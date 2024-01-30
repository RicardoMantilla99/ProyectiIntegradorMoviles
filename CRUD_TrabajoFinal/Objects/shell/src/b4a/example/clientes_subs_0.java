package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clientes_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ApiUrl As String";
clientes._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",clientes._apiurl);
 //BA.debugLineNum = 4;BA.debugLine="Private map As Map";
clientes._map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_map",clientes._map);
 //BA.debugLineNum = 5;BA.debugLine="Private json As String";
clientes._json = RemoteObject.createImmutable("");__ref.setField("_json",clientes._json);
 //BA.debugLineNum = 6;BA.debugLine="Private request As HttpJob";
clientes._request = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_request",clientes._request);
 //BA.debugLineNum = 7;BA.debugLine="Private jsonParser As JSONParser";
clientes._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",clientes._jsonparser);
 //BA.debugLineNum = 8;BA.debugLine="Private jsonGenerartor As JSONGenerator";
clientes._jsongenerartor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");__ref.setField("_jsongenerartor",clientes._jsongenerartor);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _correo_electronico,RemoteObject _telefono) throws Exception{
try {
		Debug.PushSubsStack("Create (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "clientes","create", __ref, _id, _nombre, _correo_electronico, _telefono);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre,_correo_electronico,_telefono);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _correo_electronico,RemoteObject _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._correo_electronico = _correo_electronico;
this._telefono = _telefono;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _correo_electronico;
RemoteObject _telefono;
RemoteObject _cli = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,19);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("correo_electronico", _correo_electronico);
Debug.locals.put("telefono", _telefono);
 BA.debugLineNum = 20;BA.debugLine="Dim cli As Cliente : cli.Initialize";
Debug.ShouldStop(524288);
_cli = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 20;BA.debugLine="Dim cli As Cliente : cli.Initialize";
Debug.ShouldStop(524288);
_cli.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="map.Clear ' Asegúrate de limpiar el mapa antes de";
Debug.ShouldStop(1048576);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 22;BA.debugLine="map.Put(\"id\", id)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_id)));
 BA.debugLineNum = 23;BA.debugLine="map.Put(\"nombre\", nombre)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 24;BA.debugLine="map.Put(\"correo_electronico\", correo_electronico)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("correo_electronico"))),(Object)((_correo_electronico)));
 BA.debugLineNum = 25;BA.debugLine="map.Put(\"telefono\", telefono)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("telefono"))),(Object)((_telefono)));
 BA.debugLineNum = 27;BA.debugLine="jsonGenerartor.Initialize(map)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_map" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="json = jsonGenerartor.ToString";
Debug.ShouldStop(134217728);
__ref.setField ("_json" /*RemoteObject*/ ,__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runMethod(true,"ToString"));
 BA.debugLineNum = 29;BA.debugLine="request.PostString(ApiUrl, json)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_json" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
Debug.ShouldStop(536870912);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 31;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "create"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 32;BA.debugLine="If response.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 6;
if (_response.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 33;BA.debugLine="cli = getCliente(response.GetString)";
Debug.ShouldStop(1);
_cli = __ref.runClassMethod (b4a.example.clientes.class, "_getcliente" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("cli", _cli);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 35;BA.debugLine="Log(\"Error al crear el cliente: \" & response.Err";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","22293776",RemoteObject.concat(RemoteObject.createImmutable("Error al crear el cliente: "),_response.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 37;BA.debugLine="Log(\"Respuesta del servidor: \" & response.GetStr";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","22293778",RemoteObject.concat(RemoteObject.createImmutable("Respuesta del servidor: "),_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 40;BA.debugLine="response.Release ' Asegúrate de liberar el HttpJo";
Debug.ShouldStop(128);
_response.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="Return cli";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_cli));return;};
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _response) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "clientes","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 71;BA.debugLine="request.Delete(ApiUrl & \"/\" & id)";
Debug.ShouldStop(64);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 72;BA.debugLine="Wait For (request) JobDone(response As HttpJob)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "delete"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 73;BA.debugLine="If response.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 6;
if (_response.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 74;BA.debugLine="Log(\"Eliminación exitosa\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","22490372",RemoteObject.createImmutable("Eliminación exitosa"),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 77;BA.debugLine="Log(\"Error al eliminar: \" & response.ErrorMessag";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","22490375",RemoteObject.concat(RemoteObject.createImmutable("Error al eliminar: "),_response.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 78;BA.debugLine="Log(\"Respuesta del servidor: \" & response.GetStr";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","22490376",RemoteObject.concat(RemoteObject.createImmutable("Respuesta del servidor: "),_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 81;BA.debugLine="response.Release ' Asegúrate de liberar el HttpJo";
Debug.ShouldStop(65536);
_response.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="Return response.Success";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_response.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getcliente(RemoteObject __ref,RemoteObject _jsontext) throws Exception{
try {
		Debug.PushSubsStack("getCliente (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("getcliente")) { return __ref.runUserSub(false, "clientes","getcliente", __ref, _jsontext);}
RemoteObject _cli = RemoteObject.declareNull("b4a.example.cliente");
Debug.locals.put("jsonText", _jsontext);
 BA.debugLineNum = 86;BA.debugLine="Public Sub getCliente(jsonText As String) As Clien";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim cli As Cliente";
Debug.ShouldStop(4194304);
_cli = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 88;BA.debugLine="If jsonText.Trim.StartsWith(\"{\") Then";
Debug.ShouldStop(8388608);
if (_jsontext.runMethod(true,"trim").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("{"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="cli.Initialize";
Debug.ShouldStop(33554432);
_cli.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 91;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 92;BA.debugLine="jsonParser.Initialize(jsonText)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_jsontext));
 BA.debugLineNum = 93;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(268435456);
clientes._map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
clientes._map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");__ref.setField("_map",clientes._map);
 BA.debugLineNum = 94;BA.debugLine="cli.Id = map.Get(\"id\")";
Debug.ShouldStop(536870912);
_cli.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 95;BA.debugLine="cli.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(1073741824);
_cli.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 96;BA.debugLine="cli.Correo = map.Get(\"correo_electronico\")";
Debug.ShouldStop(-2147483648);
_cli.setField ("_correo" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("correo_electronico"))))));
 BA.debugLineNum = 97;BA.debugLine="cli.Telefono = map.Get(\"telefono\")";
Debug.ShouldStop(1);
_cli.setField ("_telefono" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefono"))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 99;BA.debugLine="Log(\"Error al analizar el objeto JSON: \" & Last";
Debug.ShouldStop(4);
clientes.__c.runVoidMethod ("LogImpl","22555917",RemoteObject.concat(RemoteObject.createImmutable("Error al analizar el objeto JSON: "),clientes.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 100;BA.debugLine="Return Null ' O maneja el error de la manera qu";
Debug.ShouldStop(8);
if (true) return (clientes.__c.getField(false,"Null"));
 };
 }else {
 BA.debugLineNum = 103;BA.debugLine="Log(\"La respuesta no es un objeto JSON válido: \"";
Debug.ShouldStop(64);
clientes.__c.runVoidMethod ("LogImpl","22555921",RemoteObject.concat(RemoteObject.createImmutable("La respuesta no es un objeto JSON válido: "),_jsontext),0);
 BA.debugLineNum = 104;BA.debugLine="Return Null ' O maneja el error de la manera que";
Debug.ShouldStop(128);
if (true) return (clientes.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 106;BA.debugLine="Return cli";
Debug.ShouldStop(512);
if (true) return _cli;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clientes","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize( url As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="ApiUrl = url";
Debug.ShouldStop(8192);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 15;BA.debugLine="request.Initialize(\"\", Me)";
Debug.ShouldStop(16384);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 16;BA.debugLine="map.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "clientes","read_byid", __ref, _id);}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _cli = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,45);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 46;BA.debugLine="Dim cli As Cliente : cli.Initialize";
Debug.ShouldStop(8192);
_cli = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 46;BA.debugLine="Dim cli As Cliente : cli.Initialize";
Debug.ShouldStop(8192);
_cli.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 48;BA.debugLine="request.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(32768);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 49;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "read_byid"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 50;BA.debugLine="If response.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (_response.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 51;BA.debugLine="cli = getCliente( response.Getstring)";
Debug.ShouldStop(262144);
_cli = __ref.runClassMethod (b4a.example.clientes.class, "_getcliente" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("cli", _cli);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="Return cli";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_cli));return;};
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _correo_electronico,RemoteObject _telefono) throws Exception{
try {
		Debug.PushSubsStack("Update (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "clientes","update", __ref, _id, _nombre, _correo_electronico, _telefono);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre,_correo_electronico,_telefono);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _correo_electronico,RemoteObject _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._correo_electronico = _correo_electronico;
this._telefono = _telefono;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _correo_electronico;
RemoteObject _telefono;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (clientes) ","clientes",6,__ref.getField(false, "ba"),__ref,56);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("correo_electronico", _correo_electronico);
Debug.locals.put("telefono", _telefono);
 BA.debugLineNum = 57;BA.debugLine="map.Put(\"id\", id)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_id)));
 BA.debugLineNum = 58;BA.debugLine="map.Put(\"nombre\", nombre)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nombre"))),(Object)((_nombre)));
 BA.debugLineNum = 59;BA.debugLine="map.Put(\"correo_electronico\", correo_electronico)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("correo_electronico"))),(Object)((_correo_electronico)));
 BA.debugLineNum = 60;BA.debugLine="map.Put(\"telefono\", telefono)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("telefono"))),(Object)((_telefono)));
 BA.debugLineNum = 61;BA.debugLine="jsonGenerartor.Initialize(map)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_map" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="json = jsonGenerartor.ToString";
Debug.ShouldStop(536870912);
__ref.setField ("_json" /*RemoteObject*/ ,__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runMethod(true,"ToString"));
 BA.debugLineNum = 63;BA.debugLine="request.PutString( ApiUrl & \"/\" & id, json)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(__ref.getField(true,"_json" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 65;BA.debugLine="Wait For (request) JobDone ( response As HttpJob)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "update"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 66;BA.debugLine="Return response.Success";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_response.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}