/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/notification/INotificationListener.aidl
 */
package android.service.notification;
/** @hide */
public interface INotificationListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.notification.INotificationListener
{
private static final java.lang.String DESCRIPTOR = "android.service.notification.INotificationListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.notification.INotificationListener interface,
 * generating a proxy if needed.
 */
public static android.service.notification.INotificationListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.notification.INotificationListener))) {
return ((android.service.notification.INotificationListener)iin);
}
return new android.service.notification.INotificationListener.Stub.Proxy(obj);
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
case TRANSACTION_onListenerConnected:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.NotificationRankingUpdate _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onListenerConnected(_arg0);
return true;
}
case TRANSACTION_onNotificationPosted:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IStatusBarNotificationHolder _arg0;
_arg0 = android.service.notification.IStatusBarNotificationHolder.Stub.asInterface(data.readStrongBinder());
android.service.notification.NotificationRankingUpdate _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onNotificationPosted(_arg0, _arg1);
return true;
}
case TRANSACTION_onNotificationRemoved:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IStatusBarNotificationHolder _arg0;
_arg0 = android.service.notification.IStatusBarNotificationHolder.Stub.asInterface(data.readStrongBinder());
android.service.notification.NotificationRankingUpdate _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onNotificationRemoved(_arg0, _arg1);
return true;
}
case TRANSACTION_onNotificationRankingUpdate:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.NotificationRankingUpdate _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.notification.NotificationRankingUpdate.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onNotificationRankingUpdate(_arg0);
return true;
}
case TRANSACTION_onListenerHintsChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onListenerHintsChanged(_arg0);
return true;
}
case TRANSACTION_onInterruptionFilterChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onInterruptionFilterChanged(_arg0);
return true;
}
case TRANSACTION_onNotificationEnqueued:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IStatusBarNotificationHolder _arg0;
_arg0 = android.service.notification.IStatusBarNotificationHolder.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onNotificationEnqueued(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onNotificationVisibilityChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onNotificationVisibilityChanged(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onNotificationClick:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
this.onNotificationClick(_arg0, _arg1);
return true;
}
case TRANSACTION_onNotificationActionClick:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.onNotificationActionClick(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onNotificationRemovedReason:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.onNotificationRemovedReason(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.notification.INotificationListener
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
// listeners and rankers

@Override public void onListenerConnected(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onListenerConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((notificationHolder!=null))?(notificationHolder.asBinder()):(null)));
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onNotificationPosted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((notificationHolder!=null))?(notificationHolder.asBinder()):(null)));
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onNotificationRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((update!=null)) {
_data.writeInt(1);
update.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onNotificationRankingUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onListenerHintsChanged(int hints) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(hints);
mRemote.transact(Stub.TRANSACTION_onListenerHintsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onInterruptionFilterChanged(int interruptionFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(interruptionFilter);
mRemote.transact(Stub.TRANSACTION_onInterruptionFilterChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// rankers only

@Override public void onNotificationEnqueued(android.service.notification.IStatusBarNotificationHolder notificationHolder, int importance, boolean user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((notificationHolder!=null))?(notificationHolder.asBinder()):(null)));
_data.writeInt(importance);
_data.writeInt(((user)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onNotificationEnqueued, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationVisibilityChanged(java.lang.String key, long time, boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(time);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onNotificationVisibilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationClick(java.lang.String key, long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_onNotificationClick, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationActionClick(java.lang.String key, long time, int actionIndex) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(time);
_data.writeInt(actionIndex);
mRemote.transact(Stub.TRANSACTION_onNotificationActionClick, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNotificationRemovedReason(java.lang.String key, long time, int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(time);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onNotificationRemovedReason, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onListenerConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onNotificationPosted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onNotificationRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onNotificationRankingUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onListenerHintsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onInterruptionFilterChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onNotificationEnqueued = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onNotificationVisibilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onNotificationClick = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onNotificationActionClick = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onNotificationRemovedReason = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
// listeners and rankers

public void onListenerConnected(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException;
public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException;
public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder notificationHolder, android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException;
public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate update) throws android.os.RemoteException;
public void onListenerHintsChanged(int hints) throws android.os.RemoteException;
public void onInterruptionFilterChanged(int interruptionFilter) throws android.os.RemoteException;
// rankers only

public void onNotificationEnqueued(android.service.notification.IStatusBarNotificationHolder notificationHolder, int importance, boolean user) throws android.os.RemoteException;
public void onNotificationVisibilityChanged(java.lang.String key, long time, boolean visible) throws android.os.RemoteException;
public void onNotificationClick(java.lang.String key, long time) throws android.os.RemoteException;
public void onNotificationActionClick(java.lang.String key, long time, int actionIndex) throws android.os.RemoteException;
public void onNotificationRemovedReason(java.lang.String key, long time, int reason) throws android.os.RemoteException;
}
