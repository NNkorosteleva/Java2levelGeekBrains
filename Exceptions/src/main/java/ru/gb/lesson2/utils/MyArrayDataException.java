package ru.gb.lesson2.utils;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int i, int j) {
        System.out.println("FALSE! Index: [" + i + "," + j + "]. Attempted to convert a String to Integer");
    }
}
