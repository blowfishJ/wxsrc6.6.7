package com.tencent.mm.plugin.wallet_core;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.wallet_core.a.a;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public class Plugin
  implements c
{
  public n createApplication()
  {
    return new a();
  }
  
  public ar createSubCore()
  {
    return new o();
  }
  
  public b getContactWidgetFactory()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */