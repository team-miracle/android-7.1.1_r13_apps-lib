/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/apps/TV/tests/common/src/com/android/tv/testing/testinput/ITestInputControl.aidl
 */
package com.android.tv.testing.testinput;
/** Remote interface for controlling the test TV Input Service */
public interface ITestInputControl extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.tv.testing.testinput.ITestInputControl
{
private static final java.lang.String DESCRIPTOR = "com.android.tv.testing.testinput.ITestInputControl";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.tv.testing.testinput.ITestInputControl interface,
 * generating a proxy if needed.
 */
public static com.android.tv.testing.testinput.ITestInputControl asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.tv.testing.testinput.ITestInputControl))) {
return ((com.android.tv.testing.testinput.ITestInputControl)iin);
}
return new com.android.tv.testing.testinput.ITestInputControl.Stub.Proxy(obj);
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
case TRANSACTION_updateChannelState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.tv.testing.testinput.ChannelStateData _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.tv.testing.testinput.ChannelStateData.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.updateChannelState(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.tv.testing.testinput.ITestInputControl
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
@Override public void updateChannelState(int origId, com.android.tv.testing.testinput.ChannelStateData data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(origId);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateChannelState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_updateChannelState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void updateChannelState(int origId, com.android.tv.testing.testinput.ChannelStateData data) throws android.os.RemoteException;
}
