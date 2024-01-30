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

Public Sub Create( id As Int, nombre_producto As String, precio As Double, descripcion As String) As ResumableSub
	Dim prod As Producto : prod.Initialize
	map.Put("id", id)
	map.Put("nombre_producto", nombre_producto)
	map.Put("precio", precio)
	map.Put("descripcion", descripcion)
	jsonGenerartor.Initialize(map)
	json = jsonGenerartor.ToString
	request.PostString( ApiUrl, json)
	request.GetRequest.SetContentType("application/json")
	Wait For (request) JobDone ( response As HttpJob)
	If response.Success Then
		prod = getProducto( response.GetString )
	End If
	Return prod
End Sub

Private Sub getProducto(jsonText As String) As Producto
	Dim prod As Producto : prod.Initialize
	
	' Verifica el contenido del JSON antes de analizarlo (puede ayudar en la depuración)
	Log("Texto JSON recibido: " & jsonText)
    
	Try
		' Inicializa el analizador JSON con el texto JSON
		jsonParser.Initialize(jsonText)
        
		' Asegúrate de que el JSON sea un objeto (se espera que comience con '{')
		If jsonText.Trim.StartsWith("{") Then
			' Obtén el objeto JSON
			Dim map As Map = jsonParser.NextObject
            
			' Verifica que las claves existan en el objeto JSON antes de obtener sus valores
			If map.ContainsKey("id") Then
				prod.Id = map.Get("id")
			Else
				Log("La clave 'id' no existe en el objeto JSON.")
				' Maneja el error de la manera que prefieras o establece un valor predeterminado.
			End If
            
			If map.ContainsKey("nombre_producto") Then
				prod.Nombre = map.Get("nombre_producto")
			Else
				Log("La clave 'nombre' no existe en el objeto JSON.")
				' Maneja el error de la manera que prefieras o establece un valor predeterminado.
			End If
            
			If map.ContainsKey("precio") Then
				prod.Precio = map.Get("precio")
			Else
				Log("La clave 'precio' no existe en el objeto JSON.")
				' Maneja el error de la manera que prefieras o establece un valor predeterminado.
			End If
            
			If map.ContainsKey("descripcion") Then
				prod.Descripcion = map.Get("descripcion")
			Else
				Log("La clave 'descripcion' no existe en el objeto JSON.")
				' Maneja el error de la manera que prefieras o establece un valor predeterminado.
			End If
		Else
			Log("El texto JSON no es un objeto JSON válido: " & jsonText)
			' Maneja el error de la manera que prefieras o establece un valor predeterminado.
		End If
	Catch
		Log("Error al analizar el objeto JSON: " & LastException.Message)
		' Maneja el error de la manera que prefieras o establece un valor predeterminado.
	End Try
    
	' Devuelve el objeto Producto
	Return prod
End Sub


Public Sub Read_ById( id As Int) As ResumableSub
	Dim prod As Producto : prod.Initialize
	
	request.Download(ApiUrl & "/" & id)
	Wait For (request) JobDone (response As HttpJob)
	If response.Success Then
		prod = getProducto( response.Getstring)
	End If
	Return prod
End Sub

Public Sub Update(id As Int, nombre_producto As String, precio As Double, descripcion As String) As ResumableSub
	map.Put("id", id)
	map.Put("nombre_producto", nombre_producto)
	map.Put("precio", precio)
	map.Put("descripcion", descripcion)
	jsonGenerartor.Initialize(map)
	json = jsonGenerartor.ToString
	request.PutString( ApiUrl & "/" & id, json)
	request.GetRequest.SetContentType("application/json")
	Wait For (request) JobDone ( response As HttpJob)
	Return response.Success
 
End Sub

Public Sub Delete( id As Int) As ResumableSub
	request.Delete( ApiUrl & "/" & id)
	Wait For (request) JobDone (response As HttpJob)
	Return response.Success
End Sub	