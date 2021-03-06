package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bp.a;
import com.tencent.mm.ui.base.preference.Preference;

public class AddFriendItemPreference
  extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height = -1;
  private String mQi = "";
  private int mQj = -1;
  int mQk = 8;
  
  public AddFriendItemPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(R.i.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(R.h.image_iv);
    if (localObject != null)
    {
      ((ImageView)localObject).setVisibility(8);
      if (this.drawable == null) {
        break label128;
      }
      ((ImageView)localObject).setImageDrawable(this.drawable);
      ((ImageView)localObject).setVisibility(0);
    }
    for (;;)
    {
      localObject = (LinearLayout)paramView.findViewById(R.h.mm_preference_ll_id);
      if (this.height != -1) {
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      }
      paramView = (TextView)paramView.findViewById(R.h.text_tv_one);
      if (paramView != null)
      {
        paramView.setVisibility(this.mQk);
        paramView.setText(this.mQi);
        if (this.mQj != -1) {
          paramView.setBackgroundDrawable(a.f(this.context, this.mQj));
        }
      }
      return;
      label128:
      if (this.hh != null)
      {
        ((ImageView)localObject).setImageDrawable(this.hh);
        ((ImageView)localObject).setVisibility(0);
      }
      else if (this.Hu != 0)
      {
        ((ImageView)localObject).setImageResource(this.Hu);
        ((ImageView)localObject).setVisibility(0);
      }
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.mm_preference_content_add_friend_item, localViewGroup);
    localViewGroup.setPadding(0, localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), localViewGroup.getPaddingBottom());
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendItemPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */