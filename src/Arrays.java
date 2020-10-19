import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            count++;
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("the max value is: " + max);
        ReverseArray(array, count);
    }

    public static void ReverseArray(int input[], int n) {
        int[] inputArray = new int[n];
        int length = n;
        for (int i = 0; i < n; i++) {
            inputArray[length - 1] = input[i];
            length = length - 1;
        }

        System.out.println("Reversed array is: \n");
        for (int j = 0; j < n; j++) {
            System.out.println(inputArray[j]);
        }
    }
}
