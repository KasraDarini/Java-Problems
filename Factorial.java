import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in) ;
        int factorial = 1;
        int a =sc.nextInt() ;
        for(int i = 1 ; i <= a ; i++ ){
             factorial = i * factorial;
        }
        System.out.println(factorial);
    }
}
