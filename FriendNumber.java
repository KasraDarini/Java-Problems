import java.util.Scanner;

public class FriendNumber{
    public static void ReverseArray(int a){
        Scanner scan = new Scanner(System.in);
        int [] array =new int[a];
        for(int i =0; i<= a-1; i++){
            array[i] = scan.nextInt();
        }

        for(int c = 0;c<=((a /2) -1);c++ ){
            int temp = array[a-1 -(c)];
            array[(a-1) -(c)] = array[c];
            array[c] = temp;

        }
        for(int i = 0  ; i <= a-1;i++){
            System.out.print(array[i] +" ");
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        ReverseArray(a);
    }
}