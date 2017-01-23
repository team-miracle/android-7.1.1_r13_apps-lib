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
public final class IpReachabilityEvent
  implements android.os.Parcelable
{
IpReachabilityEvent() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static  void logProbeEvent(java.lang.String ifName, int nlErrorCode) { throw new RuntimeException("Stub!"); }
public static  void logNudFailed(java.lang.String ifName) { throw new RuntimeException("Stub!"); }
public static  void logProvisioningLost(java.lang.String ifName) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.metrics.IpReachabilityEvent> CREATOR;
public static final int NUD_FAILED = 512;
public static final int PROBE = 256;
public static final int PROVISIONING_LOST = 768;
public final int eventType;
public final java.lang.String ifName;
static { CREATOR = null; }
}
