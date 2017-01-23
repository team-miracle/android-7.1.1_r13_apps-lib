/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public class ForkJoinPool
  extends java.util.concurrent.AbstractExecutorService
{
public static interface ForkJoinWorkerThreadFactory
{
public abstract  java.util.concurrent.ForkJoinWorkerThread newThread(java.util.concurrent.ForkJoinPool pool);
}
public static interface ManagedBlocker
{
public abstract  boolean block() throws java.lang.InterruptedException;
public abstract  boolean isReleasable();
}
public  ForkJoinPool() { throw new RuntimeException("Stub!"); }
public  ForkJoinPool(int parallelism) { throw new RuntimeException("Stub!"); }
public  ForkJoinPool(int parallelism, java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory factory, java.lang.Thread.UncaughtExceptionHandler handler, boolean asyncMode) { throw new RuntimeException("Stub!"); }
public static  java.util.concurrent.ForkJoinPool commonPool() { throw new RuntimeException("Stub!"); }
public <T> T invoke(java.util.concurrent.ForkJoinTask<T> task) { throw new RuntimeException("Stub!"); }
public  void execute(java.util.concurrent.ForkJoinTask<?> task) { throw new RuntimeException("Stub!"); }
public  void execute(java.lang.Runnable task) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.ForkJoinTask<T> submit(java.util.concurrent.ForkJoinTask<T> task) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.ForkJoinTask<T> submit(java.util.concurrent.Callable<T> task) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.ForkJoinTask<T> submit(java.lang.Runnable task, T result) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ForkJoinTask<?> submit(java.lang.Runnable task) { throw new RuntimeException("Stub!"); }
public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory getFactory() { throw new RuntimeException("Stub!"); }
public  java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); }
public  int getParallelism() { throw new RuntimeException("Stub!"); }
public static  int getCommonPoolParallelism() { throw new RuntimeException("Stub!"); }
public  int getPoolSize() { throw new RuntimeException("Stub!"); }
public  boolean getAsyncMode() { throw new RuntimeException("Stub!"); }
public  int getRunningThreadCount() { throw new RuntimeException("Stub!"); }
public  int getActiveThreadCount() { throw new RuntimeException("Stub!"); }
public  boolean isQuiescent() { throw new RuntimeException("Stub!"); }
public  long getStealCount() { throw new RuntimeException("Stub!"); }
public  long getQueuedTaskCount() { throw new RuntimeException("Stub!"); }
public  int getQueuedSubmissionCount() { throw new RuntimeException("Stub!"); }
public  boolean hasQueuedSubmissions() { throw new RuntimeException("Stub!"); }
protected  java.util.concurrent.ForkJoinTask<?> pollSubmission() { throw new RuntimeException("Stub!"); }
protected  int drainTasksTo(java.util.Collection<? super java.util.concurrent.ForkJoinTask<?>> c) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Runnable> shutdownNow() { throw new RuntimeException("Stub!"); }
public  boolean isTerminated() { throw new RuntimeException("Stub!"); }
public  boolean isTerminating() { throw new RuntimeException("Stub!"); }
public  boolean isShutdown() { throw new RuntimeException("Stub!"); }
public  boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean awaitQuiescence(long timeout, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public static  void managedBlock(java.util.concurrent.ForkJoinPool.ManagedBlocker blocker) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable runnable, T value) { throw new RuntimeException("Stub!"); }
protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> callable) { throw new RuntimeException("Stub!"); }
public static final java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory defaultForkJoinWorkerThreadFactory;
static { defaultForkJoinWorkerThreadFactory = null; }
}