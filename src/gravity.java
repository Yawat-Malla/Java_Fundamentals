public class gravity {
    public static void main(String[] args) {
        double massEarth = 6 * Math.pow(10, 24);
        double gravitationalConstant = 6.67 * Math.pow(10, -11);
        double gravity = (gravitationalConstant * massEarth) / Math.pow(6.4 * Math.pow(10, 6), 2);

        System.out.println("The gravity of Earth is : " + gravity + " m/s²");
    }
}