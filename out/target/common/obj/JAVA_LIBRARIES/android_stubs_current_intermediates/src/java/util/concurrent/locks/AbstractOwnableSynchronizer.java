/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.locks;
public abstract class AbstractOwnableSynchronizer
  implements java.io.Serializable
{
protected  AbstractOwnableSynchronizer() { throw new RuntimeException("Stub!"); }
protected final  void setExclusiveOwnerThread(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
protected final  java.lang.Thread getExclusiveOwnerThread() { throw new RuntimeException("Stub!"); }
}
