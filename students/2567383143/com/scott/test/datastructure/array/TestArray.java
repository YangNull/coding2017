package com.scott.test.datastructure.array;

/**
 * Created by Ubuntu on 2017/6/14.
 */
public class TestArray {
    public static void main(String[] args) {
        Object array[] = new Object[10];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        int index = 0;
        int len = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n=======================================\n");
        System.arraycopy(array, index, array, index + 1, len - 1 - index);
        array[index] = 8;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
