package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actclientes_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actclientes.remoteMe.runUserSub(false, "actclientes","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"lyClientes\")";
Debug.ShouldStop(8388608);
actclientes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lyClientes")),actclientes.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="clientes.Initialize(\"https://api-moviles-nnq6.onr";
Debug.ShouldStop(16777216);
actclientes.mostCurrent._clientes.runClassMethod (b4a.example.clientes.class, "_initialize" /*RemoteObject*/ ,actclientes.processBA,(Object)(RemoteObject.createImmutable("https://api-moviles-nnq6.onrender.com/api/clientes")));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actclientes.remoteMe.runUserSub(false, "actclientes","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actclientes.remoteMe.runUserSub(false, "actclientes","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("cmdDelete_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,55);
if (RapidSub.canDelegate("cmddelete_click")) { b4a.example.actclientes.remoteMe.runUserSub(false, "actclientes","cmddelete_click"); return;}
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
public ResumableSub_cmdDelete_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actclientes parent;
RemoteObject _res = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,55);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 56;BA.debugLine="Wait For ( clientes.Delete( txtId.Text )) Complet";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actclientes.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actclientes", "cmddelete_click"), parent.mostCurrent._clientes.runClassMethod (b4a.example.clientes.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 57;BA.debugLine="If res = True Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 58;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(33554432);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 59;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 60;BA.debugLine="txtCorreo.Text = \"\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._txtcorreo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 61;BA.debugLine="txtTelefono.Text = \"\"";
Debug.ShouldStop(268435456);
parent.mostCurrent._txttelefono.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 62;BA.debugLine="Msgbox(\"Registro borrado correctamente !!\", \"Ok\"";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro borrado correctamente !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),actclientes.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 64;BA.debugLine="Msgbox(\"Registro NO borrado\", \"ERROR\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro NO borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actclientes.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("cmdInsertar_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,77);
if (RapidSub.canDelegate("cmdinsertar_click")) { b4a.example.actclientes.remoteMe.runUserSub(false, "actclientes","cmdinsertar_click"); return;}
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
public ResumableSub_cmdInsertar_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actclientes parent;
RemoteObject _p = RemoteObject.declareNull("b4a.example.cliente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdInsertar_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 78;BA.debugLine="Wait For ( clientes.Create( txtId.Text, txtNombre";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actclientes.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actclientes", "cmdinsertar_click"), parent.mostCurrent._clientes.runClassMethod (b4a.example.clientes.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(parent.mostCurrent._txtcorreo.runMethod(true,"getText")),(Object)(parent.mostCurrent._txttelefono.runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_p = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("p", _p);
;
 BA.debugLineNum = 79;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 80;BA.debugLine="txtId.Text = p.Id";
Debug.ShouldStop(32768);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_id" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 82;BA.debugLine="Msgbox(\"no se pudo CREAR el registro\", \"ERROR\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("no se pudo CREAR el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actclientes.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
public static void  _cmdread_click() throws Exception{
try {
		Debug.PushSubsStack("cmdRead_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,38);
if (RapidSub.canDelegate("cmdread_click")) { b4a.example.actclientes.remoteMe.runUserSub(false, "actclientes","cmdread_click"); return;}
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
public ResumableSub_cmdRead_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actclientes parent;
RemoteObject _p = RemoteObject.declareNull("b4a.example.cliente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdRead_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,38);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 39;BA.debugLine="Wait For ( clientes.Read_ById( txtId.Text )) Comp";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actclientes.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actclientes", "cmdread_click"), parent.mostCurrent._clientes.runClassMethod (b4a.example.clientes.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_p = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("p", _p);
;
 BA.debugLineNum = 40;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 41;BA.debugLine="txtId.Text = p.Id";
Debug.ShouldStop(256);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="txtNombre.Text = p.Nombre";
Debug.ShouldStop(512);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="txtCorreo.Text = p.Correo";
Debug.ShouldStop(1024);
parent.mostCurrent._txtcorreo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_correo" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="txtTelefono.Text = p.Telefono";
Debug.ShouldStop(2048);
parent.mostCurrent._txttelefono.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_telefono" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 47;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(16384);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 48;BA.debugLine="txtCorreo.Text = \"\"";
Debug.ShouldStop(32768);
parent.mostCurrent._txtcorreo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 49;BA.debugLine="txtTelefono.Text = \"\"";
Debug.ShouldStop(65536);
parent.mostCurrent._txttelefono.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 51;BA.debugLine="Msgbox(\"Cliente no existe !\", \"ERROR\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Cliente no existe !")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actclientes.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("cmdUpdate_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,68);
if (RapidSub.canDelegate("cmdupdate_click")) { b4a.example.actclientes.remoteMe.runUserSub(false, "actclientes","cmdupdate_click"); return;}
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
public ResumableSub_cmdUpdate_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.actclientes parent;
RemoteObject _res = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (actclientes) ","actclientes",7,actclientes.mostCurrent.activityBA,actclientes.mostCurrent,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 69;BA.debugLine="Wait For ( clientes.Update( txtId.Text, txtNombre";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", actclientes.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "actclientes", "cmdupdate_click"), parent.mostCurrent._clientes.runClassMethod (b4a.example.clientes.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(parent.mostCurrent._txtcorreo.runMethod(true,"getText")),(Object)(parent.mostCurrent._txttelefono.runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 70;BA.debugLine="If res = True Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 71;BA.debugLine="Msgbox(\"Registro actualizado correctamente !!\",";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro actualizado correctamente !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),actclientes.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 73;BA.debugLine="Msgbox(\"Registro NO actualizado\", \"ERROR\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro NO actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))),actclientes.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 15;BA.debugLine="Private clientes As Clientes";
actclientes.mostCurrent._clientes = RemoteObject.createNew ("b4a.example.clientes");
 //BA.debugLineNum = 16;BA.debugLine="Private txtId As EditText";
actclientes.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtNombre As EditText";
actclientes.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtCorreo As EditText";
actclientes.mostCurrent._txtcorreo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtTelefono As EditText";
actclientes.mostCurrent._txttelefono = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}