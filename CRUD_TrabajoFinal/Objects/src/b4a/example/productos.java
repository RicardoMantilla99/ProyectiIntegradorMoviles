package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class productos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.productos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.productos.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Private json As String";
_json = "";
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Private request As HttpJob";
_request = new b4a.example.httpjob();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Private jsonGenerartor As JSONGenerator";
_jsongenerartor = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.productos __ref,int _id,String _nombre_producto,double _precio,String _descripcion) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre_producto,_precio,_descripcion}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre_producto,_precio,_descripcion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.productos parent,b4a.example.productos __ref,int _id,String _nombre_producto,double _precio,String _descripcion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_producto = _nombre_producto;
this._precio = _precio;
this._descripcion = _descripcion;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
String _nombre_producto;
double _precio;
String _descripcion;
b4a.example.producto _prod = null;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim prod As Producto : prod.Initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim prod As Producto : prod.Initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="map.Put(\"id\", id)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("id"),(Object)(_id));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="map.Put(\"nombre_producto\", nombre_producto)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("nombre_producto"),(Object)(_nombre_producto));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="map.Put(\"precio\", precio)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("precio"),(Object)(_precio));
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="map.Put(\"descripcion\", descripcion)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("descripcion"),(Object)(_descripcion));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="jsonGenerartor.Initialize(map)";
__ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .Initialize(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="json = jsonGenerartor.ToString";
__ref._json /*String*/  = __ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .ToString();
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="request.PostString( ApiUrl, json)";
__ref._request /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,__ref._json /*String*/ );
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
__ref._request /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Wait For (request) JobDone ( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "create"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="prod = getProducto( response.GetString )";
_prod = __ref._getproducto /*b4a.example.producto*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="Return prod";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prod));return;};
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.producto  _getproducto(b4a.example.productos __ref,String _jsontext) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "getproducto", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "getproducto", new Object[] {_jsontext}));}
b4a.example.producto _prod = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub getProducto(jsonText As String) As Pro";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim prod As Producto : prod.Initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim prod As Producto : prod.Initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Log(\"Texto JSON recibido: \" & jsonText)";
__c.LogImpl("21179652","Texto JSON recibido: "+_jsontext,0);
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="jsonParser.Initialize(jsonText)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_jsontext);
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="If jsonText.Trim.StartsWith(\"{\") Then";
if (_jsontext.trim().startsWith("{")) { 
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="If map.ContainsKey(\"id\") Then";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("id"))) { 
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="prod.Id = map.Get(\"id\")";
_prod._id /*int*/  = (int)(BA.ObjectToNumber(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("id"))));
 }else {
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="Log(\"La clave 'id' no existe en el objeto JSON";
__c.LogImpl("21179667","La clave 'id' no existe en el objeto JSON.",0);
 };
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="If map.ContainsKey(\"nombre_producto\") Then";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("nombre_producto"))) { 
RDebugUtils.currentLine=1179672;
 //BA.debugLineNum = 1179672;BA.debugLine="prod.Nombre = map.Get(\"nombre_producto\")";
_prod._nombre /*String*/  = BA.ObjectToString(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("nombre_producto")));
 }else {
RDebugUtils.currentLine=1179674;
 //BA.debugLineNum = 1179674;BA.debugLine="Log(\"La clave 'nombre' no existe en el objeto";
__c.LogImpl("21179674","La clave 'nombre' no existe en el objeto JSON.",0);
 };
RDebugUtils.currentLine=1179678;
 //BA.debugLineNum = 1179678;BA.debugLine="If map.ContainsKey(\"precio\") Then";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("precio"))) { 
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="prod.Precio = map.Get(\"precio\")";
_prod._precio /*double*/  = (double)(BA.ObjectToNumber(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("precio"))));
 }else {
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="Log(\"La clave 'precio' no existe en el objeto";
__c.LogImpl("21179681","La clave 'precio' no existe en el objeto JSON.",0);
 };
RDebugUtils.currentLine=1179685;
 //BA.debugLineNum = 1179685;BA.debugLine="If map.ContainsKey(\"descripcion\") Then";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("descripcion"))) { 
RDebugUtils.currentLine=1179686;
 //BA.debugLineNum = 1179686;BA.debugLine="prod.Descripcion = map.Get(\"descripcion\")";
_prod._descripcion /*String*/  = BA.ObjectToString(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("descripcion")));
 }else {
RDebugUtils.currentLine=1179688;
 //BA.debugLineNum = 1179688;BA.debugLine="Log(\"La clave 'descripcion' no existe en el ob";
__c.LogImpl("21179688","La clave 'descripcion' no existe en el objeto JSON.",0);
 };
 }else {
RDebugUtils.currentLine=1179692;
 //BA.debugLineNum = 1179692;BA.debugLine="Log(\"El texto JSON no es un objeto JSON válido:";
__c.LogImpl("21179692","El texto JSON no es un objeto JSON válido: "+_jsontext,0);
 };
 } 
       catch (Exception e32) {
			ba.setLastException(e32);RDebugUtils.currentLine=1179696;
 //BA.debugLineNum = 1179696;BA.debugLine="Log(\"Error al analizar el objeto JSON: \" & LastE";
__c.LogImpl("21179696","Error al analizar el objeto JSON: "+__c.LastException(getActivityBA()).getMessage(),0);
 };
RDebugUtils.currentLine=1179701;
 //BA.debugLineNum = 1179701;BA.debugLine="Return prod";
if (true) return _prod;
RDebugUtils.currentLine=1179702;
 //BA.debugLineNum = 1179702;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.productos __ref,int _id) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.productos parent,b4a.example.productos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="request.Delete( ApiUrl & \"/\" & id)";
__ref._request /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "delete"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Return response.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_response._success /*boolean*/ ));return;};
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.productos __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Initialize( url As String)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="ApiUrl = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="request.Initialize(\"\", Me)";
__ref._request /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",this);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="map.Initialize";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.productos __ref,int _id) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.productos parent,b4a.example.productos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
b4a.example.producto _prod = null;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim prod As Producto : prod.Initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim prod As Producto : prod.Initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="request.Download(ApiUrl & \"/\" & id)";
__ref._request /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Wait For (request) JobDone (response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "read_byid"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="prod = getProducto( response.Getstring)";
_prod = __ref._getproducto /*b4a.example.producto*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Return prod";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prod));return;};
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.productos __ref,int _id,String _nombre_producto,double _precio,String _descripcion) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre_producto,_precio,_descripcion}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre_producto,_precio,_descripcion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.productos parent,b4a.example.productos __ref,int _id,String _nombre_producto,double _precio,String _descripcion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre_producto = _nombre_producto;
this._precio = _precio;
this._descripcion = _descripcion;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
String _nombre_producto;
double _precio;
String _descripcion;
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="map.Put(\"id\", id)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("id"),(Object)(_id));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="map.Put(\"nombre_producto\", nombre_producto)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("nombre_producto"),(Object)(_nombre_producto));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="map.Put(\"precio\", precio)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("precio"),(Object)(_precio));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="map.Put(\"descripcion\", descripcion)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("descripcion"),(Object)(_descripcion));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="jsonGenerartor.Initialize(map)";
__ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .Initialize(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="json = jsonGenerartor.ToString";
__ref._json /*String*/  = __ref._jsongenerartor /*anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator*/ .ToString();
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="request.PutString( ApiUrl & \"/\" & id, json)";
__ref._request /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),__ref._json /*String*/ );
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="request.GetRequest.SetContentType(\"application/js";
__ref._request /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Wait For (request) JobDone ( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "update"), (Object)(__ref._request /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Return response.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_response._success /*boolean*/ ));return;};
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}