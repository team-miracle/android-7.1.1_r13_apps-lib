/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/IImsCallSession.aidl
 */
package com.android.ims.internal;
/**
 * An IMS session that is associated with a SIP dialog which is established from/to
 * INVITE request or a mid-call transaction to control the session.
 * {@hide}
 */
public interface IImsCallSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsCallSession
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsCallSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsCallSession interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsCallSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsCallSession))) {
return ((com.android.ims.internal.IImsCallSession)iin);
}
return new com.android.ims.internal.IImsCallSession.Stub.Proxy(obj);
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
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
this.close();
reply.writeNoException();
return true;
}
case TRANSACTION_getCallId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCallId();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCallProfile:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.ImsCallProfile _result = this.getCallProfile();
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
case TRANSACTION_getLocalCallProfile:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.ImsCallProfile _result = this.getLocalCallProfile();
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
case TRANSACTION_getRemoteCallProfile:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.ImsCallProfile _result = this.getRemoteCallProfile();
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
case TRANSACTION_getProperty:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getProperty(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isInCall:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isInCall();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setListener:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsCallSessionListener _arg0;
_arg0 = com.android.ims.internal.IImsCallSessionListener.Stub.asInterface(data.readStrongBinder());
this.setListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setMute:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMute(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_start:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.start(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startConference:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
com.android.ims.ImsCallProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.startConference(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_accept:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.ims.ImsStreamMediaProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsStreamMediaProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.accept(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reject:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.reject(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_terminate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.terminate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_hold:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.ImsStreamMediaProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.ims.ImsStreamMediaProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.hold(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_resume:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.ImsStreamMediaProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.ims.ImsStreamMediaProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.resume(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_merge:
{
data.enforceInterface(DESCRIPTOR);
this.merge();
reply.writeNoException();
return true;
}
case TRANSACTION_update:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.ims.ImsStreamMediaProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.ims.ImsStreamMediaProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.update(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_extendToConference:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
this.extendToConference(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_inviteParticipants:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
this.inviteParticipants(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeParticipants:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
this.removeParticipants(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendDtmf:
{
data.enforceInterface(DESCRIPTOR);
char _arg0;
_arg0 = (char)data.readInt();
android.os.Message _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Message.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendDtmf(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startDtmf:
{
data.enforceInterface(DESCRIPTOR);
char _arg0;
_arg0 = (char)data.readInt();
this.startDtmf(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopDtmf:
{
data.enforceInterface(DESCRIPTOR);
this.stopDtmf();
reply.writeNoException();
return true;
}
case TRANSACTION_sendUssd:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sendUssd(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getVideoCallProvider:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.internal.IImsVideoCallProvider _result = this.getVideoCallProvider();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_isMultiparty:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isMultiparty();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsCallSession
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
     * Closes the object. This object is not usable after being closed.
     */
@Override public void close() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Gets the call ID of the session.
     *
     * @return the call ID
     */
@Override public java.lang.String getCallId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCallId, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets the call profile that this session is associated with
     *
     * @return the call profile that this session is associated with
     */
@Override public com.android.ims.ImsCallProfile getCallProfile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.ImsCallProfile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCallProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(_reply);
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
     * Gets the local call profile that this session is associated with
     *
     * @return the local call profile that this session is associated with
     */
@Override public com.android.ims.ImsCallProfile getLocalCallProfile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.ImsCallProfile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLocalCallProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(_reply);
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
     * Gets the remote call profile that this session is associated with
     *
     * @return the remote call profile that this session is associated with
     */
@Override public com.android.ims.ImsCallProfile getRemoteCallProfile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.ImsCallProfile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRemoteCallProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.ims.ImsCallProfile.CREATOR.createFromParcel(_reply);
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
     * Gets the value associated with the specified property of this session.
     *
     * @return the string value associated with the specified property
     */
@Override public java.lang.String getProperty(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_getProperty, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getState, _data, _reply, 0);
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
     * Checks if the session is in a call.
     *
     * @return true if the session is in a call
     */
@Override public boolean isInCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isInCall, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets the listener to listen to the session events. A {@link IImsCallSession}
     * can only hold one listener at a time. Subsequent calls to this method
     * override the previous listener.
     *
     * @param listener to listen to the session events of this object
     */
@Override public void setListener(com.android.ims.internal.IImsCallSessionListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Mutes or unmutes the mic for the active call.
     *
     * @param muted true if the call is muted, false otherwise
     */
@Override public void setMute(boolean muted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((muted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMute, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Initiates an IMS call with the specified target and call profile.
     * The session listener is called back upon defined session events.
     * The method is only valid to call when the session state is in
     * {@link ImsCallSession#State#IDLE}.
     *
     * @param callee dialed string to make the call to
     * @param profile call profile to make the call with the specified service type,
     *      call type and media information
     * @see Listener#callSessionStarted, Listener#callSessionStartFailed
     */
@Override public void start(java.lang.String callee, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callee);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_start, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Initiates an IMS call with the specified participants and call profile.
     * The session listener is called back upon defined session events.
     * The method is only valid to call when the session state is in
     * {@link ImsCallSession#State#IDLE}.
     *
     * @param participants participant list to initiate an IMS conference call
     * @param profile call profile to make the call with the specified service type,
     *      call type and media information
     * @see Listener#callSessionStarted, Listener#callSessionStartFailed
     */
@Override public void startConference(java.lang.String[] participants, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(participants);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startConference, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Accepts an incoming call or session update.
     *
     * @param callType call type specified in {@link ImsCallProfile} to be answered
     * @param profile stream media profile {@link ImsStreamMediaProfile} to be answered
     * @see Listener#callSessionStarted
     */
@Override public void accept(int callType, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callType);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_accept, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Rejects an incoming call or session update.
     *
     * @param reason reason code to reject an incoming call
     * @see Listener#callSessionStartFailed
     */
@Override public void reject(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_reject, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Terminates a call.
     *
     * @see Listener#callSessionTerminated
     */
@Override public void terminate(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_terminate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Puts a call on hold. When it succeeds, {@link Listener#callSessionHeld} is called.
     *
     * @param profile stream media profile {@link ImsStreamMediaProfile} to hold the call
     * @see Listener#callSessionHeld, Listener#callSessionHoldFailed
     */
@Override public void hold(com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_hold, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Continues a call that's on hold. When it succeeds, {@link Listener#callSessionResumed}
     * is called.
     *
     * @param profile stream media profile {@link ImsStreamMediaProfile} to resume the call
     * @see Listener#callSessionResumed, Listener#callSessionResumeFailed
     */
@Override public void resume(com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_resume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Merges the active & hold call. When the merge starts,
     * {@link Listener#callSessionMergeStarted} is called.
     * {@link Listener#callSessionMergeComplete} is called if the merge is successful, and
     * {@link Listener#callSessionMergeFailed} is called if the merge fails.
     *
     * @see Listener#callSessionMergeStarted, Listener#callSessionMergeComplete,
     *      Listener#callSessionMergeFailed
     */
@Override public void merge() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_merge, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Updates the current call's properties (ex. call mode change: video upgrade / downgrade).
     *
     * @param callType call type specified in {@link ImsCallProfile} to be updated
     * @param profile stream media profile {@link ImsStreamMediaProfile} to be updated
     * @see Listener#callSessionUpdated, Listener#callSessionUpdateFailed
     */
@Override public void update(int callType, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callType);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_update, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Extends this call to the conference call with the specified recipients.
     *
     * @param participants participant list to be invited to the conference call after extending the call
     * @see Listener#sessionConferenceExtened, Listener#sessionConferenceExtendFailed
     */
@Override public void extendToConference(java.lang.String[] participants) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(participants);
mRemote.transact(Stub.TRANSACTION_extendToConference, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Requests the conference server to invite an additional participants to the conference.
     *
     * @param participants participant list to be invited to the conference call
     * @see Listener#sessionInviteParticipantsRequestDelivered,
     *      Listener#sessionInviteParticipantsRequestFailed
     */
@Override public void inviteParticipants(java.lang.String[] participants) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(participants);
mRemote.transact(Stub.TRANSACTION_inviteParticipants, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Requests the conference server to remove the specified participants from the conference.
     *
     * @param participants participant list to be removed from the conference call
     * @see Listener#sessionRemoveParticipantsRequestDelivered,
     *      Listener#sessionRemoveParticipantsRequestFailed
     */
@Override public void removeParticipants(java.lang.String[] participants) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(participants);
mRemote.transact(Stub.TRANSACTION_removeParticipants, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sends a DTMF code. According to <a href="http://tools.ietf.org/html/rfc2833">RFC 2833</a>,
     * event 0 ~ 9 maps to decimal value 0 ~ 9, '*' to 10, '#' to 11, event 'A' ~ 'D' to 12 ~ 15,
     * and event flash to 16. Currently, event flash is not supported.
     *
     * @param c the DTMF to send. '0' ~ '9', 'A' ~ 'D', '*', '#' are valid inputs.
     * @param result.
     */
@Override public void sendDtmf(char c, android.os.Message result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((int)c));
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendDtmf, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Start a DTMF code. According to <a href="http://tools.ietf.org/html/rfc2833">RFC 2833</a>,
     * event 0 ~ 9 maps to decimal value 0 ~ 9, '*' to 10, '#' to 11, event 'A' ~ 'D' to 12 ~ 15,
     * and event flash to 16. Currently, event flash is not supported.
     *
     * @param c the DTMF to send. '0' ~ '9', 'A' ~ 'D', '*', '#' are valid inputs.
     */
@Override public void startDtmf(char c) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((int)c));
mRemote.transact(Stub.TRANSACTION_startDtmf, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Stop a DTMF code.
     */
@Override public void stopDtmf() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopDtmf, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sends an USSD message.
     *
     * @param ussdMessage USSD message to send
     */
@Override public void sendUssd(java.lang.String ussdMessage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ussdMessage);
mRemote.transact(Stub.TRANSACTION_sendUssd, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns a binder for the video call provider implementation contained within the IMS service
     * process. This binder is used by the VideoCallProvider subclass in Telephony which
     * intermediates between the propriety implementation and Telecomm/InCall.
     */
@Override public com.android.ims.internal.IImsVideoCallProvider getVideoCallProvider() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.ims.internal.IImsVideoCallProvider _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVideoCallProvider, _data, _reply, 0);
_reply.readException();
_result = com.android.ims.internal.IImsVideoCallProvider.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Determines if the current session is multiparty.
     * @return {@code True} if the session is multiparty.
     */
@Override public boolean isMultiparty() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isMultiparty, _data, _reply, 0);
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
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCallId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCallProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getLocalCallProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getRemoteCallProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isInCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setMute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_startConference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_accept = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_reject = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_terminate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_hold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_resume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_merge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_update = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_extendToConference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_inviteParticipants = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_removeParticipants = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_sendDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_startDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_stopDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_sendUssd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getVideoCallProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_isMultiparty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
}
/**
     * Closes the object. This object is not usable after being closed.
     */
public void close() throws android.os.RemoteException;
/**
     * Gets the call ID of the session.
     *
     * @return the call ID
     */
public java.lang.String getCallId() throws android.os.RemoteException;
/**
     * Gets the call profile that this session is associated with
     *
     * @return the call profile that this session is associated with
     */
public com.android.ims.ImsCallProfile getCallProfile() throws android.os.RemoteException;
/**
     * Gets the local call profile that this session is associated with
     *
     * @return the local call profile that this session is associated with
     */
public com.android.ims.ImsCallProfile getLocalCallProfile() throws android.os.RemoteException;
/**
     * Gets the remote call profile that this session is associated with
     *
     * @return the remote call profile that this session is associated with
     */
public com.android.ims.ImsCallProfile getRemoteCallProfile() throws android.os.RemoteException;
/**
     * Gets the value associated with the specified property of this session.
     *
     * @return the string value associated with the specified property
     */
public java.lang.String getProperty(java.lang.String name) throws android.os.RemoteException;
public int getState() throws android.os.RemoteException;
/**
     * Checks if the session is in a call.
     *
     * @return true if the session is in a call
     */
public boolean isInCall() throws android.os.RemoteException;
/**
     * Sets the listener to listen to the session events. A {@link IImsCallSession}
     * can only hold one listener at a time. Subsequent calls to this method
     * override the previous listener.
     *
     * @param listener to listen to the session events of this object
     */
public void setListener(com.android.ims.internal.IImsCallSessionListener listener) throws android.os.RemoteException;
/**
     * Mutes or unmutes the mic for the active call.
     *
     * @param muted true if the call is muted, false otherwise
     */
public void setMute(boolean muted) throws android.os.RemoteException;
/**
     * Initiates an IMS call with the specified target and call profile.
     * The session listener is called back upon defined session events.
     * The method is only valid to call when the session state is in
     * {@link ImsCallSession#State#IDLE}.
     *
     * @param callee dialed string to make the call to
     * @param profile call profile to make the call with the specified service type,
     *      call type and media information
     * @see Listener#callSessionStarted, Listener#callSessionStartFailed
     */
public void start(java.lang.String callee, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Initiates an IMS call with the specified participants and call profile.
     * The session listener is called back upon defined session events.
     * The method is only valid to call when the session state is in
     * {@link ImsCallSession#State#IDLE}.
     *
     * @param participants participant list to initiate an IMS conference call
     * @param profile call profile to make the call with the specified service type,
     *      call type and media information
     * @see Listener#callSessionStarted, Listener#callSessionStartFailed
     */
public void startConference(java.lang.String[] participants, com.android.ims.ImsCallProfile profile) throws android.os.RemoteException;
/**
     * Accepts an incoming call or session update.
     *
     * @param callType call type specified in {@link ImsCallProfile} to be answered
     * @param profile stream media profile {@link ImsStreamMediaProfile} to be answered
     * @see Listener#callSessionStarted
     */
public void accept(int callType, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException;
/**
     * Rejects an incoming call or session update.
     *
     * @param reason reason code to reject an incoming call
     * @see Listener#callSessionStartFailed
     */
public void reject(int reason) throws android.os.RemoteException;
/**
     * Terminates a call.
     *
     * @see Listener#callSessionTerminated
     */
public void terminate(int reason) throws android.os.RemoteException;
/**
     * Puts a call on hold. When it succeeds, {@link Listener#callSessionHeld} is called.
     *
     * @param profile stream media profile {@link ImsStreamMediaProfile} to hold the call
     * @see Listener#callSessionHeld, Listener#callSessionHoldFailed
     */
public void hold(com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException;
/**
     * Continues a call that's on hold. When it succeeds, {@link Listener#callSessionResumed}
     * is called.
     *
     * @param profile stream media profile {@link ImsStreamMediaProfile} to resume the call
     * @see Listener#callSessionResumed, Listener#callSessionResumeFailed
     */
public void resume(com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException;
/**
     * Merges the active & hold call. When the merge starts,
     * {@link Listener#callSessionMergeStarted} is called.
     * {@link Listener#callSessionMergeComplete} is called if the merge is successful, and
     * {@link Listener#callSessionMergeFailed} is called if the merge fails.
     *
     * @see Listener#callSessionMergeStarted, Listener#callSessionMergeComplete,
     *      Listener#callSessionMergeFailed
     */
public void merge() throws android.os.RemoteException;
/**
     * Updates the current call's properties (ex. call mode change: video upgrade / downgrade).
     *
     * @param callType call type specified in {@link ImsCallProfile} to be updated
     * @param profile stream media profile {@link ImsStreamMediaProfile} to be updated
     * @see Listener#callSessionUpdated, Listener#callSessionUpdateFailed
     */
public void update(int callType, com.android.ims.ImsStreamMediaProfile profile) throws android.os.RemoteException;
/**
     * Extends this call to the conference call with the specified recipients.
     *
     * @param participants participant list to be invited to the conference call after extending the call
     * @see Listener#sessionConferenceExtened, Listener#sessionConferenceExtendFailed
     */
public void extendToConference(java.lang.String[] participants) throws android.os.RemoteException;
/**
     * Requests the conference server to invite an additional participants to the conference.
     *
     * @param participants participant list to be invited to the conference call
     * @see Listener#sessionInviteParticipantsRequestDelivered,
     *      Listener#sessionInviteParticipantsRequestFailed
     */
public void inviteParticipants(java.lang.String[] participants) throws android.os.RemoteException;
/**
     * Requests the conference server to remove the specified participants from the conference.
     *
     * @param participants participant list to be removed from the conference call
     * @see Listener#sessionRemoveParticipantsRequestDelivered,
     *      Listener#sessionRemoveParticipantsRequestFailed
     */
public void removeParticipants(java.lang.String[] participants) throws android.os.RemoteException;
/**
     * Sends a DTMF code. According to <a href="http://tools.ietf.org/html/rfc2833">RFC 2833</a>,
     * event 0 ~ 9 maps to decimal value 0 ~ 9, '*' to 10, '#' to 11, event 'A' ~ 'D' to 12 ~ 15,
     * and event flash to 16. Currently, event flash is not supported.
     *
     * @param c the DTMF to send. '0' ~ '9', 'A' ~ 'D', '*', '#' are valid inputs.
     * @param result.
     */
public void sendDtmf(char c, android.os.Message result) throws android.os.RemoteException;
/**
     * Start a DTMF code. According to <a href="http://tools.ietf.org/html/rfc2833">RFC 2833</a>,
     * event 0 ~ 9 maps to decimal value 0 ~ 9, '*' to 10, '#' to 11, event 'A' ~ 'D' to 12 ~ 15,
     * and event flash to 16. Currently, event flash is not supported.
     *
     * @param c the DTMF to send. '0' ~ '9', 'A' ~ 'D', '*', '#' are valid inputs.
     */
public void startDtmf(char c) throws android.os.RemoteException;
/**
     * Stop a DTMF code.
     */
public void stopDtmf() throws android.os.RemoteException;
/**
     * Sends an USSD message.
     *
     * @param ussdMessage USSD message to send
     */
public void sendUssd(java.lang.String ussdMessage) throws android.os.RemoteException;
/**
     * Returns a binder for the video call provider implementation contained within the IMS service
     * process. This binder is used by the VideoCallProvider subclass in Telephony which
     * intermediates between the propriety implementation and Telecomm/InCall.
     */
public com.android.ims.internal.IImsVideoCallProvider getVideoCallProvider() throws android.os.RemoteException;
/**
     * Determines if the current session is multiparty.
     * @return {@code True} if the session is multiparty.
     */
public boolean isMultiparty() throws android.os.RemoteException;
}
