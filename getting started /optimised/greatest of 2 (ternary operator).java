import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("give the 1st number");
        int num1 = scn.nextInt();
        System.out.println("give the 2nd  number");
        int num2 = scn.nextInt();
        int temp ;
        if(num1 == num2){
            System.out.println(num1+" both is same ");
        }else{
            temp = num1>num2 ? num1:num2;
            System.out.println(temp+" is the greatest");
        }
        
    }
}
