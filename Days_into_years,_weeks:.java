import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        int years,weeks,days;
        Scanner sc=new Scanner(System.in);
        days=sc.nextInt();
        years=(days / 365);
        weeks=(days % 365)/7;
        System.out.println(years);
        System.out.println(weeks);
        
    }
}