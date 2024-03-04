import java.util.Scanner;

public class JAP104 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入第一組的x和y座標:");
        float a=scn.nextFloat();
        float b=scn.nextFloat();
        System.out.print("輸入第二組的x和y座標:");
        float c=scn.nextFloat();
        float d=scn.nextFloat();
        double e=Math.sqrt(Math.pow(a-c,2))+(Math.pow(b-d,2));
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f。",a,b,c,d,e);
        scn.close();
    }
}
