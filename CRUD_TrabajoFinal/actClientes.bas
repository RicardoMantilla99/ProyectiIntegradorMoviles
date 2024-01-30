B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private clientes As Clientes
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtCorreo As EditText
	Private txtTelefono As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lyClientes")
	clientes.Initialize("https://api-moviles-nnq6.onrender.com/api/clientes")
	

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub cmdRead_Click
	Wait For ( clientes.Read_ById( txtId.Text )) Complete ( p As Cliente )
	If p <> Null Then
		txtId.Text = p.Id
		txtNombre.Text = p.Nombre
		txtCorreo.Text = p.Correo
		txtTelefono.Text = p.Telefono
		
	Else
		txtNombre.Text = ""
		txtCorreo.Text = ""
		txtTelefono.Text = ""
		
		Msgbox("Cliente no existe !", "ERROR")
	End If
End Sub
 
Private Sub cmdDelete_Click
	Wait For ( clientes.Delete( txtId.Text )) Complete ( res As Boolean )
	If res = True Then
		txtId.Text = ""
		txtNombre.Text = ""
		txtCorreo.Text = ""
		txtTelefono.Text = ""
		Msgbox("Registro borrado correctamente !!", "Ok")
	Else
		Msgbox("Registro NO borrado", "ERROR")
	End If
End Sub
 
Private Sub cmdUpdate_Click
	Wait For ( clientes.Update( txtId.Text, txtNombre.Text, txtCorreo.Text, txtTelefono.Text )) Complete ( res As Boolean )
	If res = True Then
		Msgbox("Registro actualizado correctamente !!", "Ok")
	Else
		Msgbox("Registro NO actualizado", "ERROR")
	End If
End Sub
 
Private Sub cmdInsertar_Click
	Wait For ( clientes.Create( txtId.Text, txtNombre.Text, txtCorreo.Text, txtTelefono.Text )) Complete ( p As Cliente )
	If p <> Null Then
		txtId.Text = p.Id
	Else
		Msgbox("no se pudo CREAR el registro", "ERROR")
	End If
End Sub
