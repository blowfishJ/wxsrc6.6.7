package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bsr
  extends bhp
{
  public bhy rPv;
  public int rPw;
  public String rPx;
  public int rPy;
  public int scS;
  public String scT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rPv == null) {
        throw new b("Not all required fields were included: RetText");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rPv != null)
      {
        paramVarArgs.fV(2, this.rPv.boi());
        this.rPv.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rPw);
      if (this.rPx != null) {
        paramVarArgs.g(4, this.rPx);
      }
      paramVarArgs.fT(5, this.rPy);
      paramVarArgs.fT(6, this.scS);
      if (this.scT != null) {
        paramVarArgs.g(7, this.scT);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label717;
      }
    }
    label717:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rPv != null) {
        i = paramInt + f.a.a.a.fS(2, this.rPv.boi());
      }
      i += f.a.a.a.fQ(3, this.rPw);
      paramInt = i;
      if (this.rPx != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rPx);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rPy) + f.a.a.a.fQ(6, this.scS);
      paramInt = i;
      if (this.scT != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.scT);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rPv != null) {
          break;
        }
        throw new b("Not all required fields were included: RetText");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bsr localbsr = (bsr)paramVarArgs[1];
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
            localbsr.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbsr.rPv = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbsr.rPw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbsr.rPx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbsr.rPy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbsr.scS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbsr.scT = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */