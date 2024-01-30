package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cliente_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
cliente._id = RemoteObject.createImmutable(0);__ref.setField("_id",cliente._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nombre As String";
cliente._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",cliente._nombre);
 //BA.debugLineNum = 4;BA.debugLine="Public Correo As String";
cliente._correo = RemoteObject.createImmutable("");__ref.setField("_correo",cliente._correo);
 //BA.debugLineNum = 5;BA.debugLine="Public Telefono As String";
cliente._telefono = RemoteObject.createImmutable("");__ref.setField("_telefono",cliente._telefono);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cliente) ","cliente",5,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cliente","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}