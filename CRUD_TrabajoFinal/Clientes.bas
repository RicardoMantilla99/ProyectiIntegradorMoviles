B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Public ApiUrl As String
 
	Private map As Map
	Private json As String
	Private request As HttpJob
	Private jsonParser As JSONParser
	Private jsonGenerartor As JSONGenerator
End Sub

'Initializes the object. You can add parameters to this method if needed.

Public Sub Initialize( url As String)
	ApiUrl = url
	request.Initialize("", Me)
	map.Initialize
End Sub

Public Sub Create(id As Int, nombre As String, correo_electronico As String, telefono As String) As ResumableSub
	Dim cli As Cliente : cli.Initialize
	map.Clear ' Asegúrate de limpiar el mapa antes de usarlo para evitar datos antiguos
	map.Put("id", id)
	map.Put("nombre", nombre)
	map.Put("correo_electronico", correo_electronico)
	map.Put("telefono", telefono)
	
	jsonGenerartor.Initialize(map)
	json = jsonGenerartor.ToString
	request.PostString(ApiUrl, json)
	request.GetRequest.SetContentType("application/json")
	Wait For (request) JobDone (response As HttpJob)
	If response.Success Then
		cli = getCliente(response.GetString)
	Else
		Log("Error al crear el cliente: " & response.ErrorMessage)
		
		Log("Respuesta del servidor: " & response.GetString)
		' Aquí puedes manejar el error, por ejemplo, mostrando un mensaje al usuario
	End If
	response.Release ' Asegúrate de liberar el HttpJob después de usarlo
	Return cli
End Sub

 
Public Sub Read_ById( id As Int) As ResumableSub
	Dim cli As Cliente : cli.Initialize
	
	request.Download(ApiUrl & "/" & id)
	Wait For (request) JobDone (response As HttpJob)
	If response.Success Then
		cli = getCliente( response.Getstring)
	End If
	Return cli
End Sub
 
Public Sub Update(id As Int, nombre As String, correo_electronico As String, telefono As String) As ResumableSub
	map.Put("id", id)
	map.Put("nombre", nombre)
	map.Put("correo_electronico", correo_electronico)
	map.Put("telefono", telefono)
	jsonGenerartor.Initialize(map)
	json = jsonGenerartor.ToString
	request.PutString( ApiUrl & "/" & id, json)
	request.GetRequest.SetContentType("application/json")
	Wait For (request) JobDone ( response As HttpJob)
	Return response.Success
 
End Sub
 
Public Sub Delete(id As Int) As ResumableSub
	request.Delete(ApiUrl & "/" & id)
	Wait For (request) JobDone(response As HttpJob)
	If response.Success Then
		Log("Eliminación exitosa")
		' Procesar respuesta exitosa
	Else
		Log("Error al eliminar: " & response.ErrorMessage)
		Log("Respuesta del servidor: " & response.GetString)
		' Implementar acciones de manejo de errores, como mostrar un mensaje al usuario
	End If
	response.Release ' Asegúrate de liberar el HttpJob
	Return response.Success
End Sub

 
Public Sub getCliente(jsonText As String) As Cliente
	Dim cli As Cliente
	If jsonText.Trim.StartsWith("{") Then
		' Inicializa solo si jsonText es un objeto JSON
		cli.Initialize
		Try
			jsonParser.Initialize(jsonText)
			Dim map As Map = jsonParser.NextObject
			cli.Id = map.Get("id")
			cli.Nombre = map.Get("nombre")
			cli.Correo = map.Get("correo_electronico")
			cli.Telefono = map.Get("telefono")
		Catch
			Log("Error al analizar el objeto JSON: " & LastException.Message)
			Return Null ' O maneja el error de la manera que prefieras
		End Try
	Else
		Log("La respuesta no es un objeto JSON válido: " & jsonText)
		Return Null ' O maneja el error de la manera que prefieras
	End If
	Return cli
End Sub
