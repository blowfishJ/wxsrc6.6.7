package com.tencent.tinker.a.b.a;

import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.b.b.a;

public final class b
{
  public static short B(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 & 0xFFFFFFF0) != 0) {
      throw new IllegalArgumentException("bogus nibble0");
    }
    if ((paramInt2 & 0xFFFFFFF0) != 0) {
      throw new IllegalArgumentException("bogus nibble1");
    }
    if ((paramInt3 & 0xFFFFFFF0) != 0) {
      throw new IllegalArgumentException("bogus nibble2");
    }
    if ((paramInt4 & 0xFFFFFFF0) != 0) {
      throw new IllegalArgumentException("bogus nibble3");
    }
    return (short)(paramInt2 << 4 | paramInt1 | paramInt3 << 8 | paramInt4 << 12);
  }
  
  public static short HF(int paramInt)
  {
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("bogus unsigned code unit");
    }
    return (short)paramInt;
  }
  
  public static int HG(int paramInt)
  {
    return paramInt >> 8 & 0xFF;
  }
  
  public static short HH(int paramInt)
  {
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new j("Register A out of range: " + a.gW(paramInt));
    }
    return (short)paramInt;
  }
  
  public static short HI(int paramInt)
  {
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new j("Register B out of range: " + a.gW(paramInt));
    }
    return (short)paramInt;
  }
  
  public static int HJ(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 26: 
    case 27: 
      return 3;
    case 28: 
    case 31: 
    case 32: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
      return 2;
    case 82: 
    case 83: 
    case 84: 
    case 85: 
    case 86: 
    case 87: 
    case 88: 
    case 89: 
    case 90: 
    case 91: 
    case 92: 
    case 93: 
    case 94: 
    case 95: 
    case 96: 
    case 97: 
    case 98: 
    case 99: 
    case 100: 
    case 101: 
    case 102: 
    case 103: 
    case 104: 
    case 105: 
    case 106: 
    case 107: 
    case 108: 
    case 109: 
      return 5;
    case 110: 
    case 111: 
    case 112: 
    case 113: 
    case 114: 
    case 116: 
    case 117: 
    case 118: 
    case 119: 
    case 120: 
      return 4;
    }
    return 1;
  }
  
  public static short fL(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0xFF00) != 0) {
      throw new IllegalArgumentException("bogus lowByte");
    }
    if ((paramInt2 & 0xFF00) != 0) {
      throw new IllegalArgumentException("bogus highByte");
    }
    return (short)(paramInt2 << 8 | paramInt1);
  }
  
  public static int fM(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0xFFFFFFF0) != 0) {
      throw new IllegalArgumentException("bogus lowNibble");
    }
    if ((paramInt2 & 0xFFFFFFF0) != 0) {
      throw new IllegalArgumentException("bogus highNibble");
    }
    return paramInt2 << 4 | paramInt1;
  }
  
  public static short fN(int paramInt1, int paramInt2)
  {
    paramInt1 -= paramInt2;
    if (paramInt1 != (short)paramInt1) {
      throw new j("Target out of range: " + a.HP(paramInt1) + ", perhaps you need to enable force jumbo mode.");
    }
    return (short)paramInt1;
  }
  
  public static short gV(long paramLong)
  {
    if (paramLong != (short)(int)paramLong) {
      throw new j("Literal out of range: " + a.gW(paramLong));
    }
    return (short)(int)paramLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tinker/a/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */