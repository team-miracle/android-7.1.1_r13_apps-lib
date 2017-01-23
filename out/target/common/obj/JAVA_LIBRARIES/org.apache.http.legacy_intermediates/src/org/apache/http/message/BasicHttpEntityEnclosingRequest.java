/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicHttpEntityEnclosingRequest.java $
* $Revision: 618017 $
* $Date: 2008-02-03 08:42:22 -0800 (Sun, 03 Feb 2008) $
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

package org.apache.http.message;
@java.lang.Deprecated()
public class BasicHttpEntityEnclosingRequest
  extends org.apache.http.message.BasicHttpRequest
  implements org.apache.http.HttpEntityEnclosingRequest
{
public  BasicHttpEntityEnclosingRequest(java.lang.String method, java.lang.String uri) { super((org.apache.http.RequestLine)null); throw new RuntimeException("Stub!"); }
public  BasicHttpEntityEnclosingRequest(java.lang.String method, java.lang.String uri, org.apache.http.ProtocolVersion ver) { super((org.apache.http.RequestLine)null); throw new RuntimeException("Stub!"); }
public  BasicHttpEntityEnclosingRequest(org.apache.http.RequestLine requestline) { super((org.apache.http.RequestLine)null); throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpEntity getEntity() { throw new RuntimeException("Stub!"); }
public  void setEntity(org.apache.http.HttpEntity entity) { throw new RuntimeException("Stub!"); }
public  boolean expectContinue() { throw new RuntimeException("Stub!"); }
}
