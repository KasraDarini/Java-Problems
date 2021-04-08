import java.util.Scanner;
public class period {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = num.nextInt();
        if (a > b && b > c) {
            if (d > a) {
                System.out.println("MORE");
            }
            if (d < c) {
                System.out.println("LESS");
            }
            if (d > c && d < b) {
                System.out.println("MID1");
            }
            if (d > b && d < a) {
                System.out.println("MID2");
            }
        }
        if (b > c && c > a) {
            if (d > b) {
                System.out.println("MORE");
            }
            if (d < a) {
                System.out.println("LESS");
            }
            if (d > a && d < c) {
                System.out.println("MID1");
            }
            if (d > c && d < b) {
                System.out.println("MID2");
            }
        }
        if (b > a && a > c) {
            if (d > b) {
                System.out.println("MORE");
            }
            if (d < c) {
                System.out.println("LESS");
            }
            if (d > c && d < a) {
                System.out.println("MID1");
            }
            if (d > a && d < b) {
                System.out.println("MID2");
            }
        }
        if (a > c && c > b) {
            if (d > a) {
                System.out.println("MORE");
            }
            if (d < b) {
                System.out.println("LESS");
            }
            if (d > b && d < c) {
                System.out.println("MID1");
            }
            if (d > c && d < a) {
                System.out.println("MID2");
            }
        }
        if (c > a && a > b) {
            if (d > c) {
                System.out.println("MORE");
            }
            if (d < b) {
                System.out.println("LESS");
            }
            if (d > b && d < a) {
                System.out.println("MID1");
            }
            if (d > a && d < c) {
                System.out.println("MID2");
            }
        }
        if (c > b && b > a) {
            if (d > c) {
                System.out.println("MORE");
            }
            if (d < a) {
                System.out.println("LESS");
            }
            if (d > a && d < b) {
                System.out.println("MID1");
            }
            if (d > b && d < c) {
                System.out.println("MID2");
            }
        }
        if (d == a || d == b || d == c) {
            System.out.println("EQUAL");
        }
    }
}