import javax.naming.spi.DirStateFactory.Result;

public class mergeTwoSortedArray {

    public void printArray(int[] arr2){
        int n = arr2.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " --> ");
        }
        System.out.println();
    }

    static int[] arr1 = {1,3,4,5};
    static int[] arr2 = {2,6,7,8,9,11};
    
    static int l1 = arr1.length;
    static int l2 = arr2.length;
    int k,i,j=0;

    public int[] merge(int[] arr1,int[] arr2, int l1, int l2){
        int[] result = new int[l1+l2];
        
        while(i<l1 && j<l2){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<l1){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j<l2){
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        mergeTwoSortedArray m = new mergeTwoSortedArray();
        m.printArray(arr1);
        m.printArray(arr2);
        // m.merge(arr1, arr2, l1, l2);
        m.printArray(m.merge(arr1, arr2, l1, l2));
       
    }   
}
