import java.util.Scanner;
public class inch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        double cm=2.54*h;
        System.out.printf("%.2f",cm);
    }
}