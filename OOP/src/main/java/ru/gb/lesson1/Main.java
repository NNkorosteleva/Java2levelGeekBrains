package ru.gb.lesson1;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Participants[] array1 = new Participants[9];
        Obstacles[] array2 = new Obstacles[4];

        array1[0] = new Human();
        array1[1] = new Human("Вася", 10, 0.5);
        array1[2] = new Human("Даша", 5, 2);
        array1[3] = new Cat();
        array1[4] = new Cat("Кошка", 5, 1);
        array1[5] = new Cat("Пушок", 20, 4);
        array1[6] = new Robot();
        array1[7] = new Robot("R1", 5, 10);
        array1[8] = new Robot("Android", 10, 0.1);

        array2[0] = new Treadmill();
        array2[1] = new Wall();
        array2[2] = new Treadmill(6);
        array2[3] = new Wall(4);

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (!array2[j].canDo(array1[i])){
                    break;
                }
            }
        }
    }
}
