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
public final class IpManagerEvent
  implements android.os.Parcelable
{
IpManagerEvent() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static  void logEvent(int eventType, java.lang.String ifName, long durationMs) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int COMPLETE_LIFECYCLE = 3;
public static final android.os.Parcelable.Creator<android.net.metrics.IpManagerEvent> CREATOR;
public static final int PROVISIONING_FAIL = 2;
public static final int PROVISIONING_OK = 1;
public final long durationMs;
public final int eventType;
public final java.lang.String ifName;
static { CREATOR = null; }
}
