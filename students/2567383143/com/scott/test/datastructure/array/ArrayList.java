package com.scott.test.datastructure.array;


import com.scott.test.datastructure.Iterator;
import com.scott.test.datastructure.List;

import java.util.Arrays;

public class ArrayList implements List {

    private int size = 0;
    private static final int DEFAULT_SIZE = 10;
    private static final Object[] DEFAULT_EMPTY_ELEMENT_DATA = {};
    private Object[] elementData;

    public ArrayList() {
        elementData = DEFAULT_EMPTY_ELEMENT_DATA;
    }

    public ArrayList(int size) {
        if (size > 0) {
            this.elementData = new Object[size];
        } else if (size == 0) {
            this.elementData = DEFAULT_EMPTY_ELEMENT_DATA;
        } else {
            throw new RuntimeException("init size " + size + " is error");
        }
    }

    public void add(Object o) {
        checkSize(size + 1);
        elementData[size++] = o;
    }

    /***
     *数组容量增加
     * @param minCapacity
     */
    private void checkSize(int minCapacity) {
        //TODO 数组的判断
        grow(minCapacity);
    }

    private void grow(int minCapacity) {
        //TODO 容量判断
        int newCapaCity = minCapacity;
        elementData = Arrays.copyOf(elementData, newCapaCity);
    }

    public void add(int index, Object o) {

        checkSize(size + 1);
        //[1,2,3,4,5,7,8,9,0]


    }

    public Object get(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.elementData[index];
    }

    public Object remove(int index) {
        return null;
    }

    public int size() {
        return size;
    }

    public Iterator iterator() {
        return null;
    }

}
