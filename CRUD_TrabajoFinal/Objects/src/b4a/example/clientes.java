package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clientes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.clientes");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.clientes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _apiurl = "";
public anywheresoftware.b4a.objects.collections.Map _map = null;
public String _json = "";
public b4a.example.httpjob _request = null;
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerartor = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.actproductos _actproductos = null;
public b4a.example.actclientes _actclientes = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.clientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientes";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Private map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Private json As String";
_json = "";
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Private request As HttpJob";
_request = new b4a.example.httpjob();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Private jsonGenerartor As JSONGenerator";
_jsongenerartor = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.clientes __ref,int _id,String _nombre,String _correo_electronico,String _telefono) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_correo_electronico,_telefono}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre,_correo_electronico,_telefono);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clientes parent,b4a.example.clientes __ref,int _id,String _nombre,String _correo_electronico,String _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._correo_electronico = _correo_electronico;
this._telefono = _telefono;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
String _nombre;
String _correo_electronico;
String _telefono;
b4a.example.cliente _cli = null;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim cli As Cliente : cli.Initialize";
_cli = new b4a.example.cliente();
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim cli As Cliente : cli.Initialize";
_cli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="map.Clear ' Asegúrate de limpiar el mapa antes de";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="map.Put(\"id\", id)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("id"),(Object)(_id));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="map.Put(\"nombre\", nombre)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("nombre"),(Object)(_nombre));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="map.Put(\"correo_electronico\", correo_electronico)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("correo_electronico"),(Object)(_correo_electronico));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="map.Put(\"telefono\", telefono)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("telefono"),(Object)(_telefono));
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="jsonGenerartor.Initialize(map)";
__ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .Initialize(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="json = jsonGenerartor.ToString";
__ref._json /*String*/  = __ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .ToString();
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="request.PostString(ApiUrl, json)";
__ref._request /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,__ref._json /*String*/ );
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
__ref._request /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "create"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="If response.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_response._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="cli = getCliente(response.GetString)";
_cli = __ref._getcliente /*b4a.example.cliente*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="Log(\"Error al crear el cliente: \" & response.Err";
parent.__c.LogImpl("22293776","Error al crear el cliente: "+_response._errormessage /*String*/ ,0);
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="Log(\"Respuesta del servidor: \" & response.GetStr";
parent.__c.LogImpl("22293778","Respuesta del servidor: "+_response._getstring /*String*/ (null),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="response.Release ' Asegúrate de liberar el HttpJo";
_response._release /*String*/ (null);
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="Return cli";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_cli));return;};
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.cliente  _getcliente(b4a.example.clientes __ref,String _jsontext) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "getcliente", false))
	 {return ((b4a.example.cliente) Debug.delegate(ba, "getcliente", new Object[] {_jsontext}));}
b4a.example.cliente _cli = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub getCliente(jsonText As String) As Clien";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim cli As Cliente";
_cli = new b4a.example.cliente();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="If jsonText.Trim.StartsWith(\"{\") Then";
if (_jsontext.trim().startsWith("{")) { 
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="cli.Initialize";
_cli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Try";
try {RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="jsonParser.Initialize(jsonText)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_jsontext);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="cli.Id = map.Get(\"id\")";
_cli._id /*int*/  = (int)(BA.ObjectToNumber(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("id"))));
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="cli.Nombre = map.Get(\"nombre\")";
_cli._nombre /*String*/  = BA.ObjectToString(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("nombre")));
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="cli.Correo = map.Get(\"correo_electronico\")";
_cli._correo /*String*/  = BA.ObjectToString(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("correo_electronico")));
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="cli.Telefono = map.Get(\"telefono\")";
_cli._telefono /*String*/  = BA.ObjectToString(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("telefono")));
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Log(\"Error al analizar el objeto JSON: \" & Last";
__c.LogImpl("22555917","Error al analizar el objeto JSON: "+__c.LastException(getActivityBA()).getMessage(),0);
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="Return Null ' O maneja el error de la manera qu";
if (true) return (b4a.example.cliente)(__c.Null);
 };
 }else {
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="Log(\"La respuesta no es un objeto JSON válido: \"";
__c.LogImpl("22555921","La respuesta no es un objeto JSON válido: "+_jsontext,0);
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="Return Null ' O maneja el error de la manera que";
if (true) return (b4a.example.cliente)(__c.Null);
 };
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="Return cli";
if (true) return _cli;
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.clientes __ref,int _id) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clientes parent,b4a.example.clientes __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="request.Delete(ApiUrl & \"/\" & id)";
__ref._request /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Wait For (request) JobDone(response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "delete"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If response.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_response._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Log(\"Eliminación exitosa\")";
parent.__c.LogImpl("22490372","Eliminación exitosa",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Log(\"Error al eliminar: \" & response.ErrorMessag";
parent.__c.LogImpl("22490375","Error al eliminar: "+_response._errormessage /*String*/ ,0);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Log(\"Respuesta del servidor: \" & response.GetStr";
parent.__c.LogImpl("22490376","Respuesta del servidor: "+_response._getstring /*String*/ (null),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="response.Release ' Asegúrate de liberar el HttpJo";
_response._release /*String*/ (null);
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Return response.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_response._success /*boolean*/ ));return;};
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.clientes __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Initialize( url As String)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="ApiUrl = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="request.Initialize(\"\", Me)";
__ref._request /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",this);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="map.Initialize";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.clientes __ref,int _id) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.clientes parent,b4a.example.clientes __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
b4a.example.cliente _cli = null;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim cli As Cliente : cli.Initialize";
_cli = new b4a.example.cliente();
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim cli As Cliente : cli.Initialize";
_cli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="request.Download(ApiUrl & \"/\" & id)";
__ref._request /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "read_byid"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="If response.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_response._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="cli = getCliente( response.Getstring)";
_cli = __ref._getcliente /*b4a.example.cliente*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Return cli";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_cli));return;};
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.clientes __ref,int _id,String _nombre,String _correo_electronico,String _telefono) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_correo_electronico,_telefono}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre,_correo_electronico,_telefono);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clientes parent,b4a.example.clientes __ref,int _id,String _nombre,String _correo_electronico,String _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._correo_electronico = _correo_electronico;
this._telefono = _telefono;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
String _nombre;
String _correo_electronico;
String _telefono;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="map.Put(\"id\", id)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("id"),(Object)(_id));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="map.Put(\"nombre\", nombre)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("nombre"),(Object)(_nombre));
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="map.Put(\"correo_electronico\", correo_electronico)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("correo_electronico"),(Object)(_correo_electronico));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="map.Put(\"telefono\", telefono)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("telefono"),(Object)(_telefono));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="jsonGenerartor.Initialize(map)";
__ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .Initialize(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="json = jsonGenerartor.ToString";
__ref._json /*String*/  = __ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .ToString();
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="request.PutString( ApiUrl & \"/\" & id, json)";
__ref._request /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),__ref._json /*String*/ );
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
__ref._request /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Wait For (request) JobDone ( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "update"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Return response.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_response._success /*boolean*/ ));return;};
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}