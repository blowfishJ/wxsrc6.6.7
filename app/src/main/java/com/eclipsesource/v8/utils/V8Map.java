package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class V8Map<V>
  implements Releasable, Map<V8Value, V>
{
  private Map<V8Value, V> map = new HashMap();
  private Map<V8Value, V8Value> twinMap = new HashMap();
  
  public void clear()
  {
    this.map.clear();
    Iterator localIterator = this.twinMap.keySet().iterator();
    while (localIterator.hasNext()) {
      ((V8Value)localIterator.next()).release();
    }
    this.twinMap.clear();
  }
  
  public boolean containsKey(Object paramObject)
  {
    return this.map.containsKey(paramObject);
  }
  
  public boolean containsValue(Object paramObject)
  {
    return this.map.containsValue(paramObject);
  }
  
  public Set<Map.Entry<V8Value, V>> entrySet()
  {
    return this.map.entrySet();
  }
  
  public V get(Object paramObject)
  {
    return (V)this.map.get(paramObject);
  }
  
  public boolean isEmpty()
  {
    return this.map.isEmpty();
  }
  
  public Set<V8Value> keySet()
  {
    return this.map.keySet();
  }
  
  public V put(V8Value paramV8Value, V paramV)
  {
    remove(paramV8Value);
    paramV8Value = paramV8Value.twin();
    this.twinMap.put(paramV8Value, paramV8Value);
    return (V)this.map.put(paramV8Value, paramV);
  }
  
  public void putAll(Map<? extends V8Value, ? extends V> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put((V8Value)localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public void release()
  {
    clear();
  }
  
  public V remove(Object paramObject)
  {
    Object localObject = this.map.remove(paramObject);
    paramObject = (V8Value)this.twinMap.remove(paramObject);
    if (paramObject != null) {
      ((V8Value)paramObject).release();
    }
    return (V)localObject;
  }
  
  public int size()
  {
    return this.map.size();
  }
  
  public Collection<V> values()
  {
    return this.map.values();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/eclipsesource/v8/utils/V8Map.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */