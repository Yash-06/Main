package Problems;

public class searchAndInsert {

    static int[] arr = {1,3,4,5,7,9};

    public int search(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
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
        System.out.println(low);
        return low;
    }

    public static void main(String[] args) {
        searchAndInsert si = new searchAndInsert();
        si.search(arr, 1);
    }
}
