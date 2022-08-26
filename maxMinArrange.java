package Problems;

public class maxMinArrange {

    static int[] arr = {1,2,3,4,5,6,7};

    public void printArray(int[] arr2){
        int n = arr2.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " --> ");
        }
        System.out.println();
    }

    // public int[] maxMin(int[] arr){
    //     int[] result = new int[arr.length];
    //     int i = 0;
    //     int j = arr.length-1;
    //     for(int k=0;k<arr.length;k=k+2){
    //         result[k] = arr[j];
    //         j--;
    //     }
    //     for(int l=1;l<arr.length;l+=2){
    //         result[l] = arr[i];
    //         i++;
    //     }

    //     return result;
    // }
        public void maxMin(int[] arr){
            int maxidx = arr.length-1;
            int minidx = 0;
            int max = arr[maxidx] + 1;
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    arr[i] = arr[i] + (arr[maxidx]%max)*max;
                    maxidx--;
                }
                else{
                    arr[i] = arr[i] + (arr[minidx]%max)*max;
                    minidx++;
                }
            }
            for(int i=0;i<arr.length;i++){
                arr[i] = arr[i]/max;
                System.out.print(arr[i] + " ");
            }
        }



    public static void main(String[] args) {
        maxMinArrange m = new maxMinArrange();
        m.printArray(arr);
        // m.maxMin(arr);
        // int[] result = m.maxMin(arr);
        m.maxMin(arr);
        m.printArray(arr);
       
    }
}
