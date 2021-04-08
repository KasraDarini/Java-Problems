import java.util.Scanner;
public class HiPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in ) ;

        String a =input.nextLine() ;
        int Hellocount = 0 ;
        for(int i = 0; i <a.length() ; i++ ){
            for(int j=i+1 ; j < a.length() ; j++){
                if(a.substring(i , j+1).equals("Hello")){
                    Hellocount++ ;
                }
            }
        }
        System.out.print(Hellocount);
    }
}