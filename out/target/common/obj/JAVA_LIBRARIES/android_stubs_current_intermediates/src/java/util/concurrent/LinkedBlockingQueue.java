/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public class LinkedBlockingQueue<E>
  extends java.util.AbstractQueue<E>
  implements java.util.concurrent.BlockingQueue<E>, java.io.Serializable
{
public  LinkedBlockingQueue() { throw new RuntimeException("Stub!"); }
public  LinkedBlockingQueue(int capacity) { throw new RuntimeException("Stub!"); }
public  LinkedBlockingQueue(java.util.Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  int remainingCapacity() { throw new RuntimeException("Stub!"); }
public  void put(E e) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean offer(E e) { throw new RuntimeException("Stub!"); }
public  E take() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  E poll() { throw new RuntimeException("Stub!"); }
public  E peek() { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  int drainTo(java.util.Collection<? super E> c) { throw new RuntimeException("Stub!"); }
public  int drainTo(java.util.Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
public  java.util.Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
}
