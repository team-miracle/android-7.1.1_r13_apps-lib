/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/hardware/hvac/ICarHvac.aidl
 */
package android.car.hardware.hvac;
/** @hide */
public interface ICarHvac extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.hardware.hvac.ICarHvac
{
private static final java.lang.String DESCRIPTOR = "android.car.hardware.hvac.ICarHvac";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.hardware.hvac.ICarHvac interface,
 * generating a proxy if needed.
 */
public static android.car.hardware.hvac.ICarHvac asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.hardware.hvac.ICarHvac))) {
return ((android.car.hardware.hvac.ICarHvac)iin);
}
return new android.car.hardware.hvac.ICarHvac.Stub.Proxy(obj);
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
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.hardware.hvac.ICarHvacEventListener _arg0;
_arg0 = android.car.hardware.hvac.ICarHvacEventListener.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.hardware.hvac.ICarHvacEventListener _arg0;
_arg0 = android.car.hardware.hvac.ICarHvacEventListener.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getHvacProperties:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.car.hardware.CarPropertyConfig> _result = this.getHvacProperties();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getProperty:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.car.hardware.CarPropertyValue _result = this.getProperty(_arg0, _arg1);
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
case TRANSACTION_setProperty:
{
data.enforceInterface(DESCRIPTOR);
android.car.hardware.CarPropertyValue _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.hardware.CarPropertyValue.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setProperty(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.hardware.hvac.ICarHvac
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
@Override public void registerListener(android.car.hardware.hvac.ICarHvacEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(android.car.hardware.hvac.ICarHvacEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.car.hardware.CarPropertyConfig> getHvacProperties() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.car.hardware.CarPropertyConfig> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getHvacProperties, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.car.hardware.CarPropertyConfig.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.car.hardware.CarPropertyValue getProperty(int prop, int zone) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.hardware.CarPropertyValue _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(prop);
_data.writeInt(zone);
mRemote.transact(Stub.TRANSACTION_getProperty, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.hardware.CarPropertyValue.CREATOR.createFromParcel(_reply);
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
@Override public void setProperty(android.car.hardware.CarPropertyValue prop) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((prop!=null)) {
_data.writeInt(1);
prop.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setProperty, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getHvacProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void registerListener(android.car.hardware.hvac.ICarHvacEventListener listener) throws android.os.RemoteException;
public void unregisterListener(android.car.hardware.hvac.ICarHvacEventListener listener) throws android.os.RemoteException;
public java.util.List<android.car.hardware.CarPropertyConfig> getHvacProperties() throws android.os.RemoteException;
public android.car.hardware.CarPropertyValue getProperty(int prop, int zone) throws android.os.RemoteException;
public void setProperty(android.car.hardware.CarPropertyValue prop) throws android.os.RemoteException;
}
