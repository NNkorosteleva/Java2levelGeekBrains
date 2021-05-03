package ru.gb.lesson3;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UniqueArray uniqueArray = new UniqueArray();
        List<String> list = Arrays.asList("Apple", "Orange", "Watermelon", "Raspberry", "Tomato", "Beet", "Cabbage", "Potato", "Apple",
                "Apricot", "Raspberry", "Watermelon", "Raspberry", "Beet", "Tomato", "Orange", "Watermelon", "Potato");
        HashSet<String> uniqueList = uniqueArray.uniqueElements(list);
        System.out.println("Первоначальный список слов: " + list);
        System.out.println("Уникальный список слов: " + uniqueList);
        System.out.println("Кол-во повторов слов в списке");
        uniqueArray.numberUniqueElements(list);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров Василий Сергеевич", "+79652345066");
        phoneBook.add("Петров Василий Сергеевич", "+79652345066");
        phoneBook.add("Петров Василий Сергеевич", "+79873451100");
        phoneBook.add("Петров Максим Анатольевич", "+79657853948");
        System.out.println("Все номера телефонов Петрова Василия Сергеевича:" + phoneBook.get("Петров Василий Сергеевич"));
        System.out.println("Все номера телефонов Иванова Василия Анатольевича:" + phoneBook.get("Иванов Василий Анатольевич"));
    }
}
