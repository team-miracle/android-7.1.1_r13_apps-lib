/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/auth/NTCredentials.java $
* $Revision: 658430 $
* $Date: 2008-05-20 14:04:27 -0700 (Tue, 20 May 2008) $
*
* ====================================================================
*
*  Licensed to the Apache Software Foundation (ASF) under one or more
*  contributor license agreements.  See the NOTICE file distributed with
*  this work for additional information regarding copyright ownership.
*  The ASF licenses this file to You under the Apache License, Version 2.0
*  (the "License"); you may not use this file except in compliance with
*  the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation.  For more
* information on the Apache Software Foundation, please see
* <http://www.apache.org/>.
*
*/

package org.apache.http.auth;
@java.lang.Deprecated()
public class NTCredentials
  implements org.apache.http.auth.Credentials
{
public  NTCredentials(java.lang.String usernamePassword) { throw new RuntimeException("Stub!"); }
public  NTCredentials(java.lang.String userName, java.lang.String password, java.lang.String workstation, java.lang.String domain) { throw new RuntimeException("Stub!"); }
public  java.security.Principal getUserPrincipal() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUserName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPassword() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDomain() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWorkstation() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
