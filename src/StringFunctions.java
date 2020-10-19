/* Required functions for IBDP
+ for concatenation
.equals(String)
.substring(startPos, endPos)
.length()
.indexOf(String)
.compareTo(String)
.toUpperCase()
.toLowerCase()
 */

public class StringFunctions {
    public static void main(String[] args){
        String hello = "Hello";
        String world = "world";

        String concatenate = hello + world;
        Boolean equals = hello.equals(world);
        String substring = hello.substring(0, 2);
        int length = hello.length();
        int indexOf = hello.indexOf('l');
        int compare = hello.compareTo(world);
        String uppercase = hello.toUpperCase();
        String lowercase = world.toLowerCase();

        System.out.println();
    }
}
