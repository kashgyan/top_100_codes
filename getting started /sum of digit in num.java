import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = scn.nextInt();
        int temp = num1;
        int count =0;
        while(temp>0){
            int rem = temp%10;
            count = count +rem;
            temp = temp/10;
        }
        System.out.println("the sum of the given numbert is " + count);
    }
}
