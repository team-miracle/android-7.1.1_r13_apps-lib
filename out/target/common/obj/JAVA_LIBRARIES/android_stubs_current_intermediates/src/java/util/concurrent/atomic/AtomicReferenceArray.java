/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public class AtomicReferenceArray<E>
  implements java.io.Serializable
{
public  AtomicReferenceArray(int length) { throw new RuntimeException("Stub!"); }
public  AtomicReferenceArray(E[] array) { throw new RuntimeException("Stub!"); }
public final  int length() { throw new RuntimeException("Stub!"); }
public final  E get(int i) { throw new RuntimeException("Stub!"); }
public final  void set(int i, E newValue) { throw new RuntimeException("Stub!"); }
public final  void lazySet(int i, E newValue) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public final  E getAndSet(int i, E newValue) { throw new RuntimeException("Stub!"); }
public final  boolean compareAndSet(int i, E expect, E update) { throw new RuntimeException("Stub!"); }
public final  boolean weakCompareAndSet(int i, E expect, E update) { throw new RuntimeException("Stub!"); }
public final  E getAndUpdate(int i, java.util.function.UnaryOperator<E> updateFunction) { throw new RuntimeException("Stub!"); }
public final  E updateAndGet(int i, java.util.function.UnaryOperator<E> updateFunction) { throw new RuntimeException("Stub!"); }
public final  E getAndAccumulate(int i, E x, java.util.function.BinaryOperator<E> accumulatorFunction) { throw new RuntimeException("Stub!"); }
public final  E accumulateAndGet(int i, E x, java.util.function.BinaryOperator<E> accumulatorFunction) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
