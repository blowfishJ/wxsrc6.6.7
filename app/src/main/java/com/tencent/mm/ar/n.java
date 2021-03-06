package com.tencent.mm.ar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.a.e;
import com.tencent.mm.bt.h;
import com.tencent.mm.plugin.m.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import junit.framework.Assert;

public final class n
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS packageinfo ( id int  PRIMARY KEY, version int  , name text  , size int  , packname text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE TABLE IF NOT EXISTS packageinfo2 ( localId text  PRIMARY KEY , id int  , version int  , name text  , size int  , packname text  , status int  , type int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  public h dCZ;
  
  public n(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public static String G(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return a.Gj() + paramString + "_chatting_bg_vertical.jpg";
    }
    return a.Gj() + paramString + "_chatting_bg_horizontal.jpg";
  }
  
  public static String Q(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 3: 
    case 4: 
      return G(paramString, true);
    }
    return G(paramString, false);
  }
  
  public static String Qm()
  {
    return a.Gj();
  }
  
  public static int bP(Context paramContext)
  {
    int j = 1;
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    int i;
    if (localDisplayMetrics.heightPixels > localDisplayMetrics.widthPixels)
    {
      i = 1;
      if (localDisplayMetrics.density > 1.0F) {
        break label65;
      }
      if (i == 0) {
        break label63;
      }
      j = 4;
    }
    label63:
    label65:
    while (i == 0)
    {
      return j;
      i = 0;
      break;
      return 2;
    }
    return 3;
  }
  
  public static String bj(int paramInt1, int paramInt2)
  {
    return paramInt1 + "_" + paramInt2 + "_thumb.jpg";
  }
  
  public final boolean a(m paramm)
  {
    if (paramm == null) {}
    do
    {
      return false;
      paramm.bWA = -1;
      paramm = paramm.wH();
    } while ((int)this.dCZ.insert("packageinfo2", "localId", paramm) == -1);
    doNotify();
    return true;
  }
  
  public final boolean b(m paramm)
  {
    if (paramm != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ContentValues localContentValues = paramm.wH();
      if (localContentValues.size() <= 0) {
        break;
      }
      if (this.dCZ.update("packageinfo2", localContentValues, "id= ? and type =?", new String[] { paramm.id, paramm.bPh }) <= 0) {
        break;
      }
      doNotify();
      return true;
    }
    doNotify();
    return false;
  }
  
  public final m bi(int paramInt1, int paramInt2)
  {
    m localm = null;
    Object localObject = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.id = \"" + bi.oU(String.valueOf(paramInt1)) + "\" and packageinfo2.type = \"" + bi.oU(String.valueOf(paramInt2)) + "\"";
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (localObject == null) {
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localm = new m();
      localm.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    return localm;
  }
  
  public final String bk(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    default: 
      return "";
    case 0: 
      return "";
    case 1: 
      return paramInt1 + "_session_bg.zip";
    case 2: 
      return paramInt1 + "_emoji_art.temp";
    case 8: 
      return paramInt1 + "_regiondata.temp";
    case 7: 
      return paramInt1 + "_configlist.cfg";
    case 9: 
      return "_speex_upload.cfg";
    case 12: 
      return "_rcpt_addr";
    case 18: 
      m localm = bi(paramInt1, paramInt2);
      return localm.version + "_feature.zip";
    case 5: 
      return "brand_i18n.apk";
    case 19: 
      return "_report_reason.temp";
    case 20: 
      return "_pluginDesc.cfg";
    case 21: 
      return "_trace_config.cfg";
    case 23: 
      return "permissioncfg.cfg";
    case 26: 
      return "ipcallCountryCodeConfig.cfg";
    }
    return paramInt1 + "_sensewhere.xml";
  }
  
  public final String bl(int paramInt1, int paramInt2)
  {
    Object localObject;
    switch (paramInt2)
    {
    default: 
      localObject = "";
    case 0: 
    case 1: 
      for (;;)
      {
        return (String)localObject;
        return "";
        String str2 = a.Gj() + paramInt1 + "_session_bg/";
        try
        {
          File localFile = new File(str2);
          localObject = str2;
          if (!localFile.exists())
          {
            localFile.mkdirs();
            return str2;
          }
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.PackageInfoStorage", "exception:%s", new Object[] { bi.i(localException) });
          x.e("MicroMsg.PackageInfoStorage", "can not create dir, dir = " + str2);
          return str2;
        }
      }
    case 2: 
      return "";
    }
    String str1 = bk(paramInt1, paramInt2);
    return a.Gj() + str1.replace(".zip", "");
  }
  
  public final void bm(int paramInt1, int paramInt2)
  {
    e.deleteFile(a.Gj() + bk(paramInt1, paramInt2));
    m localm = bi(paramInt1, paramInt2);
    if (localm != null)
    {
      localm.status = 5;
      r.Qp().b(localm);
    }
  }
  
  public final boolean ii(int paramInt)
  {
    String str = "update packageinfo2 set status = 2 where status = 1 and type = " + paramInt + ";";
    boolean bool = this.dCZ.fV("packageinfo2", str);
    doNotify();
    return bool;
  }
  
  public final boolean ij(int paramInt)
  {
    if (this.dCZ.delete("packageinfo2", "type =?", new String[] { String.valueOf(paramInt) }) > 0)
    {
      doNotify();
      return true;
    }
    return false;
  }
  
  public final m[] ik(int paramInt)
  {
    Object localObject = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=" + paramInt;
    localObject = this.dCZ.b((String)localObject, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (((Cursor)localObject).moveToNext())
    {
      m localm = new m();
      localm.d((Cursor)localObject);
      localArrayList.add(localm);
    }
    ((Cursor)localObject).close();
    return (m[])localArrayList.toArray(new m[localArrayList.size()]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ar/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */