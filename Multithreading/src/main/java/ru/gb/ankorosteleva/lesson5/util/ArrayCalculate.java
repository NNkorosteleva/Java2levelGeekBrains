package ru.gb.ankorosteleva.lesson5.util;

public class ArrayCalculate {
    public static float[] calculate(float[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + (i + n) / 5) * Math.cos(0.2f + (i + n) / 5) * Math.cos(0.4f + (i + n) / 2));
        }
        return array;
    }
}
