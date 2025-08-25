public class ReverseArray {
    public static int[] returnReverseArray(int[] a){
        int n = a.length;
        if(n == 0){
            return a;
        }
        else{
            for(int i = 0; i < n/2; i++){
                int temp = a[i];
                a[i] = a[n - 1 - i];
                a[n - 1 - i] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] b = returnReverseArray(arr);
        for (int num : b) {
            System.out.print(num + " ");
        }
    }
}