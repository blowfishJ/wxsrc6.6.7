package com.tencent.qqmusic.mediaplayer.codec.wav;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegPlayer;

public class WavDecoder
  extends FfmpegPlayer
{
  public AudioFormat.AudioType getAudioType(String paramString, byte[] paramArrayOfByte)
  {
    if (WaveReader.isWavFormat(paramString)) {
      return AudioFormat.AudioType.WAV;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
  
  public int getErrorCodeMask()
  {
    return 100663295;
  }
  
  public AudioFormat.AudioType guessAudioType(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.toLowerCase().contains(".wav"))) {
      return AudioFormat.AudioType.WAV;
    }
    return AudioFormat.AudioType.UNSUPPORT;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/codec/wav/WavDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */