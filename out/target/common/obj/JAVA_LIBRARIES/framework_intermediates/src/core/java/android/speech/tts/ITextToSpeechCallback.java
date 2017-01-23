/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/speech/tts/ITextToSpeechCallback.aidl
 */
package android.speech.tts;
/**
 * Interface for callbacks from TextToSpeechService
 *
 * {@hide}
 */
public interface ITextToSpeechCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechCallback
{
private static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.speech.tts.ITextToSpeechCallback interface,
 * generating a proxy if needed.
 */
public static android.speech.tts.ITextToSpeechCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.speech.tts.ITextToSpeechCallback))) {
return ((android.speech.tts.ITextToSpeechCallback)iin);
}
return new android.speech.tts.ITextToSpeechCallback.Stub.Proxy(obj);
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
case TRANSACTION_onStart:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onStart(_arg0);
return true;
}
case TRANSACTION_onSuccess:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onSuccess(_arg0);
return true;
}
case TRANSACTION_onStop:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onStop(_arg0, _arg1);
return true;
}
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onError(_arg0, _arg1);
return true;
}
case TRANSACTION_onBeginSynthesis:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onBeginSynthesis(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onAudioAvailable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
this.onAudioAvailable(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.speech.tts.ITextToSpeechCallback
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
     * Tells the client that the synthesis has started playing.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     */
@Override public void onStart(java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_onStart, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tells the client that the synthesis has finished playing.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     */
@Override public void onSuccess(java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_onSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tells the client that the synthesis was stopped.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     */
@Override public void onStop(java.lang.String utteranceId, boolean isStarted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
_data.writeInt(((isStarted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onStop, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tells the client that the synthesis has failed.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     * @param errorCode One of the values from
     *        {@link android.speech.tts.v2.TextToSpeech}.
     */
@Override public void onError(java.lang.String utteranceId, int errorCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
_data.writeInt(errorCode);
mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tells the client that the TTS engine has started synthesizing the audio for a request.
     *
     * <p>
     * This doesn't mean the synthesis request has already started playing (for example when there
     * are synthesis requests ahead of it in the queue), but after receiving this callback you can
     * expect onAudioAvailable to be called.
     * </p>
     *
     * @param utteranceId Unique id identifying the synthesis request.
     * @param sampleRateInHz Sample rate in HZ of the generated audio.
     * @param audioFormat The audio format of the generated audio in the {@link #onAudioAvailable}
     *        call. Should be one of {@link android.media.AudioFormat.ENCODING_PCM_8BIT},
     *        {@link android.media.AudioFormat.ENCODING_PCM_16BIT} or
     *        {@link android.media.AudioFormat.ENCODING_PCM_FLOAT}.
     * @param channelCount The number of channels.
     */
@Override public void onBeginSynthesis(java.lang.String utteranceId, int sampleRateInHz, int audioFormat, int channelCount) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
_data.writeInt(sampleRateInHz);
_data.writeInt(audioFormat);
_data.writeInt(channelCount);
mRemote.transact(Stub.TRANSACTION_onBeginSynthesis, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tells the client about a chunk of the synthesized audio.
     *
     * <p>
     * Called when a chunk of the synthesized audio is ready. This may be called more than once for
     * every synthesis request, thereby streaming the audio to the client.
     * </p>
     *
     * @param utteranceId Unique id identifying the synthesis request.
     * @param audio The raw audio bytes. Its format is specified by the {@link #onStartAudio}
     * callback.
     */
@Override public void onAudioAvailable(java.lang.String utteranceId, byte[] audio) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
_data.writeByteArray(audio);
mRemote.transact(Stub.TRANSACTION_onAudioAvailable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onBeginSynthesis = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onAudioAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
/**
     * Tells the client that the synthesis has started playing.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     */
public void onStart(java.lang.String utteranceId) throws android.os.RemoteException;
/**
     * Tells the client that the synthesis has finished playing.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     */
public void onSuccess(java.lang.String utteranceId) throws android.os.RemoteException;
/**
     * Tells the client that the synthesis was stopped.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     */
public void onStop(java.lang.String utteranceId, boolean isStarted) throws android.os.RemoteException;
/**
     * Tells the client that the synthesis has failed.
     *
     * @param utteranceId Unique id identifying the synthesis request.
     * @param errorCode One of the values from
     *        {@link android.speech.tts.v2.TextToSpeech}.
     */
public void onError(java.lang.String utteranceId, int errorCode) throws android.os.RemoteException;
/**
     * Tells the client that the TTS engine has started synthesizing the audio for a request.
     *
     * <p>
     * This doesn't mean the synthesis request has already started playing (for example when there
     * are synthesis requests ahead of it in the queue), but after receiving this callback you can
     * expect onAudioAvailable to be called.
     * </p>
     *
     * @param utteranceId Unique id identifying the synthesis request.
     * @param sampleRateInHz Sample rate in HZ of the generated audio.
     * @param audioFormat The audio format of the generated audio in the {@link #onAudioAvailable}
     *        call. Should be one of {@link android.media.AudioFormat.ENCODING_PCM_8BIT},
     *        {@link android.media.AudioFormat.ENCODING_PCM_16BIT} or
     *        {@link android.media.AudioFormat.ENCODING_PCM_FLOAT}.
     * @param channelCount The number of channels.
     */
public void onBeginSynthesis(java.lang.String utteranceId, int sampleRateInHz, int audioFormat, int channelCount) throws android.os.RemoteException;
/**
     * Tells the client about a chunk of the synthesized audio.
     *
     * <p>
     * Called when a chunk of the synthesized audio is ready. This may be called more than once for
     * every synthesis request, thereby streaming the audio to the client.
     * </p>
     *
     * @param utteranceId Unique id identifying the synthesis request.
     * @param audio The raw audio bytes. Its format is specified by the {@link #onStartAudio}
     * callback.
     */
public void onAudioAvailable(java.lang.String utteranceId, byte[] audio) throws android.os.RemoteException;
}