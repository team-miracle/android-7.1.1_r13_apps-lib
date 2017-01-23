/*
* Copyright (C) 2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.telephony;
public class TelephonyManager
{
TelephonyManager() { throw new RuntimeException("Stub!"); }
public  int getPhoneCount() { throw new RuntimeException("Stub!"); }
public  android.telephony.TelephonyManager createForSubscriptionId(int subId) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceSoftwareVersion() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceId(int slotId) { throw new RuntimeException("Stub!"); }
public  android.telephony.CellLocation getCellLocation() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo() { throw new RuntimeException("Stub!"); }
public  int getCurrentPhoneType() { throw new RuntimeException("Stub!"); }
public  int getCurrentPhoneType(int subId) { throw new RuntimeException("Stub!"); }
public  int getPhoneType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkOperatorName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkOperator() { throw new RuntimeException("Stub!"); }
public  boolean isNetworkRoaming() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkCountryIso() { throw new RuntimeException("Stub!"); }
public  int getNetworkType() { throw new RuntimeException("Stub!"); }
public  int getDataNetworkType() { throw new RuntimeException("Stub!"); }
public  int getVoiceNetworkType() { throw new RuntimeException("Stub!"); }
public  boolean hasIccCard() { throw new RuntimeException("Stub!"); }
public  int getSimState() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimOperator() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimOperatorName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimCountryIso() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimSerialNumber() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubscriberId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getGroupIdLevel1() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLine1Number() { throw new RuntimeException("Stub!"); }
public  boolean setLine1NumberForDisplay(java.lang.String alphaTag, java.lang.String number) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVoiceMailNumber() { throw new RuntimeException("Stub!"); }
public  boolean setVoiceMailNumber(java.lang.String alphaTag, java.lang.String number) { throw new RuntimeException("Stub!"); }
public  void setVisualVoicemailEnabled(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isVisualVoicemailEnabled(android.telecom.PhoneAccountHandle phoneAccountHandle) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVoiceMailAlphaTag() { throw new RuntimeException("Stub!"); }
public  int getCallState() { throw new RuntimeException("Stub!"); }
public  int getDataActivity() { throw new RuntimeException("Stub!"); }
public  int getDataState() { throw new RuntimeException("Stub!"); }
public  void listen(android.telephony.PhoneStateListener listener, int events) { throw new RuntimeException("Stub!"); }
public  boolean isVoiceCapable() { throw new RuntimeException("Stub!"); }
public  boolean isSmsCapable() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.CellInfo> getAllCellInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMmsUserAgent() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMmsUAProfUrl() { throw new RuntimeException("Stub!"); }
public  android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String AID) { throw new RuntimeException("Stub!"); }
public  boolean iccCloseLogicalChannel(int channel) { throw new RuntimeException("Stub!"); }
public  java.lang.String iccTransmitApduLogicalChannel(int channel, int cla, int instruction, int p1, int p2, int p3, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  java.lang.String iccTransmitApduBasicChannel(int cla, int instruction, int p1, int p2, int p3, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  byte[] iccExchangeSimIO(int fileID, int command, int p1, int p2, int p3, java.lang.String filePath) { throw new RuntimeException("Stub!"); }
public  java.lang.String sendEnvelopeWithStatus(java.lang.String content) { throw new RuntimeException("Stub!"); }
public  java.lang.String getIccAuthentication(int appType, int authType, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  boolean setPreferredNetworkTypeToGlobal() { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierPrivileges() { throw new RuntimeException("Stub!"); }
public  boolean setOperatorBrandOverride(java.lang.String brand) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCdmaMdn() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCdmaMdn(int subId) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCdmaMin() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCdmaMin(int subId) { throw new RuntimeException("Stub!"); }
public  int checkCarrierPrivilegesForPackage(java.lang.String pkgName) { throw new RuntimeException("Stub!"); }
public  int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String pkgName) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getCarrierPackageNamesForIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent intent, int phoneId) { throw new RuntimeException("Stub!"); }
public  void dial(java.lang.String number) { throw new RuntimeException("Stub!"); }
public  void call(java.lang.String callingPackage, java.lang.String number) { throw new RuntimeException("Stub!"); }
public  boolean endCall() { throw new RuntimeException("Stub!"); }
public  void answerRingingCall() { throw new RuntimeException("Stub!"); }
public  void silenceRinger() { throw new RuntimeException("Stub!"); }
public  boolean isOffhook() { throw new RuntimeException("Stub!"); }
public  boolean isRinging() { throw new RuntimeException("Stub!"); }
public  boolean isIdle() { throw new RuntimeException("Stub!"); }
public  boolean isRadioOn() { throw new RuntimeException("Stub!"); }
public  boolean supplyPin(java.lang.String pin) { throw new RuntimeException("Stub!"); }
public  boolean supplyPuk(java.lang.String puk, java.lang.String pin) { throw new RuntimeException("Stub!"); }
public  int[] supplyPinReportResult(java.lang.String pin) { throw new RuntimeException("Stub!"); }
public  int[] supplyPukReportResult(java.lang.String puk, java.lang.String pin) { throw new RuntimeException("Stub!"); }
public  boolean handlePinMmi(java.lang.String dialString) { throw new RuntimeException("Stub!"); }
public  boolean handlePinMmiForSubscriber(int subId, java.lang.String dialString) { throw new RuntimeException("Stub!"); }
public  void toggleRadioOnOff() { throw new RuntimeException("Stub!"); }
public  boolean setRadio(boolean turnOn) { throw new RuntimeException("Stub!"); }
public  boolean setRadioPower(boolean turnOn) { throw new RuntimeException("Stub!"); }
public  void updateServiceLocation() { throw new RuntimeException("Stub!"); }
public  boolean enableDataConnectivity() { throw new RuntimeException("Stub!"); }
public  boolean disableDataConnectivity() { throw new RuntimeException("Stub!"); }
public  boolean isDataConnectivityPossible() { throw new RuntimeException("Stub!"); }
public  boolean needsOtaServiceProvisioning() { throw new RuntimeException("Stub!"); }
public  void setDataEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
public  void setDataEnabled(int subId, boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean getDataEnabled() { throw new RuntimeException("Stub!"); }
public  boolean getDataEnabled(int subId) { throw new RuntimeException("Stub!"); }
public  void enableVideoCalling(boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean isVideoCallingEnabled() { throw new RuntimeException("Stub!"); }
public  boolean canChangeDtmfToneLength() { throw new RuntimeException("Stub!"); }
public  boolean isWorldPhone() { throw new RuntimeException("Stub!"); }
public  boolean isTtyModeSupported() { throw new RuntimeException("Stub!"); }
public  boolean isHearingAidCompatibilitySupported() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
public  boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CONFIGURE_VOICEMAIL = "android.telephony.action.CONFIGURE_VOICEMAIL";
public static final java.lang.String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
public static final java.lang.String ACTION_RESPOND_VIA_MESSAGE = "android.intent.action.RESPOND_VIA_MESSAGE";
public static final java.lang.String ACTION_SHOW_VOICEMAIL_NOTIFICATION = "android.telephony.action.SHOW_VOICEMAIL_NOTIFICATION";
public static final int APPTYPE_CSIM = 4;
public static final int APPTYPE_ISIM = 5;
public static final int APPTYPE_RUIM = 3;
public static final int APPTYPE_SIM = 1;
public static final int APPTYPE_USIM = 2;
public static final int AUTHTYPE_EAP_AKA = 129;
public static final int AUTHTYPE_EAP_SIM = 128;
public static final int CALL_STATE_IDLE = 0;
public static final int CALL_STATE_OFFHOOK = 2;
public static final int CALL_STATE_RINGING = 1;
public static final int CARRIER_PRIVILEGE_STATUS_ERROR_LOADING_RULES = -2;
public static final int CARRIER_PRIVILEGE_STATUS_HAS_ACCESS = 1;
public static final int CARRIER_PRIVILEGE_STATUS_NO_ACCESS = 0;
public static final int CARRIER_PRIVILEGE_STATUS_RULES_NOT_LOADED = -1;
public static final int DATA_ACTIVITY_DORMANT = 4;
public static final int DATA_ACTIVITY_IN = 1;
public static final int DATA_ACTIVITY_INOUT = 3;
public static final int DATA_ACTIVITY_NONE = 0;
public static final int DATA_ACTIVITY_OUT = 2;
public static final int DATA_CONNECTED = 2;
public static final int DATA_CONNECTING = 1;
public static final int DATA_DISCONNECTED = 0;
public static final int DATA_SUSPENDED = 3;
public static final java.lang.String EXTRA_CALL_VOICEMAIL_INTENT = "android.telephony.extra.CALL_VOICEMAIL_INTENT";
public static final java.lang.String EXTRA_INCOMING_NUMBER = "incoming_number";
public static final java.lang.String EXTRA_LAUNCH_VOICEMAIL_SETTINGS_INTENT = "android.telephony.extra.LAUNCH_VOICEMAIL_SETTINGS_INTENT";
public static final java.lang.String EXTRA_NOTIFICATION_COUNT = "android.telephony.extra.NOTIFICATION_COUNT";
public static final java.lang.String EXTRA_STATE = "state";
public static final java.lang.String EXTRA_STATE_IDLE;
public static final java.lang.String EXTRA_STATE_OFFHOOK;
public static final java.lang.String EXTRA_STATE_RINGING;
public static final java.lang.String EXTRA_VOICEMAIL_NUMBER = "android.telephony.extra.VOICEMAIL_NUMBER";
public static final int NETWORK_TYPE_1xRTT = 7;
public static final int NETWORK_TYPE_CDMA = 4;
public static final int NETWORK_TYPE_EDGE = 2;
public static final int NETWORK_TYPE_EHRPD = 14;
public static final int NETWORK_TYPE_EVDO_0 = 5;
public static final int NETWORK_TYPE_EVDO_A = 6;
public static final int NETWORK_TYPE_EVDO_B = 12;
public static final int NETWORK_TYPE_GPRS = 1;
public static final int NETWORK_TYPE_GSM = 16;
public static final int NETWORK_TYPE_HSDPA = 8;
public static final int NETWORK_TYPE_HSPA = 10;
public static final int NETWORK_TYPE_HSPAP = 15;
public static final int NETWORK_TYPE_HSUPA = 9;
public static final int NETWORK_TYPE_IDEN = 11;
public static final int NETWORK_TYPE_IWLAN = 18;
public static final int NETWORK_TYPE_LTE = 13;
public static final int NETWORK_TYPE_TD_SCDMA = 17;
public static final int NETWORK_TYPE_UMTS = 3;
public static final int NETWORK_TYPE_UNKNOWN = 0;
public static final int PHONE_TYPE_CDMA = 2;
public static final int PHONE_TYPE_GSM = 1;
public static final int PHONE_TYPE_NONE = 0;
public static final int PHONE_TYPE_SIP = 3;
public static final int SIM_ACTIVATION_RESULT_CANCELED = 4;
public static final int SIM_ACTIVATION_RESULT_COMPLETE = 0;
public static final int SIM_ACTIVATION_RESULT_FAILED = 3;
public static final int SIM_ACTIVATION_RESULT_IN_PROGRESS = 2;
public static final int SIM_ACTIVATION_RESULT_NOT_SUPPORTED = 1;
public static final int SIM_STATE_ABSENT = 1;
public static final int SIM_STATE_NETWORK_LOCKED = 4;
public static final int SIM_STATE_PIN_REQUIRED = 2;
public static final int SIM_STATE_PUK_REQUIRED = 3;
public static final int SIM_STATE_READY = 5;
public static final int SIM_STATE_UNKNOWN = 0;
public static final java.lang.String VVM_TYPE_CVVM = "vvm_type_cvvm";
public static final java.lang.String VVM_TYPE_OMTP = "vvm_type_omtp";
static { EXTRA_STATE_IDLE = null; EXTRA_STATE_OFFHOOK = null; EXTRA_STATE_RINGING = null; }
}
