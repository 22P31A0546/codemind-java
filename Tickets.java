import java.util.Scanner;
public class Ticket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if(a*4<=1000)
        {
            System.out.println("YES");
        }
            else
            {
                System.out.println("NO");
            }
        
         
    }
}