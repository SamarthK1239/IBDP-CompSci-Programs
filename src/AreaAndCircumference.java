import java.util.Scanner;

public class AreaAndCircumference {
    private static final double pi = 3.14159265;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of your circle");
        int radius = scanner.nextInt();

        long circumference = Math.round(radius * pi * 2);
        long area = Math.round(radius * radius * pi);

        System.out.println("The circumference of the circle is " + circumference + " and the area is " + area);

    }
}
