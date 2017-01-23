/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/IWindowManager.aidl
 */
package android.view;
/**
 * System private interface to the window manager.
 *
 * {@hide}
 */
public interface IWindowManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IWindowManager
{
private static final java.lang.String DESCRIPTOR = "android.view.IWindowManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IWindowManager interface,
 * generating a proxy if needed.
 */
public static android.view.IWindowManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IWindowManager))) {
return ((android.view.IWindowManager)iin);
}
return new android.view.IWindowManager.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_startViewServer:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.startViewServer(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopViewServer:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopViewServer();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isViewServerRunning:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isViewServerRunning();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_openSession:
{
data.enforceInterface(DESCRIPTOR);
android.view.IWindowSessionCallback _arg0;
_arg0 = android.view.IWindowSessionCallback.Stub.asInterface(data.readStrongBinder());
com.android.internal.view.IInputMethodClient _arg1;
_arg1 = com.android.internal.view.IInputMethodClient.Stub.asInterface(data.readStrongBinder());
com.android.internal.view.IInputContext _arg2;
_arg2 = com.android.internal.view.IInputContext.Stub.asInterface(data.readStrongBinder());
android.view.IWindowSession _result = this.openSession(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_inputMethodClientHasFocus:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.view.IInputMethodClient _arg0;
_arg0 = com.android.internal.view.IInputMethodClient.Stub.asInterface(data.readStrongBinder());
boolean _result = this.inputMethodClientHasFocus(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getInitialDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Point _arg1;
_arg1 = new android.graphics.Point();
this.getInitialDisplaySize(_arg0, _arg1);
reply.writeNoException();
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getBaseDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Point _arg1;
_arg1 = new android.graphics.Point();
this.getBaseDisplaySize(_arg0, _arg1);
reply.writeNoException();
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setForcedDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setForcedDisplaySize(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearForcedDisplaySize:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.clearForcedDisplaySize(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getInitialDisplayDensity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getInitialDisplayDensity(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getBaseDisplayDensity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getBaseDisplayDensity(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setForcedDisplayDensityForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setForcedDisplayDensityForUser(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearForcedDisplayDensityForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.clearForcedDisplayDensityForUser(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setForcedDisplayScalingMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setForcedDisplayScalingMode(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setOverscan:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.setOverscan(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_pauseKeyDispatching:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.pauseKeyDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_resumeKeyDispatching:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.resumeKeyDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setEventDispatching:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setEventDispatching(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addWindowToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.addWindowToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeWindowToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeWindowToken(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addAppToken:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.IApplicationToken _arg1;
_arg1 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _arg6;
_arg6 = (0!=data.readInt());
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
boolean _arg9;
_arg9 = (0!=data.readInt());
boolean _arg10;
_arg10 = (0!=data.readInt());
android.graphics.Rect _arg11;
if ((0!=data.readInt())) {
_arg11 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg11 = null;
}
android.content.res.Configuration _arg12;
if ((0!=data.readInt())) {
_arg12 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg12 = null;
}
int _arg13;
_arg13 = data.readInt();
boolean _arg14;
_arg14 = (0!=data.readInt());
boolean _arg15;
_arg15 = (0!=data.readInt());
int _arg16;
_arg16 = data.readInt();
int _arg17;
_arg17 = data.readInt();
this.addAppToken(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11, _arg12, _arg13, _arg14, _arg15, _arg16, _arg17);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppTask:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.graphics.Rect _arg3;
if ((0!=data.readInt())) {
_arg3 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.content.res.Configuration _arg4;
if ((0!=data.readInt())) {
_arg4 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
boolean _arg6;
_arg6 = (0!=data.readInt());
this.setAppTask(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_setAppOrientation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IApplicationToken _arg0;
_arg0 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.setAppOrientation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppOrientation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IApplicationToken _arg0;
_arg0 = android.view.IApplicationToken.Stub.asInterface(data.readStrongBinder());
int _result = this.getAppOrientation(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setFocusedApp:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setFocusedApp(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_prepareAppTransition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.prepareAppTransition(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getPendingAppTransition:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPendingAppTransition();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_overridePendingAppTransition:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.IRemoteCallback _arg3;
_arg3 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
this.overridePendingAppTransition(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionScaleUp:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.overridePendingAppTransitionScaleUp(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionClipReveal:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.overridePendingAppTransitionClipReveal(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionThumb:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.IRemoteCallback _arg3;
_arg3 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
boolean _arg4;
_arg4 = (0!=data.readInt());
this.overridePendingAppTransitionThumb(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionAspectScaledThumb:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
android.os.IRemoteCallback _arg5;
_arg5 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
boolean _arg6;
_arg6 = (0!=data.readInt());
this.overridePendingAppTransitionAspectScaledThumb(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionMultiThumb:
{
data.enforceInterface(DESCRIPTOR);
android.view.AppTransitionAnimationSpec[] _arg0;
_arg0 = data.createTypedArray(android.view.AppTransitionAnimationSpec.CREATOR);
android.os.IRemoteCallback _arg1;
_arg1 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
android.os.IRemoteCallback _arg2;
_arg2 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
boolean _arg3;
_arg3 = (0!=data.readInt());
this.overridePendingAppTransitionMultiThumb(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionInPlace:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.overridePendingAppTransitionInPlace(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_overridePendingAppTransitionMultiThumbFuture:
{
data.enforceInterface(DESCRIPTOR);
android.view.IAppTransitionAnimationSpecsFuture _arg0;
_arg0 = android.view.IAppTransitionAnimationSpecsFuture.Stub.asInterface(data.readStrongBinder());
android.os.IRemoteCallback _arg1;
_arg1 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
boolean _arg2;
_arg2 = (0!=data.readInt());
this.overridePendingAppTransitionMultiThumbFuture(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_executeAppTransition:
{
data.enforceInterface(DESCRIPTOR);
this.executeAppTransition();
reply.writeNoException();
return true;
}
case TRANSACTION_setAppStartingWindow:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.content.res.CompatibilityInfo _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.res.CompatibilityInfo.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.lang.CharSequence _arg4;
if ((0!=data.readInt())) {
_arg4 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
int _arg6;
_arg6 = data.readInt();
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
android.os.IBinder _arg9;
_arg9 = data.readStrongBinder();
boolean _arg10;
_arg10 = (0!=data.readInt());
boolean _result = this.setAppStartingWindow(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setAppVisibility:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setAppVisibility(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyAppResumed:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
this.notifyAppResumed(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyAppStopped:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.notifyAppStopped(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startAppFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
this.startAppFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopAppFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.stopAppFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeAppToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeAppToken(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_endProlongedAnimations:
{
data.enforceInterface(DESCRIPTOR);
this.endProlongedAnimations();
reply.writeNoException();
return true;
}
case TRANSACTION_updateOrientationFromAppTokens:
{
data.enforceInterface(DESCRIPTOR);
android.content.res.Configuration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
android.content.res.Configuration _result = this.updateOrientationFromAppTokens(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setNewConfiguration:
{
data.enforceInterface(DESCRIPTOR);
android.content.res.Configuration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.res.Configuration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int[] _result = this.setNewConfiguration(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getBoundsForNewConfiguration:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Rect _result = this.getBoundsForNewConfiguration(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_startFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.startFreezingScreen(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopFreezingScreen:
{
data.enforceInterface(DESCRIPTOR);
this.stopFreezingScreen();
reply.writeNoException();
return true;
}
case TRANSACTION_disableKeyguard:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
this.disableKeyguard(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reenableKeyguard:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.reenableKeyguard(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_exitKeyguardSecurely:
{
data.enforceInterface(DESCRIPTOR);
android.view.IOnKeyguardExitResult _arg0;
_arg0 = android.view.IOnKeyguardExitResult.Stub.asInterface(data.readStrongBinder());
this.exitKeyguardSecurely(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isKeyguardLocked:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isKeyguardLocked();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isKeyguardSecure:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isKeyguardSecure();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_inKeyguardRestrictedInputMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.inKeyguardRestrictedInputMode();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_dismissKeyguard:
{
data.enforceInterface(DESCRIPTOR);
this.dismissKeyguard();
reply.writeNoException();
return true;
}
case TRANSACTION_keyguardGoingAway:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.keyguardGoingAway(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_closeSystemDialogs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.closeSystemDialogs(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAnimationScale:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _result = this.getAnimationScale(_arg0);
reply.writeNoException();
reply.writeFloat(_result);
return true;
}
case TRANSACTION_getAnimationScales:
{
data.enforceInterface(DESCRIPTOR);
float[] _result = this.getAnimationScales();
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
case TRANSACTION_setAnimationScale:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
this.setAnimationScale(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAnimationScales:
{
data.enforceInterface(DESCRIPTOR);
float[] _arg0;
_arg0 = data.createFloatArray();
this.setAnimationScales(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentAnimatorScale:
{
data.enforceInterface(DESCRIPTOR);
float _result = this.getCurrentAnimatorScale();
reply.writeNoException();
reply.writeFloat(_result);
return true;
}
case TRANSACTION_setInTouchMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setInTouchMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_showStrictModeViolation:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.showStrictModeViolation(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setStrictModeVisualIndicatorPreference:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setStrictModeVisualIndicatorPreference(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setScreenCaptureDisabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setScreenCaptureDisabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelTaskWindowTransition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.cancelTaskWindowTransition(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelTaskThumbnailTransition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.cancelTaskThumbnailTransition(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_updateRotation:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.updateRotation(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getRotation:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRotation();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_watchRotation:
{
data.enforceInterface(DESCRIPTOR);
android.view.IRotationWatcher _arg0;
_arg0 = android.view.IRotationWatcher.Stub.asInterface(data.readStrongBinder());
int _result = this.watchRotation(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeRotationWatcher:
{
data.enforceInterface(DESCRIPTOR);
android.view.IRotationWatcher _arg0;
_arg0 = android.view.IRotationWatcher.Stub.asInterface(data.readStrongBinder());
this.removeRotationWatcher(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPreferredOptionsPanelGravity:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPreferredOptionsPanelGravity();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_freezeRotation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.freezeRotation(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_thawRotation:
{
data.enforceInterface(DESCRIPTOR);
this.thawRotation();
reply.writeNoException();
return true;
}
case TRANSACTION_isRotationFrozen:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isRotationFrozen();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_screenshotWallpaper:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _result = this.screenshotWallpaper();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_requestAssistScreenshot:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.app.IAssistScreenshotReceiver _arg0;
_arg0 = com.android.internal.app.IAssistScreenshotReceiver.Stub.asInterface(data.readStrongBinder());
boolean _result = this.requestAssistScreenshot(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_screenshotApplications:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
float _arg4;
_arg4 = data.readFloat();
android.graphics.Bitmap _result = this.screenshotApplications(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_statusBarVisibilityChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.statusBarVisibilityChanged(_arg0);
return true;
}
case TRANSACTION_setRecentsVisibility:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setRecentsVisibility(_arg0);
return true;
}
case TRANSACTION_setTvPipVisibility:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setTvPipVisibility(_arg0);
return true;
}
case TRANSACTION_hasNavigationBar:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasNavigationBar();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_lockNow:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.lockNow(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isSafeModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSafeModeEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enableScreenIfNeeded:
{
data.enforceInterface(DESCRIPTOR);
this.enableScreenIfNeeded();
reply.writeNoException();
return true;
}
case TRANSACTION_clearWindowContentFrameStats:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
boolean _result = this.clearWindowContentFrameStats(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getWindowContentFrameStats:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.view.WindowContentFrameStats _result = this.getWindowContentFrameStats(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getDockedStackSide:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDockedStackSide();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDockedStackResizing:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setDockedStackResizing(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setDockedStackDividerTouchRegion:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Rect _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setDockedStackDividerTouchRegion(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerDockedStackListener:
{
data.enforceInterface(DESCRIPTOR);
android.view.IDockedStackListener _arg0;
_arg0 = android.view.IDockedStackListener.Stub.asInterface(data.readStrongBinder());
this.registerDockedStackListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setResizeDimLayer:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
float _arg2;
_arg2 = data.readFloat();
this.setResizeDimLayer(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_requestAppKeyboardShortcuts:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.os.IResultReceiver _arg0;
_arg0 = com.android.internal.os.IResultReceiver.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.requestAppKeyboardShortcuts(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getStableInsets:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Rect _arg0;
_arg0 = new android.graphics.Rect();
this.getStableInsets(_arg0);
reply.writeNoException();
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_registerShortcutKey:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
com.android.internal.policy.IShortcutService _arg1;
_arg1 = com.android.internal.policy.IShortcutService.Stub.asInterface(data.readStrongBinder());
this.registerShortcutKey(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_createWallpaperInputConsumer:
{
data.enforceInterface(DESCRIPTOR);
android.view.InputChannel _arg0;
_arg0 = new android.view.InputChannel();
this.createWallpaperInputConsumer(_arg0);
reply.writeNoException();
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_removeWallpaperInputConsumer:
{
data.enforceInterface(DESCRIPTOR);
this.removeWallpaperInputConsumer();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IWindowManager
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * ===== NOTICE =====
     * The first three methods must remain the first three methods. Scripts
     * and tools rely on their transaction number to work properly.
     */// This is used for debugging

@Override public boolean startViewServer(int port) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(port);
mRemote.transact(Stub.TRANSACTION_startViewServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #1

@Override public boolean stopViewServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopViewServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #2

@Override public boolean isViewServerRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isViewServerRunning, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Transaction #3

@Override public android.view.IWindowSession openSession(android.view.IWindowSessionCallback callback, com.android.internal.view.IInputMethodClient client, com.android.internal.view.IInputContext inputContext) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.IWindowSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeStrongBinder((((inputContext!=null))?(inputContext.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openSession, _data, _reply, 0);
_reply.readException();
_result = android.view.IWindowSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_inputMethodClientHasFocus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void getInitialDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getInitialDisplaySize, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
size.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getBaseDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getBaseDisplaySize, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
size.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setForcedDisplaySize(int displayId, int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_setForcedDisplaySize, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearForcedDisplaySize(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_clearForcedDisplaySize, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getInitialDisplayDensity(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getInitialDisplayDensity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getBaseDisplayDensity(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_getBaseDisplayDensity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setForcedDisplayDensityForUser(int displayId, int density, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(density);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setForcedDisplayDensityForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearForcedDisplayDensityForUser(int displayId, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_clearForcedDisplayDensityForUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setForcedDisplayScalingMode(int displayId, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setForcedDisplayScalingMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// 0 = auto, 1 = disable

@Override public void setOverscan(int displayId, int left, int top, int right, int bottom) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(left);
_data.writeInt(top);
_data.writeInt(right);
_data.writeInt(bottom);
mRemote.transact(Stub.TRANSACTION_setOverscan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These can only be called when holding the MANAGE_APP_TOKENS permission.

@Override public void pauseKeyDispatching(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_pauseKeyDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void resumeKeyDispatching(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_resumeKeyDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setEventDispatching(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setEventDispatching, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addWindowToken(android.os.IBinder token, int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_addWindowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeWindowToken(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_removeWindowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Adds an application token to the specified task Id.
     * @param addPos The position to add the token to in the task.
     * @param token The token to add.
     * @param taskId The Id of the task we are adding the token to.
     * @param stackId Stack Id to create a new Task with the input task Id on
     *                if the task doesn't exist yet.
     * @param requestedOrientation Orientation to use.
     * @param fullscreen True if the application token is fullscreen.
     * @param showWhenLocked True if the application token should be shown when locked.
     * @param userId Id of user to associate the token with.
     * @param configChanges Input configuration changes.
     * @param voiceInteraction True if the token is in voice interaction mode.
     * @param launchTaskBehind True if the token is been launched from behind.
     * @param taskBounds Bounds to use when creating a new Task with the input task Id if
     *                   the task doesn't exist yet.
     * @param configuration Configuration that is being used with this task.
     * @param taskResizeMode The resize mode of the task.
     * @param alwaysFocusable True if the app windows are always focusable regardless of the stack
     *                        they are in.
     * @param homeTask True if this is the task.
     * @param targetSdkVersion The application's target SDK version
     */
@Override public void addAppToken(int addPos, android.view.IApplicationToken token, int taskId, int stackId, int requestedOrientation, boolean fullscreen, boolean showWhenLocked, int userId, int configChanges, boolean voiceInteraction, boolean launchTaskBehind, android.graphics.Rect taskBounds, android.content.res.Configuration configuration, int taskResizeMode, boolean alwaysFocusable, boolean homeTask, int targetSdkVersion, int rotationAnimationHint) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(addPos);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(taskId);
_data.writeInt(stackId);
_data.writeInt(requestedOrientation);
_data.writeInt(((fullscreen)?(1):(0)));
_data.writeInt(((showWhenLocked)?(1):(0)));
_data.writeInt(userId);
_data.writeInt(configChanges);
_data.writeInt(((voiceInteraction)?(1):(0)));
_data.writeInt(((launchTaskBehind)?(1):(0)));
if ((taskBounds!=null)) {
_data.writeInt(1);
taskBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((configuration!=null)) {
_data.writeInt(1);
configuration.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(taskResizeMode);
_data.writeInt(((alwaysFocusable)?(1):(0)));
_data.writeInt(((homeTask)?(1):(0)));
_data.writeInt(targetSdkVersion);
_data.writeInt(rotationAnimationHint);
mRemote.transact(Stub.TRANSACTION_addAppToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     *
     * @param token The token we are adding to the input task Id.
     * @param taskId The Id of the task we are adding the token to.
     * @param stackId Stack Id to create a new Task with the input task Id on
     *                if the task doesn't exist yet.
     * @param taskBounds Bounds to use when creating a new Task with the input task Id if
     *                   the task doesn't exist yet.
     * @param config Configuration that is being used with this task.
     * @param taskResizeMode The resize mode of the task.
     * @param homeTask True if this is the task.
     */
@Override public void setAppTask(android.os.IBinder token, int taskId, int stackId, android.graphics.Rect taskBounds, android.content.res.Configuration config, int taskResizeMode, boolean homeTask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(taskId);
_data.writeInt(stackId);
if ((taskBounds!=null)) {
_data.writeInt(1);
taskBounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(taskResizeMode);
_data.writeInt(((homeTask)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAppTask, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAppOrientation(android.view.IApplicationToken token, int requestedOrientation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(requestedOrientation);
mRemote.transact(Stub.TRANSACTION_setAppOrientation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getAppOrientation(android.view.IApplicationToken token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getAppOrientation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setFocusedApp(android.os.IBinder token, boolean moveFocusNow) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((moveFocusNow)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setFocusedApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void prepareAppTransition(int transit, boolean alwaysKeepCurrent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(transit);
_data.writeInt(((alwaysKeepCurrent)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_prepareAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPendingAppTransition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPendingAppTransition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void overridePendingAppTransition(java.lang.String packageName, int enterAnim, int exitAnim, android.os.IRemoteCallback startedCallback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(enterAnim);
_data.writeInt(exitAnim);
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionScaleUp(int startX, int startY, int startWidth, int startHeight) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(startX);
_data.writeInt(startY);
_data.writeInt(startWidth);
_data.writeInt(startHeight);
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionScaleUp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionClipReveal(int startX, int startY, int startWidth, int startHeight) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(startX);
_data.writeInt(startY);
_data.writeInt(startWidth);
_data.writeInt(startHeight);
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionClipReveal, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionThumb(android.graphics.Bitmap srcThumb, int startX, int startY, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((srcThumb!=null)) {
_data.writeInt(1);
srcThumb.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(startX);
_data.writeInt(startY);
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
_data.writeInt(((scaleUp)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionThumb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionAspectScaledThumb(android.graphics.Bitmap srcThumb, int startX, int startY, int targetWidth, int targetHeight, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((srcThumb!=null)) {
_data.writeInt(1);
srcThumb.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(startX);
_data.writeInt(startY);
_data.writeInt(targetWidth);
_data.writeInt(targetHeight);
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
_data.writeInt(((scaleUp)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionAspectScaledThumb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Overrides animation for app transition that exits from an application to a multi-window
     * environment and allows specifying transition animation parameters for each window.
     *
     * @param specs Array of transition animation descriptions for entering windows.
     *
     * @hide
     */
@Override public void overridePendingAppTransitionMultiThumb(android.view.AppTransitionAnimationSpec[] specs, android.os.IRemoteCallback startedCallback, android.os.IRemoteCallback finishedCallback, boolean scaleUp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(specs, 0);
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
_data.writeStrongBinder((((finishedCallback!=null))?(finishedCallback.asBinder()):(null)));
_data.writeInt(((scaleUp)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionMultiThumb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void overridePendingAppTransitionInPlace(java.lang.String packageName, int anim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(anim);
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionInPlace, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Like overridePendingAppTransitionMultiThumb, but uses a future to supply the specs. This is
     * used for recents, where generating the thumbnails of the specs takes a non-trivial amount of
     * time, so we want to move that off the critical path for starting the new activity.
     */
@Override public void overridePendingAppTransitionMultiThumbFuture(android.view.IAppTransitionAnimationSpecsFuture specsFuture, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((specsFuture!=null))?(specsFuture.asBinder()):(null)));
_data.writeStrongBinder((((startedCallback!=null))?(startedCallback.asBinder()):(null)));
_data.writeInt(((scaleUp)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_overridePendingAppTransitionMultiThumbFuture, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void executeAppTransition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_executeAppTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Called to set the starting window for the input token and returns true if the starting
     * window was set for the token.
     */
@Override public boolean setAppStartingWindow(android.os.IBinder token, java.lang.String pkg, int theme, android.content.res.CompatibilityInfo compatInfo, java.lang.CharSequence nonLocalizedLabel, int labelRes, int icon, int logo, int windowFlags, android.os.IBinder transferFrom, boolean createIfNeeded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeString(pkg);
_data.writeInt(theme);
if ((compatInfo!=null)) {
_data.writeInt(1);
compatInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((nonLocalizedLabel!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(nonLocalizedLabel, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(labelRes);
_data.writeInt(icon);
_data.writeInt(logo);
_data.writeInt(windowFlags);
_data.writeStrongBinder(transferFrom);
_data.writeInt(((createIfNeeded)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAppStartingWindow, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAppVisibility(android.os.IBinder token, boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAppVisibility, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyAppResumed(android.os.IBinder token, boolean wasStopped, boolean allowSavedSurface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((wasStopped)?(1):(0)));
_data.writeInt(((allowSavedSurface)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyAppResumed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyAppStopped(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_notifyAppStopped, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startAppFreezingScreen(android.os.IBinder token, int configChanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(configChanges);
mRemote.transact(Stub.TRANSACTION_startAppFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopAppFreezingScreen(android.os.IBinder token, boolean force) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(((force)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_stopAppFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeAppToken(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_removeAppToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Used by system ui to report that recents has shown itself. */
@Override public void endProlongedAnimations() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_endProlongedAnimations, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Re-evaluate the current orientation from the caller's state.
// If there is a change, the new Configuration is returned and the
// caller must call setNewConfiguration() sometime later.

@Override public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration currentConfig, android.os.IBinder freezeThisOneIfNeeded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.res.Configuration _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((currentConfig!=null)) {
_data.writeInt(1);
currentConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(freezeThisOneIfNeeded);
mRemote.transact(Stub.TRANSACTION_updateOrientationFromAppTokens, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.res.Configuration.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] setNewConfiguration(android.content.res.Configuration config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNewConfiguration, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Retrieves the new bounds after the configuration update evaluated by window manager.

@Override public android.graphics.Rect getBoundsForNewConfiguration(int stackId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Rect _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(stackId);
mRemote.transact(Stub.TRANSACTION_getBoundsForNewConfiguration, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Rect.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startFreezingScreen(int exitAnim, int enterAnim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(exitAnim);
_data.writeInt(enterAnim);
mRemote.transact(Stub.TRANSACTION_startFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopFreezingScreen() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopFreezingScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// these require DISABLE_KEYGUARD permission

@Override public void disableKeyguard(android.os.IBinder token, java.lang.String tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeString(tag);
mRemote.transact(Stub.TRANSACTION_disableKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reenableKeyguard(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_reenableKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_exitKeyguardSecurely, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isKeyguardLocked() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isKeyguardLocked, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isKeyguardSecure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isKeyguardSecure, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean inKeyguardRestrictedInputMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_inKeyguardRestrictedInputMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void dismissKeyguard() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dismissKeyguard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void keyguardGoingAway(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_keyguardGoingAway, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void closeSystemDialogs(java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_closeSystemDialogs, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These can only be called with the SET_ANIMATON_SCALE permission.

@Override public float getAnimationScale(int which) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
mRemote.transact(Stub.TRANSACTION_getAnimationScale, _data, _reply, 0);
_reply.readException();
_result = _reply.readFloat();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public float[] getAnimationScales() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAnimationScales, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAnimationScale(int which, float scale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
_data.writeFloat(scale);
mRemote.transact(Stub.TRANSACTION_setAnimationScale, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAnimationScales(float[] scales) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloatArray(scales);
mRemote.transact(Stub.TRANSACTION_setAnimationScales, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public float getCurrentAnimatorScale() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentAnimatorScale, _data, _reply, 0);
_reply.readException();
_result = _reply.readFloat();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// For testing

@Override public void setInTouchMode(boolean showFocus) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showFocus)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setInTouchMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// For StrictMode flashing a red border on violations from the UI
// thread.  The uid/pid is implicit from the Binder call, and the Window
// Manager uses that to determine whether or not the red border should
// actually be shown.  (it will be ignored that pid doesn't have windows
// on screen)

@Override public void showStrictModeViolation(boolean on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((on)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_showStrictModeViolation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Proxy to set the system property for whether the flashing
// should be enabled.  The 'enabled' value is null or blank for
// the system default (differs per build variant) or any valid
// boolean string as parsed by SystemProperties.getBoolean().

@Override public void setStrictModeVisualIndicatorPreference(java.lang.String enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(enabled);
mRemote.transact(Stub.TRANSACTION_setStrictModeVisualIndicatorPreference, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set whether screen capture is disabled for all windows of a specific user
     */
@Override public void setScreenCaptureDisabled(int userId, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setScreenCaptureDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Cancels the window transitions for the given task.
     */
@Override public void cancelTaskWindowTransition(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_cancelTaskWindowTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Cancels the thumbnail transitions for the given task.
     */
@Override public void cancelTaskThumbnailTransition(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_cancelTaskThumbnailTransition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// These can only be called with the SET_ORIENTATION permission.
/**
     * Update the current screen rotation based on the current state of
     * the world.
     * @param alwaysSendConfiguration Flag to force a new configuration to
     * be evaluated.  This can be used when there are other parameters in
     * configuration that are changing.
     * @param forceRelayout If true, the window manager will always do a relayout
     * of its windows even if the rotation hasn't changed.
     */
@Override public void updateRotation(boolean alwaysSendConfiguration, boolean forceRelayout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((alwaysSendConfiguration)?(1):(0)));
_data.writeInt(((forceRelayout)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateRotation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getRotation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRotation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int watchRotation(android.view.IRotationWatcher watcher) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((watcher!=null))?(watcher.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_watchRotation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Remove a rotation watcher set using watchRotation.
     * @hide
     */
@Override public void removeRotationWatcher(android.view.IRotationWatcher watcher) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((watcher!=null))?(watcher.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeRotationWatcher, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPreferredOptionsPanelGravity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPreferredOptionsPanelGravity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Lock the device orientation to the specified rotation, or to the
     * current rotation if -1.  Sensor input will be ignored until
     * thawRotation() is called.
     * @hide
     */
@Override public void freezeRotation(int rotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rotation);
mRemote.transact(Stub.TRANSACTION_freezeRotation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Release the orientation lock imposed by freezeRotation().
     * @hide
     */
@Override public void thawRotation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_thawRotation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Gets whether the rotation is frozen.
     *
     * @return Whether the rotation is frozen.
     */
@Override public boolean isRotationFrozen() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isRotationFrozen, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Screenshot the current wallpaper layer, including the whole screen.
     */
@Override public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_screenshotWallpaper, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Used only for assist -- request a screenshot of the current application.
     */
@Override public boolean requestAssistScreenshot(com.android.internal.app.IAssistScreenshotReceiver receiver) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((receiver!=null))?(receiver.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_requestAssistScreenshot, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Create a screenshot of the applications currently displayed.
     *
     * @param frameScale the scale to apply to the frame, only used when width = -1 and
     *                   height = -1
     */
@Override public android.graphics.Bitmap screenshotApplications(android.os.IBinder appToken, int displayId, int maxWidth, int maxHeight, float frameScale) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Bitmap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(appToken);
_data.writeInt(displayId);
_data.writeInt(maxWidth);
_data.writeInt(maxHeight);
_data.writeFloat(frameScale);
mRemote.transact(Stub.TRANSACTION_screenshotApplications, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Bitmap.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Called by the status bar to notify Views of changes to System UI visiblity.
     */
@Override public void statusBarVisibilityChanged(int visibility) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(visibility);
mRemote.transact(Stub.TRANSACTION_statusBarVisibilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called by System UI to notify of changes to the visibility of Recents.
     */
@Override public void setRecentsVisibility(boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRecentsVisibility, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called by System UI to notify of changes to the visibility of PIP.
     */
@Override public void setTvPipVisibility(boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setTvPipVisibility, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Device has a software navigation bar (separate from the status bar).
     */
@Override public boolean hasNavigationBar() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasNavigationBar, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Lock the device immediately with the specified options (can be null).
     */
@Override public void lockNow(android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_lockNow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Device is in safe mode.
     */
@Override public boolean isSafeModeEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSafeModeEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enables the screen if all conditions are met.
     */
@Override public void enableScreenIfNeeded() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enableScreenIfNeeded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Clears the frame statistics for a given window.
     *
     * @param token The window token.
     * @return Whether the frame statistics were cleared.
     */
@Override public boolean clearWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_clearWindowContentFrameStats, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets the content frame statistics for a given window.
     *
     * @param token The window token.
     * @return The frame statistics or null if the window does not exist.
     */
@Override public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.WindowContentFrameStats _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_getWindowContentFrameStats, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.view.WindowContentFrameStats.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDockedStackSide() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDockedStackSide, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets whether we are currently in a drag resize operation where we are changing the docked
     * stack size.
     */
@Override public void setDockedStackResizing(boolean resizing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((resizing)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setDockedStackResizing, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sets the region the user can touch the divider. This region will be excluded from the region
     * which is used to cause a focus switch when dispatching touch.
     */
@Override public void setDockedStackDividerTouchRegion(android.graphics.Rect touchableRegion) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((touchableRegion!=null)) {
_data.writeInt(1);
touchableRegion.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDockedStackDividerTouchRegion, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Registers a listener that will be called when the dock divider changes its visibility or when
     * the docked stack gets added/removed.
     */
@Override public void registerDockedStackListener(android.view.IDockedStackListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerDockedStackListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Updates the dim layer used while resizing.
     *
     * @param visible Whether the dim layer should be visible.
     * @param targetStackId The id of the task stack the dim layer should be placed on.
     * @param alpha The translucency of the dim layer, between 0 and 1.
     */
@Override public void setResizeDimLayer(boolean visible, int targetStackId, float alpha) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((visible)?(1):(0)));
_data.writeInt(targetStackId);
_data.writeFloat(alpha);
mRemote.transact(Stub.TRANSACTION_setResizeDimLayer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Requests Keyboard Shortcuts from the displayed window.
     *
     * @param receiver The receiver to deliver the results to.
     */
@Override public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver receiver, int deviceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((receiver!=null))?(receiver.asBinder()):(null)));
_data.writeInt(deviceId);
mRemote.transact(Stub.TRANSACTION_requestAppKeyboardShortcuts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Retrieves the current stable insets from the primary display.
     */
@Override public void getStableInsets(android.graphics.Rect outInsets) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStableInsets, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
outInsets.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Register shortcut key. Shortcut code is packed as:
     * (MetaState << Integer.SIZE) | KeyCode
     * @hide
     */
@Override public void registerShortcutKey(long shortcutCode, com.android.internal.policy.IShortcutService keySubscriber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(shortcutCode);
_data.writeStrongBinder((((keySubscriber!=null))?(keySubscriber.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerShortcutKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Create the input consumer for wallpaper events.
     */
@Override public void createWallpaperInputConsumer(android.view.InputChannel inputChannel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_createWallpaperInputConsumer, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
inputChannel.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Remove the input consumer for wallpaper events.
     */
@Override public void removeWallpaperInputConsumer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_removeWallpaperInputConsumer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_startViewServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopViewServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isViewServerRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_openSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_inputMethodClientHasFocus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getInitialDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getBaseDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setForcedDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_clearForcedDisplaySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getInitialDisplayDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getBaseDisplayDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setForcedDisplayDensityForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_clearForcedDisplayDensityForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setForcedDisplayScalingMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setOverscan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_pauseKeyDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_resumeKeyDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setEventDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_addWindowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_removeWindowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_addAppToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_setAppTask = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_setAppOrientation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getAppOrientation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setFocusedApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_prepareAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getPendingAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_overridePendingAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_overridePendingAppTransitionScaleUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_overridePendingAppTransitionClipReveal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_overridePendingAppTransitionThumb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_overridePendingAppTransitionAspectScaledThumb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_overridePendingAppTransitionMultiThumb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_overridePendingAppTransitionInPlace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_overridePendingAppTransitionMultiThumbFuture = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_executeAppTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_setAppStartingWindow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_setAppVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_notifyAppResumed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_notifyAppStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_startAppFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_stopAppFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_removeAppToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_endProlongedAnimations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_updateOrientationFromAppTokens = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_setNewConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_getBoundsForNewConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_startFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_stopFreezingScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_disableKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_reenableKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_exitKeyguardSecurely = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_isKeyguardLocked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_isKeyguardSecure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_inKeyguardRestrictedInputMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_dismissKeyguard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_keyguardGoingAway = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_closeSystemDialogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_getAnimationScale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_getAnimationScales = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_setAnimationScale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_setAnimationScales = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_getCurrentAnimatorScale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_setInTouchMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_showStrictModeViolation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_setStrictModeVisualIndicatorPreference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_setScreenCaptureDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_cancelTaskWindowTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_cancelTaskThumbnailTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_updateRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
static final int TRANSACTION_getRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_watchRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_removeRotationWatcher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_getPreferredOptionsPanelGravity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
static final int TRANSACTION_freezeRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
static final int TRANSACTION_thawRotation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
static final int TRANSACTION_isRotationFrozen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
static final int TRANSACTION_screenshotWallpaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
static final int TRANSACTION_requestAssistScreenshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
static final int TRANSACTION_screenshotApplications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
static final int TRANSACTION_statusBarVisibilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
static final int TRANSACTION_setRecentsVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
static final int TRANSACTION_setTvPipVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
static final int TRANSACTION_hasNavigationBar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
static final int TRANSACTION_lockNow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
static final int TRANSACTION_isSafeModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
static final int TRANSACTION_enableScreenIfNeeded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
static final int TRANSACTION_clearWindowContentFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
static final int TRANSACTION_getWindowContentFrameStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 88);
static final int TRANSACTION_getDockedStackSide = (android.os.IBinder.FIRST_CALL_TRANSACTION + 89);
static final int TRANSACTION_setDockedStackResizing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 90);
static final int TRANSACTION_setDockedStackDividerTouchRegion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 91);
static final int TRANSACTION_registerDockedStackListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 92);
static final int TRANSACTION_setResizeDimLayer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 93);
static final int TRANSACTION_requestAppKeyboardShortcuts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 94);
static final int TRANSACTION_getStableInsets = (android.os.IBinder.FIRST_CALL_TRANSACTION + 95);
static final int TRANSACTION_registerShortcutKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 96);
static final int TRANSACTION_createWallpaperInputConsumer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 97);
static final int TRANSACTION_removeWallpaperInputConsumer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 98);
}
/**
     * ===== NOTICE =====
     * The first three methods must remain the first three methods. Scripts
     * and tools rely on their transaction number to work properly.
     */// This is used for debugging

public boolean startViewServer(int port) throws android.os.RemoteException;
// Transaction #1

public boolean stopViewServer() throws android.os.RemoteException;
// Transaction #2

public boolean isViewServerRunning() throws android.os.RemoteException;
// Transaction #3

public android.view.IWindowSession openSession(android.view.IWindowSessionCallback callback, com.android.internal.view.IInputMethodClient client, com.android.internal.view.IInputContext inputContext) throws android.os.RemoteException;
public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient client) throws android.os.RemoteException;
public void getInitialDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException;
public void getBaseDisplaySize(int displayId, android.graphics.Point size) throws android.os.RemoteException;
public void setForcedDisplaySize(int displayId, int width, int height) throws android.os.RemoteException;
public void clearForcedDisplaySize(int displayId) throws android.os.RemoteException;
public int getInitialDisplayDensity(int displayId) throws android.os.RemoteException;
public int getBaseDisplayDensity(int displayId) throws android.os.RemoteException;
public void setForcedDisplayDensityForUser(int displayId, int density, int userId) throws android.os.RemoteException;
public void clearForcedDisplayDensityForUser(int displayId, int userId) throws android.os.RemoteException;
public void setForcedDisplayScalingMode(int displayId, int mode) throws android.os.RemoteException;
// 0 = auto, 1 = disable

public void setOverscan(int displayId, int left, int top, int right, int bottom) throws android.os.RemoteException;
// These can only be called when holding the MANAGE_APP_TOKENS permission.

public void pauseKeyDispatching(android.os.IBinder token) throws android.os.RemoteException;
public void resumeKeyDispatching(android.os.IBinder token) throws android.os.RemoteException;
public void setEventDispatching(boolean enabled) throws android.os.RemoteException;
public void addWindowToken(android.os.IBinder token, int type) throws android.os.RemoteException;
public void removeWindowToken(android.os.IBinder token) throws android.os.RemoteException;
/**
     * Adds an application token to the specified task Id.
     * @param addPos The position to add the token to in the task.
     * @param token The token to add.
     * @param taskId The Id of the task we are adding the token to.
     * @param stackId Stack Id to create a new Task with the input task Id on
     *                if the task doesn't exist yet.
     * @param requestedOrientation Orientation to use.
     * @param fullscreen True if the application token is fullscreen.
     * @param showWhenLocked True if the application token should be shown when locked.
     * @param userId Id of user to associate the token with.
     * @param configChanges Input configuration changes.
     * @param voiceInteraction True if the token is in voice interaction mode.
     * @param launchTaskBehind True if the token is been launched from behind.
     * @param taskBounds Bounds to use when creating a new Task with the input task Id if
     *                   the task doesn't exist yet.
     * @param configuration Configuration that is being used with this task.
     * @param taskResizeMode The resize mode of the task.
     * @param alwaysFocusable True if the app windows are always focusable regardless of the stack
     *                        they are in.
     * @param homeTask True if this is the task.
     * @param targetSdkVersion The application's target SDK version
     */
public void addAppToken(int addPos, android.view.IApplicationToken token, int taskId, int stackId, int requestedOrientation, boolean fullscreen, boolean showWhenLocked, int userId, int configChanges, boolean voiceInteraction, boolean launchTaskBehind, android.graphics.Rect taskBounds, android.content.res.Configuration configuration, int taskResizeMode, boolean alwaysFocusable, boolean homeTask, int targetSdkVersion, int rotationAnimationHint) throws android.os.RemoteException;
/**
     *
     * @param token The token we are adding to the input task Id.
     * @param taskId The Id of the task we are adding the token to.
     * @param stackId Stack Id to create a new Task with the input task Id on
     *                if the task doesn't exist yet.
     * @param taskBounds Bounds to use when creating a new Task with the input task Id if
     *                   the task doesn't exist yet.
     * @param config Configuration that is being used with this task.
     * @param taskResizeMode The resize mode of the task.
     * @param homeTask True if this is the task.
     */
public void setAppTask(android.os.IBinder token, int taskId, int stackId, android.graphics.Rect taskBounds, android.content.res.Configuration config, int taskResizeMode, boolean homeTask) throws android.os.RemoteException;
public void setAppOrientation(android.view.IApplicationToken token, int requestedOrientation) throws android.os.RemoteException;
public int getAppOrientation(android.view.IApplicationToken token) throws android.os.RemoteException;
public void setFocusedApp(android.os.IBinder token, boolean moveFocusNow) throws android.os.RemoteException;
public void prepareAppTransition(int transit, boolean alwaysKeepCurrent) throws android.os.RemoteException;
public int getPendingAppTransition() throws android.os.RemoteException;
public void overridePendingAppTransition(java.lang.String packageName, int enterAnim, int exitAnim, android.os.IRemoteCallback startedCallback) throws android.os.RemoteException;
public void overridePendingAppTransitionScaleUp(int startX, int startY, int startWidth, int startHeight) throws android.os.RemoteException;
public void overridePendingAppTransitionClipReveal(int startX, int startY, int startWidth, int startHeight) throws android.os.RemoteException;
public void overridePendingAppTransitionThumb(android.graphics.Bitmap srcThumb, int startX, int startY, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException;
public void overridePendingAppTransitionAspectScaledThumb(android.graphics.Bitmap srcThumb, int startX, int startY, int targetWidth, int targetHeight, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException;
/**
     * Overrides animation for app transition that exits from an application to a multi-window
     * environment and allows specifying transition animation parameters for each window.
     *
     * @param specs Array of transition animation descriptions for entering windows.
     *
     * @hide
     */
public void overridePendingAppTransitionMultiThumb(android.view.AppTransitionAnimationSpec[] specs, android.os.IRemoteCallback startedCallback, android.os.IRemoteCallback finishedCallback, boolean scaleUp) throws android.os.RemoteException;
public void overridePendingAppTransitionInPlace(java.lang.String packageName, int anim) throws android.os.RemoteException;
/**
     * Like overridePendingAppTransitionMultiThumb, but uses a future to supply the specs. This is
     * used for recents, where generating the thumbnails of the specs takes a non-trivial amount of
     * time, so we want to move that off the critical path for starting the new activity.
     */
public void overridePendingAppTransitionMultiThumbFuture(android.view.IAppTransitionAnimationSpecsFuture specsFuture, android.os.IRemoteCallback startedCallback, boolean scaleUp) throws android.os.RemoteException;
public void executeAppTransition() throws android.os.RemoteException;
/**
     * Called to set the starting window for the input token and returns true if the starting
     * window was set for the token.
     */
public boolean setAppStartingWindow(android.os.IBinder token, java.lang.String pkg, int theme, android.content.res.CompatibilityInfo compatInfo, java.lang.CharSequence nonLocalizedLabel, int labelRes, int icon, int logo, int windowFlags, android.os.IBinder transferFrom, boolean createIfNeeded) throws android.os.RemoteException;
public void setAppVisibility(android.os.IBinder token, boolean visible) throws android.os.RemoteException;
public void notifyAppResumed(android.os.IBinder token, boolean wasStopped, boolean allowSavedSurface) throws android.os.RemoteException;
public void notifyAppStopped(android.os.IBinder token) throws android.os.RemoteException;
public void startAppFreezingScreen(android.os.IBinder token, int configChanges) throws android.os.RemoteException;
public void stopAppFreezingScreen(android.os.IBinder token, boolean force) throws android.os.RemoteException;
public void removeAppToken(android.os.IBinder token) throws android.os.RemoteException;
/** Used by system ui to report that recents has shown itself. */
public void endProlongedAnimations() throws android.os.RemoteException;
// Re-evaluate the current orientation from the caller's state.
// If there is a change, the new Configuration is returned and the
// caller must call setNewConfiguration() sometime later.

public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration currentConfig, android.os.IBinder freezeThisOneIfNeeded) throws android.os.RemoteException;
public int[] setNewConfiguration(android.content.res.Configuration config) throws android.os.RemoteException;
// Retrieves the new bounds after the configuration update evaluated by window manager.

public android.graphics.Rect getBoundsForNewConfiguration(int stackId) throws android.os.RemoteException;
public void startFreezingScreen(int exitAnim, int enterAnim) throws android.os.RemoteException;
public void stopFreezingScreen() throws android.os.RemoteException;
// these require DISABLE_KEYGUARD permission

public void disableKeyguard(android.os.IBinder token, java.lang.String tag) throws android.os.RemoteException;
public void reenableKeyguard(android.os.IBinder token) throws android.os.RemoteException;
public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult callback) throws android.os.RemoteException;
public boolean isKeyguardLocked() throws android.os.RemoteException;
public boolean isKeyguardSecure() throws android.os.RemoteException;
public boolean inKeyguardRestrictedInputMode() throws android.os.RemoteException;
public void dismissKeyguard() throws android.os.RemoteException;
public void keyguardGoingAway(int flags) throws android.os.RemoteException;
public void closeSystemDialogs(java.lang.String reason) throws android.os.RemoteException;
// These can only be called with the SET_ANIMATON_SCALE permission.

public float getAnimationScale(int which) throws android.os.RemoteException;
public float[] getAnimationScales() throws android.os.RemoteException;
public void setAnimationScale(int which, float scale) throws android.os.RemoteException;
public void setAnimationScales(float[] scales) throws android.os.RemoteException;
public float getCurrentAnimatorScale() throws android.os.RemoteException;
// For testing

public void setInTouchMode(boolean showFocus) throws android.os.RemoteException;
// For StrictMode flashing a red border on violations from the UI
// thread.  The uid/pid is implicit from the Binder call, and the Window
// Manager uses that to determine whether or not the red border should
// actually be shown.  (it will be ignored that pid doesn't have windows
// on screen)

public void showStrictModeViolation(boolean on) throws android.os.RemoteException;
// Proxy to set the system property for whether the flashing
// should be enabled.  The 'enabled' value is null or blank for
// the system default (differs per build variant) or any valid
// boolean string as parsed by SystemProperties.getBoolean().

public void setStrictModeVisualIndicatorPreference(java.lang.String enabled) throws android.os.RemoteException;
/**
     * Set whether screen capture is disabled for all windows of a specific user
     */
public void setScreenCaptureDisabled(int userId, boolean disabled) throws android.os.RemoteException;
/**
     * Cancels the window transitions for the given task.
     */
public void cancelTaskWindowTransition(int taskId) throws android.os.RemoteException;
/**
     * Cancels the thumbnail transitions for the given task.
     */
public void cancelTaskThumbnailTransition(int taskId) throws android.os.RemoteException;
// These can only be called with the SET_ORIENTATION permission.
/**
     * Update the current screen rotation based on the current state of
     * the world.
     * @param alwaysSendConfiguration Flag to force a new configuration to
     * be evaluated.  This can be used when there are other parameters in
     * configuration that are changing.
     * @param forceRelayout If true, the window manager will always do a relayout
     * of its windows even if the rotation hasn't changed.
     */
public void updateRotation(boolean alwaysSendConfiguration, boolean forceRelayout) throws android.os.RemoteException;
public int getRotation() throws android.os.RemoteException;
public int watchRotation(android.view.IRotationWatcher watcher) throws android.os.RemoteException;
/**
     * Remove a rotation watcher set using watchRotation.
     * @hide
     */
public void removeRotationWatcher(android.view.IRotationWatcher watcher) throws android.os.RemoteException;
public int getPreferredOptionsPanelGravity() throws android.os.RemoteException;
/**
     * Lock the device orientation to the specified rotation, or to the
     * current rotation if -1.  Sensor input will be ignored until
     * thawRotation() is called.
     * @hide
     */
public void freezeRotation(int rotation) throws android.os.RemoteException;
/**
     * Release the orientation lock imposed by freezeRotation().
     * @hide
     */
public void thawRotation() throws android.os.RemoteException;
/**
     * Gets whether the rotation is frozen.
     *
     * @return Whether the rotation is frozen.
     */
public boolean isRotationFrozen() throws android.os.RemoteException;
/**
     * Screenshot the current wallpaper layer, including the whole screen.
     */
public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException;
/**
     * Used only for assist -- request a screenshot of the current application.
     */
public boolean requestAssistScreenshot(com.android.internal.app.IAssistScreenshotReceiver receiver) throws android.os.RemoteException;
/**
     * Create a screenshot of the applications currently displayed.
     *
     * @param frameScale the scale to apply to the frame, only used when width = -1 and
     *                   height = -1
     */
public android.graphics.Bitmap screenshotApplications(android.os.IBinder appToken, int displayId, int maxWidth, int maxHeight, float frameScale) throws android.os.RemoteException;
/**
     * Called by the status bar to notify Views of changes to System UI visiblity.
     */
public void statusBarVisibilityChanged(int visibility) throws android.os.RemoteException;
/**
     * Called by System UI to notify of changes to the visibility of Recents.
     */
public void setRecentsVisibility(boolean visible) throws android.os.RemoteException;
/**
     * Called by System UI to notify of changes to the visibility of PIP.
     */
public void setTvPipVisibility(boolean visible) throws android.os.RemoteException;
/**
     * Device has a software navigation bar (separate from the status bar).
     */
public boolean hasNavigationBar() throws android.os.RemoteException;
/**
     * Lock the device immediately with the specified options (can be null).
     */
public void lockNow(android.os.Bundle options) throws android.os.RemoteException;
/**
     * Device is in safe mode.
     */
public boolean isSafeModeEnabled() throws android.os.RemoteException;
/**
     * Enables the screen if all conditions are met.
     */
public void enableScreenIfNeeded() throws android.os.RemoteException;
/**
     * Clears the frame statistics for a given window.
     *
     * @param token The window token.
     * @return Whether the frame statistics were cleared.
     */
public boolean clearWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException;
/**
     * Gets the content frame statistics for a given window.
     *
     * @param token The window token.
     * @return The frame statistics or null if the window does not exist.
     */
public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder token) throws android.os.RemoteException;
public int getDockedStackSide() throws android.os.RemoteException;
/**
     * Sets whether we are currently in a drag resize operation where we are changing the docked
     * stack size.
     */
public void setDockedStackResizing(boolean resizing) throws android.os.RemoteException;
/**
     * Sets the region the user can touch the divider. This region will be excluded from the region
     * which is used to cause a focus switch when dispatching touch.
     */
public void setDockedStackDividerTouchRegion(android.graphics.Rect touchableRegion) throws android.os.RemoteException;
/**
     * Registers a listener that will be called when the dock divider changes its visibility or when
     * the docked stack gets added/removed.
     */
public void registerDockedStackListener(android.view.IDockedStackListener listener) throws android.os.RemoteException;
/**
     * Updates the dim layer used while resizing.
     *
     * @param visible Whether the dim layer should be visible.
     * @param targetStackId The id of the task stack the dim layer should be placed on.
     * @param alpha The translucency of the dim layer, between 0 and 1.
     */
public void setResizeDimLayer(boolean visible, int targetStackId, float alpha) throws android.os.RemoteException;
/**
     * Requests Keyboard Shortcuts from the displayed window.
     *
     * @param receiver The receiver to deliver the results to.
     */
public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver receiver, int deviceId) throws android.os.RemoteException;
/**
     * Retrieves the current stable insets from the primary display.
     */
public void getStableInsets(android.graphics.Rect outInsets) throws android.os.RemoteException;
/**
     * Register shortcut key. Shortcut code is packed as:
     * (MetaState << Integer.SIZE) | KeyCode
     * @hide
     */
public void registerShortcutKey(long shortcutCode, com.android.internal.policy.IShortcutService keySubscriber) throws android.os.RemoteException;
/**
     * Create the input consumer for wallpaper events.
     */
public void createWallpaperInputConsumer(android.view.InputChannel inputChannel) throws android.os.RemoteException;
/**
     * Remove the input consumer for wallpaper events.
     */
public void removeWallpaperInputConsumer() throws android.os.RemoteException;
}
