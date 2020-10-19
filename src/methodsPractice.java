import java.util.Scanner;

/*
Java program to perform slightly more complex operations. Still carries over from methods.java
Author: Samarth Kulkarni
 */
public class methodsPractice {

    public static void main(String[] args) {
        String[] strings = inputStringArray();
        int[] ints = inputIntArray();

        printStringOutputs(strings);
        printIntegerOutputs(ints);
    }

    public static String[] inputStringArray() {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.println("Enter the string values: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.next();
        }
        return arr;
    }

    public static int[] inputIntArray() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the integer values: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printStringOutputs(String[] input) {
        for (int i = 0; i < 5; i++) {
            System.out.println(input[i]);
        }
    }

    public static void printIntegerOutputs(int[] input) {
        for (int i = 0; i < 5; i++) {
            System.out.println(input[i]);
        }
    }
}
