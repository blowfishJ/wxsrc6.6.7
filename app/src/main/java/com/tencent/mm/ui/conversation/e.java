package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.f;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.f;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.bizchat.BizChatConversationUI;
import junit.framework.Assert;

public final class e
  implements AdapterView.OnItemClickListener
{
  private Activity activity;
  private g unL;
  private ListView unh;
  
  public e(g paramg, ListView paramListView, Activity paramActivity)
  {
    this.unL = paramg;
    this.unh = paramListView;
    this.activity = paramActivity;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool = false;
    if (paramInt < this.unh.getHeaderViewsCount()) {}
    for (;;)
    {
      return;
      paramInt -= this.unh.getHeaderViewsCount();
      paramAdapterView = (ai)this.unL.Dy(paramInt);
      if (paramAdapterView == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConversationClickListener", "null user at position = " + paramInt);
        return;
      }
      if (paramAdapterView.gh(16777216))
      {
        paramAdapterView.gg(16777216);
        au.HU();
        c.FW().a(paramAdapterView, paramAdapterView.field_username);
      }
      if (paramAdapterView.gh(33554432))
      {
        paramAdapterView.gg(33554432);
        au.HU();
        c.FW().a(paramAdapterView, paramAdapterView.field_username);
      }
      if (com.tencent.mm.model.s.hk(paramAdapterView.field_username)) {
        if (q.GX())
        {
          d.A(this.activity, "tmessage", ".ui.TConversationUI");
          paramInt = 0;
        }
      }
      while (paramInt != 0)
      {
        com.tencent.mm.plugin.report.service.g.vu(9);
        paramView = (LauncherUI)this.activity;
        if (paramView != null) {
          bool = true;
        }
        Assert.assertTrue("Launcher should not be empty.", bool);
        paramView.startChatting(paramAdapterView.field_username, null, true);
        return;
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        paramInt = 0;
        continue;
        if (com.tencent.mm.model.s.hl(paramAdapterView.field_username))
        {
          if (q.GW())
          {
            d.A(this.activity, "bottle", ".ui.BottleConversationUI");
            paramInt = 0;
          }
          else
          {
            d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            paramInt = 0;
          }
        }
        else if (com.tencent.mm.model.s.hq(paramAdapterView.field_username))
        {
          MMAppMgr.cancelNotification(paramAdapterView.field_username);
          d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          paramInt = 0;
        }
        else
        {
          if (com.tencent.mm.model.s.hi(paramAdapterView.field_username))
          {
            com.tencent.mm.kernel.g.Ek();
            if (bi.f((Integer)com.tencent.mm.kernel.g.Ei().DT().get(17, null)) == 1) {}
            for (paramInt = 1;; paramInt = 0)
            {
              if (paramInt != 0) {
                break label1120;
              }
              d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
              paramInt = 0;
              break;
            }
          }
          if (!com.tencent.mm.model.s.hw(paramAdapterView.field_username))
          {
            if (com.tencent.mm.model.s.hv(paramAdapterView.field_username))
            {
              if (q.Hc())
              {
                paramView = new Intent();
                paramView.addFlags(67108864);
                paramView.putExtra("type", 20);
                d.b(this.activity, "readerapp", ".ui.ReaderAppUI", paramView);
                paramInt = 0;
              }
              else
              {
                d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
                paramInt = 0;
              }
            }
            else if (com.tencent.mm.model.s.hD(paramAdapterView.field_username))
            {
              if (q.Hd())
              {
                paramView = new Intent();
                paramView.addFlags(67108864);
                paramView.putExtra("type", 11);
                d.b(this.activity, "readerapp", ".ui.ReaderAppUI", paramView);
                paramInt = 0;
              }
              else
              {
                d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
                paramInt = 0;
              }
            }
            else if (com.tencent.mm.model.s.hn(paramAdapterView.field_username))
            {
              d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
              paramInt = 0;
            }
            else if (com.tencent.mm.model.s.ho(paramAdapterView.field_username))
            {
              if (q.Hf())
              {
                paramView = new Intent().addFlags(67108864);
                d.b(this.activity, "masssend", ".ui.MassSendHistoryUI", paramView);
                paramInt = 0;
              }
              else
              {
                d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
                paramInt = 0;
              }
            }
            else if (com.tencent.mm.model.s.hC(paramAdapterView.field_username))
            {
              if (am.a.dBu != null) {
                am.a.dBu.ix(paramAdapterView.field_username);
              }
              paramInt = 1;
            }
            else if (com.tencent.mm.model.s.hE(paramAdapterView.field_username))
            {
              if (com.tencent.mm.storage.s.auK())
              {
                this.activity.startActivity(new Intent(this.activity, BizTimeLineUI.class));
                paramInt = 0;
              }
              else
              {
                this.activity.startActivity(new Intent(this.activity, BizConversationUI.class));
                paramInt = 0;
              }
            }
            else if ((com.tencent.mm.model.s.hf(paramAdapterView.field_username)) && (f.kM(paramAdapterView.field_username)))
            {
              if (!com.tencent.mm.model.s.he(paramAdapterView.field_username))
              {
                h.bA(this.activity, this.activity.getString(R.l.enterprise_not_contact));
                return;
              }
              paramView = new Intent(this.activity, EnterpriseConversationUI.class);
              paramView.putExtra("enterprise_biz_name", paramAdapterView.field_username);
              paramView.putExtra("enterprise_biz_display_name", r.gT(paramAdapterView.field_username));
              paramView.putExtra("enterprise_from_scene", 1);
              this.activity.startActivity(paramView);
              paramInt = 0;
            }
            else if ((com.tencent.mm.model.s.hf(paramAdapterView.field_username)) && (f.eZ(paramAdapterView.field_username)))
            {
              if (!com.tencent.mm.model.s.he(paramAdapterView.field_username))
              {
                h.bA(this.activity, this.activity.getString(R.l.enterprise_not_contact));
                return;
              }
              paramView = new Intent(this.activity, BizChatConversationUI.class);
              paramView.putExtra("Contact_User", paramAdapterView.field_username);
              paramView.putExtra("biz_chat_from_scene", 1);
              paramView.addFlags(67108864);
              this.activity.startActivity(paramView);
              paramInt = 0;
            }
            else if (com.tencent.mm.model.s.hN(paramAdapterView.field_username))
            {
              paramView = new Intent();
              paramView.setClassName(this.activity, "com.tencent.mm.ui.conversation.AppBrandServiceConversationUI");
              paramView.putExtra("Contact_User", paramAdapterView.field_username);
              paramView.putExtra("app_brand_conversation_from_scene", 1);
              paramView.addFlags(67108864);
              this.activity.startActivity(paramView);
              paramInt = 0;
            }
            else
            {
              label1120:
              paramInt = 1;
            }
          }
          else {
            paramInt = 0;
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/conversation/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */