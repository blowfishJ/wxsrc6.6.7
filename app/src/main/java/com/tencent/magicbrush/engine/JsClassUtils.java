package com.tencent.magicbrush.engine;

import android.support.annotation.Keep;
import android.webkit.JavascriptInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;

@Keep
public class JsClassUtils
{
  private static final int BOOLEAN = 1;
  private static final int BYTE = 3;
  private static final int CHAR = 2;
  private static final int DOUBLE = 8;
  private static final int FLOAT = 6;
  private static final int INT = 5;
  private static final int LONG = 7;
  private static final int SHORT = 4;
  private static final int VOID = 0;
  private static final int string = 9;
  private static final int unknown = 10;
  
  private static void getDescriptor(StringBuilder paramStringBuilder, Class<?> paramClass)
  {
    char c1;
    for (;;)
    {
      if (paramClass.isPrimitive())
      {
        if (paramClass == Integer.TYPE) {
          c1 = 'I';
        }
        for (;;)
        {
          paramStringBuilder.append(c1);
          return;
          if (paramClass == Void.TYPE) {
            c1 = 'V';
          } else if (paramClass == Boolean.TYPE) {
            c1 = 'Z';
          } else if (paramClass == Byte.TYPE) {
            c1 = 'B';
          } else if (paramClass == Character.TYPE) {
            c1 = 'C';
          } else if (paramClass == Short.TYPE) {
            c1 = 'S';
          } else if (paramClass == Double.TYPE) {
            c1 = 'D';
          } else if (paramClass == Float.TYPE) {
            c1 = 'F';
          } else {
            c1 = 'J';
          }
        }
      }
      if (!paramClass.isArray()) {
        break;
      }
      paramStringBuilder.append('[');
      paramClass = paramClass.getComponentType();
    }
    paramStringBuilder.append('L');
    paramClass = paramClass.getName();
    int j = paramClass.length();
    int i = 0;
    while (i < j)
    {
      char c2 = paramClass.charAt(i);
      c1 = c2;
      if (c2 == '.') {
        c1 = '/';
      }
      paramStringBuilder.append(c1);
      i += 1;
    }
    paramStringBuilder.append(';');
  }
  
  private static int getJavaType(Class<?> paramClass)
  {
    if (paramClass == Integer.TYPE) {
      return 5;
    }
    if (paramClass == Void.TYPE) {
      return 0;
    }
    if (paramClass == Boolean.TYPE) {
      return 1;
    }
    if (paramClass == Byte.TYPE) {
      return 3;
    }
    if (paramClass == Character.TYPE) {
      return 2;
    }
    if (paramClass == Short.TYPE) {
      return 4;
    }
    if (paramClass == Double.TYPE) {
      return 8;
    }
    if (paramClass == Float.TYPE) {
      return 6;
    }
    if (paramClass.getCanonicalName().equals("java.lang.String")) {
      return 9;
    }
    return 10;
  }
  
  @Keep
  public static Method[] getJavascriptInterfaceMethod(Object paramObject)
  {
    localArrayList = new ArrayList();
    try
    {
      paramObject = paramObject.getClass().getMethods();
      int j = paramObject.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramObject[i];
        if (((Method)localObject).isAnnotationPresent(JavascriptInterface.class)) {
          localArrayList.add(localObject);
        }
        i += 1;
      }
      return (Method[])localArrayList.toArray(new Method[localArrayList.size()]);
    }
    catch (Exception paramObject) {}
  }
  
  @Keep
  public static String getMethodName(Method paramMethod)
  {
    return paramMethod.getName();
  }
  
  @Keep
  public static String getMethodSignature(Method paramMethod)
  {
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('(');
    int i = 0;
    while (i < arrayOfClass.length)
    {
      getDescriptor(localStringBuilder, arrayOfClass[i]);
      i += 1;
    }
    localStringBuilder.append(')');
    getDescriptor(localStringBuilder, paramMethod.getReturnType());
    return localStringBuilder.toString();
  }
  
  @Keep
  public static int[] getMethodType(Method paramMethod)
  {
    int i = 0;
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    int[] arrayOfInt = new int[arrayOfClass.length + 2];
    arrayOfInt[0] = arrayOfClass.length;
    arrayOfInt[1] = getJavaType(paramMethod.getReturnType());
    while (i < arrayOfClass.length)
    {
      arrayOfInt[(i + 2)] = getJavaType(arrayOfClass[i]);
      i += 1;
    }
    return arrayOfInt;
  }
  
  public static boolean hasJavascriptInterface(Object paramObject)
  {
    boolean bool2 = false;
    try
    {
      paramObject = paramObject.getClass().getMethods();
      int j = paramObject.length;
      int i = 0;
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          bool1 = paramObject[i].isAnnotationPresent(JavascriptInterface.class);
          if (bool1) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
        i += 1;
      }
      return false;
    }
    catch (Exception paramObject) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/magicbrush/engine/JsClassUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */