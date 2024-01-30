
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class actclientes implements IRemote{
	public static actclientes mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public actclientes() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("actclientes"), "b4a.example.actclientes");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, actclientes.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _clientes = RemoteObject.declareNull("b4a.example.clientes");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtcorreo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txttelefono = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.actproductos _actproductos = null;
public static b4a.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",actclientes.mostCurrent._activity,"actProductos",Debug.moduleToString(b4a.example.actproductos.class),"clientes",Debug.moduleToString(b4a.example.clientes.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"Main",Debug.moduleToString(b4a.example.main.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"txtCorreo",actclientes.mostCurrent._txtcorreo,"txtId",actclientes.mostCurrent._txtid,"txtNombre",actclientes.mostCurrent._txtnombre,"txtTelefono",actclientes.mostCurrent._txttelefono};
}
}