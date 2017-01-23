/*
* Copyright (c) 1996, 2005, Oracle and/or its affiliates. All rights reserved.
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

package java.io;
public abstract class Writer
  implements java.lang.Appendable, java.io.Closeable, java.io.Flushable
{
protected  Writer() { throw new RuntimeException("Stub!"); }
protected  Writer(java.lang.Object lock) { throw new RuntimeException("Stub!"); }
public  void write(int c) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(char[] cbuf) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void write(char[] cbuf, int off, int len) throws java.io.IOException;
public  void write(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(java.lang.String str, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.Writer append(java.lang.CharSequence csq) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.Writer append(java.lang.CharSequence csq, int start, int end) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.Writer append(char c) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void flush() throws java.io.IOException;
public abstract  void close() throws java.io.IOException;
protected java.lang.Object lock;
}