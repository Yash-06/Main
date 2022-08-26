public class kedanesAlgorithm {
    // Used to find the maximum sum sub array

    static int[] arr = {4,3,-2,6,-12,7,-1,6};

    public int maxSubArraySum(int[] arr){
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for(int i=1;i<arr.length;i++){
            currentMax = currentMax + arr[i];
            if(currentMax < arr[i]){
                currentMax = arr[i];
            }
            if(maxSoFar < currentMax){
                maxSoFar = currentMax;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        kedanesAlgorithm k = new kedanesAlgorithm();
        
        System.out.println(k.maxSubArraySum(arr));
    }
}
