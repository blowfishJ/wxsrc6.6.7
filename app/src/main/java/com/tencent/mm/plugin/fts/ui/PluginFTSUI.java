package com.tencent.mm.plugin.fts.ui;

import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.b.a;
import com.tencent.mm.plugin.fts.ui.b.e;
import com.tencent.mm.plugin.fts.ui.b.h;
import com.tencent.mm.plugin.fts.ui.b.i;
import com.tencent.mm.plugin.fts.ui.b.j;
import com.tencent.mm.plugin.fts.ui.b.k;

public class PluginFTSUI
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c
{
  private void registerUILogic()
  {
    Object localObject = new k();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new e();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new com.tencent.mm.plugin.fts.ui.b.c();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new h();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new com.tencent.mm.plugin.fts.ui.b.g();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new j();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new com.tencent.mm.plugin.fts.ui.b.d();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new com.tencent.mm.plugin.fts.ui.b.b();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new i();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new a();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new com.tencent.mm.plugin.fts.ui.b.f();
    ((n)com.tencent.mm.kernel.g.n(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public void onAccountInitialized(e.c paramc)
  {
    registerUILogic();
  }
  
  public void onAccountRelease()
  {
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(16);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(32);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(48);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(64);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(112);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(4112);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(4128);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(4176);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(8192);
    ((n)com.tencent.mm.kernel.g.n(n.class)).unregisterFTSUILogic(160);
  }
  
  public void parallelsDependency() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/PluginFTSUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */