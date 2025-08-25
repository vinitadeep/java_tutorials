public class LargestElement {
    public static int returnLargestElement(int[] a) {
        int n = a.length;
        int largestNum = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > largestNum) {
                largestNum = a[i];
            }
        }
        return largestNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 5};
        int b = returnLargestElement(arr);
        System.out.println("Largest element: " + b);  // Added print statement to see result
    }
}