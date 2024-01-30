package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actproductos_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actproductos.remoteMe.runUserSub(false, "actproductos","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"lyProductos\")";
Debug.ShouldStop(8388608);
actproductos.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lyProductos")),actproductos.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="productos.Initialize(\"https://api-moviles-nnq6.on";
Debug.ShouldStop(16777216);
actproductos.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_initialize" /*RemoteObject*/ ,actproductos.processBA,(Object)(RemoteObject.createImmutable("https://api-moviles-nnq6.onrender.com/api/productos")));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actproductos.remoteMe.runUserSub(false, "actproductos","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actproductos.remoteMe.runUserSub(false, "actproductos","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cmddelete_click() throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,54);
if (RapidSub.canDelegate("cmddelete_click")) { b4a.example.actproductos.remoteMe.runUserSub(false, "actproductos","cmddelete_click"); return;}
ResumableSub_cmdDelete_Click rsub = new ResumableSub_cmdDelete_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdDelete_Click extends BA.ResumableSub {
public ResumableSub_cmdDelete_Click(b4a.example.actproductos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actproductos parent;
RemoteObject _res = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,54);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 55;BA.debugLine="Wait For ( productos.Delete( txtId.Text )) Comple";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actproductos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actproductos", "cmddelete_click"), parent.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 56;BA.debugLine="If res = True Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_res,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 57;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(16777216);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 58;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(33554432);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 59;BA.debugLine="txtPrecio.Text = \"\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._txtprecio.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 60;BA.debugLine="txtDescripcion.Text = \"\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._txtdescripcion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 61;BA.debugLine="Msgbox(\"Registro borrado correctamente !!\", \"Ok\"";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro borrado correctamente !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),actproductos.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 63;BA.debugLine="Msgbox(\"Registro NO borrado\", \"ERROR\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro NO borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actproductos.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _complete(RemoteObject _res) throws Exception{
}
public static void  _cmdinsertar_click() throws Exception{
try {
		Debug.PushSubsStack("cmdInsertar_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,76);
if (RapidSub.canDelegate("cmdinsertar_click")) { b4a.example.actproductos.remoteMe.runUserSub(false, "actproductos","cmdinsertar_click"); return;}
ResumableSub_cmdInsertar_Click rsub = new ResumableSub_cmdInsertar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdInsertar_Click extends BA.ResumableSub {
public ResumableSub_cmdInsertar_Click(b4a.example.actproductos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actproductos parent;
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdInsertar_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,76);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 77;BA.debugLine="Wait For ( productos.Create( txtId.Text, txtNombr";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actproductos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actproductos", "cmdinsertar_click"), parent.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, parent.mostCurrent._txtprecio.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtdescripcion.runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_p = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("p", _p);
;
 BA.debugLineNum = 78;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("N",_p)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 79;BA.debugLine="txtId.Text = p.Id";
Debug.ShouldStop(16384);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_id" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 81;BA.debugLine="Msgbox(\"no se pudo CREAR el registro\", \"ERROR\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("no se pudo CREAR el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actproductos.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
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
public static void  _cmdread_click() throws Exception{
try {
		Debug.PushSubsStack("cmdRead_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,37);
if (RapidSub.canDelegate("cmdread_click")) { b4a.example.actproductos.remoteMe.runUserSub(false, "actproductos","cmdread_click"); return;}
ResumableSub_cmdRead_Click rsub = new ResumableSub_cmdRead_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdRead_Click extends BA.ResumableSub {
public ResumableSub_cmdRead_Click(b4a.example.actproductos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actproductos parent;
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdRead_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,37);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 38;BA.debugLine="Wait For ( productos.Read_ById( txtId.Text )) Com";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actproductos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actproductos", "cmdread_click"), parent.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_p = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("p", _p);
;
 BA.debugLineNum = 39;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("N",_p)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 40;BA.debugLine="txtId.Text = p.Id";
Debug.ShouldStop(128);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 41;BA.debugLine="txtNombre.Text = p.Nombre";
Debug.ShouldStop(256);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="txtPrecio.Text = p.Precio";
Debug.ShouldStop(512);
parent.mostCurrent._txtprecio.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_precio" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="txtDescripcion.Text = p.Descripcion";
Debug.ShouldStop(1024);
parent.mostCurrent._txtdescripcion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_descripcion" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 46;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(8192);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 47;BA.debugLine="txtPrecio.Text = \"\"";
Debug.ShouldStop(16384);
parent.mostCurrent._txtprecio.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 48;BA.debugLine="txtDescripcion.Text = \"\"";
Debug.ShouldStop(32768);
parent.mostCurrent._txtdescripcion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 50;BA.debugLine="Msgbox(\"producto no existe !\", \"ERROR\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("producto no existe !")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actproductos.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _cmdupdate_click() throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,67);
if (RapidSub.canDelegate("cmdupdate_click")) { b4a.example.actproductos.remoteMe.runUserSub(false, "actproductos","cmdupdate_click"); return;}
ResumableSub_cmdUpdate_Click rsub = new ResumableSub_cmdUpdate_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdUpdate_Click extends BA.ResumableSub {
public ResumableSub_cmdUpdate_Click(b4a.example.actproductos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actproductos parent;
RemoteObject _res = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (actproductos) ","actproductos",4,actproductos.mostCurrent.activityBA,actproductos.mostCurrent,67);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 68;BA.debugLine="Wait For ( productos.Update( txtId.Text, txtNombr";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actproductos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actproductos", "cmdupdate_click"), parent.mostCurrent._productos.runClassMethod (b4a.example.productos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, parent.mostCurrent._txtprecio.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtdescripcion.runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 69;BA.debugLine="If res = True Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_res,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 70;BA.debugLine="Msgbox(\"Registro actualizado correctamente !!\",";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro actualizado correctamente !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),actproductos.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 72;BA.debugLine="Msgbox(\"Registro NO actualizado\", \"ERROR\")";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro NO actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actproductos.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private productos As Productos";
actproductos.mostCurrent._productos = RemoteObject.createNew ("b4a.example.productos");
 //BA.debugLineNum = 16;BA.debugLine="Private txtId As EditText";
actproductos.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtNombre As EditText";
actproductos.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtPrecio As EditText";
actproductos.mostCurrent._txtprecio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtDescripcion As EditText";
actproductos.mostCurrent._txtdescripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}