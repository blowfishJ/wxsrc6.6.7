package com.tencent.mm.protocal.c;

public final class asv
  extends com.tencent.mm.bk.a
{
  public int bMF;
  public String bssid;
  public String ssid;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ssid != null) {
        paramVarArgs.g(1, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.g(2, this.bssid);
      }
      paramVarArgs.fT(3, this.bMF);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ssid == null) {
        break label269;
      }
    }
    label269:
    for (paramInt = f.a.a.b.b.a.h(1, this.ssid) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bssid != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bssid);
      }
      return i + f.a.a.a.fQ(3, this.bMF);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        asv localasv = (asv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localasv.ssid = locala.vHC.readString();
          return 0;
        case 2: 
          localasv.bssid = locala.vHC.readString();
          return 0;
        }
        localasv.bMF = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/asv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */