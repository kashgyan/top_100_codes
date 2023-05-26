import java.util.*;
class HelloWorld {
    static boolean isPalindrome(int num){
        int rev = 0;
        int temp = num;
        while(temp>0){
            int rem = temp%10;
                rev = rev *10 + rem;
                temp = temp /10;
        }
        if(rev== num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = scn.nextInt();
        if(isPalindrome(num1)==true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
