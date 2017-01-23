/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2000, 2009, Oracle and/or its affiliates. All rights reserved.
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

package java.nio.channels;
public final class Channels
{
Channels() { throw new RuntimeException("Stub!"); }
public static  java.io.InputStream newInputStream(java.nio.channels.ReadableByteChannel ch) { throw new RuntimeException("Stub!"); }
public static  java.io.OutputStream newOutputStream(java.nio.channels.WritableByteChannel ch) { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.ReadableByteChannel newChannel(java.io.InputStream in) { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.WritableByteChannel newChannel(java.io.OutputStream out) { throw new RuntimeException("Stub!"); }
public static  java.io.Reader newReader(java.nio.channels.ReadableByteChannel ch, java.nio.charset.CharsetDecoder dec, int minBufferCap) { throw new RuntimeException("Stub!"); }
public static  java.io.Reader newReader(java.nio.channels.ReadableByteChannel ch, java.lang.String csName) { throw new RuntimeException("Stub!"); }
public static  java.io.Writer newWriter(java.nio.channels.WritableByteChannel ch, java.nio.charset.CharsetEncoder enc, int minBufferCap) { throw new RuntimeException("Stub!"); }
public static  java.io.Writer newWriter(java.nio.channels.WritableByteChannel ch, java.lang.String csName) { throw new RuntimeException("Stub!"); }
}
