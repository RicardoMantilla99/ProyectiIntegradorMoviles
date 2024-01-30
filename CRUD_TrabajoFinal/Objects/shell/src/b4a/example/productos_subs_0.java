package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ApiUrl As String";
productos._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",productos._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="Private map As Map";
productos._map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_map",productos._map);
 //BA.debugLineNum = 4;BA.debugLine="Private json As String";
productos._json = RemoteObject.createImmutable("");__ref.setField("_json",productos._json);
 //BA.debugLineNum = 5;BA.debugLine="Private request As HttpJob";
productos._request = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_request",productos._request);
 //BA.debugLineNum = 6;BA.debugLine="Private jsonParser As JSONParser";
productos._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",productos._jsonparser);
 //BA.debugLineNum = 7;BA.debugLine="Private jsonGenerartor As JSONGenerator";
productos._jsongenerartor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");__ref.setField("_jsongenerartor",productos._jsongenerartor);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_producto,RemoteObject _precio,RemoteObject _descripcion) throws Exception{
try {
		Debug.PushSubsStack("Create (productos) ","productos",3,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "productos","create", __ref, _id, _nombre_producto, _precio, _descripcion);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre_producto,_precio,_descripcion);
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
public ResumableSub_Create(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_producto,RemoteObject _precio,RemoteObject _descripcion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_producto = _nombre_producto;
this._precio = _precio;
this._descripcion = _descripcion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _nombre_producto;
RemoteObject _precio;
RemoteObject _descripcion;
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (productos) ","productos",3,__ref.getField(false, "ba"),__ref,17);
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
Debug.locals.put("nombre_producto", _nombre_producto);
Debug.locals.put("precio", _precio);
Debug.locals.put("descripcion", _descripcion);
 BA.debugLineNum = 18;BA.debugLine="Dim prod As Producto : prod.Initialize";
Debug.ShouldStop(131072);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 18;BA.debugLine="Dim prod As Producto : prod.Initialize";
Debug.ShouldStop(131072);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="map.Put(\"id\", id)";
Debug.ShouldStop(262144);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_id)));
 BA.debugLineNum = 20;BA.debugLine="map.Put(\"nombre_producto\", nombre_producto)";
Debug.ShouldStop(524288);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nombre_producto"))),(Object)((_nombre_producto)));
 BA.debugLineNum = 21;BA.debugLine="map.Put(\"precio\", precio)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precio"))),(Object)((_precio)));
 BA.debugLineNum = 22;BA.debugLine="map.Put(\"descripcion\", descripcion)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("descripcion"))),(Object)((_descripcion)));
 BA.debugLineNum = 23;BA.debugLine="jsonGenerartor.Initialize(map)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_map" /*RemoteObject*/ )));
 BA.debugLineNum = 24;BA.debugLine="json = jsonGenerartor.ToString";
Debug.ShouldStop(8388608);
__ref.setField ("_json" /*RemoteObject*/ ,__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runMethod(true,"ToString"));
 BA.debugLineNum = 25;BA.debugLine="request.PostString( ApiUrl, json)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_json" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
Debug.ShouldStop(33554432);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 27;BA.debugLine="Wait For (request) JobDone ( response As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "create"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 28;BA.debugLine="If response.Success Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 29;BA.debugLine="prod = getProducto( response.GetString )";
Debug.ShouldStop(268435456);
_prod = __ref.runClassMethod (b4a.example.productos.class, "_getproducto" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("prod", _prod);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 31;BA.debugLine="Return prod";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_prod));return;};
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Delete (productos) ","productos",3,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "productos","delete", __ref, _id);}
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
public ResumableSub_Delete(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (productos) ","productos",3,__ref.getField(false, "ba"),__ref,116);
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
 BA.debugLineNum = 117;BA.debugLine="request.Delete( ApiUrl & \"/\" & id)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 118;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "delete"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 119;BA.debugLine="Return response.Success";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_response.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _getproducto(RemoteObject __ref,RemoteObject _jsontext) throws Exception{
try {
		Debug.PushSubsStack("getProducto (productos) ","productos",3,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("getproducto")) { return __ref.runUserSub(false, "productos","getproducto", __ref, _jsontext);}
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("jsonText", _jsontext);
 BA.debugLineNum = 34;BA.debugLine="Private Sub getProducto(jsonText As String) As Pro";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim prod As Producto : prod.Initialize";
Debug.ShouldStop(4);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 35;BA.debugLine="Dim prod As Producto : prod.Initialize";
Debug.ShouldStop(4);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="Log(\"Texto JSON recibido: \" & jsonText)";
Debug.ShouldStop(32);
productos.__c.runVoidMethod ("LogImpl","21179652",RemoteObject.concat(RemoteObject.createImmutable("Texto JSON recibido: "),_jsontext),0);
 BA.debugLineNum = 40;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 42;BA.debugLine="jsonParser.Initialize(jsonText)";
Debug.ShouldStop(512);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_jsontext));
 BA.debugLineNum = 45;BA.debugLine="If jsonText.Trim.StartsWith(\"{\") Then";
Debug.ShouldStop(4096);
if (_jsontext.runMethod(true,"trim").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("{"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(16384);
productos._map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
productos._map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");__ref.setField("_map",productos._map);
 BA.debugLineNum = 50;BA.debugLine="If map.ContainsKey(\"id\") Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("id")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 51;BA.debugLine="prod.Id = map.Get(\"id\")";
Debug.ShouldStop(262144);
_prod.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 }else {
 BA.debugLineNum = 53;BA.debugLine="Log(\"La clave 'id' no existe en el objeto JSON";
Debug.ShouldStop(1048576);
productos.__c.runVoidMethod ("LogImpl","21179667",RemoteObject.createImmutable("La clave 'id' no existe en el objeto JSON."),0);
 };
 BA.debugLineNum = 57;BA.debugLine="If map.ContainsKey(\"nombre_producto\") Then";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("nombre_producto")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="prod.Nombre = map.Get(\"nombre_producto\")";
Debug.ShouldStop(33554432);
_prod.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre_producto"))))));
 }else {
 BA.debugLineNum = 60;BA.debugLine="Log(\"La clave 'nombre' no existe en el objeto";
Debug.ShouldStop(134217728);
productos.__c.runVoidMethod ("LogImpl","21179674",RemoteObject.createImmutable("La clave 'nombre' no existe en el objeto JSON."),0);
 };
 BA.debugLineNum = 64;BA.debugLine="If map.ContainsKey(\"precio\") Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("precio")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 65;BA.debugLine="prod.Precio = map.Get(\"precio\")";
Debug.ShouldStop(1);
_prod.setField ("_precio" /*RemoteObject*/ ,BA.numberCast(double.class, __ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precio"))))));
 }else {
 BA.debugLineNum = 67;BA.debugLine="Log(\"La clave 'precio' no existe en el objeto";
Debug.ShouldStop(4);
productos.__c.runVoidMethod ("LogImpl","21179681",RemoteObject.createImmutable("La clave 'precio' no existe en el objeto JSON."),0);
 };
 BA.debugLineNum = 71;BA.debugLine="If map.ContainsKey(\"descripcion\") Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("descripcion")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="prod.Descripcion = map.Get(\"descripcion\")";
Debug.ShouldStop(128);
_prod.setField ("_descripcion" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descripcion"))))));
 }else {
 BA.debugLineNum = 74;BA.debugLine="Log(\"La clave 'descripcion' no existe en el ob";
Debug.ShouldStop(512);
productos.__c.runVoidMethod ("LogImpl","21179688",RemoteObject.createImmutable("La clave 'descripcion' no existe en el objeto JSON."),0);
 };
 }else {
 BA.debugLineNum = 78;BA.debugLine="Log(\"El texto JSON no es un objeto JSON válido:";
Debug.ShouldStop(8192);
productos.__c.runVoidMethod ("LogImpl","21179692",RemoteObject.concat(RemoteObject.createImmutable("El texto JSON no es un objeto JSON válido: "),_jsontext),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e32.toString()); BA.debugLineNum = 82;BA.debugLine="Log(\"Error al analizar el objeto JSON: \" & LastE";
Debug.ShouldStop(131072);
productos.__c.runVoidMethod ("LogImpl","21179696",RemoteObject.concat(RemoteObject.createImmutable("Error al analizar el objeto JSON: "),productos.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 87;BA.debugLine="Return prod";
Debug.ShouldStop(4194304);
if (true) return _prod;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Initialize (productos) ","productos",3,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productos","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize( url As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="ApiUrl = url";
Debug.ShouldStop(2048);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 13;BA.debugLine="request.Initialize(\"\", Me)";
Debug.ShouldStop(4096);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 14;BA.debugLine="map.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Read_ById (productos) ","productos",3,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "productos","read_byid", __ref, _id);}
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
public ResumableSub_Read_ById(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (productos) ","productos",3,__ref.getField(false, "ba"),__ref,91);
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
 BA.debugLineNum = 92;BA.debugLine="Dim prod As Producto : prod.Initialize";
Debug.ShouldStop(134217728);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 92;BA.debugLine="Dim prod As Producto : prod.Initialize";
Debug.ShouldStop(134217728);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 94;BA.debugLine="request.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 95;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "read_byid"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 96;BA.debugLine="If response.Success Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 97;BA.debugLine="prod = getProducto( response.Getstring)";
Debug.ShouldStop(1);
_prod = __ref.runClassMethod (b4a.example.productos.class, "_getproducto" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("prod", _prod);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 99;BA.debugLine="Return prod";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_prod));return;};
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_producto,RemoteObject _precio,RemoteObject _descripcion) throws Exception{
try {
		Debug.PushSubsStack("Update (productos) ","productos",3,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "productos","update", __ref, _id, _nombre_producto, _precio, _descripcion);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre_producto,_precio,_descripcion);
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
public ResumableSub_Update(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre_producto,RemoteObject _precio,RemoteObject _descripcion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_producto = _nombre_producto;
this._precio = _precio;
this._descripcion = _descripcion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _nombre_producto;
RemoteObject _precio;
RemoteObject _descripcion;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (productos) ","productos",3,__ref.getField(false, "ba"),__ref,102);
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
Debug.locals.put("nombre_producto", _nombre_producto);
Debug.locals.put("precio", _precio);
Debug.locals.put("descripcion", _descripcion);
 BA.debugLineNum = 103;BA.debugLine="map.Put(\"id\", id)";
Debug.ShouldStop(64);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_id)));
 BA.debugLineNum = 104;BA.debugLine="map.Put(\"nombre_producto\", nombre_producto)";
Debug.ShouldStop(128);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nombre_producto"))),(Object)((_nombre_producto)));
 BA.debugLineNum = 105;BA.debugLine="map.Put(\"precio\", precio)";
Debug.ShouldStop(256);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precio"))),(Object)((_precio)));
 BA.debugLineNum = 106;BA.debugLine="map.Put(\"descripcion\", descripcion)";
Debug.ShouldStop(512);
__ref.getField(false,"_map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("descripcion"))),(Object)((_descripcion)));
 BA.debugLineNum = 107;BA.debugLine="jsonGenerartor.Initialize(map)";
Debug.ShouldStop(1024);
__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_map" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="json = jsonGenerartor.ToString";
Debug.ShouldStop(2048);
__ref.setField ("_json" /*RemoteObject*/ ,__ref.getField(false,"_jsongenerartor" /*RemoteObject*/ ).runMethod(true,"ToString"));
 BA.debugLineNum = 109;BA.debugLine="request.PutString( ApiUrl & \"/\" & id, json)";
Debug.ShouldStop(4096);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(__ref.getField(true,"_json" /*RemoteObject*/ )));
 BA.debugLineNum = 110;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
Debug.ShouldStop(8192);
__ref.getField(false,"_request" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 111;BA.debugLine="Wait For (request) JobDone ( response As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "update"), (__ref.getField(false,"_request" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 112;BA.debugLine="Return response.Success";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_response.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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