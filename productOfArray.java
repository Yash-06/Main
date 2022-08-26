package Problems;

public class productOfArray {
    public void printArray(int arr[]){
        int n = arr.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static int[] productOfArrayExceptIndex(int[] arr){
        int temp = 1;
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i] = temp;
            temp = temp * arr[i];
        }
        temp = 1;
        for(int i=arr.length-1;i>=0;i--){
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        productOfArray p = new productOfArray();
        p.printArray(p.productOfArrayExceptIndex(arr));
        ;
    }
}
