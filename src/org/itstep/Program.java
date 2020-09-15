package org.itstep;

public class Program {
    public static void main(String[] args) {
        // Типы данных в Java: примитивные, ссылочные
        // Примитивные: byte(1), short(2), int(4), long(8) - 2^(n - 1)
        //              double(8), float(4)
        //              boolean
        //              char(2)
        /*byte b = 127;
        byte a = 127;
        System.out.println("b = " + b);
        b += a; // b = b + one
        System.out.println("b = " + b);
        System.out.print("Hello World");
        System.out.println("!");*/
        int a, b; // объявить переменную. Имя переменной может содержать: _, a-z, A-Z, $, 0-9
        a = 10;
        System.out.println("a = " + a);
        a = a + 2;
        System.out.println("a = " + a);
    }
}
