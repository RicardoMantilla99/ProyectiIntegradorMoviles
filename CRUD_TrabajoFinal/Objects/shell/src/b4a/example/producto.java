
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class producto {
    public static RemoteObject myClass;
	public producto() {
	}
    public static PCBA staticBA = new PCBA(null, producto.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _precio = RemoteObject.createImmutable(0);
public static RemoteObject _descripcion = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.actproductos _actproductos = null;
public static b4a.example.actclientes _actclientes = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Descripcion",_ref.getField(false, "_descripcion"),"Id",_ref.getField(false, "_id"),"Nombre",_ref.getField(false, "_nombre"),"Precio",_ref.getField(false, "_precio")};
}
}