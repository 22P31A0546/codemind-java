import java.util.Scanner;
public class Convert
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Double k = sc.nextDouble();
        Double m = k*5/18;
        System.out.printf("%.2f",m);
    }
}