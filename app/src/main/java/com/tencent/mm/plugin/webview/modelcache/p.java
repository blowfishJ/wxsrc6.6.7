package com.tencent.mm.plugin.webview.modelcache;

import android.net.Uri;
import android.webkit.URLUtil;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class p
{
  public static String QB(String paramString)
  {
    if (!vN(paramString)) {
      return null;
    }
    Object localObject1 = paramString;
    Object localObject2 = paramString;
    label379:
    for (;;)
    {
      try
      {
        Object localObject3 = new URI(paramString);
        localObject1 = paramString;
        localObject2 = paramString;
        String str3 = bi.oV(((URI)localObject3).getScheme()).toLowerCase();
        localObject1 = paramString;
        localObject2 = paramString;
        String str4 = bi.oV(((URI)localObject3).getHost()).toLowerCase();
        localObject1 = paramString;
        localObject2 = paramString;
        if (bi.oW(str4)) {
          break;
        }
        localObject1 = paramString;
        localObject2 = paramString;
        if (((URI)localObject3).getPort() == -1)
        {
          localObject1 = paramString;
          localObject2 = paramString;
          if (!str3.equalsIgnoreCase("http")) {
            break label379;
          }
          i = 80;
          localObject1 = paramString;
          localObject2 = paramString;
          if (bi.oW(((URI)localObject3).getQuery()))
          {
            str1 = "";
            localObject1 = paramString;
            localObject2 = paramString;
            if (!bi.oW(((URI)localObject3).getFragment())) {
              continue;
            }
            str2 = "";
            localObject1 = paramString;
            localObject2 = paramString;
            localObject3 = bi.oV(((URI)localObject3).getPath());
            localObject1 = paramString;
            localObject2 = paramString;
            str1 = str3 + "://" + str4 + ":" + i + "/" + (String)localObject3 + str1 + str2;
            paramString = str1;
            localObject1 = str1;
            localObject2 = str1;
            if (str1.endsWith("/"))
            {
              localObject1 = str1;
              localObject2 = str1;
              paramString = str1 + "/";
            }
            localObject1 = paramString;
            localObject2 = paramString;
            return QC(paramString);
          }
        }
        else
        {
          localObject1 = paramString;
          localObject2 = paramString;
          i = ((URI)localObject3).getPort();
          continue;
        }
        localObject1 = paramString;
        localObject2 = paramString;
        String str1 = "?" + ((URI)localObject3).getQuery();
        continue;
        localObject1 = paramString;
        localObject2 = paramString;
        String str2 = "#" + ((URI)localObject3).getFragment();
        continue;
        int i = 443;
      }
      catch (URISyntaxException paramString)
      {
        x.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL URISyntaxException : %s", new Object[] { paramString.getMessage() });
        return (String)localObject1;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL normal : %s", new Object[] { paramString.getMessage() });
        return (String)localObject2;
      }
    }
  }
  
  private static String QC(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localUri.getScheme()).append("://");
    localStringBuilder.append(localUri.getHost()).append(":").append(localUri.getPort());
    if (bi.cX(localUri.getPathSegments())) {
      localStringBuilder.append("/");
    }
    for (;;)
    {
      if (!bi.oW(localUri.getQuery())) {
        localStringBuilder.append("?").append(localUri.getQuery());
      }
      if (!bi.oW(localUri.getFragment())) {
        localStringBuilder.append("#").append(localUri.getFragment());
      }
      if (paramString.endsWith("/")) {
        localStringBuilder.append("/");
      }
      return localStringBuilder.toString();
      Iterator localIterator = localUri.getPathSegments().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("/").append(str);
      }
    }
  }
  
  public static String QD(String paramString)
  {
    paramString = QB(paramString);
    if (bi.oW(paramString)) {
      return null;
    }
    return Uri.parse(paramString).getHost();
  }
  
  public static String QE(String paramString)
  {
    paramString = QF(paramString);
    if (bi.oW(paramString)) {
      return null;
    }
    return paramString.replaceAll("http://", "").replaceAll("https://", "");
  }
  
  public static String QF(String paramString)
  {
    Object localObject1 = QB(paramString);
    if (bi.oW((String)localObject1))
    {
      x.e("MicroMsg.WebViewCacheUtils", "evaluateResURLWithScheme, original url is invalid = %s", new Object[] { paramString });
      return null;
    }
    Object localObject2 = Uri.parse((String)localObject1);
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(((Uri)localObject2).getScheme()).append("://").append(((Uri)localObject2).getHost()).append(":").append(((Uri)localObject2).getPort());
    if (!bi.cX(((Uri)localObject2).getPathSegments()))
    {
      localObject2 = ((Uri)localObject2).getPathSegments().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        ((StringBuilder)localObject1).append("/").append(bi.oV(str));
      }
    }
    if (paramString.endsWith("/")) {
      ((StringBuilder)localObject1).append("/");
    }
    return ((StringBuilder)localObject1).toString();
  }
  
  /* Error */
  public static byte[] QG(String paramString)
  {
    // Byte code:
    //   0: new 165	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 166	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_3
    //   8: new 168	java/net/URL
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 169	java/net/URL:<init>	(Ljava/lang/String;)V
    //   16: invokevirtual 173	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 175	java/net/HttpURLConnection
    //   22: astore_2
    //   23: aload_2
    //   24: ldc -79
    //   26: invokevirtual 180	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   29: ldc 94
    //   31: ldc -74
    //   33: iconst_3
    //   34: anewarray 4	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_0
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: aload_2
    //   44: invokevirtual 185	java/net/HttpURLConnection:getResponseCode	()I
    //   47: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: aastore
    //   51: dup
    //   52: iconst_2
    //   53: aload_2
    //   54: invokevirtual 194	java/net/HttpURLConnection:getContentLength	()I
    //   57: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   60: aastore
    //   61: invokestatic 197	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: aload_2
    //   65: invokevirtual 201	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   68: astore_2
    //   69: aload_2
    //   70: ifnull +112 -> 182
    //   73: aload_3
    //   74: astore 5
    //   76: aload_2
    //   77: astore 4
    //   79: sipush 1024
    //   82: newarray <illegal type>
    //   84: astore 6
    //   86: aload_3
    //   87: astore 5
    //   89: aload_2
    //   90: astore 4
    //   92: aload_2
    //   93: aload 6
    //   95: invokevirtual 207	java/io/InputStream:read	([B)I
    //   98: istore_1
    //   99: iload_1
    //   100: iconst_m1
    //   101: if_icmpeq +58 -> 159
    //   104: aload_3
    //   105: astore 5
    //   107: aload_2
    //   108: astore 4
    //   110: aload_3
    //   111: aload 6
    //   113: iconst_0
    //   114: iload_1
    //   115: invokevirtual 211	java/io/ByteArrayOutputStream:write	([BII)V
    //   118: goto -32 -> 86
    //   121: astore 6
    //   123: aload_3
    //   124: astore 5
    //   126: aload_2
    //   127: astore 4
    //   129: ldc 94
    //   131: ldc -43
    //   133: iconst_2
    //   134: anewarray 4	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload_0
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: aload 6
    //   145: aastore
    //   146: invokestatic 105	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_2
    //   150: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   153: aload_3
    //   154: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   157: aconst_null
    //   158: areturn
    //   159: aload_3
    //   160: astore 5
    //   162: aload_2
    //   163: astore 4
    //   165: aload_3
    //   166: invokevirtual 220	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   169: astore 6
    //   171: aload_2
    //   172: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   175: aload_3
    //   176: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   179: aload 6
    //   181: areturn
    //   182: aload_2
    //   183: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   186: aload_3
    //   187: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   190: goto -33 -> 157
    //   193: astore_0
    //   194: aconst_null
    //   195: astore_3
    //   196: aconst_null
    //   197: astore 4
    //   199: aload 4
    //   201: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   204: aload_3
    //   205: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   208: aload_0
    //   209: athrow
    //   210: astore_0
    //   211: aconst_null
    //   212: astore 4
    //   214: goto -15 -> 199
    //   217: astore_0
    //   218: aload 5
    //   220: astore_3
    //   221: goto -22 -> 199
    //   224: astore 6
    //   226: aconst_null
    //   227: astore_3
    //   228: aconst_null
    //   229: astore_2
    //   230: goto -107 -> 123
    //   233: astore 6
    //   235: aconst_null
    //   236: astore_2
    //   237: goto -114 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	paramString	String
    //   98	17	1	i	int
    //   22	215	2	localObject1	Object
    //   7	221	3	localObject2	Object
    //   77	136	4	localObject3	Object
    //   74	145	5	localObject4	Object
    //   84	28	6	arrayOfByte1	byte[]
    //   121	23	6	localException1	Exception
    //   169	11	6	arrayOfByte2	byte[]
    //   224	1	6	localException2	Exception
    //   233	1	6	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   79	86	121	java/lang/Exception
    //   92	99	121	java/lang/Exception
    //   110	118	121	java/lang/Exception
    //   165	171	121	java/lang/Exception
    //   0	8	193	finally
    //   8	69	210	finally
    //   79	86	217	finally
    //   92	99	217	finally
    //   110	118	217	finally
    //   129	149	217	finally
    //   165	171	217	finally
    //   0	8	224	java/lang/Exception
    //   8	69	233	java/lang/Exception
  }
  
  /* Error */
  public static String QH(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 228	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: invokestatic 232	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   13: l2i
    //   14: istore_1
    //   15: aload_0
    //   16: invokestatic 236	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: astore_3
    //   20: aload_3
    //   21: astore_2
    //   22: aload_3
    //   23: iload_1
    //   24: invokestatic 242	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   27: astore 4
    //   29: aload_3
    //   30: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   33: aload 4
    //   35: areturn
    //   36: astore 4
    //   38: aconst_null
    //   39: astore_3
    //   40: aload_3
    //   41: astore_2
    //   42: ldc 94
    //   44: ldc -12
    //   46: iconst_2
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload_0
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload 4
    //   58: aastore
    //   59: invokestatic 105	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: aload_3
    //   63: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   66: aconst_null
    //   67: areturn
    //   68: astore 4
    //   70: aconst_null
    //   71: astore_3
    //   72: aload_3
    //   73: astore_2
    //   74: ldc 94
    //   76: ldc -12
    //   78: iconst_2
    //   79: anewarray 4	java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: aload_0
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: aload 4
    //   90: aastore
    //   91: invokestatic 105	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload_3
    //   95: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   98: aconst_null
    //   99: areturn
    //   100: astore_0
    //   101: aconst_null
    //   102: astore_2
    //   103: aload_2
    //   104: invokestatic 216	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   107: aload_0
    //   108: athrow
    //   109: astore_0
    //   110: goto -7 -> 103
    //   113: astore 4
    //   115: goto -43 -> 72
    //   118: astore 4
    //   120: goto -80 -> 40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramString	String
    //   14	10	1	i	int
    //   21	83	2	localInputStream1	java.io.InputStream
    //   19	76	3	localInputStream2	java.io.InputStream
    //   27	7	4	str	String
    //   36	21	4	localFileNotFoundException1	java.io.FileNotFoundException
    //   68	21	4	localException1	Exception
    //   113	1	4	localException2	Exception
    //   118	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   9	20	36	java/io/FileNotFoundException
    //   9	20	68	java/lang/Exception
    //   9	20	100	finally
    //   22	29	109	finally
    //   42	62	109	finally
    //   74	94	109	finally
    //   22	29	113	java/lang/Exception
    //   22	29	118	java/io/FileNotFoundException
  }
  
  public static int a(i parami)
  {
    if (!bi.oV(parami.qkl).equals("cache")) {
      return -1;
    }
    if ((Boolean.parseBoolean((String)parami.mcy.get("async"))) && (!bi.oW((String)parami.mcy.get("src")))) {
      return 2;
    }
    if (!bi.oW((String)parami.mcy.get("resourceList"))) {
      return 1;
    }
    return -1;
  }
  
  public static boolean vN(String paramString)
  {
    return (!bi.oW(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString)));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */