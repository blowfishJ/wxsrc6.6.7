package com.tencent.mm.plugin.fav.ui.b;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;
import java.util.List;

public final class e
  extends com.tencent.mm.plugin.fts.ui.a
{
  public e(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    i locali = new i();
    locali.jsn = 1;
    locali.bWm = this.bWm;
    locali.jss = 1;
    locali.jst = paramHashSet;
    locali.handler = paramag;
    locali.jsv = this;
    return ((n)g.n(n.class)).search(6, locali);
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta - 1;
    l locall = null;
    Object localObject = locall;
    if (i < parama.jte.size())
    {
      localObject = locall;
      if (i >= 0)
      {
        locall = (l)parama.jte.get(i);
        localObject = new a(paramInt);
        ((a)localObject).fyJ = locall;
        ((a)localObject).jrx = parama.jrx;
        ((a)localObject).cF(locall.type, locall.jru);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtm = (i + 1);
    }
    return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    if (bk(paramj.jsx))
    {
      paramHashSet = new e.a();
      paramHashSet.iPZ = -1;
      paramHashSet.jrx = paramj.jrx;
      paramHashSet.jte = paramj.jsx;
      if (paramHashSet.jte.size() > 1)
      {
        paramHashSet.jtd = true;
        paramHashSet.jte = paramHashSet.jte.subList(0, 1);
      }
      this.jvp.add(paramHashSet);
    }
  }
  
  public final int getType()
  {
    return 128;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */