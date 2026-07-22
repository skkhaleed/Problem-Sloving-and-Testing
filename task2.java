public class task2 {
   
    /**
     * Performs a binary search on a sorted integer array.
     * @param arr The sorted array to search through.
     * @param target The element to find.
     * @return The index of the target if found; otherwise, -1.
     */
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Safe mid calculation to prevent integer overflow
            int mid = low + (high - low) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid; 
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Target was not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // Input array MUST be sorted
        int[] sortedArray = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int targetValue = 66;

        int resultIndex = search(sortedArray, targetValue);

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

    
