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
package android.accounts;
public interface AccountManagerFuture<V>
{
public abstract  boolean cancel(boolean mayInterruptIfRunning);
public abstract  boolean isCancelled();
public abstract  boolean isDone();
public abstract  V getResult() throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException;
public abstract  V getResult(long timeout, java.util.concurrent.TimeUnit unit) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException;
}