package practice_3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafetyList<E> implements List<E> {
    private final List<E> list = new ArrayList<>();
    static final Lock lock = new ReentrantLock();
    @Override
    public int size() {
        lock.lock();
        int size = list.size();
        lock.unlock();
        return size;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean size = list.isEmpty();
        lock.unlock();
        return size;
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        boolean contain = list.contains(o);
        lock.unlock();
        return contain;
    }

    @Override
    public Iterator<E> iterator() {
        lock.lock();
        Iterator<E> iterator =list.iterator();
        lock.unlock();
        return iterator;
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        Object[] toArray = list.toArray();
        lock.unlock();
        return toArray;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        lock.lock();
        T[] toArray = list.toArray(a);
        lock.unlock();
        return toArray;
    }

    @Override
    public boolean add(E e) {
        lock.lock();
        boolean add = list.add(e);
        lock.unlock();
        return add;
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        boolean remove = list.remove(o);
        lock.unlock();
        return remove;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        lock.lock();
        boolean ContainsAll = list.containsAll(c);
        lock.unlock();
        return ContainsAll;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        lock.lock();
        boolean addAll = list.addAll(c);
        lock.unlock();
        return addAll;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        lock.lock();
        boolean addAll = list.addAll(index,c);
        lock.unlock();
        return addAll;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        lock.lock();
        boolean removeAll = list.removeAll(c);
        lock.unlock();
        return removeAll;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        lock.lock();
        boolean retainAll = list.retainAll(c);
        lock.unlock();
        return retainAll;
    }

    @Override
    public void clear() {
        lock.lock();
        list.clear();
        lock.unlock();
    }

    @Override
    public E get(int index) {
        lock.lock();
        E value = list.get(index);
        lock.unlock();
        return value;
    }

    @Override
    public E set(int index, E element) {
        lock.lock();
        E value = list.set(index,element);
        lock.unlock();
        return value;
    }

    @Override
    public void add(int index, E element) {
        lock.lock();
        list.add(index,element);
        lock.unlock();
    }

    @Override
    public E remove(int index) {
        lock.lock();
        E remove = list.remove(index);
        lock.unlock();
        return remove;
    }

    @Override
    public int indexOf(Object o) {
        lock.lock();
        int index = list.indexOf(o);
        lock.unlock();
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.lock();
        int lastIndex = list.lastIndexOf(o);
        lock.unlock();
        return lastIndex;
    }

    @Override
    public ListIterator<E> listIterator() {
        lock.lock();
        ListIterator<E> listIterator = list.listIterator();
        lock.unlock();
        return listIterator;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        lock.lock();
        ListIterator<E> listIterator = list.listIterator(index);
        lock.unlock();
        return listIterator;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        lock.lock();
        List<E> subList = list.subList(fromIndex, toIndex);
        lock.unlock();
        return subList;
    }
}
