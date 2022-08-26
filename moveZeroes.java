package Problems;
public class moveZeroes{
    

    private static final int[] arr = null;
    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] zeroes(){
        int[] arr = {0,1,0,2,3,5,6,34,0,0,5,9,0,3};

    
        int nZ = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nZ] = arr[i];
                nZ++;
            }
           
        }
        while(nZ<arr.length){
            arr[nZ++] = 0;
        }
        return arr;
        // for(int j=0;j<indList.length;j++){
        //     if(arr[j]==0){
        //         arr[j] = arr[j+1];
        //     }
        // }
  }
  public static void main(String[] args) {
    moveZeroes mz = new moveZeroes();
    
    mz.printArray(mz.zeroes());

  }
}
