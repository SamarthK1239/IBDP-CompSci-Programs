import java.util.Scanner;

public class sumOfSeries2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        System.out.println("Enter the last denominator: ");
        int denominator = scanner.nextInt();

        for(double i = 1; i <= denominator; i++){
            sum = sum + 1/i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
