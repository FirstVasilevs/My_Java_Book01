package ru.ereshchenko.MyJava.Chapter06;

public class Task03_Scope {

    final static  String txt = "Это глобальная переменная класса Scope";

    public static void main(String[] args) {

        String txt = "Это локальная переменная метода main";
        System.out.println(txt);
        System.out.println(Task03_Scope.txt);
        sub();
    }

    public static void sub() {
       // String txt = "Это локальная переменная метода sub";
        System.out.println(txt);
    }

}
