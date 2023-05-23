import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("give the  number");
        int num = scn.nextInt();
        int count = 0;
        for(int i =0;i<=num;i++){
            count = count +i;
        }
        System.out.println("the sum of given number is "+ count);
        
    }
}
