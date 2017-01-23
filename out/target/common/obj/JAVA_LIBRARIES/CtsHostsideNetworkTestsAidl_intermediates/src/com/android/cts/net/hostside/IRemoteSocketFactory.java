/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: cts/hostsidetests/net/aidl/com/android/cts/net/hostside/IRemoteSocketFactory.aidl
 */
package com.android.cts.net.hostside;
public interface IRemoteSocketFactory extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.cts.net.hostside.IRemoteSocketFactory
{
private static final java.lang.String DESCRIPTOR = "com.android.cts.net.hostside.IRemoteSocketFactory";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.cts.net.hostside.IRemoteSocketFactory interface,
 * generating a proxy if needed.
 */
public static com.android.cts.net.hostside.IRemoteSocketFactory asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.cts.net.hostside.IRemoteSocketFactory))) {
return ((com.android.cts.net.hostside.IRemoteSocketFactory)iin);
}
return new com.android.cts.net.hostside.IRemoteSocketFactory.Stub.Proxy(obj);
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
case TRANSACTION_openSocketFd:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.ParcelFileDescriptor _result = this.openSocketFd(_arg0, _arg1, _arg2);
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
case TRANSACTION_getPackageName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPackageName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getUid:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getUid();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.cts.net.hostside.IRemoteSocketFactory
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
@Override public android.os.ParcelFileDescriptor openSocketFd(java.lang.String host, int port, int timeoutMs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(host);
_data.writeInt(port);
_data.writeInt(timeoutMs);
mRemote.transact(Stub.TRANSACTION_openSocketFd, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String getPackageName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPackageName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getUid() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUid, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_openSocketFd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPackageName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getUid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public android.os.ParcelFileDescriptor openSocketFd(java.lang.String host, int port, int timeoutMs) throws android.os.RemoteException;
public java.lang.String getPackageName() throws android.os.RemoteException;
public int getUid() throws android.os.RemoteException;
}
