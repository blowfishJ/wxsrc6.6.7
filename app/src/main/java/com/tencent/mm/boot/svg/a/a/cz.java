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

public final class cz
  extends c
{
  private final int height = 134;
  private final int width = 134;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 134;
      return 134;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-4605512);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(67.0F, 134.0F);
      ((Path)localObject).cubicTo(104.003075F, 134.0F, 134.0F, 104.003075F, 134.0F, 67.0F);
      ((Path)localObject).cubicTo(134.0F, 29.996922F, 104.003075F, 0.0F, 67.0F, 0.0F);
      ((Path)localObject).cubicTo(29.996922F, 0.0F, 0.0F, 29.996922F, 0.0F, 67.0F);
      ((Path)localObject).cubicTo(0.0F, 104.003075F, 29.996922F, 134.0F, 67.0F, 134.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(67.0F, 133.0F);
      ((Path)localObject).cubicTo(103.45079F, 133.0F, 133.0F, 103.45079F, 133.0F, 67.0F);
      ((Path)localObject).cubicTo(133.0F, 30.549206F, 103.45079F, 1.0F, 67.0F, 1.0F);
      ((Path)localObject).cubicTo(30.549206F, 1.0F, 1.0F, 30.549206F, 1.0F, 67.0F);
      ((Path)localObject).cubicTo(1.0F, 103.45079F, 30.549206F, 133.0F, 67.0F, 133.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */