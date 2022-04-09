/*
Здравствуйте! Меня зовут Денис, рад знакомству.
За моими плечами мощный школьный курс "Паскаля" и кружок HTML... :D
Впрочем, наверное, лучше, чем ничего! :)
 */

package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) { //Главный метод, в котором вызываются остальные.
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }//Пытался нагуглить простой способ разделения ответов разрывом строки, но простого, видимо, нет.
    public static void checkSumSign() {
        int a = -25;
        int b = 9;
        int c = (a + b);
        if (c >= 0) { //Пришлось немного загуглить, чтобы вспомнить, как использовать if и else if...
            System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }
    public static void printColor() {
        int value = 42;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) { //А когда я уже всё сделал, увидел, что это есть в подсказках =_=
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() { //Это задание не совсем понятно для чего, ну да ладно.
        int a, b;
        a = -23;
        b = -133;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    }


