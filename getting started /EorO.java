// even or odd
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("give the number");
        int num = scn.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        
    }
}
