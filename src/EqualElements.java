import java.util.Scanner;

public class EqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean trueFalse = false;
        System.out.println("How many entries will be made? ");
        int length = scanner.nextInt();
        int[] terms = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the term");
            terms[i] = scanner.nextInt();
        }
        if (length > 1 && (terms[0] == terms[length - 1])) {
            trueFalse = true;
        } else {
            trueFalse = false;
        }
        System.out.println(trueFalse);
    }
}
