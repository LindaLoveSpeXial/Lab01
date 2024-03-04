public class JAP106 {
    public static double f(double number){
        System.out.printf("f<%.1f> = %.4f\n" , number , 3 * (Math.pow(number , 3)) + 2 * number - 1);
        return 0;
    }
    public static void main(String[] args){
        f(-3.2);
        f(-2.1);
        f(0);
        f(2.1);
    }
}