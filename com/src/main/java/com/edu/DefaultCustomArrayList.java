package com.edu;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultCustomArrayList<E> implements CustomArrayList<E> {

    private  E[] list;
    private int size = 0;
    public static void main(String[] args) {

        DefaultCustomArrayList<Integer> strings = new DefaultCustomArrayList<>();
        Iterator<Integer> iterator = strings.iterator();
        for (int l = 0; l < 11 ; l++){
            strings.add(l);
        }
        strings.remove(1);
        //strings.clear();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current.equals(5)) {
               iterator.remove();
            }
        }
        System.out.println(strings.size + " size");
         for (Integer s : strings){System.out.print(s + ",");}
    }

    public DefaultCustomArrayList() {
        list = (E[]) new Object[10];
    }
    @Override
    public boolean add(E element) {
        if (size == list.length) {
            E[] temp = list;
            list = (E[]) new Object[temp.length * 2];

            System.arraycopy(temp, 0, list, 0, temp.length);
        }
        list[size] = element;
        size++;
        return true;

    }
    @Override
    public boolean remove(E element) {
         for (int k = 0; k < size; k++) {
            if (list[k].equals(element)) {
                // вариант1 //
                System.arraycopy(list, k + 1, list, k, size - k - 1);
                // вариант2 //
               // for (int m = k; m < size - k; m++) {list[k] = list[k + 1];}

                list[--size] = null;
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
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
            boolean canRemove = false;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException(" нет элемента hasNext");
                }
                canRemove = true;
                return list[index++];
            }
            @Override
            public void remove() {
                if (!canRemove) {
                    throw new IllegalStateException("не удалить элемент перед next()");
                }
                DefaultCustomArrayList.this.remove(--index);
                canRemove = false;
            }
        };
    }
}
