package ru.gb.lesson2.utils;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(int n, int m) {
        System.out.println("FALSE! expected array size: 4x4, but was: " + n + "x" + m);
    }
}
