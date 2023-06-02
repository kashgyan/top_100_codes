import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn  = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int p = scn.nextInt();
        int arr [] = new int [p];
        for(int i = 0;i<p ;i++){
            System.out.println("please give the element at "+ i + " index"     );
            arr[i] = scn.nextInt();
        }
        for(int i = 0;i<p;i++){
            System.out.println(" element at "+ i + " index is "     );
            System.out.println(arr[i]);
        }
    }
}
