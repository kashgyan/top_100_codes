import java.util.*;
class HelloWorld {
    public static boolean isPrime(int num){
            int temp = num;
            for(int i =2;i<temp;i++){
                if(temp%i==0){
                    return false;
                }
            }
            return true;
        }
    public static void PrimeFactor(int k){
        int temp = k;
        for(int i = 2;i<temp;i++){
            if(k%i==0){
                if(isPrime(i)){
                    a.add(i);
                }
            }
        }
    }    
    public static void main(String[] args) {
        ArrayList<int[]> a=new ArrayList<int[]>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = scn.nextInt();
        PrimeFactor(p);
        System.out.println(a);
    }
}
