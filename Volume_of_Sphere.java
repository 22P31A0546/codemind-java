import java.util.Scanner;
public class Sphere{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double PI=3.14;
        double sum=4.0/3*PI*r*r*r;
        System.out.printf("%.2f",sum);
    }
}