package com.tencent.mm.plugin.label;

import com.tencent.mm.model.ar;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public final class Plugin
  implements c
{
  public final n createApplication()
  {
    return new a();
  }
  
  public final ar createSubCore()
  {
    return new e();
  }
  
  public final b getContactWidgetFactory()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/label/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */