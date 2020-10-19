/*
Java program to demonstrate implementation of basic methods (both void and non-void methods)
Author: Samarth Kulkarni
 */
public class basicMethods {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String s = "Hello world";

        System.out.println(addNumbers(x, y));
        printString(s);

    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }

    public static void printString(String inputString) {
        System.out.println(inputString);
    }
}

