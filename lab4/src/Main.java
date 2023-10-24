public class Main {
    public static int sumOfMultiplesOf3(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            if (num % 3 == 0) {
                sum += num;
            }
        }

        return sum;
    }
    public static int sumThirdAndMaxPositive(int[] array) {
        if (array.length < 3) {
            System.out.println("Array is too short!");
            return 0;
        }

        int thirdElement = array[2];

        int maxElement = array[0];
        for (int i : array) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        if (maxElement < 0) {
            System.out.println("The biggest elemnt is not positive");
            return 0;
        }
        return thirdElement + maxElement;
    }
    public static int[] formArrayC(int[] A, int[] B) {
        int n = Math.min(A.length, B.length);
        int[] C = new int[n];

        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && B[i] > 0) {
                C[i] = A[i] + B[i];
            } else if (A[i] < 0 && B[i] < 0) {
                C[i] = A[i] * B[i];
            } else {
                C[i] = 0;
            }
        }

        return C;
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] A = {2, -3, 4, -5, -6};
        int[] B = {1, 7, 4, -2, 0};
        int result = sumOfMultiplesOf3(numbers);
        System.out.println("Sum of multiples of 3: " + result);
        System.out.println( sumThirdAndMaxPositive(numbers));

        int[] C = formArrayC(A, B);
        printArray(C);
    }
}
