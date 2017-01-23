/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public abstract class AtomicLongFieldUpdater<T>
{
protected  AtomicLongFieldUpdater() { throw new RuntimeException("Stub!"); }
public static <U> java.util.concurrent.atomic.AtomicLongFieldUpdater<U> newUpdater(java.lang.Class<U> tclass, java.lang.String fieldName) { throw new RuntimeException("Stub!"); }
public abstract  boolean compareAndSet(T obj, long expect, long update);
public abstract  boolean weakCompareAndSet(T obj, long expect, long update);
public abstract  void set(T obj, long newValue);
public abstract  void lazySet(T obj, long newValue);
public abstract  long get(T obj);
public  long getAndSet(T obj, long newValue) { throw new RuntimeException("Stub!"); }
public  long getAndIncrement(T obj) { throw new RuntimeException("Stub!"); }
public  long getAndDecrement(T obj) { throw new RuntimeException("Stub!"); }
public  long getAndAdd(T obj, long delta) { throw new RuntimeException("Stub!"); }
public  long incrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
public  long decrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
public  long addAndGet(T obj, long delta) { throw new RuntimeException("Stub!"); }
public final  long getAndUpdate(T obj, java.util.function.LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  long updateAndGet(T obj, java.util.function.LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  long getAndAccumulate(T obj, long x, java.util.function.LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public final  long accumulateAndGet(T obj, long x, java.util.function.LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
}
