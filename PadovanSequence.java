import java.util.Scanner ;
public class PadovanSequence{
    static int n0 =1 , n1 =1 , n2 =1 , n3= 0 ;
    public static void padovan(int a){
        for(int i =1 ; i <=a ;i++){
            n3 =n0 + n1 ;
            n0 = n1 ;
            n1 =n2 ;
        }
        return n3 ;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in) ; 
	int n = scan.nextInt() ; 
	System.out.print(PadovanSequence(n)) ; 
    }
}
