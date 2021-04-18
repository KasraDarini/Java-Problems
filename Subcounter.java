import java.util.Scanner;

public class Subcounter {
    public static int sub(String a , String b ){
        int cnt=0;
        for(int i = 0 ; i < a.length() ; i++){
            for (int j = i+1; j <a.length() ; j++) {
                if(a.substring(i , j+1).equals(b)){
                    cnt++ ;
                }
            }
        }
        return cnt ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        String a  = sc.next();
        String b = sc.next() ;
        System.out.println(sub(a,b));
    }
}
