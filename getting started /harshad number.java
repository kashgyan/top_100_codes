
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = scn.nextInt();
        int temp = p;
        int count = 0;
        while(temp>0){
            int rem = temp%10;
            temp = temp /10;
            count = count + rem;
        }
        if(p % count == 0){
            System.out.println("harshad number");
        }else{
            System.out.println("NOt harshad number");
        }
    }
}
