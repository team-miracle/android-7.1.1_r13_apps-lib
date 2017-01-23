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
public final class ApfProgramEvent
  implements android.os.Parcelable
{
ApfProgramEvent() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.metrics.ApfProgramEvent> CREATOR;
public static final int FLAG_HAS_IPV4_ADDRESS = 1;
public static final int FLAG_MULTICAST_FILTER_ON = 0;
public final int currentRas;
public final int filteredRas;
public final int flags;
public final long lifetime;
public final int programLength;
static { CREATOR = null; }
}
