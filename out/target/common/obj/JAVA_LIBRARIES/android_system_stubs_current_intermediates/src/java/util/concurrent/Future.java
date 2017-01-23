/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public interface Future<V>
{
public abstract  boolean cancel(boolean mayInterruptIfRunning);
public abstract  boolean isCancelled();
public abstract  boolean isDone();
public abstract  V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException;
public abstract  V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException;
}
