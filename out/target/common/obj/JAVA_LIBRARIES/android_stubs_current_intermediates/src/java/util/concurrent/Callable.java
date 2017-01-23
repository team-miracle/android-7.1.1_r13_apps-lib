/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
@java.lang.FunctionalInterface()
public interface Callable<V>
{
public abstract  V call() throws java.lang.Exception;
}
