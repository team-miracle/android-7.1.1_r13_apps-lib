/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public interface BlockingQueue<E>
  extends java.util.Queue<E>
{
public abstract  boolean add(E e);
public abstract  boolean offer(E e);
public abstract  void put(E e) throws java.lang.InterruptedException;
public abstract  boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E take() throws java.lang.InterruptedException;
public abstract  E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  int remainingCapacity();
public abstract  boolean remove(java.lang.Object o);
public abstract  boolean contains(java.lang.Object o);
public abstract  int drainTo(java.util.Collection<? super E> c);
public abstract  int drainTo(java.util.Collection<? super E> c, int maxElements);
}
