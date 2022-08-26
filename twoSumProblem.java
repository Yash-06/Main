package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {

    // public static int[] twoSum(int[] numbers, int target){
    //     int[] result = new int[2];
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int i=0;i<numbers.length;i++){
    //         if(!map.containsKey((target - numbers[i]))){
    //             map.put(numbers[i], i);
    //         }
    //         else{
    //             result[1] = i;
    //             result[0] = map.get(target - numbers[i]);
    //             return result;
    //         }
    //     }
    //     throw new IllegalArgumentException("Two number not found !!!");
    // }
    
    // Second approach :

    public static int[] twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int[] result = new int[2];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        throw new IllegalArgumentException("No two number makes sum as target !!!");
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        twoSumProblem t = new twoSumProblem();
        int[] arr = {2,4,6,7,8,9,10};
        // int[] numbers = {6,3,2,11,5,10,7};
        // int[] result = twoSum(numbers, 9);
        // System.out.println("The two indices are : " + result[0] + 
        // " and " + result[1]);
        int[] result = twoSum(arr, 19);
        t.printArray(result);

    }
}
