import java.util.Scanner;
public class Rides
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int hf = sc.nextInt();
        int sf = sc.nextInt();
        int sef = sc.nextInt();
        if(hf>50 && sf>60 && sef>100){
        System.out.println("10");
    }
    else if(hf>50 && sf>60){
        System.out.println("9");
    }
    else if(sf>60 && sef>100){
        System.out.println("8");
    }
else if(hf>50 && sef>100){
        System.out.println("7");
    }
    else if(hf>50 || sf>60 || sef>100){
        System.out.println("6");
    }
    else{
        System.out.println("5"); 
    }
  }
}