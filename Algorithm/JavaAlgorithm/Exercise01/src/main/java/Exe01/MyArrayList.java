package Exe01;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

    int size;               // 요소의 사이즈.
    private T[] array;      // 요소를 저장.

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public static void main(String[] args) throws Exception {

    }

    @Override
    public boolean add(T element) {

        if(size >= array.length) {
            // 큰 배열을 만들어 요소들을 복사한다.
            T[] bigger = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }

        array[size] = element;
        size++;

        return true;
    }

    @Override
    public void add(int index, T element) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        add(element);

        for(int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public int indexOf(Object target) {

        for(int i = 0; i < size; i++) {
            if(equals(target, array[i])) {
                return i;
            }
        }

        return -1;
    }

    private boolean equals(Object target, Object element) {
        if(target == null) {
            return element == null;
        } else {
            return target.equals(element);
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public int lastIndexOf(Object target) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public T remove(int index) {

        T element = get(index);

        for(int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        return element;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {

        boolean flag = false;

        for(Object obj : collection) {
            flag |= remove(obj);
        }

        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public T set(int index, T element) {
        T old = get(index);
        array[index] = element;
        return old;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <U> U[] toArray(U[] a) {
        return null;
    }
}
