package edu.psu.abington.ist.ist242;

public class Calculate {

    //two static public methods addition() and subtraction()
    //changed to four static public methods

    /***
     * <h1>Add Two Numbers!</h1>
     * The addition program implements an application that
     * simply adds two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to addition method
     * @param num2 This is the second parameter to the addition method
     * @return int This returns sum of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static int addition (int num1, int num2) {
        return num1 + num2;
    }

    /***
     * <h1>Subtract Two Numbers!</h1>
     * The subtraction program implements an application that
     * simply subtracts two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to subtraction method
     * @param num2 This is the second parameter to the subtraction method
     * @return int This returns difference of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static int subtraction (int num1, int num2) {
        return num1 - num2;
    }

    //two non-static public methods multiply() and division()
    //4.22.2020 - became static because of the tests

    /***
     * <h1>Multiply Two Numbers!</h1>
     * The multiplication program implements an application that
     * simply multiplies two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to multiplication method
     * @param num2 This is the second parameter to the multiplication method
     * @return int This returns the product of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static int multiplication (int num1, int num2) {
        return num1 * num2;
    }

    /***
     * <h1>Divide Two Numbers!</h1>
     * The division program implements an application that
     * simply divides two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to division method
     * @param num2 This is the second parameter to the division method
     * @return int This returns the quotient of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static int division (int num1, int num2) {
        return num1 / num2;

    }
}
