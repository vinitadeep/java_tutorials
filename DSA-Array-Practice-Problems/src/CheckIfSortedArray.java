public class CheckIfSortedArray {
    public static boolean checkIfSortedArray(int[] a) {
        int n = a.length;
        if (n <= 1) return true;

        for (int i = 1; i < n; i++) {
            if (a[i-1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 5};
        boolean b = checkIfSortedArray(arr);
        System.out.println("Array is sorted? " + b);
    }
}
