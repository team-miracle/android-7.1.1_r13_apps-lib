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
* limitations under the License
*/

package android.app.job;
public abstract class JobService
  extends android.app.Service
{
public  JobService() { throw new RuntimeException("Stub!"); }
public abstract  boolean onStartJob(android.app.job.JobParameters params);
public abstract  boolean onStopJob(android.app.job.JobParameters params);
public final  void jobFinished(android.app.job.JobParameters params, boolean needsReschedule) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";
}
