import java.util.Scanner;
public class Multiply
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float sum=a*b;
        System.out.printf("%.2f",sum);
    }
}