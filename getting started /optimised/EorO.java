// using ternary operator
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("give the number");
        int num = scn.nextInt();
        String res = num%2==0? " is even":" is odd";
        System.out.println(num+res);
        
        
    }
}
