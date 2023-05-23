import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("give the 1st number");
        int num1 = scn.nextInt();
        System.out.println("give the 2nd  number");
        int num2 = scn.nextInt();
        
        int count = 0;
        for(int i = num1;i<=num2;i++){
            count = count + i;
        }
        System.out.println("the sum of the numbers is "+ count);
    }
}
