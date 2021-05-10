package ru.gb.ankorosteleva.lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        float[] arr1 = ArrayClass.runOneThread();
        float[] arr2 = ArrayMultithreadingClass.runTwoThread();
        System.out.println("Проверка на равенство двух массивов: " + Arrays.equals(arr1, arr2));
    }
}
