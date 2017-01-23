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
public final class NetworkEvent
  implements android.os.Parcelable
{
NetworkEvent() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static  void logEvent(int netId, int eventType) { throw new RuntimeException("Stub!"); }
public static  void logValidated(int netId, long durationMs) { throw new RuntimeException("Stub!"); }
public static  void logCaptivePortalFound(int netId, long durationMs) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.metrics.NetworkEvent> CREATOR;
public static final int NETWORK_CAPTIVE_PORTAL_FOUND = 4;
public static final int NETWORK_CONNECTED = 1;
public static final int NETWORK_DISCONNECTED = 7;
public static final int NETWORK_LINGER = 5;
public static final int NETWORK_UNLINGER = 6;
public static final int NETWORK_VALIDATED = 2;
public static final int NETWORK_VALIDATION_FAILED = 3;
public final long durationMs;
public final int eventType;
public final int netId;
static { CREATOR = null; }
}
