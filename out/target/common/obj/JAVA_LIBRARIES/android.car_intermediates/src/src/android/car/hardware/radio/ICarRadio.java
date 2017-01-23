/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/hardware/radio/ICarRadio.aidl
 */
package android.car.hardware.radio;
/** @hide */
public interface ICarRadio extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.hardware.radio.ICarRadio
{
private static final java.lang.String DESCRIPTOR = "android.car.hardware.radio.ICarRadio";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.hardware.radio.ICarRadio interface,
 * generating a proxy if needed.
 */
public static android.car.hardware.radio.ICarRadio asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.hardware.radio.ICarRadio))) {
return ((android.car.hardware.radio.ICarRadio)iin);
}
return new android.car.hardware.radio.ICarRadio.Stub.Proxy(obj);
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
case TRANSACTION_getPresetCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPresetCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.hardware.radio.ICarRadioEventListener _arg0;
_arg0 = android.car.hardware.radio.ICarRadioEventListener.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.hardware.radio.ICarRadioEventListener _arg0;
_arg0 = android.car.hardware.radio.ICarRadioEventListener.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPreset:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.car.hardware.radio.CarRadioPreset _result = this.getPreset(_arg0);
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
case TRANSACTION_setPreset:
{
data.enforceInterface(DESCRIPTOR);
android.car.hardware.radio.CarRadioPreset _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.hardware.radio.CarRadioPreset.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setPreset(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.hardware.radio.ICarRadio
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
@Override public int getPresetCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPresetCount, _data, _reply, 0);
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
     * Registers the client for updates to radio changes.
     */
@Override public void registerListener(android.car.hardware.radio.ICarRadioEventListener listener) throws android.os.RemoteException
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
/**
     * Unregisters the client for updates to radio changes.
     */
@Override public void unregisterListener(android.car.hardware.radio.ICarRadioEventListener listener) throws android.os.RemoteException
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
/**
     * Gets the preset values stored for a particular preset number.
     */
@Override public android.car.hardware.radio.CarRadioPreset getPreset(int presetNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.hardware.radio.CarRadioPreset _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(presetNumber);
mRemote.transact(Stub.TRANSACTION_getPreset, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.hardware.radio.CarRadioPreset.CREATOR.createFromParcel(_reply);
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
     * Sets a specified preset (hard button) in the car. In order to check for success listen to
     * events using {@link registerOrUpdateRadioListener}.
     */
@Override public boolean setPreset(android.car.hardware.radio.CarRadioPreset preset) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((preset!=null)) {
_data.writeInt(1);
preset.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setPreset, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getPresetCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPreset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setPreset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public int getPresetCount() throws android.os.RemoteException;
/**
     * Registers the client for updates to radio changes.
     */
public void registerListener(android.car.hardware.radio.ICarRadioEventListener listener) throws android.os.RemoteException;
/**
     * Unregisters the client for updates to radio changes.
     */
public void unregisterListener(android.car.hardware.radio.ICarRadioEventListener listener) throws android.os.RemoteException;
/**
     * Gets the preset values stored for a particular preset number.
     */
public android.car.hardware.radio.CarRadioPreset getPreset(int presetNumber) throws android.os.RemoteException;
/**
     * Sets a specified preset (hard button) in the car. In order to check for success listen to
     * events using {@link registerOrUpdateRadioListener}.
     */
public boolean setPreset(android.car.hardware.radio.CarRadioPreset preset) throws android.os.RemoteException;
}
