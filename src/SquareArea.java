import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the side of your square");
        int side = scanner.nextInt();

        int area = side * side;

        System.out.println("The area of the square is " + area);
    }
}
