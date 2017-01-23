/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.net.metrics;
public final class DhcpErrorEvent
  implements android.os.Parcelable
{
DhcpErrorEvent() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static  void logParseError(java.lang.String ifName, int errorCode) { throw new RuntimeException("Stub!"); }
public static  void logReceiveError(java.lang.String ifName) { throw new RuntimeException("Stub!"); }
public static  int errorCodeWithOption(int errorCode, int option) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int BOOTP_TOO_SHORT;
public static final int BUFFER_UNDERFLOW;
public static final android.os.Parcelable.Creator<android.net.metrics.DhcpErrorEvent> CREATOR;
public static final int DHCP_BAD_MAGIC_COOKIE;
public static final int DHCP_ERROR = 4;
public static final int DHCP_INVALID_OPTION_LENGTH;
public static final int DHCP_NO_MSG_TYPE;
public static final int DHCP_UNKNOWN_MSG_TYPE;
public static final int L2_ERROR = 1;
public static final int L2_TOO_SHORT;
public static final int L2_WRONG_ETH_TYPE;
public static final int L3_ERROR = 2;
public static final int L3_INVALID_IP;
public static final int L3_NOT_IPV4;
public static final int L3_TOO_SHORT;
public static final int L4_ERROR = 3;
public static final int L4_NOT_UDP;
public static final int L4_WRONG_PORT;
public static final int MISC_ERROR = 5;
public static final int RECEIVE_ERROR;
public final int errorCode;
public final java.lang.String ifName;
static { BOOTP_TOO_SHORT = 0; BUFFER_UNDERFLOW = 0; CREATOR = null; DHCP_BAD_MAGIC_COOKIE = 0; DHCP_INVALID_OPTION_LENGTH = 0; DHCP_NO_MSG_TYPE = 0; DHCP_UNKNOWN_MSG_TYPE = 0; L2_TOO_SHORT = 0; L2_WRONG_ETH_TYPE = 0; L3_INVALID_IP = 0; L3_NOT_IPV4 = 0; L3_TOO_SHORT = 0; L4_NOT_UDP = 0; L4_WRONG_PORT = 0; RECEIVE_ERROR = 0; }
}
