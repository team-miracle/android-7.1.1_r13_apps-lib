/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public class AtomicReference<V>
  implements java.io.Serializable
{
public  AtomicReference(V initialValue) { throw new RuntimeException("Stub!"); }
public  AtomicReference() { throw new RuntimeException("Stub!"); }
public final  V get() { throw new RuntimeException("Stub!"); }
public final  void set(V newValue) { throw new RuntimeException("Stub!"); }
public final  void lazySet(V newValue) { throw new RuntimeException("Stub!"); }
public final  boolean compareAndSet(V expect, V update) { throw new RuntimeException("Stub!"); }
public final  boolean weakCompareAndSet(V expect, V update) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public final  V getAndSet(V newValue) { throw new RuntimeException("Stub!"); }
public final  V getAndUpdate(java.util.function.UnaryOperator<V> updateFunction) { throw new RuntimeException("Stub!"); }
public final  V updateAndGet(java.util.function.UnaryOperator<V> updateFunction) { throw new RuntimeException("Stub!"); }
public final  V getAndAccumulate(V x, java.util.function.BinaryOperator<V> accumulatorFunction) { throw new RuntimeException("Stub!"); }
public final  V accumulateAndGet(V x, java.util.function.BinaryOperator<V> accumulatorFunction) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
