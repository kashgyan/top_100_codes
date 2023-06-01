
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = scn.nextInt();
        int temp = p;
        int count = 0;
        for(int i = 1;i<temp ; i++){
            if(temp % i == 0){
                count = count +i;
            }
        }
        System.out.println("count "+ count);
        
        if(count > p){
            System.out.println("abundant  number");
        }else{
            System.out.println("Not abundant number");
        }
    }
}
