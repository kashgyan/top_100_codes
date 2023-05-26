import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scn.nextInt();
        int temp = num;
        int rev = 0;
        while(temp>0){
            int rem = temp%10;
             rev = rev*10+rem;
            temp = temp/10;
        }
        System.out.println("the reversed num is " + rev);
    }
}
