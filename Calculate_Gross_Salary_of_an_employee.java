import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Double bs = sc.nextDouble();
        Double hra = sc.nextDouble();
        Double da = sc.nextDouble();
        Double pf = bs*0.12;
        Double gs = bs+hra+da+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",gs);
    }
}