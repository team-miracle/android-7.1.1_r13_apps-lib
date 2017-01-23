/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public abstract class CountedCompleter<T>
  extends java.util.concurrent.ForkJoinTask<T>
{
protected  CountedCompleter(java.util.concurrent.CountedCompleter<?> completer, int initialPendingCount) { throw new RuntimeException("Stub!"); }
protected  CountedCompleter(java.util.concurrent.CountedCompleter<?> completer) { throw new RuntimeException("Stub!"); }
protected  CountedCompleter() { throw new RuntimeException("Stub!"); }
public abstract  void compute();
public  void onCompletion(java.util.concurrent.CountedCompleter<?> caller) { throw new RuntimeException("Stub!"); }
public  boolean onExceptionalCompletion(java.lang.Throwable ex, java.util.concurrent.CountedCompleter<?> caller) { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> getCompleter() { throw new RuntimeException("Stub!"); }
public final  int getPendingCount() { throw new RuntimeException("Stub!"); }
public final  void setPendingCount(int count) { throw new RuntimeException("Stub!"); }
public final  void addToPendingCount(int delta) { throw new RuntimeException("Stub!"); }
public final  boolean compareAndSetPendingCount(int expected, int count) { throw new RuntimeException("Stub!"); }
public final  int decrementPendingCountUnlessZero() { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> getRoot() { throw new RuntimeException("Stub!"); }
public final  void tryComplete() { throw new RuntimeException("Stub!"); }
public final  void propagateCompletion() { throw new RuntimeException("Stub!"); }
public  void complete(T rawResult) { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> firstComplete() { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> nextComplete() { throw new RuntimeException("Stub!"); }
public final  void quietlyCompleteRoot() { throw new RuntimeException("Stub!"); }
public final  void helpComplete(int maxTasks) { throw new RuntimeException("Stub!"); }
protected final  boolean exec() { throw new RuntimeException("Stub!"); }
public  T getRawResult() { throw new RuntimeException("Stub!"); }
protected  void setRawResult(T t) { throw new RuntimeException("Stub!"); }
}
