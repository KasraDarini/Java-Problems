import java.util.Scanner;

public class Borze{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String brz = sc.next() ;
        int  i = 0 ;
        while(i < brz.length() ){
            if(brz.startsWith(".",i)){
                System.out.print(0);
            }
            if(i+1 < brz.length() ) {
                if (brz.startsWith("-.", i)) {
                    System.out.print(1);
                    i++;
                }
                if (brz.startsWith("--", i)) {
                    System.out.print(2);
                    i++;
                }
            }
            i++;
        }
    }
}
