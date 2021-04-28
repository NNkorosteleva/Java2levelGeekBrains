package ru.gb.lesson2;

import ru.gb.lesson2.utils.MyArrayDataException;
import ru.gb.lesson2.utils.MyArraySizeException;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arrayTrueSize = new String[4][4];
        String[][] arrayFalseSize = new String[4][2];

        String[][] arrayTrueDate ={{"5","7","3","17"}, {"7","0","1","12"}, {"8","1","2","3"}};
        String[][] arrayFalseDate ={{"5","7","3","17"}, {"7","FALSE!","1","12"}, {"8","1","2","3"}};

        try {
            System.out.println("Sum arrayTrueDate = " + CheckExceptions.sumData(arrayTrueDate));
            System.out.println("Sum arrayFalseDate = " + CheckExceptions.sumData(arrayFalseDate));
        }
        catch (MyArrayDataException e){
            e.getMessage();
        }
        try {
            System.out.println("checkForSize arrayTrueSize: " + CheckExceptions.checkForSize(arrayTrueSize));
            System.out.println("checkForSize arrayFalseSize: " + CheckExceptions.checkForSize(arrayFalseSize));
        }
        catch (MyArraySizeException e){
            e.getMessage();
        }
    }
}
