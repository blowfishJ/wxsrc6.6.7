package com.tencent.mm.plugin.talkroom.component;

import android.media.AudioTrack;
import android.os.Looper;
import com.tencent.mm.compatible.b.d;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.plugin.talkroom.model.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends e.a
  implements Runnable
{
  private static final int ovJ = a.ovJ;
  private AudioTrack aga;
  private boolean bBa = false;
  private boolean bPd = true;
  private int bufferSize = ovJ / 1000 * 20 * 2;
  private boolean ept = false;
  private boolean erb = true;
  private ag handler = new ag(Looper.getMainLooper());
  private int kDD = 0;
  private final Object lock = new Object();
  private int ovK = ovJ;
  private final c ovL;
  private boolean ovM = false;
  private long ovN = 0L;
  private int ovO;
  private long ovP = 0L;
  private v2engine ovu;
  private short ovv;
  private short ovw;
  
  public h(v2engine paramv2engine, c paramc)
  {
    this.ovu = paramv2engine;
    this.ovL = paramc;
    this.ept = true;
    if ((this.aga != null) && (this.aga.getState() == 1)) {
      this.aga.stop();
    }
    if (this.aga != null) {}
    try
    {
      this.aga.release();
      v2engine.HV().e(true, false, false);
      int i = v2engine.HV().aX(true);
      int j = AudioTrack.getMinBufferSize(this.ovK, 2, 2);
      if ((j == -2) || (j == -1)) {
        return;
      }
      this.aga = new d(i, this.ovK, 2, j * 8);
      this.ept = false;
      return;
    }
    catch (Exception paramv2engine)
    {
      for (;;) {}
    }
  }
  
  public final void bAf()
  {
    this.bPd = true;
    if ((this.aga != null) && (this.aga.getState() == 1)) {
      this.aga.pause();
    }
  }
  
  public final int bGQ()
  {
    if (this.ovw < this.ovv) {
      this.ovw = this.ovv;
    }
    if (this.ovw == 0) {
      return 0;
    }
    int i = (short)(this.ovv * 100 / this.ovw);
    this.ovv = 0;
    return i;
  }
  
  public final void bGR()
  {
    if ((this.aga != null) && (this.aga.getState() == 1)) {
      this.aga.play();
    }
    synchronized (this.lock)
    {
      this.bPd = false;
      this.lock.notify();
      this.ovw = 0;
      this.ovv = 0;
      return;
    }
  }
  
  public final void release()
  {
    x.i("MicroMsg.TalkRoomPlayer", "release");
    this.bBa = true;
    if ((this.aga != null) && (this.aga.getState() == 1)) {
      this.aga.stop();
    }
    if (this.aga != null) {
      this.aga.release();
    }
    synchronized (this.lock)
    {
      this.bPd = false;
      this.lock.notify();
      return;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 72	com/tencent/mm/plugin/talkroom/component/h:bBa	Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 74	com/tencent/mm/plugin/talkroom/component/h:ept	Z
    //   12: ifeq +30 -> 42
    //   15: ldc2_w 161
    //   18: invokestatic 168	java/lang/Thread:sleep	(J)V
    //   21: goto -21 -> 0
    //   24: astore 8
    //   26: ldc -106
    //   28: aload 8
    //   30: ldc -86
    //   32: iconst_0
    //   33: anewarray 67	java/lang/Object
    //   36: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: goto -39 -> 0
    //   42: aload_0
    //   43: getfield 70	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   46: astore 8
    //   48: aload 8
    //   50: monitorenter
    //   51: aload_0
    //   52: getfield 76	com/tencent/mm/plugin/talkroom/component/h:bPd	Z
    //   55: istore 5
    //   57: iload 5
    //   59: ifeq +10 -> 69
    //   62: aload_0
    //   63: getfield 70	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   66: invokevirtual 177	java/lang/Object:wait	()V
    //   69: aload 8
    //   71: monitorexit
    //   72: aload_0
    //   73: getfield 86	com/tencent/mm/plugin/talkroom/component/h:ovP	J
    //   76: lstore 6
    //   78: aload_0
    //   79: invokestatic 183	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   82: putfield 86	com/tencent/mm/plugin/talkroom/component/h:ovP	J
    //   85: aload_0
    //   86: getfield 86	com/tencent/mm/plugin/talkroom/component/h:ovP	J
    //   89: lload 6
    //   91: lsub
    //   92: lstore 6
    //   94: lload 6
    //   96: ldc2_w 184
    //   99: lcmp
    //   100: ifge +31 -> 131
    //   103: lload 6
    //   105: lconst_0
    //   106: lcmp
    //   107: ifle +24 -> 131
    //   110: aload_0
    //   111: getfield 70	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   114: astore 8
    //   116: aload 8
    //   118: monitorenter
    //   119: aload_0
    //   120: getfield 70	com/tencent/mm/plugin/talkroom/component/h:lock	Ljava/lang/Object;
    //   123: lload 6
    //   125: invokevirtual 187	java/lang/Object:wait	(J)V
    //   128: aload 8
    //   130: monitorexit
    //   131: new 189	com/tencent/mm/pointers/PByteArray
    //   134: dup
    //   135: invokespecial 190	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   138: astore 8
    //   140: new 192	com/tencent/mm/pointers/PInt
    //   143: dup
    //   144: invokespecial 193	com/tencent/mm/pointers/PInt:<init>	()V
    //   147: astore 9
    //   149: new 192	com/tencent/mm/pointers/PInt
    //   152: dup
    //   153: invokespecial 193	com/tencent/mm/pointers/PInt:<init>	()V
    //   156: astore 10
    //   158: aload_0
    //   159: getfield 88	com/tencent/mm/plugin/talkroom/component/h:ovu	Lcom/tencent/mm/plugin/talkroom/component/v2engine;
    //   162: invokevirtual 196	com/tencent/mm/plugin/talkroom/component/v2engine:IsSilenceFrame	()I
    //   165: istore_3
    //   166: iload_3
    //   167: ifne +437 -> 604
    //   170: aload_0
    //   171: getfield 88	com/tencent/mm/plugin/talkroom/component/h:ovu	Lcom/tencent/mm/plugin/talkroom/component/v2engine;
    //   174: aload 8
    //   176: aload_0
    //   177: getfield 52	com/tencent/mm/plugin/talkroom/component/h:bufferSize	I
    //   180: aload 9
    //   182: aload 10
    //   184: invokevirtual 200	com/tencent/mm/plugin/talkroom/component/v2engine:GetAudioData	(Lcom/tencent/mm/pointers/PByteArray;ILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)I
    //   187: istore_2
    //   188: iload_2
    //   189: ifge +143 -> 332
    //   192: aload_0
    //   193: aload_0
    //   194: getfield 84	com/tencent/mm/plugin/talkroom/component/h:kDD	I
    //   197: iconst_1
    //   198: iadd
    //   199: putfield 84	com/tencent/mm/plugin/talkroom/component/h:kDD	I
    //   202: ldc -106
    //   204: ldc -54
    //   206: iconst_2
    //   207: anewarray 67	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: iload_2
    //   213: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   216: aastore
    //   217: dup
    //   218: iconst_1
    //   219: aload_0
    //   220: getfield 84	com/tencent/mm/plugin/talkroom/component/h:kDD	I
    //   223: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   226: aastore
    //   227: invokestatic 211	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   230: aload_0
    //   231: getfield 84	com/tencent/mm/plugin/talkroom/component/h:kDD	I
    //   234: bipush 100
    //   236: if_icmplt -236 -> 0
    //   239: aload_0
    //   240: iconst_0
    //   241: putfield 84	com/tencent/mm/plugin/talkroom/component/h:kDD	I
    //   244: aload_0
    //   245: iconst_1
    //   246: putfield 76	com/tencent/mm/plugin/talkroom/component/h:bPd	Z
    //   249: goto -249 -> 0
    //   252: astore 8
    //   254: ldc -106
    //   256: aload 8
    //   258: ldc -86
    //   260: iconst_0
    //   261: anewarray 67	java/lang/Object
    //   264: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: ldc -106
    //   269: aload 8
    //   271: invokevirtual 215	java/lang/Exception:toString	()Ljava/lang/String;
    //   274: invokestatic 217	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   277: goto -277 -> 0
    //   280: astore 9
    //   282: ldc -106
    //   284: aload 9
    //   286: ldc -86
    //   288: iconst_0
    //   289: anewarray 67	java/lang/Object
    //   292: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   295: goto -226 -> 69
    //   298: astore 9
    //   300: aload 8
    //   302: monitorexit
    //   303: aload 9
    //   305: athrow
    //   306: astore 9
    //   308: aload 8
    //   310: monitorexit
    //   311: aload 9
    //   313: athrow
    //   314: astore 8
    //   316: ldc -106
    //   318: aload 8
    //   320: ldc -86
    //   322: iconst_0
    //   323: anewarray 67	java/lang/Object
    //   326: invokestatic 174	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: goto -198 -> 131
    //   332: iload_3
    //   333: ifne +224 -> 557
    //   336: aload_0
    //   337: getfield 92	com/tencent/mm/plugin/talkroom/component/h:aga	Landroid/media/AudioTrack;
    //   340: invokevirtual 220	android/media/AudioTrack:getPlayState	()I
    //   343: iconst_3
    //   344: if_icmpeq +10 -> 354
    //   347: aload_0
    //   348: getfield 92	com/tencent/mm/plugin/talkroom/component/h:aga	Landroid/media/AudioTrack;
    //   351: invokevirtual 145	android/media/AudioTrack:play	()V
    //   354: aload 8
    //   356: getfield 224	com/tencent/mm/pointers/PByteArray:value	[B
    //   359: astore 11
    //   361: aload 8
    //   363: getfield 224	com/tencent/mm/pointers/PByteArray:value	[B
    //   366: arraylength
    //   367: istore 4
    //   369: iconst_0
    //   370: istore_2
    //   371: iload_2
    //   372: iload 4
    //   374: iconst_2
    //   375: idiv
    //   376: if_icmpge +43 -> 419
    //   379: aload 11
    //   381: iload_2
    //   382: iconst_2
    //   383: imul
    //   384: baload
    //   385: sipush 255
    //   388: iand
    //   389: aload 11
    //   391: iload_2
    //   392: iconst_2
    //   393: imul
    //   394: iconst_1
    //   395: iadd
    //   396: baload
    //   397: bipush 8
    //   399: ishl
    //   400: ior
    //   401: i2s
    //   402: istore_1
    //   403: iload_1
    //   404: aload_0
    //   405: getfield 141	com/tencent/mm/plugin/talkroom/component/h:ovv	S
    //   408: if_icmple +201 -> 609
    //   411: aload_0
    //   412: iload_1
    //   413: putfield 141	com/tencent/mm/plugin/talkroom/component/h:ovv	S
    //   416: goto +193 -> 609
    //   419: aload_0
    //   420: getfield 92	com/tencent/mm/plugin/talkroom/component/h:aga	Landroid/media/AudioTrack;
    //   423: aload 8
    //   425: getfield 224	com/tencent/mm/pointers/PByteArray:value	[B
    //   428: iconst_0
    //   429: aload 8
    //   431: getfield 224	com/tencent/mm/pointers/PByteArray:value	[B
    //   434: arraylength
    //   435: invokevirtual 228	android/media/AudioTrack:write	([BII)I
    //   438: pop
    //   439: iload_3
    //   440: ifne +134 -> 574
    //   443: aload_0
    //   444: invokestatic 183	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   447: putfield 80	com/tencent/mm/plugin/talkroom/component/h:ovN	J
    //   450: iconst_0
    //   451: istore 5
    //   453: aload_0
    //   454: getfield 82	com/tencent/mm/plugin/talkroom/component/h:erb	Z
    //   457: ifne +15 -> 472
    //   460: aload_0
    //   461: getfield 230	com/tencent/mm/plugin/talkroom/component/h:ovO	I
    //   464: aload 10
    //   466: getfield 232	com/tencent/mm/pointers/PInt:value	I
    //   469: if_icmpeq +16 -> 485
    //   472: iload 5
    //   474: ifne +11 -> 485
    //   477: aload 9
    //   479: getfield 232	com/tencent/mm/pointers/PInt:value	I
    //   482: ifne +15 -> 497
    //   485: aload_0
    //   486: getfield 82	com/tencent/mm/plugin/talkroom/component/h:erb	Z
    //   489: ifne -489 -> 0
    //   492: iload 5
    //   494: ifeq -494 -> 0
    //   497: aload_0
    //   498: getfield 78	com/tencent/mm/plugin/talkroom/component/h:ovM	Z
    //   501: ifne -501 -> 0
    //   504: iload 5
    //   506: ifne +20 -> 526
    //   509: aload 10
    //   511: getfield 232	com/tencent/mm/pointers/PInt:value	I
    //   514: ifeq +12 -> 526
    //   517: aload_0
    //   518: aload 10
    //   520: getfield 232	com/tencent/mm/pointers/PInt:value	I
    //   523: putfield 230	com/tencent/mm/plugin/talkroom/component/h:ovO	I
    //   526: aload_0
    //   527: getfield 65	com/tencent/mm/plugin/talkroom/component/h:handler	Lcom/tencent/mm/sdk/platformtools/ag;
    //   530: new 234	com/tencent/mm/plugin/talkroom/component/h$1
    //   533: dup
    //   534: aload_0
    //   535: aload 9
    //   537: aload 10
    //   539: iload 5
    //   541: invokespecial 237	com/tencent/mm/plugin/talkroom/component/h$1:<init>	(Lcom/tencent/mm/plugin/talkroom/component/h;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Z)V
    //   544: invokevirtual 241	com/tencent/mm/sdk/platformtools/ag:postAtFrontOfQueueV2	(Ljava/lang/Runnable;)Z
    //   547: pop
    //   548: aload_0
    //   549: iload 5
    //   551: putfield 82	com/tencent/mm/plugin/talkroom/component/h:erb	Z
    //   554: goto -554 -> 0
    //   557: aload_0
    //   558: getfield 82	com/tencent/mm/plugin/talkroom/component/h:erb	Z
    //   561: ifeq -122 -> 439
    //   564: aload_0
    //   565: getfield 92	com/tencent/mm/plugin/talkroom/component/h:aga	Landroid/media/AudioTrack;
    //   568: invokevirtual 136	android/media/AudioTrack:pause	()V
    //   571: goto -132 -> 439
    //   574: aload_0
    //   575: getfield 80	com/tencent/mm/plugin/talkroom/component/h:ovN	J
    //   578: invokestatic 245	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   581: lstore 6
    //   583: lload 6
    //   585: ldc2_w 246
    //   588: lcmp
    //   589: ifge +9 -> 598
    //   592: iconst_0
    //   593: istore 5
    //   595: goto -142 -> 453
    //   598: iconst_1
    //   599: istore 5
    //   601: goto -148 -> 453
    //   604: iconst_0
    //   605: istore_2
    //   606: goto -418 -> 188
    //   609: iload_2
    //   610: iconst_1
    //   611: iadd
    //   612: istore_2
    //   613: goto -242 -> 371
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	616	0	this	h
    //   402	11	1	s	short
    //   187	426	2	i	int
    //   165	275	3	j	int
    //   367	9	4	k	int
    //   55	545	5	bool	boolean
    //   76	508	6	l	long
    //   24	5	8	localInterruptedException1	InterruptedException
    //   252	57	8	localException	Exception
    //   314	116	8	localInterruptedException2	InterruptedException
    //   147	34	9	localPInt1	com.tencent.mm.pointers.PInt
    //   280	5	9	localInterruptedException3	InterruptedException
    //   298	6	9	localObject2	Object
    //   306	230	9	localPInt2	com.tencent.mm.pointers.PInt
    //   156	382	10	localPInt3	com.tencent.mm.pointers.PInt
    //   359	31	11	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   15	21	24	java/lang/InterruptedException
    //   131	166	252	java/lang/Exception
    //   170	188	252	java/lang/Exception
    //   192	249	252	java/lang/Exception
    //   336	354	252	java/lang/Exception
    //   354	369	252	java/lang/Exception
    //   371	379	252	java/lang/Exception
    //   403	416	252	java/lang/Exception
    //   419	439	252	java/lang/Exception
    //   443	450	252	java/lang/Exception
    //   453	472	252	java/lang/Exception
    //   477	485	252	java/lang/Exception
    //   485	492	252	java/lang/Exception
    //   497	504	252	java/lang/Exception
    //   509	526	252	java/lang/Exception
    //   526	554	252	java/lang/Exception
    //   557	571	252	java/lang/Exception
    //   574	583	252	java/lang/Exception
    //   62	69	280	java/lang/InterruptedException
    //   51	57	298	finally
    //   62	69	298	finally
    //   69	72	298	finally
    //   282	295	298	finally
    //   300	303	298	finally
    //   119	131	306	finally
    //   308	311	306	finally
    //   110	119	314	java/lang/InterruptedException
    //   311	314	314	java/lang/InterruptedException
  }
  
  public final void start()
  {
    e.b(this, "TalkRoomPlayer_start").start();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/talkroom/component/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */