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

package android.widget;
public class DialerFilter
  extends android.widget.RelativeLayout
{
public  DialerFilter(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  DialerFilter(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
protected  void onFinishInflate() { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  boolean isQwertyKeyboard() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  int getMode() { throw new RuntimeException("Stub!"); }
public  void setMode(int newMode) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLetters() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDigits() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getFilterText() { throw new RuntimeException("Stub!"); }
public  void append(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  void clearText() { throw new RuntimeException("Stub!"); }
public  void setLettersWatcher(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
public  void setDigitsWatcher(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
public  void setFilterWatcher(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
public  void removeFilterWatcher(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
protected  void onModeChange(int oldMode, int newMode) { throw new RuntimeException("Stub!"); }
public static final int DIGITS_AND_LETTERS = 1;
public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;
public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;
public static final int DIGITS_ONLY = 4;
public static final int LETTERS_ONLY = 5;
}
