package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.g.c;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.Iterator;
import java.util.List;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  public SQLiteStatement jva;
  public SQLiteStatement jvb;
  private SQLiteStatement jvc;
  public SQLiteStatement jvd;
  public SQLiteStatement jve;
  private SQLiteStatement jvf;
  public SQLiteStatement jvg;
  
  protected final void BR()
  {
    if (BS()) {
      this.jpT.t(-102L, 4L);
    }
    this.jpT.execSQL("CREATE TABLE IF NOT EXISTS FTS5ChatRoomMembers (chatroom TEXT, member TEXT);");
    this.jpT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_chatroom ON FTS5ChatRoomMembers(chatroom);");
    this.jpT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_member ON FTS5ChatRoomMembers(member);");
    this.jpT.execSQL("CREATE TABLE IF NOT EXISTS FTS5ContactLabels (user TEXT, label_id INTEGER);");
    this.jpT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_user ON FTS5ContactLabels(user);");
    this.jpT.execSQL("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_label ON FTS5ContactLabels(label_id);");
    this.jva = this.jpT.compileStatement("INSERT INTO FTS5ChatRoomMembers (chatroom, member) VALUES (?, ?);");
    this.jvb = this.jpT.compileStatement("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=? AND member=?;");
    this.jvc = this.jpT.compileStatement("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=?;");
    this.jvd = this.jpT.compileStatement("INSERT INTO FTS5ContactLabels (user, label_id) VALUES (?, ?);");
    this.jve = this.jpT.compileStatement("DELETE FROM FTS5ContactLabels WHERE user=? AND label_id=?;");
    this.jvf = this.jpT.compileStatement("DELETE FROM FTS5ContactLabels WHERE user=?;");
    this.jvg = this.jpT.compileStatement("SELECT changes();");
  }
  
  protected final boolean BS()
  {
    return !cE(-102, 4);
  }
  
  protected final boolean BT()
  {
    super.BT();
    this.jva.close();
    this.jvb.close();
    this.jvc.close();
    this.jvd.close();
    this.jve.close();
    this.jvf.close();
    this.jvg.close();
    return true;
  }
  
  public final void CI(String paramString)
  {
    this.jvf.bindString(1, paramString);
    this.jvf.execute();
  }
  
  public final Cursor CJ(String paramString)
  {
    return this.jpT.rawQuery("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers WHERE member=?;", new String[] { paramString });
  }
  
  public final void CK(String paramString)
  {
    this.jvc.bindString(1, paramString);
    this.jvc.execute();
  }
  
  public final Cursor a(g paramg, String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    String str = paramg.aQa();
    if (bi.oW(paramString))
    {
      paramg = "";
      if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length <= 0)) {
        break label184;
      }
      paramString = " AND type IN " + d.l(paramArrayOfInt1);
      label45:
      if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length <= 0)) {
        break label190;
      }
    }
    label184:
    label190:
    for (paramArrayOfInt1 = " AND subtype IN " + d.l(paramArrayOfInt2);; paramArrayOfInt1 = "")
    {
      paramg = String.format("SELECT aux_index, type, subtype FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + paramg + paramString + paramArrayOfInt1 + " AND status >= 0 ORDER BY subtype;", new Object[] { aPU(), aPV(), aPU(), aPV(), aPV(), str });
      return this.jpT.rawQuery(paramg, null);
      paramg = String.format(" AND aux_index = '%s'", new Object[] { paramString });
      break;
      paramString = "";
      break label45;
    }
  }
  
  protected final String aLZ()
  {
    return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", new Object[] { aPU() });
  }
  
  protected final boolean aPW()
  {
    return true;
  }
  
  public final boolean b(g paramg)
  {
    String str1 = aPU();
    String str2 = aPV();
    String str3 = aPU();
    String str4 = aPV();
    String str5 = aPV();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramg.jrZ.size())
    {
      localStringBuffer.append("(");
      localStringBuffer.append(((g.c)paramg.jrZ.get(i)).aQb());
      localStringBuffer.append(")");
      if (i != paramg.jrZ.size() - 1) {
        localStringBuffer.append(" OR ");
      }
      i += 1;
    }
    paramg = String.format("SELECT 1 FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type=131072 LIMIT 1;", new Object[] { str1, str2, str3, str4, str5, localStringBuffer.toString() });
    paramg = this.jpT.rawQuery(paramg, null);
    boolean bool = paramg.moveToNext();
    paramg.close();
    return bool;
  }
  
  public final String getName()
  {
    return "FTS5ContactStorage";
  }
  
  public final int getPriority()
  {
    return 3;
  }
  
  protected final String getTableName()
  {
    return "Contact";
  }
  
  public final int getType()
  {
    return 3;
  }
  
  public final void h(String paramString, List<Long> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {}
    boolean bool;
    do
    {
      return;
      bool = this.jpT.inTransaction();
      if (!bool) {
        this.jpT.beginTransaction();
      }
      this.jvd.bindString(1, paramString);
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        long l = ((Long)paramString.next()).longValue();
        this.jvd.bindLong(2, l);
        this.jvd.execute();
      }
    } while (bool);
    this.jpT.commit();
  }
  
  public final void j(String paramString, String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {}
    boolean bool;
    do
    {
      return;
      bool = this.jpT.inTransaction();
      if (!bool) {
        this.jpT.beginTransaction();
      }
      this.jva.bindString(1, paramString);
      int j = paramArrayOfString.length;
      int i = 0;
      while (i < j)
      {
        paramString = paramArrayOfString[i];
        this.jva.bindString(2, paramString);
        this.jva.execute();
        i += 1;
      }
    } while (bool);
    this.jpT.commit();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */