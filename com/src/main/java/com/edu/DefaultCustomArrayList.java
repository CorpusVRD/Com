package com.edu;
import java.util.Iterator;

public class DefaultCustomArrayList<E> implements CustomArrayList<E> {

    private E[] list;
    private int size = 0;
    public static void main(String[] args) {

          DefaultCustomArrayList<Integer> strings = new DefaultCustomArrayList<>();
          strings.add(1);
          strings.remove(0);
          strings.add(2);
          strings.add(3);
          // strings.clear();
           strings.add(1);
           for (Integer s : strings){System.out.println(s);}
    }
    public DefaultCustomArrayList() {
        list = (E[]) new Object[0];
    }
    @Override
    public boolean add(E element) {
        E[] temp = list;
        list = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, list, 0, temp.length);
        list[size] = element;
        size++;
        return true;
    }
    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    private void remove(int index) {
        System.arraycopy(list, index + 1, list, index, size - index - 1);
        list[--size] = null;
    }

    @Override
    public E get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            int index = 0;
            @Override
            public boolean hasNext() {
                return index < list.length;
            }

            @Override
            public E next() {
                return list[index++];
            }
        };
    }
}