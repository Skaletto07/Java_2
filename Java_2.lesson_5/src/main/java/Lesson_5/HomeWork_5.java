package Lesson_5;

import java.util.Arrays;

public class HomeWork_5 {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();

    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

    public static void secondMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();

        // Создаем два массива для левой и правой части исходного
        // Копируем в них значения из большого массива
        // Запускает два потока и параллельно просчитываем каждый малый массив
        // ...
        // Склеиваем малые массивы обратно в один большой
        // ...

        float[] firstArr = new float[size / 2];
        float[] secondArr = new float[size / 2];
        System.arraycopy(arr, 0, firstArr, 0, size / 2);
        System.arraycopy(arr, size / 2 - 1, secondArr, 0, size / 2);

        Thread thread = new Thread(() -> {
            for (int i = 0; i < firstArr.length; i++) {
                firstArr[i] = (float) (firstArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < secondArr.length; i++) {
                secondArr[i] = (float) (secondArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(firstArr, 0, arr, 0, size/2);
        System.arraycopy(secondArr, 0, arr, size / 2 - 1, size/2);


        System.out.println("Two thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

}
