import java.util.Scanner;

public class Deneme {



   static int a=0;
    static int b=0;
    static int sum=0;


    public static void main(String[] args) {


        Scanner in = new Scanner (System.in);
        a = in.nextInt();
        b = in.nextInt();
        sum=a+b;
        System.out.println(sum);
    }
}