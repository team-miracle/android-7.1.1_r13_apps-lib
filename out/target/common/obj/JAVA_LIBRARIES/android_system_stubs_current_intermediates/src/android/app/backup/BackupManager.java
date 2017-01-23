/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.app.backup;
public class BackupManager
{
public  BackupManager(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void dataChanged() { throw new RuntimeException("Stub!"); }
public static  void dataChanged(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int requestRestore(android.app.backup.RestoreObserver observer) { throw new RuntimeException("Stub!"); }
public  android.app.backup.RestoreSession beginRestoreSession() { throw new RuntimeException("Stub!"); }
public  void setBackupEnabled(boolean isEnabled) { throw new RuntimeException("Stub!"); }
public  boolean isBackupEnabled() { throw new RuntimeException("Stub!"); }
public  void setAutoRestore(boolean isEnabled) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCurrentTransport() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] listAllTransports() { throw new RuntimeException("Stub!"); }
public  java.lang.String selectBackupTransport(java.lang.String transport) { throw new RuntimeException("Stub!"); }
public  void backupNow() { throw new RuntimeException("Stub!"); }
public  long getAvailableRestoreToken(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean isAppEligibleForBackup(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int requestBackup(java.lang.String[] packages, android.app.backup.BackupObserver observer) { throw new RuntimeException("Stub!"); }
public static final int ERROR_AGENT_FAILURE = -1003;
public static final int ERROR_BACKUP_NOT_ALLOWED = -2001;
public static final int ERROR_PACKAGE_NOT_FOUND = -2002;
public static final int ERROR_TRANSPORT_ABORTED = -1000;
public static final int ERROR_TRANSPORT_PACKAGE_REJECTED = -1002;
public static final int ERROR_TRANSPORT_QUOTA_EXCEEDED = -1005;
public static final int SUCCESS = 0;
}
