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

public final class ci
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(44.0F, 21.962822F);
      ((Path)localObject2).lineTo(44.0F, 4.0F);
      ((Path)localObject2).lineTo(4.0F, 4.0F);
      ((Path)localObject2).lineTo(4.0F, 20.913124F);
      ((Path)localObject2).lineTo(14.878189F, 12.518221F);
      ((Path)localObject2).cubicTo(15.9883175F, 11.620444F, 17.771101F, 11.663985F, 18.841188F, 12.6042F);
      ((Path)localObject2).lineTo(29.616116F, 22.07142F);
      ((Path)localObject2).lineTo(35.061848F, 17.385994F);
      ((Path)localObject2).cubicTo(36.17116F, 16.44265F, 37.936134F, 16.461815F, 39.013035F, 17.428202F);
      ((Path)localObject2).lineTo(44.0F, 21.962822F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(44.0F, 29.16303F);
      ((Path)localObject2).lineTo(44.0F, 27.369196F);
      ((Path)localObject2).lineTo(36.995003F, 20.999496F);
      ((Path)localObject2).lineTo(32.650444F, 24.737488F);
      ((Path)localObject2).lineTo(34.997852F, 26.8F);
      ((Path)localObject2).lineTo(28.937702F, 26.8F);
      ((Path)localObject2).lineTo(16.771114F, 16.110018F);
      ((Path)localObject2).lineTo(4.0F, 25.965727F);
      ((Path)localObject2).lineTo(4.0F, 32.0F);
      ((Path)localObject2).lineTo(44.0F, 32.0F);
      ((Path)localObject2).lineTo(44.0F, 29.16303F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(-2.220446E-15F, 2.4F);
      ((Path)localObject2).cubicTo(-2.382771E-15F, 1.0745167F, 1.0745167F, 2.4348735E-16F, 2.4F, 0.0F);
      ((Path)localObject2).lineTo(45.6F, -2.220446E-15F);
      ((Path)localObject2).cubicTo(46.925484F, -2.4639335E-15F, 48.0F, 1.0745167F, 48.0F, 2.4F);
      ((Path)localObject2).lineTo(48.0F, 33.6F);
      ((Path)localObject2).cubicTo(48.0F, 34.925484F, 46.925484F, 36.0F, 45.6F, 36.0F);
      ((Path)localObject2).lineTo(2.4F, 36.0F);
      ((Path)localObject2).cubicTo(1.0745167F, 36.0F, 1.623249E-16F, 34.925484F, 0.0F, 33.6F);
      ((Path)localObject2).lineTo(-2.220446E-15F, 2.4F);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */