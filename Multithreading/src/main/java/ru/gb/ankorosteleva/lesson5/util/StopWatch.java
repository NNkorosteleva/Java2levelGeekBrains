package ru.gb.ankorosteleva.lesson5.util;

public class StopWatch {

    public static long start() {
        return System.currentTimeMillis();
    }

    public static long getElapsedTime(long start) {
        long end = System.currentTimeMillis();
        return end - start;
    }
}
