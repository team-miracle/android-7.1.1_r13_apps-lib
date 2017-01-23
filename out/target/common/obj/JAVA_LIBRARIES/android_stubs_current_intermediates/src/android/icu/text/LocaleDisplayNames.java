/* GENERATED SOURCE. DO NOT MODIFY. */
/*
*******************************************************************************
* Copyright (C) 2009-2016, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*/
package android.icu.text;
public abstract class LocaleDisplayNames
{
public static enum DialectHandling
{
DIALECT_NAMES(),
STANDARD_NAMES();
}
LocaleDisplayNames() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale locale, android.icu.text.LocaleDisplayNames.DialectHandling dialectHandling) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale locale, android.icu.text.DisplayContext... contexts) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(java.util.Locale locale, android.icu.text.DisplayContext... contexts) { throw new RuntimeException("Stub!"); }
public abstract  android.icu.util.ULocale getLocale();
public abstract  android.icu.text.LocaleDisplayNames.DialectHandling getDialectHandling();
public abstract  android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type type);
public abstract  java.lang.String localeDisplayName(android.icu.util.ULocale locale);
public abstract  java.lang.String localeDisplayName(java.util.Locale locale);
public abstract  java.lang.String localeDisplayName(java.lang.String localeId);
public abstract  java.lang.String languageDisplayName(java.lang.String lang);
public abstract  java.lang.String scriptDisplayName(java.lang.String script);
public abstract  java.lang.String scriptDisplayName(int scriptCode);
public abstract  java.lang.String regionDisplayName(java.lang.String region);
public abstract  java.lang.String variantDisplayName(java.lang.String variant);
public abstract  java.lang.String keyDisplayName(java.lang.String key);
public abstract  java.lang.String keyValueDisplayName(java.lang.String key, java.lang.String value);
}
