package Lesson_3;

import java.util.Locale;
import java.util.Map;

public class Phonebook {
    private String nameBook;
    private String lastName;
    private String number;
    private Map<String, String> book;

    public Phonebook() {
    }

    public Phonebook(String nameBook, Map<String, String> book) {
        this.nameBook = nameBook;
        this.book = book;
    }

    public Phonebook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void add(String lastName, String number) {
        book.put(number, lastName.toUpperCase());
    }

    public void get(String lastName) {
        for (Map.Entry entry : book.entrySet()) {
            if (entry.getValue().equals(lastName.toUpperCase())) {
                System.out.println("Lastname: " + entry.getValue() + "  Phone number: " + entry.getKey());
            }
        }
    }
}
