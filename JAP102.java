import java.util.Scanner;
public class JAP102 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please input:");
        int kg=scn.nextInt();
        System.out.println(kg+" kg ="+kg*2.20462+" ponds");
        scn.close();
    }
}
