import java.util.*;
class HelloWorld {
    public static int len(int k){
        int temp = k;
        int count = 0;
        while(temp>0){
            int rem = temp%10;
            count = count +1;
            temp  = temp/10;
        }
        return count;
    }
    public static int armo(int p){
        int temp = p;
        int nn = 0;
        while(temp>0){
            int rem = temp%10;
            nn = nn+Math.pow(rem,si);
            temp = temp/10;
        }
        return nn;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        int si = len(num);
        System.out.println("the size of "+si);
        int newNum = armo(num);
        System.out.println("the new num "+ newNum);
    }
}



// error is
// ERROR!
// javac /tmp/i72xiT9b8c/HelloWorld.java
// /tmp/i72xiT9b8c/HelloWorld.java:20: error: cannot find symbol
//             nn = nn+Math.pow(rem,si);
//                                  ^
//   symbol:   variable si
//   location: class HelloWorld
// 1 error
