/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/routing/RouteTracker.java $
* $Revision: 620254 $
* $Date: 2008-02-10 02:18:48 -0800 (Sun, 10 Feb 2008) $
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

package org.apache.http.conn.routing;
@java.lang.Deprecated()
public final class RouteTracker
  implements org.apache.http.conn.routing.RouteInfo
{
public  RouteTracker(org.apache.http.HttpHost target, java.net.InetAddress local) { throw new RuntimeException("Stub!"); }
public  RouteTracker(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public final  void connectTarget(boolean secure) { throw new RuntimeException("Stub!"); }
public final  void connectProxy(org.apache.http.HttpHost proxy, boolean secure) { throw new RuntimeException("Stub!"); }
public final  void tunnelTarget(boolean secure) { throw new RuntimeException("Stub!"); }
public final  void tunnelProxy(org.apache.http.HttpHost proxy, boolean secure) { throw new RuntimeException("Stub!"); }
public final  void layerProtocol(boolean secure) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getTargetHost() { throw new RuntimeException("Stub!"); }
public final  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public final  int getHopCount() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getHopTarget(int hop) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getProxyHost() { throw new RuntimeException("Stub!"); }
public final  boolean isConnected() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.RouteInfo.TunnelType getTunnelType() { throw new RuntimeException("Stub!"); }
public final  boolean isTunnelled() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.RouteInfo.LayerType getLayerType() { throw new RuntimeException("Stub!"); }
public final  boolean isLayered() { throw new RuntimeException("Stub!"); }
public final  boolean isSecure() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.HttpRoute toRoute() { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
