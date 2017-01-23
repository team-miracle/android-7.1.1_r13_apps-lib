/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/ProtocolVersion.java $
* $Revision: 609106 $
* $Date: 2008-01-05 01:15:42 -0800 (Sat, 05 Jan 2008) $
*
* ====================================================================
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation.  For more
* information on the Apache Software Foundation, please see
* <http://www.apache.org/>.
*
*/

package org.apache.http;
@java.lang.Deprecated()
public class ProtocolVersion
  implements java.io.Serializable
{
public  ProtocolVersion(java.lang.String protocol, int major, int minor) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getProtocol() { throw new RuntimeException("Stub!"); }
public final  int getMajor() { throw new RuntimeException("Stub!"); }
public final  int getMinor() { throw new RuntimeException("Stub!"); }
public  org.apache.http.ProtocolVersion forVersion(int major, int minor) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  boolean isComparable(org.apache.http.ProtocolVersion that) { throw new RuntimeException("Stub!"); }
public  int compareToVersion(org.apache.http.ProtocolVersion that) { throw new RuntimeException("Stub!"); }
public final  boolean greaterEquals(org.apache.http.ProtocolVersion version) { throw new RuntimeException("Stub!"); }
public final  boolean lessEquals(org.apache.http.ProtocolVersion version) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected final int major;
protected final int minor;
protected final java.lang.String protocol;
}