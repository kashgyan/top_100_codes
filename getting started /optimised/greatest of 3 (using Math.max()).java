
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("give the 1st number");
        int num1 = scn.nextInt();
        System.out.println("give the 2nd  number");
        int num2 = scn.nextInt();
        System.out.println("give the 3rd  number");
        int num3 = scn.nextInt();
        
        int temp ;
        int res;
        temp = Math.max(num1,num2);
        res = Math.max(temp,num3);
        
        System.out.println(res+ " is the largest among all the 3 numbers");
    }
}
