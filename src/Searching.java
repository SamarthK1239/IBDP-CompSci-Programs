/*
Java program to implement linear and binary searches. References sorting.java to sort array. Required for binary search.
Author: Samarth Kulkarni
 */
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How long should the array be? ");
        int len = scanner.nextInt();

        int[] input = generateArray(len);

        for (int value : input) {
            System.out.println(value);
        }

        System.out.println("///////////////// Bubble sort starts here /////////////////");

        int[] output = sorting.bubbleSort(input);
        int[] output2 = sorting.selectionSort(input);

        for (int i = 0; i < input.length; i++) {
            System.out.println(output[i]);
        }
        System.out.println("///////////////// Selection sort starts here /////////////////");
        for (int i = 0; i < input.length; i++) {
            System.out.println(output2[i]);
        }

        System.out.println("What element are you looking for?");
        int searchValue = scanner.nextInt();

        System.out.println(linearSearch(output, searchValue));
        System.out.println(binarySearch(input, searchValue));

    }

    public static int linearSearch(int[] arr, int searchElement) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                index = i;
            }
        }
        if (index == 0) {
            return -1;
        } else return index;
    }

    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) return mid;

            if (arr[mid] < x) l = mid + 1;

            else r = mid - 1;
        }

        return -1;
    }

    public static int[] generateArray(int len) {
        int[] input = new int[len];

        for (int i = 0; i < len; i++) {
            input[i] = (int) Math.round(Math.random() * (2000 - 1 + 1) + 1);
        }
        return input;
    }
}
