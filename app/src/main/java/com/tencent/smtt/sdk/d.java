package com.tencent.smtt.sdk;

import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;

class d
  implements ValueCallback<IX5JsError>
{
  d(JsContext paramJsContext) {}
  
  public void a(IX5JsError paramIX5JsError)
  {
    JsContext.a(this.a).handleException(this.a, new JsError(paramIX5JsError));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */