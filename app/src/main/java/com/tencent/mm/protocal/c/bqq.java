package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bqq
  extends com.tencent.mm.bk.a
{
  public int soK;
  public int soL;
  public int soM;
  public int soo;
  public byx sop;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sop == null) {
        throw new b("Not all required fields were included: Addr");
      }
      if (this.sop != null)
      {
        paramVarArgs.fV(1, this.sop.boi());
        this.sop.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.soo);
      paramVarArgs.fT(3, this.soK);
      paramVarArgs.fT(4, this.soL);
      paramVarArgs.fT(5, this.soM);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sop == null) {
        break label453;
      }
    }
    label453:
    for (paramInt = f.a.a.a.fS(1, this.sop.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.soo) + f.a.a.a.fQ(3, this.soK) + f.a.a.a.fQ(4, this.soL) + f.a.a.a.fQ(5, this.soM);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sop != null) {
          break;
        }
        throw new b("Not all required fields were included: Addr");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bqq localbqq = (bqq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((byx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbqq.sop = ((byx)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbqq.soo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbqq.soK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbqq.soL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbqq.soM = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */