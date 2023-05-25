import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("first number");
        int num1 = scn.nextInt();
        System.out.println("second number");
        int num2 = scn.nextInt();
        
        static boolean isPrime(int n){
            if(n<2){
                return false;
            }
            for(int i = 2;i<n;i++){
                if(i%2==0){
                    return false;
                }
            }
            return true;
        }
        for(int i =num1;i<num2;i++){
            if(isPrime(i)== true){
                System.out.println(i);
            }
        }
    }
}
