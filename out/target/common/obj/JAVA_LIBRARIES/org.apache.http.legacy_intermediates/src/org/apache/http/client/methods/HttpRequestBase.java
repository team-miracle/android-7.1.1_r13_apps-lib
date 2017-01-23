/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/client/methods/HttpRequestBase.java $
* $Revision: 674186 $
* $Date: 2008-07-05 05:18:54 -0700 (Sat, 05 Jul 2008) $
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

package org.apache.http.client.methods;
@java.lang.Deprecated()
public abstract class HttpRequestBase
  extends org.apache.http.message.AbstractHttpMessage
  implements org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.methods.AbortableHttpRequest
{
public  HttpRequestBase() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getMethod();
public  org.apache.http.ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); }
public  java.net.URI getURI() { throw new RuntimeException("Stub!"); }
public  org.apache.http.RequestLine getRequestLine() { throw new RuntimeException("Stub!"); }
public  void setURI(java.net.URI uri) { throw new RuntimeException("Stub!"); }
public  void setConnectionRequest(org.apache.http.conn.ClientConnectionRequest connRequest) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setReleaseTrigger(org.apache.http.conn.ConnectionReleaseTrigger releaseTrigger) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void abort() { throw new RuntimeException("Stub!"); }
public  boolean isAborted() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
