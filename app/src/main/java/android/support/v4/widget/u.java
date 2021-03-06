package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public final class u
{
  private static final Interpolator vY = new Interpolator()
  {
    public final float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
    }
  };
  private int[] CA;
  private int[] CB;
  private int CC;
  private float CD;
  float CE;
  int CF;
  int CG;
  private final a CH;
  View CI;
  private boolean CJ;
  private final ViewGroup CK;
  private final Runnable CL = new Runnable()
  {
    public final void run()
    {
      u.this.aB(0);
    }
  };
  int Cu;
  float[] Cv;
  float[] Cw;
  float[] Cx;
  float[] Cy;
  private int[] Cz;
  private VelocityTracker cE;
  private int cF = -1;
  private q fT;
  public int fW;
  
  private u(Context paramContext, ViewGroup paramViewGroup, a parama)
  {
    if (paramViewGroup == null) {
      throw new IllegalArgumentException("Parent view may not be null");
    }
    if (parama == null) {
      throw new IllegalArgumentException("Callback may not be null");
    }
    this.CK = paramViewGroup;
    this.CH = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.CF = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.fW = paramViewGroup.getScaledTouchSlop();
    this.CD = paramViewGroup.getScaledMaximumFlingVelocity();
    this.CE = paramViewGroup.getScaledMinimumFlingVelocity();
    this.fT = q.a(paramContext, vY);
  }
  
  public static u a(ViewGroup paramViewGroup, float paramFloat, a parama)
  {
    paramViewGroup = a(paramViewGroup, parama);
    paramViewGroup.fW = ((int)(paramViewGroup.fW * (1.0F / paramFloat)));
    return paramViewGroup;
  }
  
  public static u a(ViewGroup paramViewGroup, a parama)
  {
    return new u(paramViewGroup.getContext(), paramViewGroup, parama);
  }
  
  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int j = 0;
    if ((this.Cv == null) || (this.Cv.length <= paramInt))
    {
      localObject = new float[paramInt + 1];
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (this.Cv != null)
      {
        System.arraycopy(this.Cv, 0, localObject, 0, this.Cv.length);
        System.arraycopy(this.Cw, 0, arrayOfFloat1, 0, this.Cw.length);
        System.arraycopy(this.Cx, 0, arrayOfFloat2, 0, this.Cx.length);
        System.arraycopy(this.Cy, 0, arrayOfFloat3, 0, this.Cy.length);
        System.arraycopy(this.Cz, 0, arrayOfInt1, 0, this.Cz.length);
        System.arraycopy(this.CA, 0, arrayOfInt2, 0, this.CA.length);
        System.arraycopy(this.CB, 0, arrayOfInt3, 0, this.CB.length);
      }
      this.Cv = ((float[])localObject);
      this.Cw = arrayOfFloat1;
      this.Cx = arrayOfFloat2;
      this.Cy = arrayOfFloat3;
      this.Cz = arrayOfInt1;
      this.CA = arrayOfInt2;
      this.CB = arrayOfInt3;
    }
    Object localObject = this.Cv;
    this.Cx[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = this.Cw;
    this.Cy[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = this.Cz;
    int m = (int)paramFloat1;
    int k = (int)paramFloat2;
    if (m < this.CK.getLeft() + this.CF) {
      j = 1;
    }
    int i = j;
    if (k < this.CK.getTop() + this.CF) {
      i = j | 0x4;
    }
    j = i;
    if (m > this.CK.getRight() - this.CF) {
      j = i | 0x2;
    }
    i = j;
    if (k > this.CK.getBottom() - this.CF) {
      i = j | 0x8;
    }
    localObject[paramInt] = i;
    this.CC |= 1 << paramInt;
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    if (((this.Cz[paramInt1] & paramInt2) != paramInt2) || ((this.CG & paramInt2) == 0) || ((this.CB[paramInt1] & paramInt2) == paramInt2) || ((this.CA[paramInt1] & paramInt2) == paramInt2) || ((paramFloat1 <= this.fW) && (paramFloat2 <= this.fW))) {}
    while (((this.CA[paramInt1] & paramInt2) != 0) || (paramFloat1 <= this.fW)) {
      return false;
    }
    return true;
  }
  
  private boolean aC(int paramInt)
  {
    if (!aA(paramInt))
    {
      new StringBuilder("Ignoring pointerId=").append(paramInt).append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
      return false;
    }
    return true;
  }
  
  private void az(int paramInt)
  {
    if (this.Cv == null) {
      return;
    }
    this.Cv[paramInt] = 0.0F;
    this.Cw[paramInt] = 0.0F;
    this.Cx[paramInt] = 0.0F;
    this.Cy[paramInt] = 0.0F;
    this.Cz[paramInt] = 0;
    this.CA[paramInt] = 0;
    this.CB[paramInt] = 0;
    this.CC &= (1 << paramInt ^ 0xFFFFFFFF);
  }
  
  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int j = 1;
    if (a(paramFloat1, paramFloat2, paramInt, 1)) {}
    for (;;)
    {
      int i = j;
      if (a(paramFloat2, paramFloat1, paramInt, 4)) {
        i = j | 0x4;
      }
      j = i;
      if (a(paramFloat1, paramFloat2, paramInt, 2)) {
        j = i | 0x2;
      }
      i = j;
      if (a(paramFloat2, paramFloat1, paramInt, 8)) {
        i = j | 0x8;
      }
      if (i != 0)
      {
        int[] arrayOfInt = this.CA;
        arrayOfInt[paramInt] |= i;
        this.CH.t(i, paramInt);
      }
      return;
      j = 0;
    }
  }
  
  private boolean b(View paramView, float paramFloat1, float paramFloat2)
  {
    if (paramView == null) {}
    label20:
    int j;
    label72:
    label78:
    do
    {
      do
      {
        return false;
        int i;
        if (this.CH.s(paramView) > 0)
        {
          i = 1;
          if (this.CH.V() <= 0) {
            break label72;
          }
        }
        for (j = 1;; j = 0)
        {
          if ((i == 0) || (j == 0)) {
            break label78;
          }
          if (paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 <= this.fW * this.fW) {
            break;
          }
          return true;
          i = 0;
          break label20;
        }
        if (i == 0) {
          break;
        }
      } while (Math.abs(paramFloat1) <= this.fW);
      return true;
    } while ((j == 0) || (Math.abs(paramFloat2) <= this.fW));
    return true;
  }
  
  private void cY()
  {
    this.cE.computeCurrentVelocity(1000, this.CD);
    t(e(y.a(this.cE, this.cF), this.CE, this.CD), e(y.b(this.cE, this.cF), this.CE, this.CD));
  }
  
  private static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2) {
      paramFloat2 = 0.0F;
    }
    do
    {
      return paramFloat2;
      if (f <= paramFloat3) {
        break;
      }
      paramFloat2 = paramFloat3;
    } while (paramFloat1 > 0.0F);
    return -paramFloat3;
    return paramFloat1;
  }
  
  public static boolean e(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView == null) {}
    while ((paramInt1 < paramView.getLeft()) || (paramInt1 >= paramView.getRight()) || (paramInt2 < paramView.getTop()) || (paramInt2 >= paramView.getBottom())) {
      return false;
    }
    return true;
  }
  
  private boolean g(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.CI.getLeft();
    int j = this.CI.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.fT.abortAnimation();
      aB(0);
      return false;
    }
    View localView = this.CI;
    paramInt3 = k(paramInt3, (int)this.CE, (int)this.CD);
    paramInt4 = k(paramInt4, (int)this.CE, (int)this.CD);
    int k = Math.abs(paramInt1);
    int m = Math.abs(paramInt2);
    int n = Math.abs(paramInt3);
    int i1 = Math.abs(paramInt4);
    int i2 = n + i1;
    int i3 = k + m;
    float f1;
    if (paramInt3 != 0)
    {
      f1 = n / i2;
      if (paramInt4 == 0) {
        break label237;
      }
    }
    label237:
    for (float f2 = i1 / i2;; f2 = m / i3)
    {
      paramInt3 = j(paramInt1, paramInt3, this.CH.s(localView));
      paramInt4 = j(paramInt2, paramInt4, this.CH.V());
      float f3 = paramInt3;
      paramInt3 = (int)(f2 * paramInt4 + f1 * f3);
      this.fT.startScroll(i, j, paramInt1, paramInt2, paramInt3);
      aB(2);
      return true;
      f1 = k / i3;
      break;
    }
  }
  
  private void i(MotionEvent paramMotionEvent)
  {
    int j = o.f(paramMotionEvent);
    int i = 0;
    while (i < j)
    {
      int k = o.c(paramMotionEvent, i);
      float f1 = o.d(paramMotionEvent, i);
      float f2 = o.e(paramMotionEvent, i);
      this.Cx[k] = f1;
      this.Cy[k] = f2;
      i += 1;
    }
  }
  
  private int j(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    int i = this.CK.getWidth();
    int j = i / 2;
    float f3 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f1 = j;
    float f2 = j;
    f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {}
    for (paramInt1 = Math.round(Math.abs((f3 * f2 + f1) / paramInt2) * 1000.0F) * 4;; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F)) {
      return Math.min(paramInt1, 600);
    }
  }
  
  private static int k(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2) {
      paramInt2 = 0;
    }
    do
    {
      return paramInt2;
      if (i <= paramInt3) {
        break;
      }
      paramInt2 = paramInt3;
    } while (paramInt1 > 0);
    return -paramInt3;
    return paramInt1;
  }
  
  private boolean o(View paramView, int paramInt)
  {
    if ((paramView == this.CI) && (this.cF == paramInt)) {
      return true;
    }
    if ((paramView != null) && (this.CH.b(paramView, paramInt)))
    {
      this.cF = paramInt;
      n(paramView, paramInt);
      return true;
    }
    return false;
  }
  
  private void t(float paramFloat1, float paramFloat2)
  {
    this.CJ = true;
    this.CH.a(this.CI, paramFloat1, paramFloat2);
    this.CJ = false;
    if (this.Cu == 1) {
      aB(0);
    }
  }
  
  public final boolean aA(int paramInt)
  {
    return (this.CC & 1 << paramInt) != 0;
  }
  
  final void aB(int paramInt)
  {
    this.CK.removeCallbacks(this.CL);
    if (this.Cu != paramInt)
    {
      this.Cu = paramInt;
      this.CH.t(paramInt);
      if (this.Cu == 0) {
        this.CI = null;
      }
    }
  }
  
  public final void abort()
  {
    cancel();
    if (this.Cu == 2)
    {
      this.fT.getCurrX();
      this.fT.getCurrY();
      this.fT.abortAnimation();
      int i = this.fT.getCurrX();
      int j = this.fT.getCurrY();
      this.CH.a(this.CI, i, j);
    }
    aB(0);
  }
  
  public final boolean cX()
  {
    boolean bool2 = false;
    if (this.Cu == 2)
    {
      boolean bool3 = this.fT.computeScrollOffset();
      int i = this.fT.getCurrX();
      int j = this.fT.getCurrY();
      int k = i - this.CI.getLeft();
      int m = j - this.CI.getTop();
      if (k != 0) {
        z.k(this.CI, k);
      }
      if (m != 0) {
        z.j(this.CI, m);
      }
      if ((k != 0) || (m != 0)) {
        this.CH.a(this.CI, i, j);
      }
      bool1 = bool3;
      if (bool3)
      {
        bool1 = bool3;
        if (i == this.fT.getFinalX())
        {
          bool1 = bool3;
          if (j == this.fT.getFinalY())
          {
            this.fT.abortAnimation();
            bool1 = false;
          }
        }
      }
      if (!bool1) {
        this.CK.post(this.CL);
      }
    }
    boolean bool1 = bool2;
    if (this.Cu == 2) {
      bool1 = true;
    }
    return bool1;
  }
  
  public final void cancel()
  {
    this.cF = -1;
    if (this.Cv != null)
    {
      Arrays.fill(this.Cv, 0.0F);
      Arrays.fill(this.Cw, 0.0F);
      Arrays.fill(this.Cx, 0.0F);
      Arrays.fill(this.Cy, 0.0F);
      Arrays.fill(this.Cz, 0);
      Arrays.fill(this.CA, 0);
      Arrays.fill(this.CB, 0);
      this.CC = 0;
    }
    if (this.cE != null)
    {
      this.cE.recycle();
      this.cE = null;
    }
  }
  
  public final boolean d(View paramView, int paramInt1, int paramInt2)
  {
    this.CI = paramView;
    this.cF = -1;
    boolean bool = g(paramInt1, paramInt2, 0, 0);
    if ((!bool) && (this.Cu == 0) && (this.CI != null)) {
      this.CI = null;
    }
    return bool;
  }
  
  public final boolean j(MotionEvent paramMotionEvent)
  {
    int j = o.d(paramMotionEvent);
    int i = o.e(paramMotionEvent);
    if (j == 0) {
      cancel();
    }
    if (this.cE == null) {
      this.cE = VelocityTracker.obtain();
    }
    this.cE.addMovement(paramMotionEvent);
    switch (j)
    {
    }
    while (this.Cu == 1)
    {
      return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      i = o.c(paramMotionEvent, 0);
      a(f1, f2, i);
      paramMotionEvent = x((int)f1, (int)f2);
      if ((paramMotionEvent == this.CI) && (this.Cu == 2)) {
        o(paramMotionEvent, i);
      }
      if ((this.Cz[i] & this.CG) != 0)
      {
        this.CH.cH();
        continue;
        j = o.c(paramMotionEvent, i);
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        a(f1, f2, j);
        if (this.Cu == 0)
        {
          if ((this.Cz[j] & this.CG) != 0) {
            this.CH.cH();
          }
        }
        else if (this.Cu == 2)
        {
          paramMotionEvent = x((int)f1, (int)f2);
          if (paramMotionEvent == this.CI)
          {
            o(paramMotionEvent, j);
            continue;
            if ((this.Cv != null) && (this.Cw != null))
            {
              int k = o.f(paramMotionEvent);
              i = 0;
              if (i < k)
              {
                int m = o.c(paramMotionEvent, i);
                float f3;
                float f4;
                View localView;
                if (aC(m))
                {
                  f1 = o.d(paramMotionEvent, i);
                  f2 = o.e(paramMotionEvent, i);
                  f3 = f1 - this.Cv[m];
                  f4 = f2 - this.Cw[m];
                  localView = x((int)f1, (int)f2);
                  if ((localView == null) || (!b(localView, f3, f4))) {
                    break label551;
                  }
                }
                label551:
                for (j = 1;; j = 0)
                {
                  if (j != 0)
                  {
                    int n = localView.getLeft();
                    int i1 = (int)f3;
                    i1 = this.CH.d(localView, i1 + n);
                    int i2 = localView.getTop();
                    int i3 = (int)f4;
                    i3 = this.CH.c(localView, i3 + i2);
                    int i4 = this.CH.s(localView);
                    int i5 = this.CH.V();
                    if (((i4 == 0) || ((i4 > 0) && (i1 == n))) && ((i5 == 0) || ((i5 > 0) && (i3 == i2)))) {
                      break label557;
                    }
                  }
                  b(f3, f4, m);
                  if ((this.Cu == 1) || ((j != 0) && (o(localView, m)))) {
                    break label557;
                  }
                  i += 1;
                  break;
                }
              }
              label557:
              i(paramMotionEvent);
              continue;
              az(o.c(paramMotionEvent, i));
              continue;
              cancel();
            }
          }
        }
      }
    }
    return false;
  }
  
  public final void k(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    int m = o.d(paramMotionEvent);
    int k = o.e(paramMotionEvent);
    if (m == 0) {
      cancel();
    }
    if (this.cE == null) {
      this.cE = VelocityTracker.obtain();
    }
    this.cE.addMovement(paramMotionEvent);
    float f1;
    float f2;
    switch (m)
    {
    case 4: 
    default: 
    case 0: 
    case 5: 
    case 2: 
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              f1 = paramMotionEvent.getX();
              f2 = paramMotionEvent.getY();
              i = o.c(paramMotionEvent, 0);
              paramMotionEvent = x((int)f1, (int)f2);
              a(f1, f2, i);
              o(paramMotionEvent, i);
            } while ((this.Cz[i] & this.CG) == 0);
            this.CH.cH();
            return;
            i = o.c(paramMotionEvent, k);
            f1 = o.d(paramMotionEvent, k);
            f2 = o.e(paramMotionEvent, k);
            a(f1, f2, i);
            if (this.Cu != 0) {
              break;
            }
            o(x((int)f1, (int)f2), i);
          } while ((this.Cz[i] & this.CG) == 0);
          this.CH.cH();
          return;
          j = (int)f1;
          k = (int)f2;
        } while (!e(this.CI, j, k));
        o(this.CI, i);
        return;
        if (this.Cu != 1) {
          break;
        }
      } while (!aC(this.cF));
      i = o.b(paramMotionEvent, this.cF);
      f1 = o.d(paramMotionEvent, i);
      f2 = o.e(paramMotionEvent, i);
      m = (int)(f1 - this.Cx[this.cF]);
      int n = (int)(f2 - this.Cy[this.cF]);
      j = this.CI.getLeft() + m;
      k = this.CI.getTop() + n;
      int i2 = this.CI.getLeft();
      int i1 = this.CI.getTop();
      i = j;
      if (m != 0)
      {
        i = this.CH.d(this.CI, j);
        z.k(this.CI, i - i2);
      }
      j = k;
      if (n != 0)
      {
        j = this.CH.c(this.CI, k);
        z.j(this.CI, j - i1);
      }
      if ((m != 0) || (n != 0)) {
        this.CH.a(this.CI, i, j);
      }
      i(paramMotionEvent);
      return;
      k = o.f(paramMotionEvent);
      i = j;
      while (i < k)
      {
        j = o.c(paramMotionEvent, i);
        if (aC(j))
        {
          f1 = o.d(paramMotionEvent, i);
          f2 = o.e(paramMotionEvent, i);
          float f3 = f1 - this.Cv[j];
          float f4 = f2 - this.Cw[j];
          b(f3, f4, j);
          if (this.Cu == 1) {
            break;
          }
          View localView = x((int)f1, (int)f2);
          if ((b(localView, f3, f4)) && (o(localView, j))) {
            break;
          }
        }
        i += 1;
      }
      i(paramMotionEvent);
      return;
    case 6: 
      j = o.c(paramMotionEvent, k);
      if ((this.Cu == 1) && (j == this.cF))
      {
        k = o.f(paramMotionEvent);
        if (i >= k) {
          break label785;
        }
        m = o.c(paramMotionEvent, i);
        if (m == this.cF) {
          break label740;
        }
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        if ((x((int)f1, (int)f2) != this.CI) || (!o(this.CI, m))) {
          break label740;
        }
      }
      break;
    }
    label740:
    label785:
    for (i = this.cF;; i = -1)
    {
      if (i == -1) {
        cY();
      }
      az(j);
      return;
      i += 1;
      break;
      if (this.Cu == 1) {
        cY();
      }
      cancel();
      return;
      if (this.Cu == 1) {
        t(0.0F, 0.0F);
      }
      cancel();
      return;
    }
  }
  
  public final void n(View paramView, int paramInt)
  {
    if (paramView.getParent() != this.CK) {
      throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.CK + ")");
    }
    this.CI = paramView;
    this.cF = paramInt;
    this.CH.f(paramView, paramInt);
    aB(1);
  }
  
  public final boolean w(int paramInt1, int paramInt2)
  {
    if (!this.CJ) {
      throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    return g(paramInt1, paramInt2, (int)y.a(this.cE, this.cF), (int)y.b(this.cE, this.cF));
  }
  
  public final View x(int paramInt1, int paramInt2)
  {
    int i = this.CK.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = this.CK.getChildAt(i);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom())) {
        return localView;
      }
      i -= 1;
    }
    return null;
  }
  
  public static abstract class a
  {
    public int V()
    {
      return 0;
    }
    
    public void a(View paramView, float paramFloat1, float paramFloat2) {}
    
    public void a(View paramView, int paramInt1, int paramInt2) {}
    
    public abstract boolean b(View paramView, int paramInt);
    
    public int c(View paramView, int paramInt)
    {
      return 0;
    }
    
    public void cH() {}
    
    public int d(View paramView, int paramInt)
    {
      return 0;
    }
    
    public void f(View paramView, int paramInt) {}
    
    public int s(View paramView)
    {
      return 0;
    }
    
    public void t(int paramInt) {}
    
    public void t(int paramInt1, int paramInt2) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */