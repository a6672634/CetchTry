package org.itstep.qa.runner;

import org.itstep.qa.entery.Cat;
import org.itstep.qa.exception.ColorEyesException;
import org.itstep.qa.exception.CountEyesException;

public class RunnerExceptionThrow {
    public static void main(String[] args) {
        Cat catOne = new Cat(2, "Red");
        catOne.printCoutnEyes();
        Cat catTwo = new Cat(2, "Yellow");
        catTwo.printCoutnEyes();

        try {
            Cat catThree = new Cat(2, "Green");
            catThree.printColourEyes();
            Cat catFour = new Cat(2,"Blue");
            catFour.printColourEyes();


        } catch (ColorEyesException ex) {
            ex.printStackTrace();
        } catch (CountEyesException ex) {
            ex.printStackTrace();
        }
    }
}