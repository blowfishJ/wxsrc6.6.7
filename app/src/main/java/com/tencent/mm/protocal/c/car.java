package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class car
  extends bhp
{
  public long swW;
  public int sxa;
  public int sxb;
  public LinkedList<bqq> sxc = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.sxa);
      paramVarArgs.T(3, this.swW);
      paramVarArgs.fT(4, this.sxb);
      paramVarArgs.d(5, 8, this.sxc);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label547;
      }
    }
    label547:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.sxa) + f.a.a.a.S(3, this.swW) + f.a.a.a.fQ(4, this.sxb) + f.a.a.a.c(5, 8, this.sxc);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sxc.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        car localcar = (car)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcar.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcar.sxa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcar.swW = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localcar.sxb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localcar.sxc.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/car.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */