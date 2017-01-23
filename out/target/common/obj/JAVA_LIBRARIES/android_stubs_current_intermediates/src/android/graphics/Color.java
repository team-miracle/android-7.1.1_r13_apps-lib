/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.graphics;
public class Color
{
public  Color() { throw new RuntimeException("Stub!"); }
public static  int alpha(int color) { throw new RuntimeException("Stub!"); }
public static  int red(int color) { throw new RuntimeException("Stub!"); }
public static  int green(int color) { throw new RuntimeException("Stub!"); }
public static  int blue(int color) { throw new RuntimeException("Stub!"); }
public static  int rgb(int red, int green, int blue) { throw new RuntimeException("Stub!"); }
public static  int argb(int alpha, int red, int green, int blue) { throw new RuntimeException("Stub!"); }
public static  float luminance(int color) { throw new RuntimeException("Stub!"); }
public static  int parseColor(java.lang.String colorString) { throw new RuntimeException("Stub!"); }
public static  void RGBToHSV(int red, int green, int blue, float[] hsv) { throw new RuntimeException("Stub!"); }
public static  void colorToHSV(int color, float[] hsv) { throw new RuntimeException("Stub!"); }
public static  int HSVToColor(float[] hsv) { throw new RuntimeException("Stub!"); }
public static  int HSVToColor(int alpha, float[] hsv) { throw new RuntimeException("Stub!"); }
public static final int BLACK = -16777216;
public static final int BLUE = -16776961;
public static final int CYAN = -16711681;
public static final int DKGRAY = -12303292;
public static final int GRAY = -7829368;
public static final int GREEN = -16711936;
public static final int LTGRAY = -3355444;
public static final int MAGENTA = -65281;
public static final int RED = -65536;
public static final int TRANSPARENT = 0;
public static final int WHITE = -1;
public static final int YELLOW = -256;
}
