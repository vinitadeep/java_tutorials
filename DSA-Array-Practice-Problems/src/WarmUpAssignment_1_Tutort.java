public class WarmUpAssignment_1_Tutort {
    //Q1. Given an array of N integers. Your task is to print the sum of all of the integers.
    public static int printSumOfArray(int[] arr){
        int sum = 0;
        if(arr.length == 0){
            return 0;
        }
        for(int eachElement : arr) sum += eachElement;
        return sum;
    }

    //Q2. Given an array A[] of N integers and an index Key. Your task is to print the element present at
    //index key in the array
    public static int printElementAtIndex(int[] arr, int index){
        if(arr.length == 0){
            return 0;
        }
        return arr[index];
    }

    //Q3. Given a sorted array A of size N. Find number of elements which are less than or equal to given element X
    public static int findNumberOfElements(int[] arr, int x){
        int count = 0;
        if(arr.length == 0){
            return 0;
        }
        for (int j : arr) {
            if (j <= x) count++;
        }
        return count;
    }
    //Q4. You are given an array A of size N. You need to print elements of A in alternate order (starting
    //from index 0).
    public static int[] findAlternateArray(int[] arr){
        int[] newArr = new int[Math.abs(arr.length/2)];
        if(arr.length == 0){
            return null;
        }
        for (int i=0,k=0; i< arr.length; i+=2) {
            newArr[k] = arr[i];
            k++;
        }
        return newArr;
    }
    //Q5. Given an array Arr of N positive integers. Your task is to find the elements whose value is equal
    //to that of its index value ( Consider 1-based indexing )
    public static void findElementsEqualToIndex(int[] arr){
        if(arr.length == 0){
            return;
        }
        for (int i=0; i < arr.length; i++) {
            if(arr[i] == i+1){
                System.out.println(arr[i]);
            }
        }
    }

    //Given an array of size N and you have to tell whether the array is perfect or not. An array is said
    //to be perfect if it's reverse array matches the original array. If the array is perfect then print
    //"PERFECT" else print "NOT PERFECT"
    public static void checkIfPerfect(int[] arr){
        if(arr.length == 0){
            return;
        }
        int n = arr.length;
        for (int i=0; i < n / 2 ; i++) {
            if(arr[i] == arr[n-1]){
                System.out.println("NOT PERFECT");
            }
            else{
                System.out.println("NOT PERFECT");
                break;
            }
            n--;
        }
    }

    //Q7. Given an array of length N, at each step it is reduced by 1 element. In the first step the maximum
    //element would be removed, while in the second step minimum element of the remaining array would
    //be removed, in the third step again the maximum and so on. Continue this till the array contains only 1
    //element. And find the final element remaining in the array.
    public static int findFinalElement(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        else if(arr.length == 1){
            return arr[0];
        }
        else{
            int size = arr.length;                // effective size of array
            boolean removeMax = true;    // step 1: remove max

            while (size > 1) {
                int idx = -1;
                if (removeMax) {
                    int max = arr[0];
                    idx = 0;
                    for (int i = 1; i < size; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                            idx = i;
                        }
                    }
                } else {
                    int min = arr[0];
                    idx = 0;
                    for (int i = 1; i < size; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                            idx = i;
                        }
                    }
                }

                for (int i = idx; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;                 // reduce effective array size
                removeMax = !removeMax; // alternate between max and min
            }
            return arr[0];
        }
    }

    //Q8. Given an array of N distinct elements, the task is to find all elements in array except two greatest
    //elements in sorted order.
    public static void findSortedElements(int[] arr){
        //a[] = {2, 8, 7, 1, 5}
        if(arr.length == 0) return;
        if(arr.length == 1) System.out.println("Distinct Element : "+arr[0]);
        if(arr.length >= 2){
            int n = arr.length;
            int min_index = -1;

            for(int i = 0; i < n; i++) {
                int min_ele = Integer.MAX_VALUE;
                for (int j = i; j < n; j++) {
                    if (arr[j] < min_ele) {
                        min_ele = arr[j];
                        min_index = j;
                    }
                }
                if(min_index != 0){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[min_index];
                    arr[min_index] = temp;
                }
            }
            for(int x = 0; x < n-2; x++) {
                System.out.println("Each Element Is : " + arr[x]);
            }
        }
    }

    //Q9. Write a program to find the sum of the given series 1+2+3+
    //. . . . . .(N terms)
    public static int findSum(int n){
        int sumtotal = 0;
        for(int x = n; x > 0; x--){
            sumtotal+=x;
        }
        return sumtotal;
    }

    //Q10. Given a number N. Your task is to check whether it is fascinating or not.
    //Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and
    //when both these products are concatenated with the original number, then it results in all digits from 1
    //to 9 present exactly once.
    public static boolean findFascinatingNumber(int n){
        String finalNumberAsString = n + String.valueOf(n*2) + n * 3;
        for(int i = 0; i < finalNumberAsString.length(); i++){
            if(finalNumberAsString.charAt(i) == 0) return false;
            char temp_char = finalNumberAsString.charAt(i);
            for(int j = i+1; j < finalNumberAsString.length(); j++){
                if(finalNumberAsString.charAt(j) == temp_char) {return false;}
            }
        }
        return true;
    }

    //Bonus Question
    //Given an array of even size N, task is to find minimum value that can be added to an element so that
    //array become balanced. An array is balanced if the sum of the left half of the array elements is equal
    //to the sum of right half.
    public static int findBalancingElement(int[] arr){
        int balancingElement = 0;
        int n = arr.length;
        if(n == 0) return balancingElement;
        if(n > 1 && n%2 == 0){
            int sum_firstHalf = 0;
            int sum_secondHalf = 0;
            for(int i = 0; i <= n/2; i++){
                sum_firstHalf += arr[i];
            }
            for(int j = (n/2) + 1; j < n; j++){
                sum_secondHalf += arr[j];
            }
            balancingElement = Math.abs(sum_firstHalf - sum_secondHalf);
        }
        return balancingElement;
    }

    public static void main(String[] args) {
        int totalSum = printSumOfArray(new int[]{5, 8, 3, 10, 22, 45});
        System.out.println("Total Sum Is : "+totalSum);

        int indexElement = printElementAtIndex(new int[]{5, 8, 3, 10, 22, 45}, 3);
        System.out.println("Index Element Is : "+indexElement);

        int count = findNumberOfElements(new int[]{5, 8, 3, 10, 22, 45}, 20);
        System.out.println("Count Is : "+count);

        int[] alternateArray = findAlternateArray(new int[]{5, 8, 3, 10, 22, 45});
        assert alternateArray != null;
        for(int j : alternateArray) {
            System.out.println("Alternate Array Element Is : " + j);
        }
        findElementsEqualToIndex(new int[]{5, 2, 3, 10, 22, 45});

        checkIfPerfect(new int[]{5, 2, 3, 10, 22, 45});
        checkIfPerfect(new int[]{1,2,3,2,1});

        int sumTotal = findSum(5);
        System.out.println("Sum of n numbers is : " + sumTotal);

        int finalElement = findFinalElement(new int[]{7, 8, 10, 2, 4});
        System.out.println("Final element is : " + finalElement);

        findSortedElements(new int[]{2, 8, 7, 1, 5});

        boolean isFascinating = findFascinatingNumber(192);
        System.out.println("isFascinating : " + isFascinating);

        int balancingElement = findBalancingElement(new int[]{ 1, 2, 1, 2, 1, 3 });
        System.out.println("balancingElement : " + balancingElement);
    }
}
