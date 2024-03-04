import java.util.Scanner;
public class JAP105 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入您的姓名:");
        String a=scn.nextLine();
        System.out.println("Hi, "+a+",請輸入您銅板的個數:");
        System.out.printf("請輸入1元的數量:");
        int b=scn.nextInt();
        System.out.printf("請輸入5元的數量:");
        int c=scn.nextInt();
        System.out.printf("請輸入10元的數量:");
        int d=scn.nextInt();
        System.out.printf("請輸入50元的數量:");
        int e=scn.nextInt();
        int f=b+c*5+d*10+e*50;
        int aa=f/1000;
        int bb=(f%1000)/100;
        int cc=(f%100)/10;
        int dd=f%10;
        System.out.printf("您的錢總共有: %d 千 %d 百 %d 十 %d 元",aa,bb,cc,dd);
        scn.close();
    }   
}
