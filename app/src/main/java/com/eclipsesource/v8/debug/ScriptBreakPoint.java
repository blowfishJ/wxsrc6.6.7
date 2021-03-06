package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8ResultUndefined;

public class ScriptBreakPoint
  implements Releasable
{
  private static final String CONDITION = "condition";
  private static final String LINE = "line";
  private static final String NUMBER = "number";
  private static final String SET_CONDITION = "setCondition";
  private V8Object v8Object;
  
  ScriptBreakPoint(V8Object paramV8Object)
  {
    this.v8Object = paramV8Object.twin();
  }
  
  public int getBreakPointNumber()
  {
    return this.v8Object.executeIntegerFunction("number", null);
  }
  
  public String getCondition()
  {
    try
    {
      String str = this.v8Object.executeStringFunction("condition", null);
      return str;
    }
    catch (V8ResultUndefined localV8ResultUndefined) {}
    return "undefined";
  }
  
  public int getLine()
  {
    return this.v8Object.executeIntegerFunction("line", null);
  }
  
  public void release()
  {
    if ((this.v8Object != null) && (!this.v8Object.isReleased()))
    {
      this.v8Object.release();
      this.v8Object = null;
    }
  }
  
  public void setCondition(String paramString)
  {
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramString);
    try
    {
      this.v8Object.executeVoidFunction("setCondition", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/v8/debug/ScriptBreakPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */