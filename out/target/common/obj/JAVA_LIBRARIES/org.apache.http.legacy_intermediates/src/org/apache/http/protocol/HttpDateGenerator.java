/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/protocol/HttpDateGenerator.java $
* $Revision: 548066 $
* $Date: 2007-06-17 09:51:55 -0700 (Sun, 17 Jun 2007) $
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

package org.apache.http.protocol;
@java.lang.Deprecated()
public class HttpDateGenerator
{
public  HttpDateGenerator() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getCurrentDate() { throw new RuntimeException("Stub!"); }
public static final java.util.TimeZone GMT;
public static final java.lang.String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
static { GMT = null; }
}
