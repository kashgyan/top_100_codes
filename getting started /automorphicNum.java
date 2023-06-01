import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the number");
        int p = scn.nextInt();
        int temp = p;
        int realLast = temp%10;
        int f = temp *temp;
        // System.out.println("f "+f);
        int rem = f%10;
        // System.out.println("rem "+rem);
        // System.out.println("  temp "+p);
        if(rem == realLast){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not Automorphic Number");
        }
    }
}
