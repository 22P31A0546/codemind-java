import java.util.*;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double PI=3.14;
        double sum=PI*r*r;
        System.out.printf("%.2f",sum);
    }
}