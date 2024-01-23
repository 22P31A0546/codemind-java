
import java.util.Scanner;
public class Reach
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int maxdistance=x*5;
        if(maxdistance>=y)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}