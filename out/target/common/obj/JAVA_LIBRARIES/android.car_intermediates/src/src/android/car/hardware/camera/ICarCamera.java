/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/hardware/camera/ICarCamera.aidl
 */
package android.car.hardware.camera;
/** @hide */
public interface ICarCamera extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.hardware.camera.ICarCamera
{
private static final java.lang.String DESCRIPTOR = "android.car.hardware.camera.ICarCamera";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.hardware.camera.ICarCamera interface,
 * generating a proxy if needed.
 */
public static android.car.hardware.camera.ICarCamera asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.hardware.camera.ICarCamera))) {
return ((android.car.hardware.camera.ICarCamera)iin);
}
return new android.car.hardware.camera.ICarCamera.Stub.Proxy(obj);
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
case TRANSACTION_getCameraList:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getCameraList();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getCapabilities:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getCapabilities(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCameraCrop:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Rect _result = this.getCameraCrop(_arg0);
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
case TRANSACTION_setCameraCrop:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Rect _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setCameraCrop(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCameraPosition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Rect _result = this.getCameraPosition(_arg0);
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
case TRANSACTION_setCameraPosition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Rect _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setCameraPosition(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCameraState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.car.hardware.camera.CarCameraState _result = this.getCameraState(_arg0);
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
case TRANSACTION_setCameraState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.car.hardware.camera.CarCameraState _arg1;
if ((0!=data.readInt())) {
_arg1 = android.car.hardware.camera.CarCameraState.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setCameraState(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.hardware.camera.ICarCamera
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
@Override public int[] getCameraList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCameraList, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCapabilities(int cameraType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraType);
mRemote.transact(Stub.TRANSACTION_getCapabilities, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.graphics.Rect getCameraCrop(int cameraType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Rect _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraType);
mRemote.transact(Stub.TRANSACTION_getCameraCrop, _data, _reply, 0);
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
@Override public void setCameraCrop(int cameraType, android.graphics.Rect rect) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraType);
if ((rect!=null)) {
_data.writeInt(1);
rect.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCameraCrop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.graphics.Rect getCameraPosition(int cameraType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Rect _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraType);
mRemote.transact(Stub.TRANSACTION_getCameraPosition, _data, _reply, 0);
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
@Override public void setCameraPosition(int cameraType, android.graphics.Rect rect) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraType);
if ((rect!=null)) {
_data.writeInt(1);
rect.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCameraPosition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.car.hardware.camera.CarCameraState getCameraState(int cameraType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.hardware.camera.CarCameraState _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraType);
mRemote.transact(Stub.TRANSACTION_getCameraState, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.hardware.camera.CarCameraState.CREATOR.createFromParcel(_reply);
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
@Override public void setCameraState(int cameraType, android.car.hardware.camera.CarCameraState state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraType);
if ((state!=null)) {
_data.writeInt(1);
state.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCameraState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getCameraList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCameraCrop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setCameraCrop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getCameraPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setCameraPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getCameraState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setCameraState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public int[] getCameraList() throws android.os.RemoteException;
public int getCapabilities(int cameraType) throws android.os.RemoteException;
public android.graphics.Rect getCameraCrop(int cameraType) throws android.os.RemoteException;
public void setCameraCrop(int cameraType, android.graphics.Rect rect) throws android.os.RemoteException;
public android.graphics.Rect getCameraPosition(int cameraType) throws android.os.RemoteException;
public void setCameraPosition(int cameraType, android.graphics.Rect rect) throws android.os.RemoteException;
public android.car.hardware.camera.CarCameraState getCameraState(int cameraType) throws android.os.RemoteException;
public void setCameraState(int cameraType, android.car.hardware.camera.CarCameraState state) throws android.os.RemoteException;
}
