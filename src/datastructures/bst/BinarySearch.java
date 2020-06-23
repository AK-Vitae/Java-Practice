package datastructures.bst;

public class BinarySearch {
    //Iterative Approach
    public int binarySearch(int[] arr, int x) {
        //1. Initialize the whole interval to search
        int low = 0;
        int high = arr.length - 1;
        //2. Iteratively search
        while (low <= high) {
            //2.1. Locate the middle item index
            int mid = (high + low) / 2;

            //2.2 check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            //2.3 If x is larger, ignore left half, and update low as mid + 1
            if (arr[mid] < x) {
                low = mid + 1;

            } else { //2.4 If x is smaller, ignore right half, and update high as mid - 1
                high = mid - 1;
            }

        }
        //3. If not found, return -1
        return -1;
    }

    //Recursive Approach
    public int recursiveBinarySearch(int[] arr, int low, int high, int x) { //(A,0,A.length-1,target)
        if (low<=high) {
            //1. Locate the middle item/index
            int mid = (high + low) / 2;
            //2. Check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }
            //3. if x is smaller, search left half
            if (x < arr[mid]) {
                return recursiveBinarySearch(arr, low, mid - 1, x);
            } else { //4. IF x is larger, search right half
                return recursiveBinarySearch(arr, mid + 1, high, x);
            }
        }
        //5. If not found, return -1
        return -1;
    }
}
