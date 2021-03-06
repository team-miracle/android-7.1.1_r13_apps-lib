/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public class AtomicStampedReference<V>
{
public  AtomicStampedReference(V initialRef, int initialStamp) { throw new RuntimeException("Stub!"); }
public  V getReference() { throw new RuntimeException("Stub!"); }
public  int getStamp() { throw new RuntimeException("Stub!"); }
public  V get(int[] stampHolder) { throw new RuntimeException("Stub!"); }
public  boolean weakCompareAndSet(V expectedReference, V newReference, int expectedStamp, int newStamp) { throw new RuntimeException("Stub!"); }
public  boolean compareAndSet(V expectedReference, V newReference, int expectedStamp, int newStamp) { throw new RuntimeException("Stub!"); }
public  void set(V newReference, int newStamp) { throw new RuntimeException("Stub!"); }
public  boolean attemptStamp(V expectedReference, int newStamp) { throw new RuntimeException("Stub!"); }
}
