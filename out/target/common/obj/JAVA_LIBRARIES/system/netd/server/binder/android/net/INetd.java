/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/../../system/netd/server/binder/android/net/INetd.aidl
 */
package android.net;
/** {@hide} */
public interface INetd extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetd
{
private static final java.lang.String DESCRIPTOR = "android.net.INetd";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetd interface,
 * generating a proxy if needed.
 */
public static android.net.INetd asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetd))) {
return ((android.net.INetd)iin);
}
return new android.net.INetd.Stub.Proxy(obj);
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
case TRANSACTION_isAlive:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAlive();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_firewallReplaceUidChain:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int[] _arg2;
_arg2 = data.createIntArray();
boolean _result = this.firewallReplaceUidChain(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_bandwidthEnableDataSaver:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.bandwidthEnableDataSaver(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_networkRejectNonSecureVpn:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
android.net.UidRange[] _arg1;
_arg1 = data.createTypedArray(android.net.UidRange.CREATOR);
this.networkRejectNonSecureVpn(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_socketDestroy:
{
data.enforceInterface(DESCRIPTOR);
android.net.UidRange[] _arg0;
_arg0 = data.createTypedArray(android.net.UidRange.CREATOR);
int[] _arg1;
_arg1 = data.createIntArray();
this.socketDestroy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setResolverConfiguration:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
int[] _arg3;
_arg3 = data.createIntArray();
this.setResolverConfiguration(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getResolverInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new java.lang.String[_arg1_length];
}
java.lang.String[] _arg2;
int _arg2_length = data.readInt();
if ((_arg2_length<0)) {
_arg2 = null;
}
else {
_arg2 = new java.lang.String[_arg2_length];
}
int[] _arg3;
int _arg3_length = data.readInt();
if ((_arg3_length<0)) {
_arg3 = null;
}
else {
_arg3 = new int[_arg3_length];
}
int[] _arg4;
int _arg4_length = data.readInt();
if ((_arg4_length<0)) {
_arg4 = null;
}
else {
_arg4 = new int[_arg4_length];
}
this.getResolverInfo(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeStringArray(_arg1);
reply.writeStringArray(_arg2);
reply.writeIntArray(_arg3);
reply.writeIntArray(_arg4);
return true;
}
case TRANSACTION_tetherApplyDnsInterfaces:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.tetherApplyDnsInterfaces();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_interfaceAddAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.interfaceAddAddress(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceDelAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.interfaceDelAddress(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setProcSysNet:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
this.setProcSysNet(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetd
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
     * Returns true if the service is responding.
     */
@Override public boolean isAlive() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAlive, _data, _reply, 0);
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
     * Replaces the contents of the specified UID-based firewall chain.
     *
     * The chain may be a whitelist chain or a blacklist chain. A blacklist chain contains DROP
     * rules for the specified UIDs and a RETURN rule at the end. A whitelist chain contains RETURN
     * rules for the system UID range (0 to {@code UID_APP} - 1), RETURN rules for for the specified
     * UIDs, and a DROP rule at the end. The chain will be created if it does not exist.
     *
     * @param chainName The name of the chain to replace.
     * @param isWhitelist Whether this is a whitelist or blacklist chain.
     * @param uids The list of UIDs to allow/deny.
     * @return true if the chain was successfully replaced, false otherwise.
     */
@Override public boolean firewallReplaceUidChain(java.lang.String chainName, boolean isWhitelist, int[] uids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(chainName);
_data.writeInt(((isWhitelist)?(1):(0)));
_data.writeIntArray(uids);
mRemote.transact(Stub.TRANSACTION_firewallReplaceUidChain, _data, _reply, 0);
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
     * Enables or disables data saver mode on costly network interfaces.
     *
     * - When disabled, all packets to/from apps in the penalty box chain are rejected on costly
     *   interfaces. Traffic to/from other apps or on other network interfaces is allowed.
     * - When enabled, only apps that are in the happy box chain and not in the penalty box chain
     *   are allowed network connectivity on costly interfaces. All other packets on these
     *   interfaces are rejected. The happy box chain always contains all system UIDs; to disallow
     *   traffic from system UIDs, place them in the penalty box chain.
     *
     * By default, data saver mode is disabled. This command has no effect but might still return an
     * error) if {@code enable} is the same as the current value.
     *
     * @param enable whether to enable or disable data saver mode.
     * @return true if the if the operation was successful, false otherwise.
     */
@Override public boolean bandwidthEnableDataSaver(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_bandwidthEnableDataSaver, _data, _reply, 0);
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
     * Adds or removes one rule for each supplied UID range to prohibit all network activity outside
     * of secure VPN.
     *
     * When a UID is covered by one of these rules, traffic sent through any socket that is not
     * protected or explicitly overriden by the system will be rejected. The kernel will respond
     * with an ICMP prohibit message.
     *
     * Initially, there are no such rules. Any rules that are added will only last until the next
     * restart of netd or the device.
     *
     * @param add {@code true} if the specified UID ranges should be denied access to any network
     *        which is not secure VPN by adding rules, {@code false} to remove existing rules.
     * @param uidRanges a set of non-overlapping, contiguous ranges of UIDs to which to apply or
     *        remove this restriction.
     *        <p> Added rules should not overlap with existing rules. Likewise, removed rules should
     *        each correspond to an existing rule.
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void networkRejectNonSecureVpn(boolean add, android.net.UidRange[] uidRanges) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((add)?(1):(0)));
_data.writeTypedArray(uidRanges, 0);
mRemote.transact(Stub.TRANSACTION_networkRejectNonSecureVpn, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Administratively closes sockets belonging to the specified UIDs.
     */
@Override public void socketDestroy(android.net.UidRange[] uidRanges, int[] exemptUids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(uidRanges, 0);
_data.writeIntArray(exemptUids);
mRemote.transact(Stub.TRANSACTION_socketDestroy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Sets the name servers, search domains and resolver params for the given network. Flushes the
     * cache as needed (i.e. when the servers or the number of samples to store changes).
     *
     * @param netId the network ID of the network for which information should be configured.
     * @param servers the DNS servers to configure for the network.
     * @param domains the search domains to configure.
     * @param params the params to set. This array contains RESOLVER_PARAMS_COUNT integers that
     *   encode the contents of Bionic's __res_params struct, i.e. sample_validity is stored at
     *   position RESOLVER_PARAMS_SAMPLE_VALIDITY, etc.
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void setResolverConfiguration(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
_data.writeStringArray(servers);
_data.writeStringArray(domains);
_data.writeIntArray(params);
mRemote.transact(Stub.TRANSACTION_setResolverConfiguration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Retrieves the name servers, search domains and resolver stats associated with the given
     * network ID.
     *
     * @param netId the network ID of the network for which information should be retrieved.
     * @param servers the DNS servers that are currently configured for the network.
     * @param domains the search domains currently configured.
     * @param params the resolver parameters configured, i.e. the contents of __res_params in order.
     * @param stats the stats for each server in the order specified by RESOLVER_STATS_XXX
     *         constants, serialized as an int array. The contents of this array are the number of
     *         <ul>
     *           <li> successes,
     *           <li> errors,
     *           <li> timeouts,
     *           <li> internal errors,
     *           <li> the RTT average,
     *           <li> the time of the last recorded sample,
     *           <li> and an integer indicating whether the server is usable (1) or broken (0).
     *         </ul>
     *         in this order. For example, the timeout counter for server N is stored at position
     *         RESOLVER_STATS_COUNT*N + RESOLVER_STATS_TIMEOUTS
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void getResolverInfo(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params, int[] stats) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(netId);
if ((servers==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(servers.length);
}
if ((domains==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(domains.length);
}
if ((params==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(params.length);
}
if ((stats==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(stats.length);
}
mRemote.transact(Stub.TRANSACTION_getResolverInfo, _data, _reply, 0);
_reply.readException();
_reply.readStringArray(servers);
_reply.readStringArray(domains);
_reply.readIntArray(params);
_reply.readIntArray(stats);
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Instruct the tethering DNS server to reevaluated serving interfaces.
     * This is needed to for the DNS server to observe changes in the set
     * of potential listening IP addresses. (Listening on wildcard addresses
     * can turn the device into an open resolver; b/7530468)
     *
     * TODO: Return something richer than just a boolean.
     */
@Override public boolean tetherApplyDnsInterfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_tetherApplyDnsInterfaces, _data, _reply, 0);
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
     * Add/Remove and IP address from an interface.
     *
     * @param ifName the interface name
     * @param addrString the IP address to add/remove as a string literal
     * @param prefixLength the prefix length associated with this IP address
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
@Override public void interfaceAddAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ifName);
_data.writeString(addrString);
_data.writeInt(prefixLength);
mRemote.transact(Stub.TRANSACTION_interfaceAddAddress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void interfaceDelAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ifName);
_data.writeString(addrString);
_data.writeInt(prefixLength);
mRemote.transact(Stub.TRANSACTION_interfaceDelAddress, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setProcSysNet(int family, int which, java.lang.String ifname, java.lang.String parameter, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(family);
_data.writeInt(which);
_data.writeString(ifname);
_data.writeString(parameter);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setProcSysNet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_isAlive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_firewallReplaceUidChain = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_bandwidthEnableDataSaver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_networkRejectNonSecureVpn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_socketDestroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setResolverConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getResolverInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_tetherApplyDnsInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_interfaceAddAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_interfaceDelAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setProcSysNet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public static final int RESOLVER_PARAMS_SAMPLE_VALIDITY = 0;
public static final int RESOLVER_PARAMS_SUCCESS_THRESHOLD = 1;
public static final int RESOLVER_PARAMS_MIN_SAMPLES = 2;
public static final int RESOLVER_PARAMS_MAX_SAMPLES = 3;
public static final int RESOLVER_PARAMS_COUNT = 4;
public static final int RESOLVER_STATS_SUCCESSES = 0;
public static final int RESOLVER_STATS_ERRORS = 1;
public static final int RESOLVER_STATS_TIMEOUTS = 2;
public static final int RESOLVER_STATS_INTERNAL_ERRORS = 3;
public static final int RESOLVER_STATS_RTT_AVG = 4;
public static final int RESOLVER_STATS_LAST_SAMPLE_TIME = 5;
public static final int RESOLVER_STATS_USABLE = 6;
public static final int RESOLVER_STATS_COUNT = 7;
public static final int IPV4 = 4;
public static final int IPV6 = 6;
public static final int CONF = 1;
public static final int NEIGH = 2;
/**
     * Returns true if the service is responding.
     */
public boolean isAlive() throws android.os.RemoteException;
/**
     * Replaces the contents of the specified UID-based firewall chain.
     *
     * The chain may be a whitelist chain or a blacklist chain. A blacklist chain contains DROP
     * rules for the specified UIDs and a RETURN rule at the end. A whitelist chain contains RETURN
     * rules for the system UID range (0 to {@code UID_APP} - 1), RETURN rules for for the specified
     * UIDs, and a DROP rule at the end. The chain will be created if it does not exist.
     *
     * @param chainName The name of the chain to replace.
     * @param isWhitelist Whether this is a whitelist or blacklist chain.
     * @param uids The list of UIDs to allow/deny.
     * @return true if the chain was successfully replaced, false otherwise.
     */
public boolean firewallReplaceUidChain(java.lang.String chainName, boolean isWhitelist, int[] uids) throws android.os.RemoteException;
/**
     * Enables or disables data saver mode on costly network interfaces.
     *
     * - When disabled, all packets to/from apps in the penalty box chain are rejected on costly
     *   interfaces. Traffic to/from other apps or on other network interfaces is allowed.
     * - When enabled, only apps that are in the happy box chain and not in the penalty box chain
     *   are allowed network connectivity on costly interfaces. All other packets on these
     *   interfaces are rejected. The happy box chain always contains all system UIDs; to disallow
     *   traffic from system UIDs, place them in the penalty box chain.
     *
     * By default, data saver mode is disabled. This command has no effect but might still return an
     * error) if {@code enable} is the same as the current value.
     *
     * @param enable whether to enable or disable data saver mode.
     * @return true if the if the operation was successful, false otherwise.
     */
public boolean bandwidthEnableDataSaver(boolean enable) throws android.os.RemoteException;
/**
     * Adds or removes one rule for each supplied UID range to prohibit all network activity outside
     * of secure VPN.
     *
     * When a UID is covered by one of these rules, traffic sent through any socket that is not
     * protected or explicitly overriden by the system will be rejected. The kernel will respond
     * with an ICMP prohibit message.
     *
     * Initially, there are no such rules. Any rules that are added will only last until the next
     * restart of netd or the device.
     *
     * @param add {@code true} if the specified UID ranges should be denied access to any network
     *        which is not secure VPN by adding rules, {@code false} to remove existing rules.
     * @param uidRanges a set of non-overlapping, contiguous ranges of UIDs to which to apply or
     *        remove this restriction.
     *        <p> Added rules should not overlap with existing rules. Likewise, removed rules should
     *        each correspond to an existing rule.
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void networkRejectNonSecureVpn(boolean add, android.net.UidRange[] uidRanges) throws android.os.RemoteException;
/**
     * Administratively closes sockets belonging to the specified UIDs.
     */
public void socketDestroy(android.net.UidRange[] uidRanges, int[] exemptUids) throws android.os.RemoteException;
/**
     * Sets the name servers, search domains and resolver params for the given network. Flushes the
     * cache as needed (i.e. when the servers or the number of samples to store changes).
     *
     * @param netId the network ID of the network for which information should be configured.
     * @param servers the DNS servers to configure for the network.
     * @param domains the search domains to configure.
     * @param params the params to set. This array contains RESOLVER_PARAMS_COUNT integers that
     *   encode the contents of Bionic's __res_params struct, i.e. sample_validity is stored at
     *   position RESOLVER_PARAMS_SAMPLE_VALIDITY, etc.
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void setResolverConfiguration(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params) throws android.os.RemoteException;
/**
     * Retrieves the name servers, search domains and resolver stats associated with the given
     * network ID.
     *
     * @param netId the network ID of the network for which information should be retrieved.
     * @param servers the DNS servers that are currently configured for the network.
     * @param domains the search domains currently configured.
     * @param params the resolver parameters configured, i.e. the contents of __res_params in order.
     * @param stats the stats for each server in the order specified by RESOLVER_STATS_XXX
     *         constants, serialized as an int array. The contents of this array are the number of
     *         <ul>
     *           <li> successes,
     *           <li> errors,
     *           <li> timeouts,
     *           <li> internal errors,
     *           <li> the RTT average,
     *           <li> the time of the last recorded sample,
     *           <li> and an integer indicating whether the server is usable (1) or broken (0).
     *         </ul>
     *         in this order. For example, the timeout counter for server N is stored at position
     *         RESOLVER_STATS_COUNT*N + RESOLVER_STATS_TIMEOUTS
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void getResolverInfo(int netId, java.lang.String[] servers, java.lang.String[] domains, int[] params, int[] stats) throws android.os.RemoteException;
/**
     * Instruct the tethering DNS server to reevaluated serving interfaces.
     * This is needed to for the DNS server to observe changes in the set
     * of potential listening IP addresses. (Listening on wildcard addresses
     * can turn the device into an open resolver; b/7530468)
     *
     * TODO: Return something richer than just a boolean.
     */
public boolean tetherApplyDnsInterfaces() throws android.os.RemoteException;
/**
     * Add/Remove and IP address from an interface.
     *
     * @param ifName the interface name
     * @param addrString the IP address to add/remove as a string literal
     * @param prefixLength the prefix length associated with this IP address
     *
     * @throws ServiceSpecificException in case of failure, with an error code corresponding to the
     *         unix errno.
     */
public void interfaceAddAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException;
public void interfaceDelAddress(java.lang.String ifName, java.lang.String addrString, int prefixLength) throws android.os.RemoteException;
public void setProcSysNet(int family, int which, java.lang.String ifname, java.lang.String parameter, java.lang.String value) throws android.os.RemoteException;
}
