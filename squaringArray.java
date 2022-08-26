package Problems;

public class squaringArray {

    static int[] arr = {-9,-7,-3,2,4,6,8};

    public void printArray(int[] arr2){
        int n = arr2.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " --> ");
        }
        System.out.println();
    }

    public static int[] sortedSqaures(int[] arr){
        
        int i = 0;
        int j = arr.length-1;
        int[] result = new int[arr.length];
        for(int k=arr.length-1;k>=0;k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i]*arr[i];
                i++;
            }
            else{
                result[k] = arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    

    public static void main(String[] args) {
        squaringArray sq = new squaringArray();
        sq.printArray(arr);
        int[] result = squaringArray.sortedSqaures(arr);
        sq.printArray(result);
    }
}
