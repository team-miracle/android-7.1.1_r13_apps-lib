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
public class ConnectivityMetricsLogger
{
public  ConnectivityMetricsLogger() { throw new RuntimeException("Stub!"); }
public  void logEvent(long timestamp, int componentTag, int eventTag, android.os.Parcelable data) { throw new RuntimeException("Stub!"); }
public  android.net.ConnectivityMetricsEvent[] getEvents(android.net.ConnectivityMetricsEvent.Reference reference) { throw new RuntimeException("Stub!"); }
public  boolean register(android.app.PendingIntent newEventsIntent) { throw new RuntimeException("Stub!"); }
public  boolean unregister(android.app.PendingIntent newEventsIntent) { throw new RuntimeException("Stub!"); }
public static final int COMPONENT_TAG_BLUETOOTH = 1;
public static final int COMPONENT_TAG_CONNECTIVITY = 0;
public static final int COMPONENT_TAG_TELECOM = 3;
public static final int COMPONENT_TAG_TELEPHONY = 4;
public static final int COMPONENT_TAG_WIFI = 2;
public static final java.lang.String CONNECTIVITY_METRICS_LOGGER_SERVICE = "connectivity_metrics_logger";
public static final java.lang.String DATA_KEY_EVENTS_COUNT = "count";
public static final int NUMBER_OF_COMPONENTS = 5;
public static final int TAG_SKIPPED_EVENTS = -1;
}
