package org.itstep.qa.runner;

import org.itstep.qa.entery.Cat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerMassiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел");
        int result = 1;

        try {
            result = scanner.nextInt();
            System.out.println("Заполнено");
            int[] arrey = new int[3];
            arrey[3] = result;
            try {
                arrey = new RunnerMassiv (2,2,3);
                catThree.printColourEyes();
                Cat catFour = new Cat(2,"Blue");
                catFour.printColourEyes();
        }catch (InputMismatchException ex){
            System.out.println("Сработала функция InputMismatchException ");
        }finally {
            System.out.println("Сработала секция finally");
        }
    }

}
