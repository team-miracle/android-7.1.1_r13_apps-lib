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

package android.content.pm;
public class LauncherApps
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onPackageRemoved(java.lang.String packageName, android.os.UserHandle user);
public abstract  void onPackageAdded(java.lang.String packageName, android.os.UserHandle user);
public abstract  void onPackageChanged(java.lang.String packageName, android.os.UserHandle user);
public abstract  void onPackagesAvailable(java.lang.String[] packageNames, android.os.UserHandle user, boolean replacing);
public abstract  void onPackagesUnavailable(java.lang.String[] packageNames, android.os.UserHandle user, boolean replacing);
public  void onPackagesSuspended(java.lang.String[] packageNames, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void onPackagesUnsuspended(java.lang.String[] packageNames, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void onShortcutsChanged(java.lang.String packageName, java.util.List<android.content.pm.ShortcutInfo> shortcuts, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
}
public static class ShortcutQuery
{
public  ShortcutQuery() { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setChangedSince(long changedSince) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setShortcutIds(java.util.List<java.lang.String> shortcutIds) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setActivity(android.content.ComponentName activity) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherApps.ShortcutQuery setQueryFlags(int queryFlags) { throw new RuntimeException("Stub!"); }
public static final int FLAG_GET_KEY_FIELDS_ONLY = 4;
public static final int FLAG_MATCH_DYNAMIC = 1;
public static final int FLAG_MATCH_MANIFEST = 8;
public static final int FLAG_MATCH_PINNED = 2;
}
LauncherApps() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.LauncherActivityInfo> getActivityList(java.lang.String packageName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.content.pm.LauncherActivityInfo resolveActivity(android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void startMainActivity(android.content.ComponentName component, android.os.UserHandle user, android.graphics.Rect sourceBounds, android.os.Bundle opts) { throw new RuntimeException("Stub!"); }
public  void startAppDetailsActivity(android.content.ComponentName component, android.os.UserHandle user, android.graphics.Rect sourceBounds, android.os.Bundle opts) { throw new RuntimeException("Stub!"); }
public  boolean isPackageEnabled(java.lang.String packageName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  boolean isActivityEnabled(android.content.ComponentName component, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  boolean hasShortcutHostPermission() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ShortcutInfo> getShortcuts(android.content.pm.LauncherApps.ShortcutQuery query, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void pinShortcuts(java.lang.String packageName, java.util.List<java.lang.String> shortcutIds, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getShortcutIconDrawable(android.content.pm.ShortcutInfo shortcut, int density) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getShortcutBadgedIconDrawable(android.content.pm.ShortcutInfo shortcut, int density) { throw new RuntimeException("Stub!"); }
public  void startShortcut(java.lang.String packageName, java.lang.String shortcutId, android.graphics.Rect sourceBounds, android.os.Bundle startActivityOptions, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void startShortcut(android.content.pm.ShortcutInfo shortcut, android.graphics.Rect sourceBounds, android.os.Bundle startActivityOptions) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.content.pm.LauncherApps.Callback callback) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.content.pm.LauncherApps.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.content.pm.LauncherApps.Callback callback) { throw new RuntimeException("Stub!"); }
}
