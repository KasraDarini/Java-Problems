import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 1 && a <= 60) {
            for (int i = 1; i <= a; i++) {
                if (i == 1) {
                    for (int m = 1; m <= a; m++) {
                        if(m !=a) {
                            System.out.print(m + " ");
                        }
                        else{
                            System.out.print(m);
                        }
                    }
                    System.out.print("\n");
                }
                if (i >= 1) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print(" ");
                    }
                }

                for (int j = i + 1; j <= a; j++) {
                    if(j !=a ) {
                        System.out.print(j +" ");
                    }
                    else{
                        System.out.print(j);
                    }
                }
                if (i != a) {
                    System.out.print("\n");
                }

            }
            for (int g = a - 1; g >= 1; g--) {
                if (a - 1 >= g) {
                    for (int f = 1; f <= g - 1; f++) {
                        System.out.print(" ");
                    }
                }


                for (int h = g; h <= a; h++) {
                    if(h !=a) {
                        System.out.print(h + " ");
                    }
                    else{
                        System.out.print(h);
                    }
                }
                if (g != 1) {
                    System.out.print("\n");
                }
            }

        }
    }
}