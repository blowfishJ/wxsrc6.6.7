package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class t
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String hbL;
  public String jPd;
  public String jQf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jQf == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.jPd != null) {
        paramVarArgs.g(2, this.jPd);
      }
      if (this.bHD != null) {
        paramVarArgs.g(3, this.bHD);
      }
      if (this.jQf != null) {
        paramVarArgs.g(4, this.jQf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label412;
      }
    }
    label412:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPd != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPd);
      }
      i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bHD);
      }
      paramInt = i;
      if (this.jQf != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jQf);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jQf != null) {
          break;
        }
        throw new b("Not all required fields were included: Detail");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        t localt = (t)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localt.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localt.jPd = locala.vHC.readString();
          return 0;
        case 3: 
          localt.bHD = locala.vHC.readString();
          return 0;
        }
        localt.jQf = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */