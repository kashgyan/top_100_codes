import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        boolean flag = true;
        for(int i = 2;i<num;i++){
            if(num%i == 0){
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("Prime no");
        }else{
            System.out.println("Composite no");
        }
    }
}
