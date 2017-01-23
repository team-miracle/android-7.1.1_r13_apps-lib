/*
* Copyright (c) 2003, 2004, Oracle and/or its affiliates. All rights reserved.
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
public abstract class AuthProvider
  extends java.security.Provider
{
protected  AuthProvider(java.lang.String name, double version, java.lang.String info) { super((java.lang.String)null,0,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public abstract  void login(javax.security.auth.Subject subject, javax.security.auth.callback.CallbackHandler handler) throws javax.security.auth.login.LoginException;
public abstract  void logout() throws javax.security.auth.login.LoginException;
public abstract  void setCallbackHandler(javax.security.auth.callback.CallbackHandler handler);
}
