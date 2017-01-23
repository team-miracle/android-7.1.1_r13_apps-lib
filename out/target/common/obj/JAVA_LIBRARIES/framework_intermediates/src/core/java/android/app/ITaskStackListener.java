/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/ITaskStackListener.aidl
 */
package android.app;
/** @hide */
public interface ITaskStackListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.ITaskStackListener
{
private static final java.lang.String DESCRIPTOR = "android.app.ITaskStackListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.ITaskStackListener interface,
 * generating a proxy if needed.
 */
public static android.app.ITaskStackListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.ITaskStackListener))) {
return ((android.app.ITaskStackListener)iin);
}
return new android.app.ITaskStackListener.Stub.Proxy(obj);
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
case TRANSACTION_onTaskStackChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onTaskStackChanged();
return true;
}
case TRANSACTION_onActivityPinned:
{
data.enforceInterface(DESCRIPTOR);
this.onActivityPinned();
return true;
}
case TRANSACTION_onPinnedActivityRestartAttempt:
{
data.enforceInterface(DESCRIPTOR);
this.onPinnedActivityRestartAttempt();
return true;
}
case TRANSACTION_onPinnedStackAnimationEnded:
{
data.enforceInterface(DESCRIPTOR);
this.onPinnedStackAnimationEnded();
return true;
}
case TRANSACTION_onActivityForcedResizable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onActivityForcedResizable(_arg0, _arg1);
return true;
}
case TRANSACTION_onActivityDismissingDockedStack:
{
data.enforceInterface(DESCRIPTOR);
this.onActivityDismissingDockedStack();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.ITaskStackListener
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
/** Called whenever there are changes to the state of tasks in a stack. */
@Override public void onTaskStackChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onTaskStackChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/** Called whenever an Activity is moved to the pinned stack from another stack. */
@Override public void onActivityPinned() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onActivityPinned, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called whenever IActivityManager.startActivity is called on an activity that is already
     * running in the pinned stack and the activity is not actually started, but the task is either
     * brought to the front or a new Intent is delivered to it.
     */
@Override public void onPinnedActivityRestartAttempt() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onPinnedActivityRestartAttempt, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called whenever the pinned stack is done animating a resize.
     */
@Override public void onPinnedStackAnimationEnded() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onPinnedStackAnimationEnded, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when we launched an activity that we forced to be resizable.
     */
@Override public void onActivityForcedResizable(java.lang.String packageName, int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_onActivityForcedResizable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Callen when we launched an activity that is dismissed the docked stack.
     */
@Override public void onActivityDismissingDockedStack() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onActivityDismissingDockedStack, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onTaskStackChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onActivityPinned = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onPinnedActivityRestartAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onPinnedStackAnimationEnded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onActivityForcedResizable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onActivityDismissingDockedStack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
/** Called whenever there are changes to the state of tasks in a stack. */
public void onTaskStackChanged() throws android.os.RemoteException;
/** Called whenever an Activity is moved to the pinned stack from another stack. */
public void onActivityPinned() throws android.os.RemoteException;
/**
     * Called whenever IActivityManager.startActivity is called on an activity that is already
     * running in the pinned stack and the activity is not actually started, but the task is either
     * brought to the front or a new Intent is delivered to it.
     */
public void onPinnedActivityRestartAttempt() throws android.os.RemoteException;
/**
     * Called whenever the pinned stack is done animating a resize.
     */
public void onPinnedStackAnimationEnded() throws android.os.RemoteException;
/**
     * Called when we launched an activity that we forced to be resizable.
     */
public void onActivityForcedResizable(java.lang.String packageName, int taskId) throws android.os.RemoteException;
/**
     * Callen when we launched an activity that is dismissed the docked stack.
     */
public void onActivityDismissingDockedStack() throws android.os.RemoteException;
}
