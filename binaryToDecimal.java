package Problems;

public class binaryToDecimal {
    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public double bTD(){
        int n = 1001010;
        int i = 0;
        double sum = 0;

        while(n!=0){
            sum = sum + (n%10)*(Math.pow(2, i));
            n = n/10;
            i++;
        }
        return sum;
    }
          
    public int[] dTB(){
        int n = 8;
        int rem = 0;
        int arr[] = new int[4];
        int k = 0;
        while(n>0){
            rem = n%2;
            arr[k] = rem;
            n = n/2;
            k++;
        }
        return arr;
    }
    
    // 101 --> 5

    


    public static void main(String[] args) {
        binaryToDecimal b = new binaryToDecimal();
        // System.out.println(b.bTD());
        int arr3[] = new int[4];
        arr3 = b.dTB();
    
        b.printArray(b.reverseArray(arr3, 0, arr3.length-1));


        // b.printArray(binaryToDecimal.reverseArray(b.dTB(), 0,4));
       
    }
}
