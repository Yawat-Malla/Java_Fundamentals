import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        float principle,time,rate,si;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your Principle");
        principle=obj.nextFloat();
        System.out.println("Enter Your Rate");
        rate=obj.nextFloat();
        System.out.println("Enter Your Time");
        time=obj.nextFloat();
        si=(float) (principle*time*rate)/100;
        System.out.println(si);
    }
}
