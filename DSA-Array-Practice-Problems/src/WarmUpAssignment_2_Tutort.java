import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUpAssignment_2_Tutort {

    public static int reverseNumber(int n) {
        boolean negative = n < 0;
        String s = Integer.toString(Math.abs(n));
        char[] a = s.toCharArray();

        int i = 0, j = a.length - 1;
        while (i < j) {
            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++; j--;
        }

        String revStr = new String(a);

        try {
            int result = Integer.parseInt(revStr);
            return negative ? -result : result;
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static List<Integer> printNthRowOfPascalTriangle(int n){
        if(n == 0) return null;
        ArrayList<Integer> previousArray = new ArrayList<>();
        if(n >= 1){
            for(int i = 1; i < n+1; i++){
                ArrayList<Integer> ithArr = new ArrayList<>();
                int k = 0;
                for(int j = 0; j < i; j++){
                    if(j == 0 || j == i-1){
                        ithArr.add(j, 1);
                    }
                    else{
                        if(!previousArray.isEmpty()) {
                            ithArr.add(j, previousArray.get(k) + previousArray.get(k + 1));
                            k++;
                        }
                    }
                }
                previousArray = new ArrayList<>(ithArr);
            }
            return previousArray;
        }
        return null;
    }

    //LC : https://leetcode.com/problems/richest-customer-wealth
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int sum;
        for (int[] account : accounts) {
            sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    //LC : https://leetcode.com/problems/running-sum-of-1d-array/
    public int[] runningSum(int[] nums) {
        int[] runningSumArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < i + 1; j++){
                sum += nums[j];
            }
            runningSumArray[i] = sum;
        }
        return runningSumArray;
    }

    //https://leetcode.com/problems/jewels-and-stones/
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i < stones.length(); i++){ //aAAbbbb
            for(int j = 0; j < jewels.length(); j++){ //aA
                if(jewels.charAt(j) == stones.charAt(i)) count++;
            }
        }
        return count;
    }
    //https://leetcode.com/problems/three-consecutive-odds/
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length == 0 || arr.length == 1 || arr.length == 2) return false;
        for(int i = 2; i < arr.length; i++){
            if(arr[i-2]%2 != 0 && arr[i-1]%2 != 0 && arr[i]%2 != 0){
                return true;
            }
        }
        return false;
    }

    //LC https://leetcode.com/problems/move-zeroes/
    public void moveZeroes(int[] nums) {
        int zero_index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zero_index = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] != 0 && zero_index != -1){
                    nums[zero_index] = nums[j];
                    nums[j] = 0;
                    break;
                }
            }
        }
    }

    //https://leetcode.com/problems/minimum-absolute-difference/
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr == null || arr.length < 2) return res;

        Arrays.sort(arr); // O(n log n)

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1]; // safe because arr is sorted, diff >= 0
            if (diff < minDiff) minDiff = diff;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }


    public static void main(String[] args) {
       int reversedNum = reverseNumber(-152);
       System.out.println("Reversed Number : "+reversedNum);

        List<Integer> pascalTriangleRow = printNthRowOfPascalTriangle(1);
        System.out.println("pascalTriangleRow : "+pascalTriangleRow);
    }
}
