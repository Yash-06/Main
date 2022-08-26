package Problems;

import javax.naming.spi.DirStateFactory.Result;

public class commonNumbers {

    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] common(){

        int arr1[] = {1,2,3,4,5,6,4,6,2,1};
        int arr2[] = {3,4,5,6,7,8,8,9,6,8};
        int k = 0;
        int result[] = new int[10];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    result[k] = arr2[j];
                    k++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        commonNumbers cn = new commonNumbers();
        cn.printArray(cn.common());
        
    }
}
