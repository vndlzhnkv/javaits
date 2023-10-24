public class Main {
    public static Double firstEquation (double a, double b, double c, double d) {
        try {
            double y = 0;
            double firstPart = 4 * Math.sinh(Math.sqrt(Math.abs(a) / Math.abs(b)));
            double secondPart = 3 * Math.asin(c);
            y = Math.pow(firstPart + secondPart, d);

            return y;
        } catch (Exception ex) {
            System.out.println("Error occurred: " + ex.getMessage());
            return null;
        }
    }

    public static Double secondEquation (double a, double b, double c, double d) {
        try {
            double y = 0;
            double firstPart = (5 * c) / Math.cos(a);
            double secondPart = Math.sqrt(Math.sinh((Math.abs(b) * c)) / Math.tan(d));
            y = firstPart + secondPart;

            return y;
        } catch (Exception ex) {
            System.out.println("Error occurred: " + ex.getMessage());
            return null;
        }
    }

    public static Double thirdEquation (double a, double b, double c, double d) {
        try {
            double y = 0;
            double firstPart = Math.cos(b) + Math.sin(Math.sqrt(a));
            double secondPart = 2 * Math.log(c) + Math.pow(Math.E, d);
            y= firstPart / secondPart;

            return y;
        } catch (Exception ex) {
            System.out.println("Error occurred: " + ex.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(firstEquation(1.23, -0.34, 0.707, 2.312));
        System.out.println(secondEquation(-3.45, -2.34, 1.45, 0.83));
        System.out.println(thirdEquation(0.345, -2.25, 2.65, 3.99));
    }
}