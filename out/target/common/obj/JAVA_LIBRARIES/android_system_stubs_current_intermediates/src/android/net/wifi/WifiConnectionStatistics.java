/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.net.wifi;
public class WifiConnectionStatistics
  implements android.os.Parcelable
{
public  WifiConnectionStatistics() { throw new RuntimeException("Stub!"); }
public  WifiConnectionStatistics(android.net.wifi.WifiConnectionStatistics source) { throw new RuntimeException("Stub!"); }
public  void incrementOrAddUntrusted(java.lang.String SSID, int connection, int usage) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.WifiConnectionStatistics> CREATOR;
public int num24GhzConnected;
public int num5GhzConnected;
public int numAutoJoinAttempt;
public int numAutoRoamAttempt;
public int numWifiManagerJoinAttempt;
public java.util.HashMap<java.lang.String, android.net.wifi.WifiNetworkConnectionStatistics> untrustedNetworkHistory;
static { CREATOR = null; }
}
