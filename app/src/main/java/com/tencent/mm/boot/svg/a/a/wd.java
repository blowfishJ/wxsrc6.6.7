package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class wd
  extends c
{
  private final int height = 36;
  private final int width = 36;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 36;
      return 36;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Paint localPaint1 = c.i(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.i(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -3864.0F, 0.0F, 1.0F, -2672.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3855.0F, 0.0F, 1.0F, 2663.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(42.0F, 12.0F);
      ((Path)localObject2).lineTo(42.0F, 24.0F);
      ((Path)localObject2).lineTo(45.0F, 24.0F);
      ((Path)localObject2).lineTo(45.0F, 10.5F);
      ((Path)localObject2).lineTo(45.0F, 9.0F);
      ((Path)localObject2).lineTo(30.0F, 9.0F);
      ((Path)localObject2).lineTo(30.0F, 12.0F);
      ((Path)localObject2).lineTo(42.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(12.0F, 42.0F);
      ((Path)localObject2).lineTo(12.0F, 30.0F);
      ((Path)localObject2).lineTo(9.0F, 30.0F);
      ((Path)localObject2).lineTo(9.0F, 43.5F);
      ((Path)localObject2).lineTo(9.0F, 45.0F);
      ((Path)localObject2).lineTo(24.0F, 45.0F);
      ((Path)localObject2).lineTo(24.0F, 42.0F);
      ((Path)localObject2).lineTo(12.0F, 42.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/wd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */