package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ft
  extends c
{
  private final int height = 60;
  private final int width = 60;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 60;
      return 60;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.f(paramVarArgs);
      c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.i(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(11.0F, 15.0F);
      localPath.lineTo(44.0F, 15.0F);
      localPath.lineTo(44.0F, 48.0F);
      localPath.lineTo(11.0F, 48.0F);
      localPath.lineTo(11.0F, 15.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-2012855);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(30.0F, 28.37868F);
      ((Path)localObject).lineTo(20.454058F, 18.832739F);
      ((Path)localObject).lineTo(18.332739F, 20.954058F);
      ((Path)localObject).lineTo(27.87868F, 30.5F);
      ((Path)localObject).lineTo(18.332739F, 40.04594F);
      ((Path)localObject).lineTo(20.454058F, 42.167263F);
      ((Path)localObject).lineTo(30.0F, 32.62132F);
      ((Path)localObject).lineTo(39.54594F, 42.167263F);
      ((Path)localObject).lineTo(41.667263F, 40.04594F);
      ((Path)localObject).lineTo(32.12132F, 30.5F);
      ((Path)localObject).lineTo(41.667263F, 20.954058F);
      ((Path)localObject).lineTo(39.54594F, 18.832739F);
      ((Path)localObject).lineTo(30.0F, 28.37868F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(30.0F, 60.0F);
      ((Path)localObject).cubicTo(13.4314575F, 60.0F, 0.0F, 46.568542F, 0.0F, 30.0F);
      ((Path)localObject).cubicTo(0.0F, 13.4314575F, 13.4314575F, 0.0F, 30.0F, 0.0F);
      ((Path)localObject).cubicTo(46.568542F, 0.0F, 60.0F, 13.4314575F, 60.0F, 30.0F);
      ((Path)localObject).cubicTo(60.0F, 46.568542F, 46.568542F, 60.0F, 30.0F, 60.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */