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

public final class ahr
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
      Object localObject = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -392.0F, 0.0F, 1.0F, -141.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 392.0F, 0.0F, 1.0F, 141.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(60.0F, 0.0F);
      ((Path)localObject).lineTo(60.0F, 60.0F);
      ((Path)localObject).lineTo(0.0F, 60.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-5592406);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(30.0F, 16.0F);
      ((Path)localObject).cubicTo(22.16F, 16.0F, 16.0F, 22.16F, 16.0F, 30.0F);
      ((Path)localObject).cubicTo(16.0F, 37.84F, 22.16F, 44.0F, 30.0F, 44.0F);
      ((Path)localObject).cubicTo(37.84F, 44.0F, 44.0F, 37.84F, 44.0F, 30.0F);
      ((Path)localObject).cubicTo(44.0F, 22.16F, 37.84F, 16.0F, 30.0F, 16.0F);
      ((Path)localObject).lineTo(30.0F, 16.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(30.0F, 6.0F);
      ((Path)localObject).cubicTo(16.8F, 6.0F, 6.0F, 16.8F, 6.0F, 30.0F);
      ((Path)localObject).cubicTo(6.0F, 43.2F, 16.8F, 54.0F, 30.0F, 54.0F);
      ((Path)localObject).cubicTo(43.2F, 54.0F, 54.0F, 43.2F, 54.0F, 30.0F);
      ((Path)localObject).cubicTo(54.0F, 16.8F, 43.2F, 6.0F, 30.0F, 6.0F);
      ((Path)localObject).lineTo(30.0F, 6.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(10.0F, 30.0F);
      ((Path)localObject).cubicTo(10.0F, 19.0F, 19.0F, 10.0F, 30.0F, 10.0F);
      ((Path)localObject).cubicTo(41.0F, 10.0F, 50.0F, 19.0F, 50.0F, 30.0F);
      ((Path)localObject).cubicTo(50.0F, 41.0F, 41.0F, 50.0F, 30.0F, 50.0F);
      ((Path)localObject).cubicTo(19.0F, 50.0F, 10.0F, 41.0F, 10.0F, 30.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ahr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */