public class Main {
    public static Double firstEquation (double z, int k) {
        if (k >= 15) throw new IllegalArgumentException("Incorrect value for argument k!!!");
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += (1 / Math.sqrt(z * i)) + Math.tan(k / i);
        }

        return sum;
    }

    public static Double secondEquation (int t, int l) {
        double sum = 0;
        if (l % 2 != 0) {
            for (int i = 1; i <= t; i++) {
                sum += Math.sqrt(t * l);
            }
        } else {
            for (int i = 1; i <= t; i++) {
                sum += 1 / Math.sqrt(t);
            }
        }
        return sum;
    }

    public static Double thirdEquation (double e) {
        if (e <= 0) throw new IllegalArgumentException("Incorrect value for argument e!!!");
        double sum = 0;
        for (int i = 1; i< Double.POSITIVE_INFINITY; i++) {
            double top = Math.pow(-1, i + 1);
            double bottom = i * (i + 1) * (i * 2);
            double current = top / bottom;
            if (Math.abs(current) < e) {
                break;
            }
            sum += current;
        }
        return sum;
    }

    static void printResults(double z, int k) {
        System.out.print("z: " + z + " k: " + k + " result: ");
        try {
            System.out.println(firstEquation(z, k));
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    static void printResults2(int t, int l) {
        System.out.print("t: " + t + " l: " + l + " result: ");
        try {
            System.out.println(secondEquation(t, l));
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    static void printResults3(double e) {
        System.out.print("e: " + e + " result: ");
        try {
            System.out.println(thirdEquation(e));
        } catch (IllegalArgumentException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        printResults(2, 5);
        printResults2(2, 4);
        printResults3(0.001);
    }
}