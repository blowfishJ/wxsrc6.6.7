package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class afp
  extends bhp
{
  public int rJA;
  public int rJx;
  public LinkedList<awy> rJy = new LinkedList();
  public String rJz;
  public int rbZ;
  
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
      paramVarArgs.fT(2, this.rJx);
      paramVarArgs.d(3, 8, this.rJy);
      if (this.rJz != null) {
        paramVarArgs.g(4, this.rJz);
      }
      paramVarArgs.fT(5, this.rbZ);
      paramVarArgs.fT(6, this.rJA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label606;
      }
    }
    label606:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rJx) + f.a.a.a.c(3, 8, this.rJy);
      paramInt = i;
      if (this.rJz != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rJz);
      }
      return paramInt + f.a.a.a.fQ(5, this.rbZ) + f.a.a.a.fQ(6, this.rJA);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rJy.clear();
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
        afp localafp = (afp)paramVarArgs[1];
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
            localafp.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafp.rJx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new awy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((awy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafp.rJy.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localafp.rJz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localafp.rbZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localafp.rJA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/afp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */