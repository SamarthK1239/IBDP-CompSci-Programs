import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in celsius");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("The temperature in fahrenheit is approximately: " + fahrenheit);
    }
}
