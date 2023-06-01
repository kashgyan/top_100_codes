import java.util.*;
class HelloWorld {
    public static int  FactorSum(int num){
        int count = 0;
        int temp = num  ;
        for(int i =1;i<temp ;i++){
            if(temp % i == 0){
                count = count +i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number1 ");
        int p1 = scn.nextInt();
        System.out.println("Enter the number2 ");
        int p2 = scn.nextInt();
        
        int temp1 = p1;
        int temp2 = p2;
        
        int t1 = FactorSum(p1);
        System.out.println("factor sum is "+ t1);
        int t2 = FactorSum(p2);
        System.out.println("factor sum is "+ t2);
        
        int f1 = p1/t1;
        int f2 = p2/t2;
        
        if(f1 == f2){
            System.out.println("friendly pair");
            
        }else{
            System.out.println("Not friendly pair");
        }
    }
}
