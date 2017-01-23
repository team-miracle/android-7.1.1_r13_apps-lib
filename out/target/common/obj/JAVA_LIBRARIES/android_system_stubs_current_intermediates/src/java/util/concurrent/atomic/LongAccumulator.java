/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public class LongAccumulator
  extends java.util.concurrent.atomic.Striped64
  implements java.io.Serializable
{
public  LongAccumulator(java.util.function.LongBinaryOperator accumulatorFunction, long identity) { throw new RuntimeException("Stub!"); }
public  void accumulate(long x) { throw new RuntimeException("Stub!"); }
public  long get() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  long getThenReset() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  long longValue() { throw new RuntimeException("Stub!"); }
public  int intValue() { throw new RuntimeException("Stub!"); }
public  float floatValue() { throw new RuntimeException("Stub!"); }
public  double doubleValue() { throw new RuntimeException("Stub!"); }
}
