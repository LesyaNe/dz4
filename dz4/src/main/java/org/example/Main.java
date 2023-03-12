package org.example;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //        1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
    public static void main(String[] args) {

        ex1();
    }

    private static void ex1() {
        Scanner userInput = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();


        while (true) {
            System.out.println("Введите строки через пробел: ");
            String words = userInput.next();
            String[] words1 = words.split(" ");

            if (words1.equals("print")) {
                deque.addLast(words1.length);;
                deque.addFirst(words1.length);
                System.out.println(words1);

            } else if (words1.equals("revert")) {
                deque.removeLast();
                System.out.println(words1);
            }
            else {
                System.out.println(words1);
            }

        }
//        for (int a = 0; a < list.size(); a++)
//            System.out.println(list.get(a));

    }

}


//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

//    public static LinkedList<Integer> getReversDeque(int count) {
//        LinkedList<Integer> deque = new LinkedList<>();
//        LinkedList<Integer> reverseDeque = new LinkedList<>();
//
//        for (int i = 0; i < count; i++) {
//            int random = (int) (Math.random() * (10 - 1));
//            deque.addFirst(random);
//        }
//        System.out.println(deque);
//
//        for (int i = 0; i < count; i++) {
//            reverseDeque.addFirst(deque.getFirst());
//            deque.removeFirst();
//        }
//        return reverseDeque;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(getReversDeque(5));
//    }
//}

