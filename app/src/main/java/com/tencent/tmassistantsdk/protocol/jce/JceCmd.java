package com.tencent.tmassistantsdk.protocol.jce;

import java.io.Serializable;

public final class JceCmd
  implements Serializable
{
  public static final JceCmd Empty;
  public static final JceCmd GetAppSimpleDetail;
  public static final JceCmd GetAppUpdate;
  public static final JceCmd GetSettings;
  public static final JceCmd ReportApkFileInfo;
  public static final JceCmd ReportLog;
  public static final int _Empty = 0;
  public static final int _GetAppSimpleDetail = 5;
  public static final int _GetAppUpdate = 3;
  public static final int _GetSettings = 2;
  public static final int _ReportApkFileInfo = 4;
  public static final int _ReportLog = 1;
  private static JceCmd[] __values;
  private String __T = new String();
  private int __value;
  
  static
  {
    if (!JceCmd.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      __values = new JceCmd[6];
      Empty = new JceCmd(0, 0, "Empty");
      ReportLog = new JceCmd(1, 1, "ReportLog");
      GetSettings = new JceCmd(2, 2, "GetSettings");
      GetAppUpdate = new JceCmd(3, 3, "GetAppUpdate");
      ReportApkFileInfo = new JceCmd(4, 4, "ReportApkFileInfo");
      GetAppSimpleDetail = new JceCmd(5, 5, "GetAppSimpleDetail");
      return;
    }
  }
  
  private JceCmd(int paramInt1, int paramInt2, String paramString)
  {
    this.__T = paramString;
    this.__value = paramInt2;
    __values[paramInt1] = this;
  }
  
  public static JceCmd convert(int paramInt)
  {
    int i = 0;
    while (i < __values.length)
    {
      if (__values[i].value() == paramInt) {
        return __values[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public static JceCmd convert(String paramString)
  {
    int i = 0;
    while (i < __values.length)
    {
      if (__values[i].toString().equals(paramString)) {
        return __values[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public final String toString()
  {
    return this.__T;
  }
  
  public final int value()
  {
    return this.__value;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tmassistantsdk/protocol/jce/JceCmd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */