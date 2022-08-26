package Problems;

import java.util.Arrays;

public class threeSumProblem {

    public void threeSum(int[] arr, int target){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int j = i+1;
            int k = arr.length - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    j++;
                    k--;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,7,6,3,8,9,10};
        threeSumProblem t = new threeSumProblem();
        t.threeSum(arr, 16);
    }
}
