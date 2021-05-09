package ru.gb.ankorosteleva.lesson5;

import ru.gb.ankorosteleva.lesson5.util.ArrayCalculate;
import ru.gb.ankorosteleva.lesson5.util.StopWatch;

public class ArrayClass {

    static final int SIZE = 10000000;

    public static float[] runOneThread() {
        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1;
        }
        long timeStart = StopWatch.start();
        array = ArrayCalculate.calculate(array,0);
        System.out.println("Время работы метода без использования потоков: " + StopWatch.getElapsedTime(timeStart) + " мс");
        return array;
    }
}
