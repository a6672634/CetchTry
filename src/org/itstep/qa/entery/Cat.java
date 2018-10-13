package org.itstep.qa.entery;

import org.itstep.qa.exception.ColorEyesException;
import org.itstep.qa.exception.CountEyesException;

public class Cat {
    private int countEyes;
    private String colorEyes;

    public  Cat (int countEyes, String colorEyes){
        this.countEyes = countEyes;
        this.colorEyes = colorEyes;
    }

    public void printCoutnEyes() {
        if (countEyes !=2){
            throw new IndexOutOfBoundsException() ;
        }
            System.out.println("Число глаз у котикак = "+countEyes);
        }
        public void printColourEyes() throws ColorEyesException, CountEyesException {
        if (!colorEyes.equals ("Green")){
            throw new ColorEyesException();
        }
            if (countEyes !=2){
                throw new CountEyesException() ;
            }
            System.out.println("Цвет глаз у котика = " + colorEyes);
        }
    }

