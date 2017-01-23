/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.locks;
public interface Condition
{
public abstract  void await() throws java.lang.InterruptedException;
public abstract  void awaitUninterruptibly();
public abstract  long awaitNanos(long nanosTimeout) throws java.lang.InterruptedException;
public abstract  boolean await(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  boolean awaitUntil(java.util.Date deadline) throws java.lang.InterruptedException;
public abstract  void signal();
public abstract  void signalAll();
}
