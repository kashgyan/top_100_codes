import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = scn.nextInt();
        int temp = p;
        
        int sq = (int )Math.sqrt(temp);
        if(sq*sq == temp){
             System.out.println("perfect sq");
        }else{
            System.out.println("not perfect sq");
        }
    }
}
