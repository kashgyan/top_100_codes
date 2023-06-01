import java.util.*;
class HelloWorld {
    public static int fact(int num){
        int temp = num;
        if(num ==0|| num ==1){
            return 1;
        }else{
            int count = 1;
            for(int i = 1;i< temp;i++){
                count = count + count*i;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the num");
        int p = scn.nextInt();
        int k = p;
        int count = 0;
        while(k>0){
            int rem = k%10;
            k = k/10;
            count = count+fact(rem);
        }
        System.out.println("the sum no is" +count);
        if(count == p){
            System.out.println("strong number");
        }else{
            System.out.println("Not Strong number");
        }
    }
}
