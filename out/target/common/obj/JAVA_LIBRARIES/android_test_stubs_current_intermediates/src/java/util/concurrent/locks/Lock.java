/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.locks;
public interface Lock
{
public abstract  void lock();
public abstract  void lockInterruptibly() throws java.lang.InterruptedException;
public abstract  boolean tryLock();
public abstract  boolean tryLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  void unlock();
public abstract  java.util.concurrent.locks.Condition newCondition();
}
