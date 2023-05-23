import java.util.*;

public class PorN{
 public static void main(String main[]){
    Scanner scn  = new Scanner(System.in);
    System.out.println("please gibe the number");
    int p = scn.nextInt();
    if(p>0){
        System.out.println("positive no ");
    }else if(p<0){
        System.out.println("negetiv no");
    }else{
        System.out.println("zero");
    }
 }
}
