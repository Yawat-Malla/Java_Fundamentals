    import java.util.Scanner;

    public class area{
        public static void main(String[] args) {
            float length,area;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the Length of Your Square");
            length= obj.nextFloat();
            area=length*length;
            System.out.println("Area of the square is :"+area);
        }
    }