/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public class AtomicInteger
  extends java.lang.Number
  implements java.io.Serializable
{
public  AtomicInteger(int initialValue) { throw new RuntimeException("Stub!"); }
public  AtomicInteger() { throw new RuntimeException("Stub!"); }
public final  int get() { throw new RuntimeException("Stub!"); }
public final  void set(int newValue) { throw new RuntimeException("Stub!"); }
public final  void lazySet(int newValue) { throw new RuntimeException("Stub!"); }
public final  int getAndSet(int newValue) { throw new RuntimeException("Stub!"); }
public final  boolean compareAndSet(int expect, int update) { throw new RuntimeException("Stub!"); }
public final  boolean weakCompareAndSet(int expect, int update) { throw new RuntimeException("Stub!"); }
public final  int getAndIncrement() { throw new RuntimeException("Stub!"); }
public final  int getAndDecrement() { throw new RuntimeException("Stub!"); }
public final  int getAndAdd(int delta) { throw new RuntimeException("Stub!"); }
public final  int incrementAndGet() { throw new RuntimeException("Stub!"); }
public final  int decrementAndGet() { throw new RuntimeException("Stub!"); }
public final  int addAndGet(int delta) { throw new RuntimeException("Stub!"); }
public final  int getAndUpdate(java.util.function.IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  int updateAndGet(java.util.function.IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  int getAndAccumulate(int x, java.util.function.IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public final  int accumulateAndGet(int x, java.util.function.IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int intValue() { throw new RuntimeException("Stub!"); }
public  long longValue() { throw new RuntimeException("Stub!"); }
public  float floatValue() { throw new RuntimeException("Stub!"); }
public  double doubleValue() { throw new RuntimeException("Stub!"); }
}
