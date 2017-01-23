/*
* Copyright 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.net;
public abstract class PskKeyManager
{
public  PskKeyManager() { throw new RuntimeException("Stub!"); }
public  java.lang.String chooseServerKeyIdentityHint(java.net.Socket socket) { throw new RuntimeException("Stub!"); }
public  java.lang.String chooseServerKeyIdentityHint(javax.net.ssl.SSLEngine engine) { throw new RuntimeException("Stub!"); }
public  java.lang.String chooseClientKeyIdentity(java.lang.String identityHint, java.net.Socket socket) { throw new RuntimeException("Stub!"); }
public  java.lang.String chooseClientKeyIdentity(java.lang.String identityHint, javax.net.ssl.SSLEngine engine) { throw new RuntimeException("Stub!"); }
public  javax.crypto.SecretKey getKey(java.lang.String identityHint, java.lang.String identity, java.net.Socket socket) { throw new RuntimeException("Stub!"); }
public  javax.crypto.SecretKey getKey(java.lang.String identityHint, java.lang.String identity, javax.net.ssl.SSLEngine engine) { throw new RuntimeException("Stub!"); }
public static final int MAX_IDENTITY_HINT_LENGTH_BYTES = 128;
public static final int MAX_IDENTITY_LENGTH_BYTES = 128;
public static final int MAX_KEY_LENGTH_BYTES = 256;
}
