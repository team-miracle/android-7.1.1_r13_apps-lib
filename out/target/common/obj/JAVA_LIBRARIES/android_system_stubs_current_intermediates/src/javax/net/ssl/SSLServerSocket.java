/*
* Copyright (c) 1997, 2010, Oracle and/or its affiliates. All rights reserved.
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


package javax.net.ssl;
public abstract class SSLServerSocket
  extends java.net.ServerSocket
{
protected  SSLServerSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  SSLServerSocket(int port) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  SSLServerSocket(int port, int backlog) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  SSLServerSocket(int port, int backlog, java.net.InetAddress address) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String[] getEnabledCipherSuites();
public abstract  void setEnabledCipherSuites(java.lang.String[] suites);
public abstract  java.lang.String[] getSupportedCipherSuites();
public abstract  java.lang.String[] getSupportedProtocols();
public abstract  java.lang.String[] getEnabledProtocols();
public abstract  void setEnabledProtocols(java.lang.String[] protocols);
public abstract  void setNeedClientAuth(boolean need);
public abstract  boolean getNeedClientAuth();
public abstract  void setWantClientAuth(boolean want);
public abstract  boolean getWantClientAuth();
public abstract  void setUseClientMode(boolean mode);
public abstract  boolean getUseClientMode();
public abstract  void setEnableSessionCreation(boolean flag);
public abstract  boolean getEnableSessionCreation();
public  javax.net.ssl.SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); }
public  void setSSLParameters(javax.net.ssl.SSLParameters params) { throw new RuntimeException("Stub!"); }
}
