package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class ccu
  extends com.tencent.mm.bk.a
{
  public b syp;
  public b syv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.syp != null) {
        paramVarArgs.b(1, this.syp);
      }
      if (this.syv != null) {
        paramVarArgs.b(2, this.syv);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.syp == null) {
        break label228;
      }
    }
    label228:
    for (paramInt = f.a.a.a.a(1, this.syp) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.syv != null) {
        i = paramInt + f.a.a.a.a(2, this.syv);
      }
      return i;
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
        ccu localccu = (ccu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localccu.syp = locala.cJR();
          return 0;
        }
        localccu.syv = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ccu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */