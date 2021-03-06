/*
* Copyright (C) 2014 The Android Open Source Project
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
package android.transition;
public abstract class TransitionPropagation
{
public  TransitionPropagation() { throw new RuntimeException("Stub!"); }
public abstract  long getStartDelay(android.view.ViewGroup sceneRoot, android.transition.Transition transition, android.transition.TransitionValues startValues, android.transition.TransitionValues endValues);
public abstract  void captureValues(android.transition.TransitionValues transitionValues);
public abstract  java.lang.String[] getPropagationProperties();
}
