/*
* Copyright (C) 2015 The Android Open Source Project
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
public final class EphemeralResolveInfo
  implements android.os.Parcelable
{
public  EphemeralResolveInfo(android.net.Uri uri, java.lang.String packageName, java.util.List<android.content.IntentFilter> filters) { throw new RuntimeException("Stub!"); }
public  byte[] getDigestBytes() { throw new RuntimeException("Stub!"); }
public  int getDigestPrefix() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.IntentFilter> getFilters() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.EphemeralResolveInfo> CREATOR;
public static final java.lang.String SHA_ALGORITHM = "SHA-256";
static { CREATOR = null; }
}
