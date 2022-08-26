import javax.management.BadStringOperationException;

public class binarySearch {

    static int[] arr = {1,3,6,7,8,11,15,27,29};

    public int seach(int[] arr, int key){

        int low = 0;
        int high = arr.length-1;
    
        while(low <= high){
            int mid = (high+low)/2;
            if(arr[mid] == key){
                System.out.println(mid);
                return mid;
            }
            if(key<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("Element not present");
        return -1;
    }

    
    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        bs.seach(arr, 12);
    }
}
