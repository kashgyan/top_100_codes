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
        if(num1 == num2 && num2 == num3){
            System.out.println("all the 3 numbers are same");
        }else{
        temp = num1>num2? num1:num2;
        res = temp>num3 ? temp:num3;
        
        System.out.println(res+ " is the largest among all the 3 numbers");
        }
        
    }
}
