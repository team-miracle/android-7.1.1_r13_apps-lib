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

package android.net;
public final class ConnectivityMetricsEvent
  implements android.os.Parcelable
{
public static final class Reference
  implements android.os.Parcelable
{
public  Reference(long ref) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  long getValue() { throw new RuntimeException("Stub!"); }
public  void setValue(long val) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.ConnectivityMetricsEvent.Reference> CREATOR;
static { CREATOR = null; }
}
public  ConnectivityMetricsEvent(long timestamp, int componentTag, int eventTag, android.os.Parcelable data) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.ConnectivityMetricsEvent> CREATOR;
public final int componentTag;
public final android.os.Parcelable data;
public final int eventTag;
public final long timestamp;
static { CREATOR = null; }
}
