package aston.school;

import java.util.Arrays;

public class Lesson2 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = -100;
        int b = 50;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    private static void printColor() {
        int value = 23;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a;
        int b;
        a = 49;
        b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.
    */
    private static void method5(int a, int b) {
        if ((a+b)>=10 && (a+b)<=20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /* 6. Напишите метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом. */
    private static void method6(int n) {
        if (n >= 0) {
            System.out.println("Число " + n + " - положительное");
        } else {
            System.out.println("Число " + n + " - отрицательное");
        }
    }

    /* 7. Напишите метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    private static void method7(int n) {
        if (n >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    /* 8. Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    */
    private static void method8(String str, int n) {
        if (n>0) {
            for (int i=1; i <= n; i++) {
                System.out.println(str);
            }
        }
    }

    /*9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean
    (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    private static void method9(int n) {
        if ((n%4==0 && n%100!=0) || n%400==0) {
            System.out.println("Год " + n + " - високосный.");
        } else {
            System.out.println("Год " + n + " - не високосный.");
        }
    }

    /* 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void method10() {
        int[] arr = {0, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /* 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
    1 2 3 4 5 6 7 8 ... 100;
    */
    private static void method11() {
        int[] arr = new int[100];
        for (int i=0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /* 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа
    меньшие 6 умножить на 2;
    */
    private static void method12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /* 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
    элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
    */
    private static void method13() {
        int n = 5;
        int[][] arr = new int[n][n];
        //задаем диагональные элементы массива
        for (int i = 0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j || i+j == n-1) {
                    arr[i][j] = 1;
                }
            }
        }
        //выводим массив
        for (int i = 0; i<n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    /* 14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
    */
    private static int[] method14(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        method5(-2,14);
        method6(-90);
        method7(88);
        method8("fun", 5);
        method9(2024);
        method10();
        method11();
        method12();
        method13();

        int[] a = method14(7, 14);
        System.out.println(Arrays.toString(a));

    }
}
