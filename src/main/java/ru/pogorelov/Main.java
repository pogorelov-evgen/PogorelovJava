package ru.pogorelov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        compareInt();
        compareString();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        arrayEven(array);
    }

    public static void compareInt(){
        System.out.println("Данная программа для сранения двух чисел\n Введите первое число");
        int a;
        int b;
        a = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Введите второе число");
        b = Integer.parseInt(new Scanner(System.in).nextLine());
        if(a==b) {
            System.out.println("a = b");
            System.out.println("Сумма данных чисел = " + (a+b));
            System.out.println("Разница данных чисел = " + 0);
            System.out.println("Произведение данных чисел = " + (a*b));
            System.out.println("Частное данных чисел = " + (a*1.0/b));
        }
        if(a>b){
            System.out.println("a > b");
            System.out.println("Сумма данных чисел = " + (a+b));
            System.out.println("Разница данных чисел = " + (a-b));
            System.out.println("Произведение данных чисел = " + (a*b));
            System.out.println("Частное данных чисел = " + (a*1.0/b));
        }
        if(b>a){
            System.out.println("a < b");
            System.out.println("Сумма данных чисел = " + (a+b));
            System.out.println("Разница данных чисел = " + (b-a));
            System.out.println("Произведение данных чисел = " + (a*b));
            System.out.println("Частное данных чисел = " + (b*1.0/a));
        }

    }

    public static void compareString(){
        System.out.println("Данная программа для сранения двух строк\n Введите первую строку");
        String a;
        String b;
        a = new Scanner(System.in).nextLine();
        System.out.println("Введите вторую строку");
        b = new Scanner(System.in).nextLine();
        if (a.equals(b)) System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");
    }

    public static void arrayEven(int[] array){
        Arrays.stream(array).filter(x->x%2==0).forEach(System.out::println);
    }

}