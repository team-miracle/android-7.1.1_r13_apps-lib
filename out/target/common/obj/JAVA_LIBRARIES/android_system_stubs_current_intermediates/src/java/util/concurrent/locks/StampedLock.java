/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.locks;
public class StampedLock
  implements java.io.Serializable
{
public  StampedLock() { throw new RuntimeException("Stub!"); }
public  long writeLock() { throw new RuntimeException("Stub!"); }
public  long tryWriteLock() { throw new RuntimeException("Stub!"); }
public  long tryWriteLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long writeLockInterruptibly() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long readLock() { throw new RuntimeException("Stub!"); }
public  long tryReadLock() { throw new RuntimeException("Stub!"); }
public  long tryReadLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long readLockInterruptibly() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long tryOptimisticRead() { throw new RuntimeException("Stub!"); }
public  boolean validate(long stamp) { throw new RuntimeException("Stub!"); }
public  void unlockWrite(long stamp) { throw new RuntimeException("Stub!"); }
public  void unlockRead(long stamp) { throw new RuntimeException("Stub!"); }
public  void unlock(long stamp) { throw new RuntimeException("Stub!"); }
public  long tryConvertToWriteLock(long stamp) { throw new RuntimeException("Stub!"); }
public  long tryConvertToReadLock(long stamp) { throw new RuntimeException("Stub!"); }
public  long tryConvertToOptimisticRead(long stamp) { throw new RuntimeException("Stub!"); }
public  boolean tryUnlockWrite() { throw new RuntimeException("Stub!"); }
public  boolean tryUnlockRead() { throw new RuntimeException("Stub!"); }
public  boolean isWriteLocked() { throw new RuntimeException("Stub!"); }
public  boolean isReadLocked() { throw new RuntimeException("Stub!"); }
public  int getReadLockCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.Lock asReadLock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.Lock asWriteLock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.ReadWriteLock asReadWriteLock() { throw new RuntimeException("Stub!"); }
}
