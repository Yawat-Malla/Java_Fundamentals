import java.util.Scanner;

public class nrp2usd {
    public static void main(String[] args) {
        float npr,usd;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Your Amount in NPR");
        npr= obj.nextFloat();
        usd= (float) (npr/132.29);
        System.out.println("The equivalent USD of NRP "+ npr+" is: "+usd);
    }
}
