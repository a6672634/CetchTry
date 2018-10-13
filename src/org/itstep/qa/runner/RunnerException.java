package org.itstep.qa.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int result = -1;
        try {
            result = scanner.nextInt();
            System.out.println("Код который идет после ввода");
            int [] arrey = new int[3];
            arrey[3] = result;
        } catch (InputMismatchException ex){
            System.out.println("Сработала секция catch для InputMismatchException");
            ex.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Сработала секция cath для" + "ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Сработала секция finally");
        }
        System.out.println("Вы ввели: " +result);
        // тут еще может быть  10005500 строчек кода
    }
}
