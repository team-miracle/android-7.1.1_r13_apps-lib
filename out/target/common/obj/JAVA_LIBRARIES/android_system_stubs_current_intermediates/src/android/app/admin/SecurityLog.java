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

package android.app.admin;
public class SecurityLog
{
public static final class SecurityEvent
  implements android.os.Parcelable
{
SecurityEvent() { throw new RuntimeException("Stub!"); }
public  long getTimeNanos() { throw new RuntimeException("Stub!"); }
public  int getTag() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getData() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.admin.SecurityLog.SecurityEvent> CREATOR;
static { CREATOR = null; }
}
public  SecurityLog() { throw new RuntimeException("Stub!"); }
public static final int TAG_ADB_SHELL_CMD = 210002;
public static final int TAG_ADB_SHELL_INTERACTIVE = 210001;
public static final int TAG_APP_PROCESS_START = 210005;
public static final int TAG_KEYGUARD_DISMISSED = 210006;
public static final int TAG_KEYGUARD_DISMISS_AUTH_ATTEMPT = 210007;
public static final int TAG_KEYGUARD_SECURED = 210008;
public static final int TAG_SYNC_RECV_FILE = 210003;
public static final int TAG_SYNC_SEND_FILE = 210004;
}
