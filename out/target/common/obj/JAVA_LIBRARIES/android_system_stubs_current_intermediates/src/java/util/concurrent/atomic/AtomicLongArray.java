/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public class AtomicLongArray
  implements java.io.Serializable
{
public  AtomicLongArray(int length) { throw new RuntimeException("Stub!"); }
public  AtomicLongArray(long[] array) { throw new RuntimeException("Stub!"); }
public final  int length() { throw new RuntimeException("Stub!"); }
public final  long get(int i) { throw new RuntimeException("Stub!"); }
public final  void set(int i, long newValue) { throw new RuntimeException("Stub!"); }
public final  void lazySet(int i, long newValue) { throw new RuntimeException("Stub!"); }
public final  long getAndSet(int i, long newValue) { throw new RuntimeException("Stub!"); }
public final  boolean compareAndSet(int i, long expect, long update) { throw new RuntimeException("Stub!"); }
public final  boolean weakCompareAndSet(int i, long expect, long update) { throw new RuntimeException("Stub!"); }
public final  long getAndIncrement(int i) { throw new RuntimeException("Stub!"); }
public final  long getAndDecrement(int i) { throw new RuntimeException("Stub!"); }
public final  long getAndAdd(int i, long delta) { throw new RuntimeException("Stub!"); }
public final  long incrementAndGet(int i) { throw new RuntimeException("Stub!"); }
public final  long decrementAndGet(int i) { throw new RuntimeException("Stub!"); }
public  long addAndGet(int i, long delta) { throw new RuntimeException("Stub!"); }
public final  long getAndUpdate(int i, java.util.function.LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  long updateAndGet(int i, java.util.function.LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  long getAndAccumulate(int i, long x, java.util.function.LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public final  long accumulateAndGet(int i, long x, java.util.function.LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
