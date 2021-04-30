package ru.gb.lesson2;

import ru.gb.lesson2.utils.MyArrayDataException;
import ru.gb.lesson2.utils.MyArraySizeException;

public class CheckExceptions {

    public static boolean checkForSize(String[][] array) throws MyArraySizeException {
        if (array.length == 4){
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4){
                    throw new MyArraySizeException(array.length, array[i].length);
                }
            }
        }
        else {
            throw new MyArraySizeException(array.length, array[0].length);
        }
        return true;
    }

    public static int sumData(String[][] array) throws NumberFormatException{
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum+=Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
