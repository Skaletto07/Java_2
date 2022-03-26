package Lesson_3;

import java.util.*;

public class Main  {
    public static void main(String[] args) {
        String[] arrayStr = {"Сестра","Мама","Папа","Брат","Сестра","Дедушка","Бабушка","Брат","Брат","Тетя","Дядя","Дедушка"};

        Phonebook phonebook = new Phonebook("1", new TreeMap<>());

        phonebook.add("Emergency", "112");
        phonebook.add("Police", "02");
        phonebook.add("Fire Department", "01");
        phonebook.add("SOS", "991");
        phonebook.add("Ambulance", "03");
        phonebook.add("Moscow Number", "+7495......");
        phonebook.add("Moscow Number", "+7499......");
        phonebook.add("Petrov", "+79999999988");
        phonebook.add("Petrov", "+79889998899");
        phonebook.add("Sidorov", "+79912223344");

        phonebook.get("Moscow Number");
        phonebook.get("Petrov");



        Map<String, Integer> abc = returnSumOnWords(arrayStr);
        for (Map.Entry entry : abc.entrySet()) {
            System.out.println(entry);
        }



    }

    public static Map<String, Integer> returnSumOnWords(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                int a = map.get(s);
                a++;
                map.put(s, a);
            } else
                map.put(s, 1);
        }
        return map;
    }



}
