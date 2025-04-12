package sorting;

public class QuickSort {


	    // Main function to call quicksort
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Partition the array
	            int pi = partition(arr, low, high);

	            // Recursively sort subarrays
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    // Partition function
	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];  // Pivot is the last element
	        int i = low - 1;        // Index of smaller element

	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Swap pivot into correct position
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    // Example usage
	    public static void main(String[] args) {
	        int[] arr = {10, 7, 8, 9, 1, 5};
	        quickSort(arr, 0, arr.length - 1);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


