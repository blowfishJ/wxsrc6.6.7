package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class akh
  extends bhd
{
  public String hbL;
  public int otY;
  public bhy rEu;
  public String rMW;
  public bhy reB;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.reB == null) {
        throw new b("Not all required fields were included: A2Key");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.reB != null)
      {
        paramVarArgs.fV(2, this.reB.boi());
        this.reB.a(paramVarArgs);
      }
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
      }
      paramVarArgs.fT(4, this.otY);
      if (this.rMW != null) {
        paramVarArgs.g(5, this.rMW);
      }
      if (this.rEu != null)
      {
        paramVarArgs.fV(6, this.rEu.boi());
        this.rEu.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label752;
      }
    }
    label752:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.reB != null) {
        paramInt = i + f.a.a.a.fS(2, this.reB.boi());
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hbL);
      }
      i += f.a.a.a.fQ(4, this.otY);
      paramInt = i;
      if (this.rMW != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rMW);
      }
      i = paramInt;
      if (this.rEu != null) {
        i = paramInt + f.a.a.a.fS(6, this.rEu.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.reB != null) {
          break;
        }
        throw new b("Not all required fields were included: A2Key");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        akh localakh = (akh)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localakh.shX = ((fk)localObject1);
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localakh.reB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localakh.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localakh.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localakh.rMW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localakh.rEu = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/akh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */