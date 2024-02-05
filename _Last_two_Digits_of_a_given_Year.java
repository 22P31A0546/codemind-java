import java.util.Scanner;
public class Digit{
    public static void main(String[] args)
    {
        int x,y,i=0;
        String z="";
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        while(i<2)
        {
            y=x%10;
            z=y+""+z;
            x=x/10;
            i++;
        }
        System.out.println(z);
    }
}