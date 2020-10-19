/*
It is a block of code that runs only when called

 */
public class Methods {
    static int printRes (int height, int width){
        int result = width * height;
        return result;
    }

    public static void main(String[] args){
        int num = 1920;
        int num2 = 1080;

        int resolution = printRes(num, num2);
        System.out.println(resolution);
    }
}
