package com.tencent.pb.common.c;

import com.tencent.pb.talkroom.sdk.e;
import com.tencent.wecall.talkroom.model.f;

public final class c
{
  public static int level = 0;
  private static int vgd = 2;
  private static boolean vge = false;
  
  private static String B(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0)) {
      return "";
    }
    int j = paramArrayOfObject.length;
    StringBuffer localStringBuffer = new StringBuffer(250);
    int i = 0;
    if (i < j)
    {
      Object localObject = paramArrayOfObject[i];
      if (localObject != null)
      {
        localStringBuffer.append("|");
        if (!(localObject instanceof Throwable)) {
          break label78;
        }
        localStringBuffer.append(((Throwable)localObject).getMessage());
      }
      for (;;)
      {
        i += 1;
        break;
        label78:
        localStringBuffer.append(localObject.toString());
      }
    }
    return localStringBuffer.toString();
  }
  
  private static void D(int paramInt, String paramString1, String paramString2)
  {
    e locale = f.cHX();
    if (locale != null) {
      locale.m(paramInt, "MTSDK" + paramString1, paramString2);
    }
  }
  
  public static void cED()
  {
    vgd = 0;
    vge = true;
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    if ((!vge) || (vgd > 1)) {}
    while (paramString == null) {
      return;
    }
    paramVarArgs = B(paramVarArgs);
    D(1, paramString, " " + paramVarArgs);
  }
  
  public static void e(String paramString, Object... paramVarArgs)
  {
    if ((!vge) || (vgd > 4)) {
      return;
    }
    paramVarArgs = B(paramVarArgs);
    D(4, paramString, " " + paramVarArgs);
  }
  
  public static void w(String paramString, Object... paramVarArgs)
  {
    if ((!vge) || (vgd > 2)) {
      return;
    }
    paramVarArgs = B(paramVarArgs);
    D(2, paramString, " " + paramVarArgs);
  }
  
  public static void x(String paramString, Object... paramVarArgs)
  {
    if ((!vge) || (vgd > 3)) {}
    while (paramString == null) {
      return;
    }
    paramVarArgs = B(paramVarArgs);
    D(3, paramString, " " + paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/pb/common/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */