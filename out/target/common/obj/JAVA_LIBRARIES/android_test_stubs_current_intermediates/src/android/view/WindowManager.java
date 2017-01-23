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

package android.view;
public interface WindowManager
  extends android.view.ViewManager
{
public static class BadTokenException
  extends java.lang.RuntimeException
{
public  BadTokenException() { throw new RuntimeException("Stub!"); }
public  BadTokenException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public static class InvalidDisplayException
  extends java.lang.RuntimeException
{
public  InvalidDisplayException() { throw new RuntimeException("Stub!"); }
public  InvalidDisplayException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public static class LayoutParams
  extends android.view.ViewGroup.LayoutParams
  implements android.os.Parcelable
{
public  LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int _type) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int _type, int _flags) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int _type, int _flags, int _format) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h, int _type, int _flags, int _format) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h, int xpos, int ypos, int _type, int _flags, int _format) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.os.Parcel in) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public static  boolean mayUseInputMethod(int flags) { throw new RuntimeException("Stub!"); }
public final  void setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public final  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public final  int copyFrom(android.view.WindowManager.LayoutParams o) { throw new RuntimeException("Stub!"); }
public  java.lang.String debug(java.lang.String output) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ALPHA_CHANGED = 128;
public static final int ANIMATION_CHANGED = 16;
public static final float BRIGHTNESS_OVERRIDE_FULL = 1.0f;
public static final float BRIGHTNESS_OVERRIDE_NONE = -1.0f;
public static final float BRIGHTNESS_OVERRIDE_OFF = 0.0f;
public static final android.os.Parcelable.Creator<android.view.WindowManager.LayoutParams> CREATOR;
public static final int DIM_AMOUNT_CHANGED = 32;
public static final int FIRST_APPLICATION_WINDOW = 1;
public static final int FIRST_SUB_WINDOW = 1000;
public static final int FIRST_SYSTEM_WINDOW = 2000;
public static final int FLAGS_CHANGED = 4;
public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = 1;
public static final int FLAG_ALT_FOCUSABLE_IM = 131072;
@java.lang.Deprecated()
public static final int FLAG_BLUR_BEHIND = 4;
public static final int FLAG_DIM_BEHIND = 2;
public static final int FLAG_DISMISS_KEYGUARD = 4194304;
@java.lang.Deprecated()
public static final int FLAG_DITHER = 4096;
public static final int FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS = -2147483648;
public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;
public static final int FLAG_FULLSCREEN = 1024;
public static final int FLAG_HARDWARE_ACCELERATED = 16777216;
public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;
public static final int FLAG_KEEP_SCREEN_ON = 128;
public static final int FLAG_LAYOUT_ATTACHED_IN_DECOR = 1073741824;
public static final int FLAG_LAYOUT_INSET_DECOR = 65536;
public static final int FLAG_LAYOUT_IN_OVERSCAN = 33554432;
public static final int FLAG_LAYOUT_IN_SCREEN = 256;
public static final int FLAG_LAYOUT_NO_LIMITS = 512;
public static final int FLAG_LOCAL_FOCUS_MODE = 268435456;
public static final int FLAG_NOT_FOCUSABLE = 8;
public static final int FLAG_NOT_TOUCHABLE = 16;
public static final int FLAG_NOT_TOUCH_MODAL = 32;
public static final int FLAG_SCALED = 16384;
public static final int FLAG_SECURE = 8192;
public static final int FLAG_SHOW_WALLPAPER = 1048576;
public static final int FLAG_SHOW_WHEN_LOCKED = 524288;
public static final int FLAG_SPLIT_TOUCH = 8388608;
@java.lang.Deprecated()
public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;
public static final int FLAG_TRANSLUCENT_NAVIGATION = 134217728;
public static final int FLAG_TRANSLUCENT_STATUS = 67108864;
public static final int FLAG_TURN_SCREEN_ON = 2097152;
public static final int FLAG_WATCH_OUTSIDE_TOUCH = 262144;
public static final int FORMAT_CHANGED = 8;
public static final int LAST_APPLICATION_WINDOW = 99;
public static final int LAST_SUB_WINDOW = 1999;
public static final int LAST_SYSTEM_WINDOW = 2999;
@java.lang.SuppressWarnings(value={"PointlessBitwiseExpression"})
public static final int LAYOUT_CHANGED = 1;
public static final int MEMORY_TYPE_CHANGED = 256;
@java.lang.Deprecated()
public static final int MEMORY_TYPE_GPU = 2;
@java.lang.Deprecated()
public static final int MEMORY_TYPE_HARDWARE = 1;
@java.lang.Deprecated()
public static final int MEMORY_TYPE_NORMAL = 0;
@java.lang.Deprecated()
public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;
public static final int ROTATION_ANIMATION_CHANGED = 4096;
public static final int ROTATION_ANIMATION_CROSSFADE = 1;
public static final int ROTATION_ANIMATION_JUMPCUT = 2;
public static final int ROTATION_ANIMATION_ROTATE = 0;
public static final int SCREEN_BRIGHTNESS_CHANGED = 2048;
public static final int SCREEN_ORIENTATION_CHANGED = 1024;
public static final int SOFT_INPUT_ADJUST_NOTHING = 48;
public static final int SOFT_INPUT_ADJUST_PAN = 32;
public static final int SOFT_INPUT_ADJUST_RESIZE = 16;
public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = 0;
public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = 256;
public static final int SOFT_INPUT_MASK_ADJUST = 240;
public static final int SOFT_INPUT_MASK_STATE = 15;
public static final int SOFT_INPUT_MODE_CHANGED = 512;
public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = 3;
public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = 5;
public static final int SOFT_INPUT_STATE_HIDDEN = 2;
public static final int SOFT_INPUT_STATE_UNCHANGED = 1;
public static final int SOFT_INPUT_STATE_UNSPECIFIED = 0;
public static final int SOFT_INPUT_STATE_VISIBLE = 4;
public static final int TITLE_CHANGED = 64;
public static final int TYPE_ACCESSIBILITY_OVERLAY = 2032;
public static final int TYPE_APPLICATION = 2;
public static final int TYPE_APPLICATION_ATTACHED_DIALOG = 1003;
public static final int TYPE_APPLICATION_MEDIA = 1001;
public static final int TYPE_APPLICATION_PANEL = 1000;
public static final int TYPE_APPLICATION_STARTING = 3;
public static final int TYPE_APPLICATION_SUB_PANEL = 1002;
public static final int TYPE_BASE_APPLICATION = 1;
public static final int TYPE_CHANGED = 2;
public static final int TYPE_DRAWN_APPLICATION = 4;
public static final int TYPE_INPUT_METHOD = 2011;
public static final int TYPE_INPUT_METHOD_DIALOG = 2012;
public static final int TYPE_KEYGUARD_DIALOG = 2009;
public static final int TYPE_PHONE = 2002;
public static final int TYPE_PRIORITY_PHONE = 2007;
public static final int TYPE_PRIVATE_PRESENTATION = 2030;
public static final int TYPE_SEARCH_BAR = 2001;
public static final int TYPE_STATUS_BAR = 2000;
public static final int TYPE_STATUS_BAR_PANEL = 2014;
public static final int TYPE_SYSTEM_ALERT = 2003;
public static final int TYPE_SYSTEM_DIALOG = 2008;
public static final int TYPE_SYSTEM_ERROR = 2010;
public static final int TYPE_SYSTEM_OVERLAY = 2006;
public static final int TYPE_TOAST = 2005;
public static final int TYPE_WALLPAPER = 2013;
public float alpha;
public float buttonBrightness;
public float dimAmount;
@android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1,equals=1,name="FLAG_ALLOW_LOCK_WHILE_SCREEN_ON"),@android.view.ViewDebug.FlagToString(mask=2,equals=2,name="FLAG_DIM_BEHIND"),@android.view.ViewDebug.FlagToString(mask=4,equals=4,name="FLAG_BLUR_BEHIND"),@android.view.ViewDebug.FlagToString(mask=8,equals=8,name="FLAG_NOT_FOCUSABLE"),@android.view.ViewDebug.FlagToString(mask=16,equals=16,name="FLAG_NOT_TOUCHABLE"),@android.view.ViewDebug.FlagToString(mask=32,equals=32,name="FLAG_NOT_TOUCH_MODAL"),@android.view.ViewDebug.FlagToString(mask=64,equals=64,name="FLAG_TOUCHABLE_WHEN_WAKING"),@android.view.ViewDebug.FlagToString(mask=128,equals=128,name="FLAG_KEEP_SCREEN_ON"),@android.view.ViewDebug.FlagToString(mask=256,equals=256,name="FLAG_LAYOUT_IN_SCREEN"),@android.view.ViewDebug.FlagToString(mask=512,equals=512,name="FLAG_LAYOUT_NO_LIMITS"),@android.view.ViewDebug.FlagToString(mask=1024,equals=1024,name="FLAG_FULLSCREEN"),@android.view.ViewDebug.FlagToString(mask=2048,equals=2048,name="FLAG_FORCE_NOT_FULLSCREEN"),@android.view.ViewDebug.FlagToString(mask=4096,equals=4096,name="FLAG_DITHER"),@android.view.ViewDebug.FlagToString(mask=8192,equals=8192,name="FLAG_SECURE"),@android.view.ViewDebug.FlagToString(mask=16384,equals=16384,name="FLAG_SCALED"),@android.view.ViewDebug.FlagToString(mask=32768,equals=32768,name="FLAG_IGNORE_CHEEK_PRESSES"),@android.view.ViewDebug.FlagToString(mask=65536,equals=65536,name="FLAG_LAYOUT_INSET_DECOR"),@android.view.ViewDebug.FlagToString(mask=131072,equals=131072,name="FLAG_ALT_FOCUSABLE_IM"),@android.view.ViewDebug.FlagToString(mask=262144,equals=262144,name="FLAG_WATCH_OUTSIDE_TOUCH"),@android.view.ViewDebug.FlagToString(mask=524288,equals=524288,name="FLAG_SHOW_WHEN_LOCKED"),@android.view.ViewDebug.FlagToString(mask=1048576,equals=1048576,name="FLAG_SHOW_WALLPAPER"),@android.view.ViewDebug.FlagToString(mask=2097152,equals=2097152,name="FLAG_TURN_SCREEN_ON"),@android.view.ViewDebug.FlagToString(mask=4194304,equals=4194304,name="FLAG_DISMISS_KEYGUARD"),@android.view.ViewDebug.FlagToString(mask=8388608,equals=8388608,name="FLAG_SPLIT_TOUCH"),@android.view.ViewDebug.FlagToString(mask=16777216,equals=16777216,name="FLAG_HARDWARE_ACCELERATED"),@android.view.ViewDebug.FlagToString(mask=268435456,equals=268435456,name="FLAG_LOCAL_FOCUS_MODE"),@android.view.ViewDebug.FlagToString(mask=67108864,equals=67108864,name="FLAG_TRANSLUCENT_STATUS"),@android.view.ViewDebug.FlagToString(mask=134217728,equals=134217728,name="FLAG_TRANSLUCENT_NAVIGATION"),@android.view.ViewDebug.FlagToString(mask=-2147483648,equals=-2147483648,name="FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS")},formatToHexString=true)
public int flags;
public int format;
public int gravity;
public float horizontalMargin;
@android.view.ViewDebug.ExportedProperty()
public float horizontalWeight;
@java.lang.Deprecated()
public int memoryType;
public java.lang.String packageName;
public int preferredDisplayModeId;
@java.lang.Deprecated()
public float preferredRefreshRate;
public int rotationAnimation;
public float screenBrightness;
public int screenOrientation;
public int softInputMode;
public int systemUiVisibility;
public android.os.IBinder token;
@android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=1,to="TYPE_BASE_APPLICATION"),@android.view.ViewDebug.IntToString(from=2,to="TYPE_APPLICATION"),@android.view.ViewDebug.IntToString(from=3,to="TYPE_APPLICATION_STARTING"),@android.view.ViewDebug.IntToString(from=4,to="TYPE_DRAWN_APPLICATION"),@android.view.ViewDebug.IntToString(from=1000,to="TYPE_APPLICATION_PANEL"),@android.view.ViewDebug.IntToString(from=1001,to="TYPE_APPLICATION_MEDIA"),@android.view.ViewDebug.IntToString(from=1002,to="TYPE_APPLICATION_SUB_PANEL"),@android.view.ViewDebug.IntToString(from=1005,to="TYPE_APPLICATION_ABOVE_SUB_PANEL"),@android.view.ViewDebug.IntToString(from=1003,to="TYPE_APPLICATION_ATTACHED_DIALOG"),@android.view.ViewDebug.IntToString(from=1004,to="TYPE_APPLICATION_MEDIA_OVERLAY"),@android.view.ViewDebug.IntToString(from=2000,to="TYPE_STATUS_BAR"),@android.view.ViewDebug.IntToString(from=2001,to="TYPE_SEARCH_BAR"),@android.view.ViewDebug.IntToString(from=2002,to="TYPE_PHONE"),@android.view.ViewDebug.IntToString(from=2003,to="TYPE_SYSTEM_ALERT"),@android.view.ViewDebug.IntToString(from=2005,to="TYPE_TOAST"),@android.view.ViewDebug.IntToString(from=2006,to="TYPE_SYSTEM_OVERLAY"),@android.view.ViewDebug.IntToString(from=2007,to="TYPE_PRIORITY_PHONE"),@android.view.ViewDebug.IntToString(from=2008,to="TYPE_SYSTEM_DIALOG"),@android.view.ViewDebug.IntToString(from=2009,to="TYPE_KEYGUARD_DIALOG"),@android.view.ViewDebug.IntToString(from=2010,to="TYPE_SYSTEM_ERROR"),@android.view.ViewDebug.IntToString(from=2011,to="TYPE_INPUT_METHOD"),@android.view.ViewDebug.IntToString(from=2012,to="TYPE_INPUT_METHOD_DIALOG"),@android.view.ViewDebug.IntToString(from=2013,to="TYPE_WALLPAPER"),@android.view.ViewDebug.IntToString(from=2014,to="TYPE_STATUS_BAR_PANEL"),@android.view.ViewDebug.IntToString(from=2015,to="TYPE_SECURE_SYSTEM_OVERLAY"),@android.view.ViewDebug.IntToString(from=2016,to="TYPE_DRAG"),@android.view.ViewDebug.IntToString(from=2017,to="TYPE_STATUS_BAR_SUB_PANEL"),@android.view.ViewDebug.IntToString(from=2018,to="TYPE_POINTER"),@android.view.ViewDebug.IntToString(from=2019,to="TYPE_NAVIGATION_BAR"),@android.view.ViewDebug.IntToString(from=2020,to="TYPE_VOLUME_OVERLAY"),@android.view.ViewDebug.IntToString(from=2021,to="TYPE_BOOT_PROGRESS"),@android.view.ViewDebug.IntToString(from=2022,to="TYPE_INPUT_CONSUMER"),@android.view.ViewDebug.IntToString(from=2023,to="TYPE_DREAM"),@android.view.ViewDebug.IntToString(from=2024,to="TYPE_NAVIGATION_BAR_PANEL"),@android.view.ViewDebug.IntToString(from=2026,to="TYPE_DISPLAY_OVERLAY"),@android.view.ViewDebug.IntToString(from=2027,to="TYPE_MAGNIFICATION_OVERLAY"),@android.view.ViewDebug.IntToString(from=2030,to="TYPE_PRIVATE_PRESENTATION"),@android.view.ViewDebug.IntToString(from=2031,to="TYPE_VOICE_INTERACTION"),@android.view.ViewDebug.IntToString(from=2033,to="TYPE_VOICE_INTERACTION_STARTING"),@android.view.ViewDebug.IntToString(from=2034,to="TYPE_DOCK_DIVIDER"),@android.view.ViewDebug.IntToString(from=2035,to="TYPE_QS_DIALOG"),@android.view.ViewDebug.IntToString(from=2036,to="TYPE_SCREENSHOT")})
public int type;
public float verticalMargin;
@android.view.ViewDebug.ExportedProperty()
public float verticalWeight;
public int windowAnimations;
@android.view.ViewDebug.ExportedProperty()
public int x;
@android.view.ViewDebug.ExportedProperty()
public int y;
static { CREATOR = null; }
}
public abstract  android.view.Display getDefaultDisplay();
public abstract  void removeViewImmediate(android.view.View view);
}
