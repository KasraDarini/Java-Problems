import java.util.Scanner;

public class SchoolQueue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;

        int num = sc.nextInt() ;
        int t = sc.nextInt() ;
        String queue = sc.next() ;
        char [] arr = queue.toCharArray() ;
        for(int i =0 ; i <t ; i++){

            for(int j = 0 ; j < num ; j+=1) {
                if (j + 1 < num) {
                    if (arr[j] == 'B' && arr[j+1] == 'G') {
                        arr[j] = 'G' ;
                        arr[j+1] = 'B' ;
                        j++ ;
                    }
                }
            }
        }

        for(int i =0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
