/*
Project: Lab 7 Java Classes Calculator
Purpose Details: Learn how to create a new Class and use Non-Static and Static Methods
Course: IST 242
Author: Aneta O'Donnell
Date Developed: 2/28/2020
Last Date Changed:
Revision:
*/

package edu.psu.abington.ist.ist242;

import java.util.Scanner;

public class Main {

    /***
     * <h1>Input Value Check</h1>
     * This is the main method which makes use of addition,
     * subtraction, multiplication and division methods in the
     * switch statement.
     * It contains a while loop to keep asking for num1 and num 2
     * until user enters Q to Quit.
     * The if statement, while loop goes to the inputvaluecheck method and
     * checks the division and multiplication
     * methods for an input num of 0, cannot multiply or divide by 0.
     *
     * @param args Unused.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static void main(String[] args) {

        //passed in Run - Program Arguments
        //two arguments passed into main method as a String array
        //in the variable object named args[] so we need to parse them
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        //two static public methods addition() and subtraction()
        //which are called using the Class name "public class Calculate"
        //call static methods just use the className.methodName() for example Calculate.addition().
        System.out.println("Addition result: " + Calculate.addition(num1, num2));
        System.out.println("Subtraction result: " + Calculate.subtraction(num1, num2));

        //two non-static public methods multiply() and division()
        //which are called using the calculate object
        //below created an object "cal"

        //To call non-static methods, you will need to first instantiate an object of that class
        Calculate cal = new Calculate();

        //then call the method using the object objectName.methodName() for example calc.addition()
        System.out.println("Multiplication result: " + cal.multiplication(num1, num2));
        System.out.println("Division result: " + cal.division(num1, num2));



    }
}
