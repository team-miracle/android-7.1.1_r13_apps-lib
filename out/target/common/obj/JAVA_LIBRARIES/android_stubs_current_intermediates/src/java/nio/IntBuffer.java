/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2000, 2008, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/

// -- This file was mechanically generated: Do not edit! -- //

package java.nio;
public abstract class IntBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.IntBuffer>
{
IntBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.IntBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.IntBuffer wrap(int[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
public static  java.nio.IntBuffer wrap(int[] array) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.IntBuffer slice();
public abstract  java.nio.IntBuffer duplicate();
public abstract  java.nio.IntBuffer asReadOnlyBuffer();
public abstract  int get();
public abstract  java.nio.IntBuffer put(int i);
public abstract  int get(int index);
public abstract  java.nio.IntBuffer put(int index, int i);
public  java.nio.IntBuffer get(int[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
public  java.nio.IntBuffer get(int[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.IntBuffer put(java.nio.IntBuffer src) { throw new RuntimeException("Stub!"); }
public  java.nio.IntBuffer put(int[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
public final  java.nio.IntBuffer put(int[] src) { throw new RuntimeException("Stub!"); }
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public final  int[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.IntBuffer compact();
public abstract  boolean isDirect();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object ob) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.nio.IntBuffer that) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ByteOrder order();
}
