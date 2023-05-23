
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("give the 1st number");
        int num1 = scn.nextInt();
        System.out.println("give the 2nd  number");
        int num2 = scn.nextInt();
        int temp ;
        temp = Math.max(num1,num2);
        if(num1 == num2){
            System.out.println("both are the same numbers");
        }else{
             System.out.println(temp + " is the greatest number");
        }
        
       
    }
}
