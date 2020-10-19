import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter the final base term: ");
        int base = scanner.nextInt();

        for(int i = 0; i <= base; i++){
            sum = sum + Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
