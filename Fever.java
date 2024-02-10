import java.util.Scanner;
public class Fever
{
    public static void main(String[] args)
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        if(temp>98)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}