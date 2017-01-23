/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public interface Delayed
  extends java.lang.Comparable<java.util.concurrent.Delayed>
{
public abstract  long getDelay(java.util.concurrent.TimeUnit unit);
}
