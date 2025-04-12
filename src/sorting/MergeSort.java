package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting:");
        printArray(array);

        divide(array, 0, array.length - 1);

        System.out.println("After sorting:");
        printArray(array);
    }

    // Divide method (recursively splits the array)
    public static void divide(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Divide left half
            divide(array, left, mid);

            // Divide right half
            divide(array, mid + 1, right);

            // Conquer (merge sorted halves)
            conquer(array, left, mid, right);
        }
    }

    // Conquer method (merges two sorted halves)
    public static void conquer(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge both halves
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
