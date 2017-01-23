/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public abstract class RecursiveAction
  extends java.util.concurrent.ForkJoinTask<java.lang.Void>
{
public  RecursiveAction() { throw new RuntimeException("Stub!"); }
protected abstract  void compute();
public final  java.lang.Void getRawResult() { throw new RuntimeException("Stub!"); }
protected final  void setRawResult(java.lang.Void mustBeNull) { throw new RuntimeException("Stub!"); }
protected final  boolean exec() { throw new RuntimeException("Stub!"); }
}
