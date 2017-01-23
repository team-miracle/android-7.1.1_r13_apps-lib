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

package android.mtp;
public class MtpEvent
{
MtpEvent() { throw new RuntimeException("Stub!"); }
public  int getEventCode() { throw new RuntimeException("Stub!"); }
public  int getParameter1() { throw new RuntimeException("Stub!"); }
public  int getParameter2() { throw new RuntimeException("Stub!"); }
public  int getParameter3() { throw new RuntimeException("Stub!"); }
public  int getObjectHandle() { throw new RuntimeException("Stub!"); }
public  int getStorageId() { throw new RuntimeException("Stub!"); }
public  int getDevicePropCode() { throw new RuntimeException("Stub!"); }
public  int getTransactionId() { throw new RuntimeException("Stub!"); }
public  int getObjectPropCode() { throw new RuntimeException("Stub!"); }
public  int getObjectFormatCode() { throw new RuntimeException("Stub!"); }
public static final int EVENT_CANCEL_TRANSACTION = 16385;
public static final int EVENT_CAPTURE_COMPLETE = 16397;
public static final int EVENT_DEVICE_INFO_CHANGED = 16392;
public static final int EVENT_DEVICE_PROP_CHANGED = 16390;
public static final int EVENT_DEVICE_RESET = 16395;
public static final int EVENT_OBJECT_ADDED = 16386;
public static final int EVENT_OBJECT_INFO_CHANGED = 16391;
public static final int EVENT_OBJECT_PROP_CHANGED = 51201;
public static final int EVENT_OBJECT_PROP_DESC_CHANGED = 51202;
public static final int EVENT_OBJECT_REFERENCES_CHANGED = 51203;
public static final int EVENT_OBJECT_REMOVED = 16387;
public static final int EVENT_REQUEST_OBJECT_TRANSFER = 16393;
public static final int EVENT_STORAGE_INFO_CHANGED = 16396;
public static final int EVENT_STORE_ADDED = 16388;
public static final int EVENT_STORE_FULL = 16394;
public static final int EVENT_STORE_REMOVED = 16389;
public static final int EVENT_UNDEFINED = 16384;
public static final int EVENT_UNREPORTED_STATUS = 16398;
}
