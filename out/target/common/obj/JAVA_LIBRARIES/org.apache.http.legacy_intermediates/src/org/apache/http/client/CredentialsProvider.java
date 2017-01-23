/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/client/CredentialsProvider.java $
* $Revision: 558124 $
* $Date: 2007-07-20 13:36:47 -0700 (Fri, 20 Jul 2007) $
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

package org.apache.http.client;
@java.lang.Deprecated()
public interface CredentialsProvider
{
public abstract  void setCredentials(org.apache.http.auth.AuthScope authscope, org.apache.http.auth.Credentials credentials);
public abstract  org.apache.http.auth.Credentials getCredentials(org.apache.http.auth.AuthScope authscope);
public abstract  void clear();
}