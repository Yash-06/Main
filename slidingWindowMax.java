package Problems;

public class slidingWindowMax {
    public void printArray(int arr[]){
        int n = arr.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    // Below code is hard coded for a window of size K = 3 (i, j, k)
    // Study the main approach !!! 

    public static int[] maxInSlidingWindow(int[] arr){
        int p = 0;
        int[] result = new int[arr.length];
        int i = 0;
        int j = i+1;
        int k = j+1;
        for(int a=0;a<arr.length-2;a++){
            if(arr[i]>arr[j] && arr[i]>arr[k]){
                result[p] = arr[i];
                p++;
            }
            else if(arr[j]>arr[i] && arr[j]>arr[k]){
                result[p] = arr[j];
                p++;
            }
            else{
                result[p] = arr[k];
                p++;
            }
            i++;
            j++;
            k++;
        }
            
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {44,77,33,44,88,11};
        slidingWindowMax s = new slidingWindowMax();
        s.printArray(s.maxInSlidingWindow(arr));
        
        
    }
    
}
 