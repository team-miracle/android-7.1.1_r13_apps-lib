/*
* Copyright (C) 2015 The Android Open Source Project
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
public abstract class ViewStructure
{
public  ViewStructure() { throw new RuntimeException("Stub!"); }
public abstract  void setId(int id, java.lang.String packageName, java.lang.String typeName, java.lang.String entryName);
public abstract  void setDimens(int left, int top, int scrollX, int scrollY, int width, int height);
public abstract  void setTransformation(android.graphics.Matrix matrix);
public abstract  void setElevation(float elevation);
public abstract  void setAlpha(float alpha);
public abstract  void setVisibility(int visibility);
public abstract  void setEnabled(boolean state);
public abstract  void setClickable(boolean state);
public abstract  void setLongClickable(boolean state);
public abstract  void setContextClickable(boolean state);
public abstract  void setFocusable(boolean state);
public abstract  void setFocused(boolean state);
public abstract  void setAccessibilityFocused(boolean state);
public abstract  void setCheckable(boolean state);
public abstract  void setChecked(boolean state);
public abstract  void setSelected(boolean state);
public abstract  void setActivated(boolean state);
public abstract  void setClassName(java.lang.String className);
public abstract  void setContentDescription(java.lang.CharSequence contentDescription);
public abstract  void setText(java.lang.CharSequence text);
public abstract  void setText(java.lang.CharSequence text, int selectionStart, int selectionEnd);
public abstract  void setTextStyle(float size, int fgColor, int bgColor, int style);
public abstract  void setTextLines(int[] charOffsets, int[] baselines);
public abstract  void setHint(java.lang.CharSequence hint);
public abstract  java.lang.CharSequence getText();
public abstract  int getTextSelectionStart();
public abstract  int getTextSelectionEnd();
public abstract  java.lang.CharSequence getHint();
public abstract  android.os.Bundle getExtras();
public abstract  boolean hasExtras();
public abstract  void setChildCount(int num);
public abstract  int addChildCount(int num);
public abstract  int getChildCount();
public abstract  android.view.ViewStructure newChild(int index);
public abstract  android.view.ViewStructure asyncNewChild(int index);
public abstract  void asyncCommit();
}
