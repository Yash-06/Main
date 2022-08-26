public class linearSearch {

    static int arr[] = {0,1,2,3,4,5,6};
    
    public int search(int[] arr, int n, int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println(i);
                return i;
            }
        }
        System.out.println("Element is not present");
        return -1;
    }

    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        ls.search(arr, arr.length, 4);
    }
}
