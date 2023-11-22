import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give the string");
        StringBuilder sb = new StringBuilder(scn.nextLine());
        System.out.println(sb);
        for(int i =0;i<sb.length();i++){
            boolean flag = true;// small
            char ch = sb.charAt(i);
            int asci = (int)ch;
           if(asci<97 ){
               flag = false;
           }
           if(flag == true){
               asci = asci -32;
               char dh = (char)asci;
               sb.setCharAt(i,dh);
           }else{
               asci = asci +32;
               char dh = (char)asci;
               sb.setCharAt(i,dh);
           }
        }
        System.out.println(sb);
    }
}
