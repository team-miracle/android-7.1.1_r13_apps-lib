/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public interface ThreadFactory
{
public abstract  java.lang.Thread newThread(java.lang.Runnable r);
}
