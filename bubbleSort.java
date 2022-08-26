public class bubbleSort {

    public void printArray(int[] arr2){
        int n = arr2.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " --> ");
        }
        System.out.println();
    }

    static int[] arr = {1,8,4,9,2,6,4,7,5};

    public void sort(int[] arr){
        boolean isSwapped;
        for(int j=0;j<arr.length-1;j++){
            isSwapped = false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false){
                System.out.println("Array sorted");
                break;
            }
            
        }      
        
        
    }

    public static void main(String[] args) {
        bubbleSort bs = new bubbleSort();
        bs.printArray(arr);
        bs.sort(arr);
        bs.printArray(arr);
    }
}
