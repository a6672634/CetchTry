package org.itstep.qa.runner;

import org.itstep.qa.exception.TriagleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RannerTriagle {
    public static void main(String[] args) {
        System.out.println("Введите первую сторону");
        int a = inputWithControl();
        System.out.println("Введите вторую сторону");
        int b = inputWithControl();
        System.out.println("Введите третью сторону");
        int c = inputWithControl();
        double result = square(a, b, c);
        if (result > 0) {
            System.out.println("Площадь треугольника равна " + result);
        }
    }

    private static int inputWithControl() {
        int a;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                scanner.nextLine();
                System.out.println("введенное значение не корекно");
            }
        }
        return a;
    }

    private static double square(int a, int b, int c) {
        double square = 0;
        try {
            if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
                throw new TriagleException();
            }
            double p = (a + b + c) / 2.0;
            square = Math.sqrt((p - a) * (p - b) * (p - c) * p);
        } catch (TriagleException ex) {
            System.out.println("Треугольник с такими сторонами существовать" + " не может");

            System.out.println("Работа программы прекращена. Попробуйте еще раз");
        }
        return square;

    }
}

