package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cai
  extends bhd
{
  public int rxG;
  public long rxH;
  public int seq;
  public int swG;
  public int swH;
  public LinkedList<cal> swI = new LinkedList();
  public int swJ;
  
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
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.fT(4, this.seq);
      paramVarArgs.fT(5, this.swG);
      paramVarArgs.fT(6, this.swH);
      paramVarArgs.d(7, 8, this.swI);
      paramVarArgs.fT(8, this.swJ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label632;
      }
    }
    label632:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.S(3, this.rxH) + f.a.a.a.fQ(4, this.seq) + f.a.a.a.fQ(5, this.swG) + f.a.a.a.fQ(6, this.swH) + f.a.a.a.c(7, 8, this.swI) + f.a.a.a.fQ(8, this.swJ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.swI.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        cai localcai = (cai)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        int i;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcai.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcai.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcai.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localcai.seq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localcai.swG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localcai.swH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cal();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cal)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcai.swI.add(localObject1);
            paramInt += 1;
          }
        }
        localcai.swJ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */