package com.tencent.tencentmap.mapsdk.a;

import com.qq.jutil.string.StringUtil;
import com.qq.sim.Millis100TimeProvider;

public class bb
  implements Comparable<bb>
{
  String a;
  String b;
  int c;
  protected boolean d = true;
  String e;
  int f = 60000;
  int g;
  int h;
  bf i;
  private int j;
  private long k;
  private String l;
  
  public bb(String paramString, fl paramfl)
  {
    this.e = paramString;
    if (paramfl.d == 0) {
      this.a = "udp";
    }
    for (;;)
    {
      this.b = paramfl.a;
      this.c = paramfl.b;
      this.g = paramfl.c;
      this.h = paramfl.c;
      b(paramfl.e);
      a(paramfl.h);
      return;
      if (paramfl.d == 1) {
        this.a = "tcp";
      }
    }
  }
  
  public bb(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, 0);
  }
  
  public bb(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e = paramString1;
    this.a = paramString2;
    this.b = paramString3;
    this.c = paramInt1;
    this.g = paramInt2;
    this.h = paramInt3;
    b(paramInt4);
  }
  
  public static bb a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    paramString2 = paramString2.toLowerCase();
    for (paramInt3 = paramString2.indexOf("  "); paramInt3 >= 0; paramInt3 = paramString2.indexOf("  ")) {
      paramString2 = StringUtil.replaceAll(paramString2, "  ", " ");
    }
    String[] arrayOfString = StringUtil.split(paramString2, " ");
    if (arrayOfString.length < 5) {
      throw new bl("node config error " + paramString2);
    }
    String str = "";
    paramString2 = "";
    int m = 0;
    paramInt3 = 1;
    int n = 0;
    if (m < arrayOfString.length) {
      if (arrayOfString[m].equals("-h")) {
        str = arrayOfString[(m + 1)];
      }
    }
    for (;;)
    {
      m += 1;
      break;
      if (arrayOfString[m].equals("-p"))
      {
        n = Integer.parseInt(arrayOfString[(m + 1)]);
      }
      else if (arrayOfString[m].equals("-a"))
      {
        paramInt3 = Integer.parseInt(arrayOfString[(m + 1)]);
      }
      else if (arrayOfString[m].equals("-s"))
      {
        paramString2 = arrayOfString[(m + 1)];
        continue;
        paramString1 = new bb(paramString1, arrayOfString[0], str, n, paramInt1, paramInt2);
        if (paramInt3 != 0) {}
        for (;;)
        {
          paramString1.d = bool;
          if ((paramString2 != null) && (paramString2.length() > 0)) {
            paramString1.a(paramString2);
          }
          return paramString1;
          bool = false;
        }
      }
    }
  }
  
  public static String a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    if ((paramString3 != null) && (paramString3.length() > 0)) {
      return paramString1 + ">" + paramString2 + ":" + paramInt + "|" + paramString3;
    }
    return paramString1 + ">" + paramString2 + ":" + paramInt;
  }
  
  public int a(bb parambb)
  {
    return a().hashCode() - parambb.a().hashCode();
  }
  
  public String a()
  {
    return a(this.a, this.b, this.c, this.l);
  }
  
  @Deprecated
  protected void a(int paramInt) {}
  
  public void a(String paramString)
  {
    this.l = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.k = Millis100TimeProvider.INSTANCE.currentTimeMillis();
      return;
    }
    this.k = 0L;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public String c()
  {
    int m = 0;
    if (this.d) {
      m = 1;
    }
    String str2 = this.a + " -h " + this.b + " -p " + this.c + " -t 3000 -a " + m + " -g " + e();
    String str1 = str2;
    if (this.l != null)
    {
      str1 = str2;
      if (this.l.length() > 0) {
        str1 = str2 + " -s " + this.l;
      }
    }
    return str1;
  }
  
  public String d()
  {
    return a() + " syncTimeout:" + this.g + " active:" + this.d + " asyncTimeout:" + this.h + " grid:" + e() + " setDivision:" + this.l;
  }
  
  public int e()
  {
    return this.j;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof bb)) && (((bb)paramObject).toString().equals(toString()));
  }
  
  public bb f()
  {
    return new bb(this.e, this.a, this.b, this.c, this.g, this.h, this.j);
  }
  
  public boolean g()
  {
    return this.d;
  }
  
  public String h()
  {
    return this.l;
  }
  
  public int hashCode()
  {
    return toString().hashCode();
  }
  
  public String toString()
  {
    return a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */