/* GENERATED SOURCE. DO NOT MODIFY. */
/*
******************************************************************************
* Copyright (C) 2005-2016, International Business Machines Corporation and    *
* others. All Rights Reserved.                                               *
******************************************************************************
*/
package android.icu.util;
public interface Freezable<T>
  extends java.lang.Cloneable
{
public abstract  boolean isFrozen();
public abstract  T freeze();
public abstract  T cloneAsThawed();
}
