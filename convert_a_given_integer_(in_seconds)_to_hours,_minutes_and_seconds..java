import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Seconds=sc.nextInt();
        int S=Seconds%60;
        int H=Seconds/60;
        int M=H%60;
        H=H/60;
        System.out.print("H:M:S-"+H+":"+M+":"+S);
    }
}