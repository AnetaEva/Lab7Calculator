package edu.psu.abington.ist.ist242;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    Main main = new Main();

    @Test
    public void addition() {
        try {
            assertTrue(Calculate.addition(5, 5) == 10);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void subtraction() {
        try {
            assertFalse(Calculate.subtraction(5, 5) == 7);
        }
        catch (Exception e){
            System.out.println("Eception: " + e.getMessage());
        }
    }

    @Test
    public void multiplication() {
        try{
            assertTrue(Calculate.multiplication(5, 5) == 25);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void division() {
        try {
            assertFalse(Calculate.division(5, 5) == 2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}