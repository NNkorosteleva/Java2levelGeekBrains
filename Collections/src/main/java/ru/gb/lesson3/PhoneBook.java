package ru.gb.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> listPhoneBook;

    public PhoneBook(){
        this.listPhoneBook = new HashMap<>();
    }

    /**
     * Метод добавляет новую запись в справочник
     *
     * @param name имя пользователя
     * @param number номер телефона пользователя
     * @return true если успешно добавилась новая запись, false если запись не добавилась
     */
    public boolean add(String name, String number){
        if (listPhoneBook.containsKey(name)){
            ArrayList<String> listNumber = listPhoneBook.get(name);
            if (listNumber.contains(number)){
                System.out.println("Такой номер телефона " + number + " уже существует для пользователя " + name);
                return false;
            }
            else {
                listNumber.add(number);
                System.out.println("К существующему пользователю " + name + " добавлен новый номер " + number);
            }
        }
        else {
            listPhoneBook.put(name,new ArrayList<>(Arrays.asList(number)));
            System.out.println("Добавлен новый пользователь " + name + " с номером " + number);
        }
        return true;
    }

    /**
     * Метод возвращает список номеров пользователя name
     *
     * @param name имя пользователя
     * @return список номеров пользователя
     */
    public ArrayList<String> get(String name){
        if (listPhoneBook.containsKey(name)){
            return listPhoneBook.get(name);
        }
        else {
            System.out.println("Пользователя " + name + " нет в справочнике");
            return new ArrayList<>();
        }
    }
}
