/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1996, 2006, Oracle and/or its affiliates. All rights reserved.
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

package java.security;
@java.lang.Deprecated()
public abstract class Identity
  implements java.security.Principal, java.io.Serializable
{
protected  Identity() { throw new RuntimeException("Stub!"); }
public  Identity(java.lang.String name, java.security.IdentityScope scope) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  Identity(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public final  java.security.IdentityScope getScope() { throw new RuntimeException("Stub!"); }
public  java.security.PublicKey getPublicKey() { throw new RuntimeException("Stub!"); }
public  void setPublicKey(java.security.PublicKey key) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  void setInfo(java.lang.String info) { throw new RuntimeException("Stub!"); }
public  java.lang.String getInfo() { throw new RuntimeException("Stub!"); }
public  void addCertificate(java.security.Certificate certificate) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  void removeCertificate(java.security.Certificate certificate) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  java.security.Certificate[] certificates() { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object identity) { throw new RuntimeException("Stub!"); }
protected  boolean identityEquals(java.security.Identity identity) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString(boolean detailed) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}