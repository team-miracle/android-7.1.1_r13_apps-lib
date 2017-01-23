/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothGattCallback.aidl
 */
package android.bluetooth;
/**
 * Callback definitions for interacting with BLE / GATT
 * @hide
 */
public interface IBluetoothGattCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGattCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGattCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothGattCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothGattCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothGattCallback))) {
return ((android.bluetooth.IBluetoothGattCallback)iin);
}
return new android.bluetooth.IBluetoothGattCallback.Stub.Proxy(obj);
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
case TRANSACTION_onClientRegistered:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onClientRegistered(_arg0, _arg1);
return true;
}
case TRANSACTION_onClientConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
java.lang.String _arg3;
_arg3 = data.readString();
this.onClientConnectionState(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onScanResult:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.le.ScanResult _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.le.ScanResult.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onScanResult(_arg0);
return true;
}
case TRANSACTION_onBatchScanResults:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.bluetooth.le.ScanResult> _arg0;
_arg0 = data.createTypedArrayList(android.bluetooth.le.ScanResult.CREATOR);
this.onBatchScanResults(_arg0);
return true;
}
case TRANSACTION_onSearchComplete:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.bluetooth.BluetoothGattService> _arg1;
_arg1 = data.createTypedArrayList(android.bluetooth.BluetoothGattService.CREATOR);
int _arg2;
_arg2 = data.readInt();
this.onSearchComplete(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onCharacteristicRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
this.onCharacteristicRead(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onCharacteristicWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onCharacteristicWrite(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onExecuteWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onExecuteWrite(_arg0, _arg1);
return true;
}
case TRANSACTION_onDescriptorRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
this.onDescriptorRead(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onDescriptorWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onDescriptorWrite(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onNotify:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
this.onNotify(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onReadRemoteRssi:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onReadRemoteRssi(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onMultiAdvertiseCallback:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.bluetooth.le.AdvertiseSettings _arg2;
if ((0!=data.readInt())) {
_arg2 = android.bluetooth.le.AdvertiseSettings.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onMultiAdvertiseCallback(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onScanManagerErrorCallback:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onScanManagerErrorCallback(_arg0);
return true;
}
case TRANSACTION_onConfigureMTU:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onConfigureMTU(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onFoundOrLost:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.bluetooth.le.ScanResult _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.le.ScanResult.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onFoundOrLost(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothGattCallback
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
@Override public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(clientIf);
mRemote.transact(Stub.TRANSACTION_onClientRegistered, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onClientConnectionState(int status, int clientIf, boolean connected, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(clientIf);
_data.writeInt(((connected)?(1):(0)));
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_onClientConnectionState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScanResult(android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((scanResult!=null)) {
_data.writeInt(1);
scanResult.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onScanResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> batchResults) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(batchResults);
mRemote.transact(Stub.TRANSACTION_onBatchScanResults, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSearchComplete(java.lang.String address, java.util.List<android.bluetooth.BluetoothGattService> services, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeTypedList(services);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onSearchComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCharacteristicRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onCharacteristicRead, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCharacteristicWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
mRemote.transact(Stub.TRANSACTION_onCharacteristicWrite, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onExecuteWrite(java.lang.String address, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onExecuteWrite, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDescriptorRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onDescriptorRead, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDescriptorWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(handle);
mRemote.transact(Stub.TRANSACTION_onDescriptorWrite, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotify(java.lang.String address, int handle, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(handle);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onNotify, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onReadRemoteRssi(java.lang.String address, int rssi, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(rssi);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onReadRemoteRssi, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMultiAdvertiseCallback(int status, boolean isStart, android.bluetooth.le.AdvertiseSettings advertiseSettings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(((isStart)?(1):(0)));
if ((advertiseSettings!=null)) {
_data.writeInt(1);
advertiseSettings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMultiAdvertiseCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScanManagerErrorCallback(int errorCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
mRemote.transact(Stub.TRANSACTION_onScanManagerErrorCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConfigureMTU(java.lang.String address, int mtu, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(mtu);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onConfigureMTU, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onFoundOrLost(boolean onFound, android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((onFound)?(1):(0)));
if ((scanResult!=null)) {
_data.writeInt(1);
scanResult.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onFoundOrLost, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onClientRegistered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onClientConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onScanResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onBatchScanResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onSearchComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onCharacteristicRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onCharacteristicWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onExecuteWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onDescriptorRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onDescriptorWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onNotify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onReadRemoteRssi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onMultiAdvertiseCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onScanManagerErrorCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_onConfigureMTU = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_onFoundOrLost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException;
public void onClientConnectionState(int status, int clientIf, boolean connected, java.lang.String address) throws android.os.RemoteException;
public void onScanResult(android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException;
public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> batchResults) throws android.os.RemoteException;
public void onSearchComplete(java.lang.String address, java.util.List<android.bluetooth.BluetoothGattService> services, int status) throws android.os.RemoteException;
public void onCharacteristicRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException;
public void onCharacteristicWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException;
public void onExecuteWrite(java.lang.String address, int status) throws android.os.RemoteException;
public void onDescriptorRead(java.lang.String address, int status, int handle, byte[] value) throws android.os.RemoteException;
public void onDescriptorWrite(java.lang.String address, int status, int handle) throws android.os.RemoteException;
public void onNotify(java.lang.String address, int handle, byte[] value) throws android.os.RemoteException;
public void onReadRemoteRssi(java.lang.String address, int rssi, int status) throws android.os.RemoteException;
public void onMultiAdvertiseCallback(int status, boolean isStart, android.bluetooth.le.AdvertiseSettings advertiseSettings) throws android.os.RemoteException;
public void onScanManagerErrorCallback(int errorCode) throws android.os.RemoteException;
public void onConfigureMTU(java.lang.String address, int mtu, int status) throws android.os.RemoteException;
public void onFoundOrLost(boolean onFound, android.bluetooth.le.ScanResult scanResult) throws android.os.RemoteException;
}