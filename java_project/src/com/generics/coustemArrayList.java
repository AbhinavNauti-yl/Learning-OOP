package com.generics;

import java.util.Arrays;

public class coustemArrayList {
    private int[] array;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public coustemArrayList() {
        this.array = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        array[size++] = num;
    }

    public boolean isFull(){
        return array.length == size;
    }

    private void resize() {
        int[] temp = new int[DEFAULT_SIZE * 2];

        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        array = temp;
    }

    public int remove() {
        int temp = array[--size];
        return temp;
    }

    @Override
    public String toString() {
        return "arraylist{" + "data = " +  Arrays.toString(array) + "}" ;
    }


    public static void main(String[] args) {
        coustemArrayList list = new coustemArrayList();
        list.add(5);
        list.add(7);
        list.add(8);

        System.out.println(list);
    }
}
