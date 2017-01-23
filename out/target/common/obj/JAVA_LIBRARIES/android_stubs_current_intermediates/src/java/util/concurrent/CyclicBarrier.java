/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public class CyclicBarrier
{
public  CyclicBarrier(int parties, java.lang.Runnable barrierAction) { throw new RuntimeException("Stub!"); }
public  CyclicBarrier(int parties) { throw new RuntimeException("Stub!"); }
public  int getParties() { throw new RuntimeException("Stub!"); }
public  int await() throws java.lang.InterruptedException, java.util.concurrent.BrokenBarrierException { throw new RuntimeException("Stub!"); }
public  int await(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.BrokenBarrierException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public  boolean isBroken() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  int getNumberWaiting() { throw new RuntimeException("Stub!"); }
}
