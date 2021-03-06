package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class at
{
  boolean bVR = false;
  Object lock = new byte[0];
  String name = "";
  int priority = 1;
  public LinkedBlockingQueue<a> sIl = new LinkedBlockingQueue();
  private int sIm = 1;
  Vector<b> sIn = new Vector();
  ag sIo;
  
  public at(int paramInt, String paramString)
  {
    this(paramInt, paramString, 1);
  }
  
  public at(int paramInt1, String paramString, int paramInt2)
  {
    this(paramInt1, paramString, paramInt2, Looper.myLooper());
  }
  
  public at(int paramInt1, String paramString, int paramInt2, Looper paramLooper)
  {
    this.sIm = paramInt2;
    this.name = paramString;
    this.priority = paramInt1;
    paramString = paramLooper;
    if (paramLooper == null)
    {
      paramString = paramLooper;
      if (Looper.getMainLooper() != null)
      {
        paramString = Looper.getMainLooper();
        x.i("QueueWorkerThread.QueueWorkerThread", "looper is null use MainLooper!");
      }
    }
    this.sIo = new ag(paramString)
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        if ((paramAnonymousMessage != null) && (paramAnonymousMessage.obj != null)) {
          ((at.a)paramAnonymousMessage.obj).Ks();
        }
      }
    };
  }
  
  public final int c(a parama)
  {
    int j = 0;
    int i;
    if (parama == null)
    {
      x.e("QueueWorkerThread.QueueWorkerThread", "add empty thread object");
      i = -1;
    }
    do
    {
      do
      {
        return i;
        try
        {
          if (!this.sIl.offer(parama, 1L, TimeUnit.MILLISECONDS))
          {
            x.e("QueueWorkerThread.QueueWorkerThread", "add To Queue failed");
            return -2;
          }
        }
        catch (Exception parama)
        {
          x.e("QueueWorkerThread.QueueWorkerThread", "add To Queue failed :" + parama.getMessage());
          x.printErrStackTrace("QueueWorkerThread.QueueWorkerThread", parama, "", new Object[0]);
          return -3;
        }
        if (this.sIn.size() == 0) {
          break;
        }
        i = j;
      } while (this.sIl.size() <= 0);
      i = j;
    } while (this.sIm <= this.sIn.size());
    new b((byte)0).start();
    return 0;
  }
  
  @Deprecated
  public final boolean ciz()
  {
    return (this.sIn == null) || (this.sIn.size() == 0);
  }
  
  public final void lh(boolean paramBoolean)
  {
    synchronized (this.lock)
    {
      this.bVR = paramBoolean;
      if (!paramBoolean) {}
      synchronized (this.lock)
      {
        this.lock.notifyAll();
        return;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean Kr();
    
    public abstract boolean Ks();
  }
  
  final class b
    extends Thread
  {
    private int pVu = 60;
    
    private b()
    {
      super();
      setPriority(at.this.priority);
      at.this.sIn.add(this);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 24	com/tencent/mm/sdk/platformtools/at$b:pVu	I
      //   4: ifle +152 -> 156
      //   7: aload_0
      //   8: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   11: getfield 53	com/tencent/mm/sdk/platformtools/at:lock	Ljava/lang/Object;
      //   14: astore_1
      //   15: aload_1
      //   16: monitorenter
      //   17: aload_0
      //   18: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   21: getfield 57	com/tencent/mm/sdk/platformtools/at:bVR	Z
      //   24: ifeq +13 -> 37
      //   27: aload_0
      //   28: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   31: getfield 53	com/tencent/mm/sdk/platformtools/at:lock	Ljava/lang/Object;
      //   34: invokevirtual 62	java/lang/Object:wait	()V
      //   37: aload_1
      //   38: monitorexit
      //   39: aload_0
      //   40: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   43: getfield 66	com/tencent/mm/sdk/platformtools/at:sIl	Ljava/util/concurrent/LinkedBlockingQueue;
      //   46: ldc2_w 67
      //   49: getstatic 74	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
      //   52: invokevirtual 80	java/util/concurrent/LinkedBlockingQueue:poll	(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
      //   55: checkcast 82	com/tencent/mm/sdk/platformtools/at$a
      //   58: astore_1
      //   59: aload_1
      //   60: ifnonnull +55 -> 115
      //   63: aload_0
      //   64: aload_0
      //   65: getfield 24	com/tencent/mm/sdk/platformtools/at$b:pVu	I
      //   68: iconst_1
      //   69: isub
      //   70: putfield 24	com/tencent/mm/sdk/platformtools/at$b:pVu	I
      //   73: goto -73 -> 0
      //   76: astore_2
      //   77: ldc 84
      //   79: aload_2
      //   80: ldc 86
      //   82: iconst_0
      //   83: anewarray 59	java/lang/Object
      //   86: invokestatic 92	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   89: goto -52 -> 37
      //   92: astore_2
      //   93: aload_1
      //   94: monitorexit
      //   95: aload_2
      //   96: athrow
      //   97: astore_1
      //   98: ldc 84
      //   100: aload_1
      //   101: ldc 86
      //   103: iconst_0
      //   104: anewarray 59	java/lang/Object
      //   107: invokestatic 92	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   110: aconst_null
      //   111: astore_1
      //   112: goto -53 -> 59
      //   115: aload_0
      //   116: bipush 60
      //   118: putfield 24	com/tencent/mm/sdk/platformtools/at$b:pVu	I
      //   121: aload_1
      //   122: invokeinterface 96 1 0
      //   127: ifeq -127 -> 0
      //   130: aload_0
      //   131: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   134: getfield 100	com/tencent/mm/sdk/platformtools/at:sIo	Lcom/tencent/mm/sdk/platformtools/ag;
      //   137: aload_0
      //   138: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   141: getfield 100	com/tencent/mm/sdk/platformtools/at:sIo	Lcom/tencent/mm/sdk/platformtools/ag;
      //   144: iconst_0
      //   145: aload_1
      //   146: invokevirtual 106	com/tencent/mm/sdk/platformtools/ag:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   149: invokevirtual 110	com/tencent/mm/sdk/platformtools/ag:sendMessage	(Landroid/os/Message;)Z
      //   152: pop
      //   153: goto -153 -> 0
      //   156: aload_0
      //   157: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   160: getfield 35	com/tencent/mm/sdk/platformtools/at:sIn	Ljava/util/Vector;
      //   163: aload_0
      //   164: invokevirtual 113	java/util/Vector:remove	(Ljava/lang/Object;)Z
      //   167: pop
      //   168: ldc 84
      //   170: new 115	java/lang/StringBuilder
      //   173: dup
      //   174: ldc 117
      //   176: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   179: aload_0
      //   180: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   183: getfield 66	com/tencent/mm/sdk/platformtools/at:sIl	Ljava/util/concurrent/LinkedBlockingQueue;
      //   186: invokevirtual 122	java/util/concurrent/LinkedBlockingQueue:size	()I
      //   189: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   192: ldc -128
      //   194: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   197: aload_0
      //   198: getfield 15	com/tencent/mm/sdk/platformtools/at$b:sIp	Lcom/tencent/mm/sdk/platformtools/at;
      //   201: getfield 35	com/tencent/mm/sdk/platformtools/at:sIn	Ljava/util/Vector;
      //   204: invokevirtual 132	java/util/Vector:size	()I
      //   207: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   210: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   213: invokestatic 140	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   216: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	217	0	this	b
      //   14	80	1	localObject1	Object
      //   97	4	1	localException1	Exception
      //   111	35	1	localObject2	Object
      //   76	4	2	localException2	Exception
      //   92	4	2	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   17	37	76	java/lang/Exception
      //   17	37	92	finally
      //   37	39	92	finally
      //   77	89	92	finally
      //   93	95	92	finally
      //   39	59	97	java/lang/Exception
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */