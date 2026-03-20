public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 20, 15 };

        // basic check to see if array has at least 2 elements
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // looping through array to find largest and second largest without sorting
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // old max becomes the new second max
                secondMax = max;
                // update max
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                // if it's less than max but greater than current second max
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Output: " + secondMax);
        }
    }
}
