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

package android.service.notification;
public abstract class NotificationRankerService
  extends android.service.notification.NotificationListenerService
{
public  NotificationRankerService() { throw new RuntimeException("Stub!"); }
protected  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  android.service.notification.Adjustment onNotificationEnqueued(android.service.notification.StatusBarNotification sbn, int importance, boolean user);
public  void onNotificationVisibilityChanged(java.lang.String key, long time, boolean visible) { throw new RuntimeException("Stub!"); }
public  void onNotificationClick(java.lang.String key, long time) { throw new RuntimeException("Stub!"); }
public  void onNotificationActionClick(java.lang.String key, long time, int actionIndex) { throw new RuntimeException("Stub!"); }
public  void onNotificationRemoved(java.lang.String key, long time, int reason) { throw new RuntimeException("Stub!"); }
public final  void adjustNotification(android.service.notification.Adjustment adjustment) { throw new RuntimeException("Stub!"); }
public final  void adjustNotifications(java.util.List<android.service.notification.Adjustment> adjustments) { throw new RuntimeException("Stub!"); }
public static final int REASON_APP_CANCEL = 8;
public static final int REASON_APP_CANCEL_ALL = 9;
public static final int REASON_DELEGATE_CANCEL = 2;
public static final int REASON_DELEGATE_CANCEL_ALL = 3;
public static final int REASON_DELEGATE_CLICK = 1;
public static final int REASON_DELEGATE_ERROR = 4;
public static final int REASON_GROUP_OPTIMIZATION = 13;
public static final int REASON_GROUP_SUMMARY_CANCELED = 12;
public static final int REASON_LISTENER_CANCEL = 10;
public static final int REASON_LISTENER_CANCEL_ALL = 11;
public static final int REASON_PACKAGE_BANNED = 7;
public static final int REASON_PACKAGE_CHANGED = 5;
public static final int REASON_PACKAGE_SUSPENDED = 14;
public static final int REASON_PROFILE_TURNED_OFF = 15;
public static final int REASON_UNAUTOBUNDLED = 16;
public static final int REASON_USER_STOPPED = 6;
public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.NotificationRankerService";
}
