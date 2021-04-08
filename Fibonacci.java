import java.util.*;
public class WriteandErase{
   static int n1=0 , n2=1 , n3=0 ;static boolean isfibo =false;
    public static boolean fibo(int a) {
       for(int i =0; i<=a ; i++){

            n3 = n2+ n1;
            n1=n2;
            n2 =n3 ;
            if(a == n3){
                isfibo=true;
                break ;
            }

        }

        return isfibo;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        int a = scan.nextInt();
        System.out.println(fibo(a));
    }
}
