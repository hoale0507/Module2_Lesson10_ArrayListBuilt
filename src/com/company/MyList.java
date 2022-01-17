package com.company;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[0];
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public E get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public void add(E e){
        if(size == elements.length){
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if(size == elements.length){
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

        if(size < 0 || size > index){
            throw new ArrayIndexOutOfBoundsException();
        }
            for (int i = index; i < size; i++) {
                elements[i+1] = elements[i];
            }
            elements[index] = e;
            size++;
        }
    }

