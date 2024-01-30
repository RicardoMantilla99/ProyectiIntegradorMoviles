
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clientes {
    public static RemoteObject myClass;
	public clientes() {
	}
    public static PCBA staticBA = new PCBA(null, clientes.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _apiurl = RemoteObject.createImmutable("");
public static RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _json = RemoteObject.createImmutable("");
public static RemoteObject _request = RemoteObject.declareNull("b4a.example.httpjob");
public static RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
public static RemoteObject _jsongenerartor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.actproductos _actproductos = null;
public static b4a.example.actclientes _actclientes = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ApiUrl",_ref.getField(false, "_apiurl"),"json",_ref.getField(false, "_json"),"jsonGenerartor",_ref.getField(false, "_jsongenerartor"),"jsonParser",_ref.getField(false, "_jsonparser"),"map",_ref.getField(false, "_map"),"request",_ref.getField(false, "_request")};
}
}