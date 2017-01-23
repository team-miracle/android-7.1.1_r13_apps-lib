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
package android.hardware.location;
public final class ContextHubManager
{
public abstract static class Callback
{
protected  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onMessageReceipt(int hubHandle, int nanoAppHandle, android.hardware.location.ContextHubMessage message);
}
ContextHubManager() { throw new RuntimeException("Stub!"); }
public  int[] getContextHubHandles() { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubInfo getContextHubInfo(int hubHandle) { throw new RuntimeException("Stub!"); }
public  int loadNanoApp(int hubHandle, android.hardware.location.NanoApp app) { throw new RuntimeException("Stub!"); }
public  int unloadNanoApp(int nanoAppHandle) { throw new RuntimeException("Stub!"); }
public  android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int nanoAppHandle) { throw new RuntimeException("Stub!"); }
public  int[] findNanoAppOnHub(int hubHandle, android.hardware.location.NanoAppFilter filter) { throw new RuntimeException("Stub!"); }
public  int sendMessage(int hubHandle, int nanoAppHandle, android.hardware.location.ContextHubMessage message) { throw new RuntimeException("Stub!"); }
public  int registerCallback(android.hardware.location.ContextHubManager.Callback callback) { throw new RuntimeException("Stub!"); }
public  int registerCallback(android.hardware.location.ContextHubManager.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  int unregisterCallback(android.hardware.location.ContextHubManager.Callback callback) { throw new RuntimeException("Stub!"); }
}
