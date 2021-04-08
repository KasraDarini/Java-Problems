public class Mathsolver {
    // Solves a*x +b = 0
    public static void eq1(double a, double b){

        double x = -b/a;
        System.out.println(x);

    }
    //Solves a*x*x + b*x +c = 0
    public static void eq2(double a, double b, double c){
        double delta = (b*b) -(4*a*c);
        if(delta >0){
            double root1 = (-b + (Math.sqrt(delta)));
            double root2 = (-b -(Math.sqrt(delta)));
            System.out.println(root1);
            System.out.println(root2);
        }
        if(delta <0){
            System.out.println("This equation has no real roots");
        }
        if(delta ==0){
            System.out.println(-b/(2*a));
        }
        if(a ==0){
            Mathsolver.eq1(b, c);
        }
    }
    //Displays numbers of a specific range
    public static void num(int a, int b){
        int num = (b-a) +1;
        System.out.format("%,d is the numbers in this range\n", num);
    }
    public static void sum(int a, int b){
        int num = (b-a) +1;
        int sum = ((a+b)/2) * num;
        System.out.format("The sum of numbers is %d", sum);
    }
}