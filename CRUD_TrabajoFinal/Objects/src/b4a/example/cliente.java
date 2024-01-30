package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cliente extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.cliente");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.cliente.class).invoke(this, new Object[] {null});
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
public int _id = 0;
public String _nombre = "";
public String _correo = "";
public String _telefono = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.actproductos _actproductos = null;
public b4a.example.actclientes _actclientes = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.cliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cliente";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Public Nombre As String";
_nombre = "";
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Public Correo As String";
_correo = "";
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Public Telefono As String";
_telefono = "";
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.cliente __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cliente";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
}