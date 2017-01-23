/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/hardware/hvac/ICarHvacEventListener.aidl
 */
package android.car.hardware.hvac;
/**
 * Binder callback for CarHvacEventListener.
 * This is generated per each CarClient.
 * @hide
 */
public interface ICarHvacEventListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.hardware.hvac.ICarHvacEventListener
{
private static final java.lang.String DESCRIPTOR = "android.car.hardware.hvac.ICarHvacEventListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.hardware.hvac.ICarHvacEventListener interface,
 * generating a proxy if needed.
 */
public static android.car.hardware.hvac.ICarHvacEventListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.hardware.hvac.ICarHvacEventListener))) {
return ((android.car.hardware.hvac.ICarHvacEventListener)iin);
}
return new android.car.hardware.hvac.ICarHvacEventListener.Stub.Proxy(obj);
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
case TRANSACTION_onEvent:
{
data.enforceInterface(DESCRIPTOR);
android.car.hardware.hvac.CarHvacEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.hardware.hvac.CarHvacEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onEvent(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.hardware.hvac.ICarHvacEventListener
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
     * Called when an event is triggered in response to one of the calls (such as on tune) or
     * asynchronously (such as on announcement).
     */
@Override public void onEvent(android.car.hardware.hvac.CarHvacEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called when an event is triggered in response to one of the calls (such as on tune) or
     * asynchronously (such as on announcement).
     */
public void onEvent(android.car.hardware.hvac.CarHvacEvent event) throws android.os.RemoteException;
}
