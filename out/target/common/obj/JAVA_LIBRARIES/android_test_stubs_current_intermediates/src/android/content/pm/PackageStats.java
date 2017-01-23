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

package android.content.pm;
public class PackageStats
  implements android.os.Parcelable
{
public  PackageStats(java.lang.String pkgName) { throw new RuntimeException("Stub!"); }
public  PackageStats(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  PackageStats(android.content.pm.PackageStats pStats) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.PackageStats> CREATOR;
public long cacheSize;
public long codeSize;
public long dataSize;
public long externalCacheSize;
public long externalCodeSize;
public long externalDataSize;
public long externalMediaSize;
public long externalObbSize;
public java.lang.String packageName;
static { CREATOR = null; }
}
