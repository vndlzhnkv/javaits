public class Main {
    public static void printArray(long[] arr) {
        System.out.print("Array Elements: ");
        for (long element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void insertionSort(long array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            long key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] < key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    public static void selectionSort(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i; // find the index of the maximum value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // swap the found maximum value with the value at position 'i'
            long temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        long[] array = {12, 11, 13, 5, 6, 15, 22, 1, 4};
        long[] array2 = {12, 11, 13, 5, 6, 15, 22, 1, 4};
        selectionSort(array);
        insertionSort(array2);
        System.out.println("After sort:");
        System.out.println("Selection sorted");
        printArray(array);
        System.out.println("Insertion sorted");
        printArray(array2);
    }
}