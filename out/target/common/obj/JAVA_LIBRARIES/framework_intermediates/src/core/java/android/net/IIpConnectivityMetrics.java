/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/IIpConnectivityMetrics.aidl
 */
package android.net;
/** {@hide} */
public interface IIpConnectivityMetrics extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.IIpConnectivityMetrics
{
private static final java.lang.String DESCRIPTOR = "android.net.IIpConnectivityMetrics";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.IIpConnectivityMetrics interface,
 * generating a proxy if needed.
 */
public static android.net.IIpConnectivityMetrics asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.IIpConnectivityMetrics))) {
return ((android.net.IIpConnectivityMetrics)iin);
}
return new android.net.IIpConnectivityMetrics.Stub.Proxy(obj);
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
case TRANSACTION_logEvent:
{
data.enforceInterface(DESCRIPTOR);
android.net.ConnectivityMetricsEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.ConnectivityMetricsEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.logEvent(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.IIpConnectivityMetrics
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
@Override public int logEvent(android.net.ConnectivityMetricsEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_logEvent, _data, _reply, 0);
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
static final int TRANSACTION_logEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public int logEvent(android.net.ConnectivityMetricsEvent event) throws android.os.RemoteException;
}
