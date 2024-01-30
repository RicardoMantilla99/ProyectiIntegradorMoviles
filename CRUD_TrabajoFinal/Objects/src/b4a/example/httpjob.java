package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.httpjob");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public String _invalidurl = "";
public String _defaultscheme = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.actproductos _actproductos = null;
public b4a.example.actclientes _actclientes = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _poststring(b4a.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return null;
}
public String  _getstring(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94915205",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Try";
try {RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94718597",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public String  _release(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release", true))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4a.example.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return "";
}
public String  _addscheme(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=3866652;
 //BA.debugLineNum = 3866652;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=3866653;
 //BA.debugLineNum = 3866653;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=3866654;
 //BA.debugLineNum = 3866654;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Try";
try {RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94980741",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4a.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink", true))
	 {return ((String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Try";
try {RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94784133",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.example.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.example.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height);
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="End Sub";
return null;
}
public String  _getstring2(b4a.example.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Try";
try {RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94456453",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.example.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="Try";
try {RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94390924",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(b4a.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Try";
try {RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94128773",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4a.example.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile", true))
	 {return ((String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename}));}
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("94653064","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=4653075;
 //BA.debugLineNum = 4653075;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=4653078;
 //BA.debugLineNum = 4653078;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4a.example.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart", true))
	 {return ((String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files}));}
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
b4a.example.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.example.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=4522015;
 //BA.debugLineNum = 4522015;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=4522016;
 //BA.debugLineNum = 4522016;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=4522020;
 //BA.debugLineNum = 4522020;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=4522023;
 //BA.debugLineNum = 4522023;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=4522024;
 //BA.debugLineNum = 4522024;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=4522025;
 //BA.debugLineNum = 4522025;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=4522026;
 //BA.debugLineNum = 4522026;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=4522027;
 //BA.debugLineNum = 4522027;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=4522028;
 //BA.debugLineNum = 4522028;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Try";
try {RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("94259845",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="End Sub";
return "";
}
}