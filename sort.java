public class sort {

    public void printArray(int[] arr2){
        int n = arr2.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " --> ");
        }
        System.out.println();
    }

    static int[] arr = {1,4,3,8,5,9,7,6,2};

    public void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }

    public void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;           
        }
    }
    public void merge(int[] arr, int[] temp, int low, int mid, int high){
        for(int i=low;i<=high;i++){
            temp[i] = arr[i];
        }
        int i = low; int j = mid+1; int k = low;
        while(i<=mid && j<=high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    static int[] temp = new int[arr.length];
    public void mergeSort(int[] arr, int[] temp, int low, int high){

        if(low<high){
            int mid = low + (high-low)/2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        int j = low;

        while(i<=high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public void quickSort(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    public static void main(String[] args) {
        sort is = new sort();
        is.printArray(arr);
        // is.selectionSort(arr);
        // is.mergeSort(arr, temp, 0, arr.length-1);
        is.quickSort(arr, 0, arr.length-1);
        is.printArray(arr);
    }
}
