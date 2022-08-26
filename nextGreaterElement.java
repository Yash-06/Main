package Problems;

public class nextGreaterElement {

    public void printArray(int arr[]){
        int n = arr.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public void nGE(){

    
    int[] arr = {9,7,3,4,8,1};
    int[] op = new int[arr.length];
    int k = 0;
    for(int i=0;i<arr.length;i++){
        int l = i+1;
        while(l<arr.length){
            if(arr[i]<arr[l]){
                System.out.print(arr[l] + " ");
                break;
            }
            else if(arr[i]>arr[l]){
                l++;
            }
            
        }
       

    }



    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[j]>arr[i]){
    //             op[k] = arr[j];
    //             k++;
    //             break;
    //         }
    //         }
            
    //     }
    //     return op;
    }
 
    public static void main(String[] args) {
        nextGreaterElement n = new nextGreaterElement();
        n.nGE();
        
    }
}
