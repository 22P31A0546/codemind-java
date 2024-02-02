import java.util.Scanner;
public class hypo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double sum=Math.sqrt(a*a+b*b);
        System.out.printf("%.2f",sum);
    }
}