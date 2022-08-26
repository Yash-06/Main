package Problems;

import java.util.Arrays;

public class maxSubArraySum {

    int max_SubArraySum(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;
        int start = 0;
        for(int end=0;end<arr.length;end++){   // 2 7 3 5 8 1
            windowSum = windowSum + arr[end];
            if(end >= k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        System.out.println(maxSum);
        return maxSum;
    }

    // Below codes number of elements at a time for sum is hard coded.

    public static int maxSum(int[] arr){
        int result[] = new int[arr.length];
        
        int i = 0;
        int j = i+1;
        int k = j+1;
        int sum = 0;
        for(int a=0;a<arr.length-2;a++){
            sum = arr[i] + arr[j] + arr[k];
            result[a] = sum;
            i++;
            j++;
            k++;
        }
        int max = 0;
        for(int l=0;l<result.length;l++){
            if(result[l] > max){
                max = result[l];
            }
        }
        System.out.println(max);
        return max;
    }

   
    public static void main(String[] args) {
        int[] arr = {2,7,3,5,8,1};
        maxSubArraySum m = new maxSubArraySum();
        m.maxSum(arr);
        m.max_SubArraySum(arr, 3);
        
    }
}
