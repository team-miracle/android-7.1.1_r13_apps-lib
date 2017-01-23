/*
* Copyright (C) 2010 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package java.util.concurrent;
public class CopyOnWriteArrayList<E>
  implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable
{
public  CopyOnWriteArrayList() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  CopyOnWriteArrayList(java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public  CopyOnWriteArrayList(E[] array) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  E get(int index) { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  boolean containsAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public  int indexOf(E object, int from) { throw new RuntimeException("Stub!"); }
public  int indexOf(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(E object, int to) { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
public  java.util.ListIterator<E> listIterator(int index) { throw new RuntimeException("Stub!"); }
public  java.util.ListIterator<E> listIterator() { throw new RuntimeException("Stub!"); }
public  java.util.List<E> subList(int from, int to) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked","SuspiciousSystemArraycopy"})
public <T> T[] toArray(T[] contents) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public synchronized  boolean add(E e) { throw new RuntimeException("Stub!"); }
public synchronized  void add(int index, E e) { throw new RuntimeException("Stub!"); }
public synchronized  boolean addAll(java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public synchronized  boolean addAll(int index, java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public synchronized  int addAllAbsent(java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public synchronized  boolean addIfAbsent(E object) { throw new RuntimeException("Stub!"); }
public synchronized  void clear() { throw new RuntimeException("Stub!"); }
public synchronized  E remove(int index) { throw new RuntimeException("Stub!"); }
public synchronized  boolean remove(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public synchronized  boolean removeAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public synchronized  boolean retainAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public synchronized  void replaceAll(java.util.function.UnaryOperator<E> operator) { throw new RuntimeException("Stub!"); }
public synchronized  void sort(java.util.Comparator<? super E> c) { throw new RuntimeException("Stub!"); }
public  void forEach(java.util.function.Consumer<? super E> action) { throw new RuntimeException("Stub!"); }
public synchronized  E set(int index, E e) { throw new RuntimeException("Stub!"); }
}
