package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class actclientes extends Activity implements B4AActivity{
	public static actclientes mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.actclientes");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (actclientes).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.actclientes");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.actclientes", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (actclientes) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (actclientes) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return actclientes.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (actclientes) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (actclientes) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            actclientes mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (actclientes) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.clientes _clientes = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcorreo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttelefono = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.actproductos _actproductos = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="actclientes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Activity.LoadLayout(\"lyClientes\")";
mostCurrent._activity.LoadLayout("lyClientes",mostCurrent.activityBA);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="clientes.Initialize(\"https://api-moviles-nnq6.onr";
mostCurrent._clientes._initialize /*String*/ (null,processBA,"https://api-moviles-nnq6.onrender.com/api/clientes");
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="actclientes";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="actclientes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static void  _cmddelete_click() throws Exception{
RDebugUtils.currentModule="actclientes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmddelete_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cmddelete_click", null); return;}
ResumableSub_cmdDelete_Click rsub = new ResumableSub_cmdDelete_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_cmdDelete_Click extends BA.ResumableSub {
public ResumableSub_cmdDelete_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
b4a.example.actclientes parent;
boolean _res = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="actclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Wait For ( clientes.Delete( txtId.Text )) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "actclientes", "cmddelete_click"), parent.mostCurrent._clientes._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(parent.mostCurrent._txtid.getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If res = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_res==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="txtId.Text = \"\"";
parent.mostCurrent._txtid.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="txtNombre.Text = \"\"";
parent.mostCurrent._txtnombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="txtCorreo.Text = \"\"";
parent.mostCurrent._txtcorreo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="txtTelefono.Text = \"\"";
parent.mostCurrent._txttelefono.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Msgbox(\"Registro borrado correctamente !!\", \"Ok\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Registro borrado correctamente !!"),BA.ObjectToCharSequence("Ok"),mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Msgbox(\"Registro NO borrado\", \"ERROR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Registro NO borrado"),BA.ObjectToCharSequence("ERROR"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cmdinsertar_click() throws Exception{
RDebugUtils.currentModule="actclientes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmdinsertar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cmdinsertar_click", null); return;}
ResumableSub_cmdInsertar_Click rsub = new ResumableSub_cmdInsertar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_cmdInsertar_Click extends BA.ResumableSub {
public ResumableSub_cmdInsertar_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
b4a.example.actclientes parent;
b4a.example.cliente _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="actclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Wait For ( clientes.Create( txtId.Text, txtNombre";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "actclientes", "cmdinsertar_click"), parent.mostCurrent._clientes._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(parent.mostCurrent._txtid.getText())),parent.mostCurrent._txtnombre.getText(),parent.mostCurrent._txtcorreo.getText(),parent.mostCurrent._txttelefono.getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_p = (b4a.example.cliente) result[0];
;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If p <> Null Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_p!= null) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="txtId.Text = p.Id";
parent.mostCurrent._txtid.setText(BA.ObjectToCharSequence(_p._id /*int*/ ));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Msgbox(\"no se pudo CREAR el registro\", \"ERROR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("no se pudo CREAR el registro"),BA.ObjectToCharSequence("ERROR"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cmdread_click() throws Exception{
RDebugUtils.currentModule="actclientes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmdread_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cmdread_click", null); return;}
ResumableSub_cmdRead_Click rsub = new ResumableSub_cmdRead_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_cmdRead_Click extends BA.ResumableSub {
public ResumableSub_cmdRead_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
b4a.example.actclientes parent;
b4a.example.cliente _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="actclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Wait For ( clientes.Read_ById( txtId.Text )) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "actclientes", "cmdread_click"), parent.mostCurrent._clientes._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(parent.mostCurrent._txtid.getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_p = (b4a.example.cliente) result[0];
;
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If p <> Null Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_p!= null) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="txtId.Text = p.Id";
parent.mostCurrent._txtid.setText(BA.ObjectToCharSequence(_p._id /*int*/ ));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="txtNombre.Text = p.Nombre";
parent.mostCurrent._txtnombre.setText(BA.ObjectToCharSequence(_p._nombre /*String*/ ));
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="txtCorreo.Text = p.Correo";
parent.mostCurrent._txtcorreo.setText(BA.ObjectToCharSequence(_p._correo /*String*/ ));
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="txtTelefono.Text = p.Telefono";
parent.mostCurrent._txttelefono.setText(BA.ObjectToCharSequence(_p._telefono /*String*/ ));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="txtNombre.Text = \"\"";
parent.mostCurrent._txtnombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="txtCorreo.Text = \"\"";
parent.mostCurrent._txtcorreo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="txtTelefono.Text = \"\"";
parent.mostCurrent._txttelefono.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Msgbox(\"Cliente no existe !\", \"ERROR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Cliente no existe !"),BA.ObjectToCharSequence("ERROR"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cmdupdate_click() throws Exception{
RDebugUtils.currentModule="actclientes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmdupdate_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cmdupdate_click", null); return;}
ResumableSub_cmdUpdate_Click rsub = new ResumableSub_cmdUpdate_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_cmdUpdate_Click extends BA.ResumableSub {
public ResumableSub_cmdUpdate_Click(b4a.example.actclientes parent) {
this.parent = parent;
}
b4a.example.actclientes parent;
boolean _res = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="actclientes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Wait For ( clientes.Update( txtId.Text, txtNombre";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "actclientes", "cmdupdate_click"), parent.mostCurrent._clientes._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(parent.mostCurrent._txtid.getText())),parent.mostCurrent._txtnombre.getText(),parent.mostCurrent._txtcorreo.getText(),parent.mostCurrent._txttelefono.getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If res = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_res==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Msgbox(\"Registro actualizado correctamente !!\",";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Registro actualizado correctamente !!"),BA.ObjectToCharSequence("Ok"),mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Msgbox(\"Registro NO actualizado\", \"ERROR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Registro NO actualizado"),BA.ObjectToCharSequence("ERROR"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}