package com.company;

public class Main {

    public static void main(String[] args) {
        //taskOne();
        //taskTwo();
       // taskThree();
        taskFour();


    }


    public static void taskOne(){
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
    }


    public static void taskTwo(){
        int[] arr = generateRandomArray();
        int minNumber = 300000;
        int maxNumber = 100;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>maxNumber) {
                maxNumber = arr[i];
            }
            if (arr[i]<minNumber) {
                minNumber = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minNumber + " рублей." +
                " Максимальная сумма трат за день составила " + maxNumber + " рублей");

    }

    public static void taskThree(){
        int[] arr = generateRandomArray();
        int total = 0;
        double average = 0;
        int month = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            month ++;

        }

        average = total / month;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

    }

    public static void taskFour(){
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i =  reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
