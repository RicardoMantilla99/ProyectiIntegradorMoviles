
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cliente {
    public static RemoteObject myClass;
	public cliente() {
	}
    public static PCBA staticBA = new PCBA(null, cliente.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _correo = RemoteObject.createImmutable("");
public static RemoteObject _telefono = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.actproductos _actproductos = null;
public static b4a.example.actclientes _actclientes = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Correo",_ref.getField(false, "_correo"),"Id",_ref.getField(false, "_id"),"Nombre",_ref.getField(false, "_nombre"),"Telefono",_ref.getField(false, "_telefono")};
}
}