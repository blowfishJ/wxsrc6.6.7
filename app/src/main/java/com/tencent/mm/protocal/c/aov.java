package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aov
  extends bhd
{
  public String jQb;
  public LinkedList<String> rQZ = new LinkedList();
  public int rRa;
  public int rRb;
  public chf rRc;
  public int rRe;
  public String rRf;
  
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
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      paramVarArgs.d(3, 1, this.rQZ);
      paramVarArgs.fT(4, this.rRe);
      if (this.rRf != null) {
        paramVarArgs.g(6, this.rRf);
      }
      paramVarArgs.fT(7, this.rRa);
      paramVarArgs.fT(8, this.rRb);
      if (this.rRc != null)
      {
        paramVarArgs.fV(9, this.rRc.boi());
        this.rRc.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label708;
      }
    }
    label708:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = i + f.a.a.a.c(3, 1, this.rQZ) + f.a.a.a.fQ(4, this.rRe);
      paramInt = i;
      if (this.rRf != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rRf);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rRa) + f.a.a.a.fQ(8, this.rRb);
      paramInt = i;
      if (this.rRc != null) {
        paramInt = i + f.a.a.a.fS(9, this.rRc.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rQZ.clear();
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
        aov localaov = (aov)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5: 
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
            localaov.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaov.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaov.rQZ.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 4: 
          localaov.rRe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localaov.rRf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaov.rRa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localaov.rRb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new chf();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((chf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localaov.rRc = ((chf)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */