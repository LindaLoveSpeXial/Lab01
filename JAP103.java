import java.util.Scanner;
public class JAP103 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please input:");
        String temp=scn.nextLine();
        String[] s=temp.trim().split(" ");
        scn.close();
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int c=Integer.parseInt(s[2]);
        float d=(a+b+c);
        System.out.print("Average: ");
        System.out.printf("%.2f",d/3);
        
    }
}
