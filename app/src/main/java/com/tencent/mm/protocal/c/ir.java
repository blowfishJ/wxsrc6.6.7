package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ir
  extends com.tencent.mm.bk.a
{
  public String rjR;
  public int rjS;
  public String rjT;
  public int rjU;
  public LinkedList<hn> rjV = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rjR != null) {
        paramVarArgs.g(1, this.rjR);
      }
      paramVarArgs.fT(2, this.rjS);
      if (this.rjT != null) {
        paramVarArgs.g(3, this.rjT);
      }
      paramVarArgs.fT(4, this.rjU);
      paramVarArgs.d(5, 8, this.rjV);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rjR == null) {
        break label441;
      }
    }
    label441:
    for (paramInt = f.a.a.b.b.a.h(1, this.rjR) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rjS);
      paramInt = i;
      if (this.rjT != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rjT);
      }
      return paramInt + f.a.a.a.fQ(4, this.rjU) + f.a.a.a.c(5, 8, this.rjV);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rjV.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ir localir = (ir)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localir.rjR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localir.rjS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localir.rjT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localir.rjU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hn();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((hn)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localir.rjV.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */