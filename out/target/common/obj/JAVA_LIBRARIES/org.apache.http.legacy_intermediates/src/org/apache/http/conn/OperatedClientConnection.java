/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/OperatedClientConnection.java $
* $Revision: 646087 $
* $Date: 2008-04-08 14:36:46 -0700 (Tue, 08 Apr 2008) $
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

package org.apache.http.conn;
@java.lang.Deprecated()
public interface OperatedClientConnection
  extends org.apache.http.HttpClientConnection, org.apache.http.HttpInetConnection
{
public abstract  org.apache.http.HttpHost getTargetHost();
public abstract  boolean isSecure();
public abstract  java.net.Socket getSocket();
public abstract  void opening(java.net.Socket sock, org.apache.http.HttpHost target) throws java.io.IOException;
public abstract  void openCompleted(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void update(java.net.Socket sock, org.apache.http.HttpHost target, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
}
