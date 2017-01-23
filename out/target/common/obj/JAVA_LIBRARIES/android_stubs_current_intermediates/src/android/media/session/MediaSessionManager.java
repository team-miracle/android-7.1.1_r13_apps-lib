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

package android.media.session;
public final class MediaSessionManager
{
public static interface OnActiveSessionsChangedListener
{
public abstract  void onActiveSessionsChanged(java.util.List<android.media.session.MediaController> controllers);
}
MediaSessionManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.session.MediaController> getActiveSessions(android.content.ComponentName notificationListener) { throw new RuntimeException("Stub!"); }
public  void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener sessionListener, android.content.ComponentName notificationListener) { throw new RuntimeException("Stub!"); }
public  void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener sessionListener, android.content.ComponentName notificationListener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removeOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener listener) { throw new RuntimeException("Stub!"); }
}
