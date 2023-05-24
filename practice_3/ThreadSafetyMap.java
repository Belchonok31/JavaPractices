package practice_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.concurrent.Semaphore;

public class ThreadSafetyMap<E,V> implements Map <E,V>{

    private static final Semaphore semaphore = new Semaphore(1);
    private final Map<E,V> map = new HashMap<>();

    @Override
    public int size() {
        try{
            semaphore.acquire();
            int size = map.size();
            semaphore.release();
            return size;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isEmpty() {
        try{
            semaphore.acquire();
            boolean size = map.isEmpty();
            semaphore.release();
            return size;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean containsKey(Object key) {
        try{
            semaphore.acquire();
            boolean contain = map.containsKey(key);
            semaphore.release();
            return contain;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean containsValue(Object value) {
        try{
            semaphore.acquire();
            boolean contain = map.containsValue(value);
            semaphore.release();
            return contain;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public V get(Object key) {
        try{
            semaphore.acquire();
            V value = map.get(key);
            semaphore.release();
            return value;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public V put(E key, V value) {
        try{
            semaphore.acquire();
            map.put(key,value);
            semaphore.release();
            return null;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public V remove(Object key) {
        try{
            semaphore.acquire();
            map.remove(key);
            semaphore.release();
            return null;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void putAll(Map<? extends E, ? extends V> m) {
        try{
            semaphore.acquire();
            map.putAll(m);
            semaphore.release();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clear() {
        try{
            semaphore.acquire();
            map.clear();
            semaphore.release();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Set<E> keySet() {
        try{
            semaphore.acquire();
            Set<E> keySet = map.keySet();
            semaphore.release();
            return keySet;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<V> values() {
        try{
         semaphore.acquire();
         Collection<V> values = map.values();
         semaphore.release();
         return values;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Set<Entry<E, V>> entrySet() {
        try{
         semaphore.acquire();
         Set<Entry<E,V>> entrySet = map.entrySet();
         semaphore.release();
         return entrySet;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
