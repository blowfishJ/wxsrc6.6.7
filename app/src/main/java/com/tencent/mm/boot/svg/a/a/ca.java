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

public final class ca
  extends c
{
  private final int height = 90;
  private final int width = 90;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 90;
      return 90;
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
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-855310);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(90.0F, 0.0F);
      localPath.lineTo(90.0F, 90.0F);
      localPath.lineTo(0.0F, 90.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(29.25F, 16.59649F);
      ((Path)localObject2).cubicTo(29.25F, 9.496691F, 23.53672F, 3.75F, 16.5F, 3.75F);
      ((Path)localObject2).cubicTo(9.46328F, 3.75F, 3.75F, 9.496691F, 3.75F, 16.59649F);
      ((Path)localObject2).cubicTo(3.75F, 23.03143F, 7.8978143F, 30.246017F, 16.5F, 38.14612F);
      ((Path)localObject2).cubicTo(25.102188F, 30.246014F, 29.25F, 23.031427F, 29.25F, 16.59649F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(17.825495F, 41.99967F);
      ((Path)localObject2).cubicTo(17.068739F, 42.66942F, 15.931266F, 42.66942F, 15.174507F, 41.999672F);
      ((Path)localObject2).cubicTo(5.058169F, 33.046417F, 0.0F, 24.578691F, 0.0F, 16.59649F);
      ((Path)localObject2).cubicTo(4.3587476E-16F, 7.4305024F, 7.3873014F, 0.0F, 16.5F, 0.0F);
      ((Path)localObject2).cubicTo(25.612698F, 0.0F, 33.0F, 7.4305024F, 33.0F, 16.59649F);
      ((Path)localObject2).cubicTo(33.0F, 24.57869F, 27.941832F, 33.046417F, 17.825495F, 41.99967F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(16.5F, 19.614035F);
      ((Path)localObject2).cubicTo(18.156855F, 19.614035F, 19.5F, 18.263035F, 19.5F, 16.59649F);
      ((Path)localObject2).cubicTo(19.5F, 14.929948F, 18.156855F, 13.578947F, 16.5F, 13.578947F);
      ((Path)localObject2).cubicTo(14.843145F, 13.578947F, 13.5F, 14.929948F, 13.5F, 16.59649F);
      ((Path)localObject2).cubicTo(13.5F, 18.263035F, 14.843145F, 19.614035F, 16.5F, 19.614035F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(16.5F, 23.364035F);
      ((Path)localObject2).cubicTo(12.767167F, 23.364035F, 9.75F, 20.329224F, 9.75F, 16.59649F);
      ((Path)localObject2).cubicTo(9.75F, 12.863759F, 12.767167F, 9.828947F, 16.5F, 9.828947F);
      ((Path)localObject2).cubicTo(20.232832F, 9.828947F, 23.25F, 12.863759F, 23.25F, 16.59649F);
      ((Path)localObject2).cubicTo(23.25F, 20.329224F, 20.232832F, 23.364035F, 16.5F, 23.364035F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */