package com.company;

public class Main {
    public static void main(String[] args) {

        ReadDouble readDouble = new ReadDouble();
        double a;
        double b;

        int action;

        do {

            System.out.print("Введите первое число: ");
            a = readDouble.readNextDouble();
            System.out.print("Введите второе число: ");
            b = readDouble.readNextDouble();

            Calculator calculator = new Calculator(a, b);


            System.out.println("Выберите действие: ");
            System.out.println("1-сложение");
            System.out.println("2-вычетание");
            System.out.println("3-умножение");
            System.out.println("4-деление");
            System.out.println("5-модуль");
            System.out.println("0-закрыть программу");
            System.out.print("Выберите действие: ");

            action = (int) readDouble.readNextDouble();

            switch (action) {
                case 1:
                    System.out.println("Результат: " + calculator.plus());
                    break;
                case 2:
                    System.out.println("Результат: " + calculator.subscribe());
                    break;
                case 3:
                    System.out.println("Результат: " + calculator.multiplication());
                    break;
                case 4:
                    System.out.println("Результат: " + calculator.division());
                    break;
                case 5:
                    System.out.println("Результат: " + calculator.mod());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Выберите действие: ");
                    System.out.println("1-умножение");
                    System.out.println("2-вычетание");
                    System.out.println("3-умножение");
                    System.out.println("4-деление");
                    System.out.println("5-модуль");
                    System.out.println("0-закрыть программу");

            }
        } while (action != 0);
    }
}
