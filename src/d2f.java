import java.util.Scanner;

public class d2f {
    public static void main(String[] args) {
        float fahrenheit,celsius;
        Scanner obj=new Scanner(System.in);
        System.out.println("Your Temperature in fahrenheit: ");
        fahrenheit= obj.nextFloat();
        celsius=(fahrenheit-32)*((float) 5 /9);
//                                        ((float) (5/9))
        System.out.println(celsius);


    }
}
