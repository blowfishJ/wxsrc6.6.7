package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bsn
  extends com.tencent.mm.bk.a
{
  public int rSt;
  public bhz spT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.spT == null) {
        throw new b("Not all required fields were included: StatReport");
      }
      paramVarArgs.fT(1, this.rSt);
      if (this.spT != null)
      {
        paramVarArgs.fV(2, this.spT.boi());
        this.spT.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rSt) + 0;
      paramInt = i;
    } while (this.spT == null);
    return i + f.a.a.a.fS(2, this.spT.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.spT == null) {
        throw new b("Not all required fields were included: StatReport");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bsn localbsn = (bsn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbsn.rSt = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhz();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localbsn.spT = ((bhz)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */