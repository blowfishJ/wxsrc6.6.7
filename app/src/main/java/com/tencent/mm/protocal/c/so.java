package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class so
  extends bhd
{
  public int rci;
  public long rcq;
  public int rdV;
  public int rdW;
  public int rvT;
  public int rvU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rci);
      paramVarArgs.fT(3, this.rdV);
      paramVarArgs.fT(4, this.rdW);
      paramVarArgs.fT(5, this.rvT);
      paramVarArgs.fT(6, this.rvU);
      paramVarArgs.T(7, this.rcq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label499;
      }
    }
    label499:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rci) + f.a.a.a.fQ(3, this.rdV) + f.a.a.a.fQ(4, this.rdW) + f.a.a.a.fQ(5, this.rvT) + f.a.a.a.fQ(6, this.rvU) + f.a.a.a.S(7, this.rcq);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        so localso = (so)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localso.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localso.rci = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localso.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localso.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localso.rvT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localso.rvU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localso.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */