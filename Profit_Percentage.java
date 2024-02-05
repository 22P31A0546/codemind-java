import java.util.Scanner;
public class profit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double X=sc.nextDouble();
        double Y=sc.nextDouble();
        double Z=(((Y-X)/X*100));
        System.out.printf("%.2f",Z);
        
    }
}