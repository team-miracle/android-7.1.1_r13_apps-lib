/*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent;
public interface ConcurrentMap<K, V>
  extends java.util.Map<K, V>
{
default public  V getOrDefault(java.lang.Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
default public  void forEach(java.util.function.BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
public abstract  V putIfAbsent(K key, V value);
public abstract  boolean remove(java.lang.Object key, java.lang.Object value);
public abstract  boolean replace(K key, V oldValue, V newValue);
public abstract  V replace(K key, V value);
default public  void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
default public  V computeIfAbsent(K key, java.util.function.Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
default public  V computeIfPresent(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
default public  V compute(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
default public  V merge(K key, V value, java.util.function.BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
}
