/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public interface TransferQueue<E>
  extends java.util.concurrent.BlockingQueue<E>
{
public abstract  boolean tryTransfer(E e);
public abstract  void transfer(E e) throws java.lang.InterruptedException;
public abstract  boolean tryTransfer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  boolean hasWaitingConsumer();
public abstract  int getWaitingConsumerCount();
}
