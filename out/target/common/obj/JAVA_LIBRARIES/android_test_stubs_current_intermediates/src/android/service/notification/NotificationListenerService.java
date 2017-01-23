/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.service.notification;
public abstract class NotificationListenerService
  extends android.app.Service
{
public static class Ranking
{
public  Ranking() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKey() { throw new RuntimeException("Stub!"); }
public  int getRank() { throw new RuntimeException("Stub!"); }
public  boolean isAmbient() { throw new RuntimeException("Stub!"); }
public  int getSuppressedVisualEffects() { throw new RuntimeException("Stub!"); }
public  boolean matchesInterruptionFilter() { throw new RuntimeException("Stub!"); }
public  int getImportance() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getImportanceExplanation() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOverrideGroupKey() { throw new RuntimeException("Stub!"); }
}
public static class RankingMap
  implements android.os.Parcelable
{
RankingMap() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getOrderedKeys() { throw new RuntimeException("Stub!"); }
public  boolean getRanking(java.lang.String key, android.service.notification.NotificationListenerService.Ranking outRanking) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.notification.NotificationListenerService.RankingMap> CREATOR;
static { CREATOR = null; }
}
public  NotificationListenerService() { throw new RuntimeException("Stub!"); }
protected  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
public  void onNotificationPosted(android.service.notification.StatusBarNotification sbn) { throw new RuntimeException("Stub!"); }
public  void onNotificationPosted(android.service.notification.StatusBarNotification sbn, android.service.notification.NotificationListenerService.RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
public  void onNotificationRemoved(android.service.notification.StatusBarNotification sbn) { throw new RuntimeException("Stub!"); }
public  void onNotificationRemoved(android.service.notification.StatusBarNotification sbn, android.service.notification.NotificationListenerService.RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
public  void onListenerConnected() { throw new RuntimeException("Stub!"); }
public  void onListenerDisconnected() { throw new RuntimeException("Stub!"); }
public  void onNotificationRankingUpdate(android.service.notification.NotificationListenerService.RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
public  void onListenerHintsChanged(int hints) { throw new RuntimeException("Stub!"); }
public  void onInterruptionFilterChanged(int interruptionFilter) { throw new RuntimeException("Stub!"); }
@Deprecated
public final  void cancelNotification(java.lang.String pkg, java.lang.String tag, int id) { throw new RuntimeException("Stub!"); }
public final  void cancelNotification(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  void cancelAllNotifications() { throw new RuntimeException("Stub!"); }
public final  void cancelNotifications(java.lang.String[] keys) { throw new RuntimeException("Stub!"); }
public final  void setNotificationsShown(java.lang.String[] keys) { throw new RuntimeException("Stub!"); }
public  android.service.notification.StatusBarNotification[] getActiveNotifications() { throw new RuntimeException("Stub!"); }
public  android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String[] keys) { throw new RuntimeException("Stub!"); }
public final  int getCurrentListenerHints() { throw new RuntimeException("Stub!"); }
public final  int getCurrentInterruptionFilter() { throw new RuntimeException("Stub!"); }
public final  void requestListenerHints(int hints) { throw new RuntimeException("Stub!"); }
public final  void requestInterruptionFilter(int interruptionFilter) { throw new RuntimeException("Stub!"); }
public  android.service.notification.NotificationListenerService.RankingMap getCurrentRanking() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public static  void requestRebind(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
public final  void requestUnbind() { throw new RuntimeException("Stub!"); }
public static final int HINT_HOST_DISABLE_CALL_EFFECTS = 4;
public static final int HINT_HOST_DISABLE_EFFECTS = 1;
public static final int HINT_HOST_DISABLE_NOTIFICATION_EFFECTS = 2;
public static final int INTERRUPTION_FILTER_ALARMS = 4;
public static final int INTERRUPTION_FILTER_ALL = 1;
public static final int INTERRUPTION_FILTER_NONE = 3;
public static final int INTERRUPTION_FILTER_PRIORITY = 2;
public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.NotificationListenerService";
public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
}
