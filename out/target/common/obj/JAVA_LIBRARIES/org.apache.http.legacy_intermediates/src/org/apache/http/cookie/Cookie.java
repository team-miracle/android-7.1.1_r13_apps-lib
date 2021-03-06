/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/cookie/Cookie.java $
* $Revision: 578403 $
* $Date: 2007-09-22 03:56:04 -0700 (Sat, 22 Sep 2007) $
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

package org.apache.http.cookie;
@java.lang.Deprecated()
public interface Cookie
{
public abstract  java.lang.String getName();
public abstract  java.lang.String getValue();
public abstract  java.lang.String getComment();
public abstract  java.lang.String getCommentURL();
public abstract  java.util.Date getExpiryDate();
public abstract  boolean isPersistent();
public abstract  java.lang.String getDomain();
public abstract  java.lang.String getPath();
public abstract  int[] getPorts();
public abstract  boolean isSecure();
public abstract  int getVersion();
public abstract  boolean isExpired(java.util.Date date);
}
