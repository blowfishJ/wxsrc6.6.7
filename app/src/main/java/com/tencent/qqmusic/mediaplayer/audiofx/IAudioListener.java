package com.tencent.qqmusic.mediaplayer.audiofx;

import com.tencent.qqmusic.mediaplayer.BufferInfo;

public abstract interface IAudioListener
{
  public abstract boolean isEnabled();
  
  public abstract boolean isTerminal();
  
  public abstract boolean onPcm(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2);
  
  public abstract long onPlayerReady(long paramLong, int paramInt1, int paramInt2);
  
  public abstract void onPlayerSeekComplete(long paramLong);
  
  public abstract void onPlayerStopped();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/audiofx/IAudioListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */