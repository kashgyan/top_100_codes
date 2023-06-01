import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = scn.nextInt();
        int temp = p;
        int count = 1;
        for(int i =2;i<temp;i++){
            if(temp%i == 0){
                count = count +i;
            }
        }
        if(count == temp){
            System.out.println("perfect Number");
        }else{
            System.out.println("not perfect Number");
        }
    }
}
