package Problems;

public class sortArray_0s_1s_2s {

    public void printArray(int[] arr2){
        int n = arr2.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " --> ");
        }
        System.out.println();
    }

    

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] arr = {1,2,2,0,1,2,0,0};
    public void sort(){
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while(i<=k){
            if(arr[i] == 0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 2){
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void main(String[] args) {
        sortArray_0s_1s_2s s = new sortArray_0s_1s_2s();
        s.printArray(arr);
        s.sort();
        s.printArray(arr);
    }
}
