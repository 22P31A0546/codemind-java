import java.util.Scanner;
public class Square
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();  
        sc.close();
        double hypotenuse=Math.sqrt(m*m+n*n);
        System.out.printf("%.2f",hypotenuse);
}
}