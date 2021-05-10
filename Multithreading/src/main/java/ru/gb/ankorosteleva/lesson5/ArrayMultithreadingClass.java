package ru.gb.ankorosteleva.lesson5;

import ru.gb.ankorosteleva.lesson5.util.ArrayCalculate;
import ru.gb.ankorosteleva.lesson5.util.StopWatch;

public class ArrayMultithreadingClass {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static float[] runTwoThread() throws InterruptedException {
        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1;
        }

        long timeStart = StopWatch.start();

        float[] a1 = new float[HALF], a2 = new float[HALF];
        System.arraycopy(array, 0, a1, 0, HALF);
        System.arraycopy(array, HALF, a2, 0, HALF);


        Thread t1 = new Thread(() -> {
            float[] arr1 = ArrayCalculate.calculate(a1, 0);
            System.arraycopy(arr1, 0, a1, 0, a1.length);

        });
        Thread t2 = new Thread(() -> {
            float[] arr2 = ArrayCalculate.calculate(a2, HALF);
            System.arraycopy(arr2, 0, a2, 0, a2.length);

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.arraycopy(a1, 0, array, 0, HALF);
        System.arraycopy(a2, 0, array, HALF, HALF);

        System.out.println("Время работы метода c использованием потоков: " + StopWatch.getElapsedTime(timeStart) + " мс");
        return array;
    }
}
