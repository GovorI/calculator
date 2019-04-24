package com.company;

import java.util.Scanner;

public class ReadDouble {


    public double readNextDouble() {

    Scanner scanner = new Scanner(System.in);
        double a = 0;
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        }else System.out.println("Введите число");
        return a;
    }


}
