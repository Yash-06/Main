import java.security.Principal;

import javax.sound.sampled.SourceDataLine;

public class oneDimensionalArray {
        
    public void printArray(int arr[]){
        int n = arr.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static int[] removeEven(int arr[]){
       int oddCount = 0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            oddCount++;
        }
       }
       int result[] = new int[oddCount];
       int indx = 0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            result[indx] = arr[i];
            indx++;
        }
       }
       return result;
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

    public static int minValueInArray(int arr[]){
        int min = 9999;
        if(arr == null || arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public int maxValueInArray(int arr[]){
        int max = 0;
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public int[] secondMaxValueInArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;  
                }
            } 
        }
        return arr;
        
        
        // if(arr == null || arr.length == 0){
        //     throw new IllegalArgumentException("Invalid Input");
        // }
        // int max = Integer.MIN_VALUE;
        // int secondMax = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         secondMax = max;
        //         max = arr[i];
        //     }
        //     else{
        //         if(arr[i]>secondMax && arr[i]!=max){
        //             secondMax = arr[i];
        //         }
        //     }
        // }
        // return secondMax;
        
    }

    public void moveZeroes(int[] arr, int n){
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){    //{1,0,2,3,0,4}
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

    public int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    
    public int missingNumber(int[] arr){
        // int n = arr.length;
        // int sum = (n*(n+1))/2;
        // int arrSum = 0;
        // for(int i=0;i<n;i++){
        //     arrSum += arr[i];
        // } 
        // int missEle = sum-arrSum;
        // System.out.println(missEle);

        int n = arr.length + 1;
        int sum = (n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum = sum - arr[i];
        }        
        return sum;
    }

    public void isPalindrome(){
        
        int n[] = {1,2,98765,2,1};
        
        int len = n.length;
        int k=0;
        for(int i=0;i<len/2;i++){
            if(n[i]==n[len-1]){
                len--;
            }
            else{
                k++;
            }
        }
       if(k>0){
        System.out.println("Not palindrome");
       }
       else{
        System.out.println("palindrome");
       }
    }

    public int fibnacci(int n){
        if(n<1){
            System.out.println("Invalid input");
        }     
        if(n==1){
            return 0;
        }
        if(n==2 || n==3){
            return 1;
        }
        int series = fibnacci(n-1) + fibnacci(n-2);  
        return series;                                  //0,1,1,2,3,5,8
    }

    
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4};
        // int[] ya = new int[5];
        // int yas[] = {1,2,3,4,5};
    
            // arr[0] = 7;
            // arr[1] = 1;
            // arr[2] = 2;
            // arr[3] = 3;
            // arr[4] = 4;
            // arr[5] = 5;
            // arr[6] = 6;
        
         
         
        
            
            oneDimensionalArray odr = new oneDimensionalArray();
            // odr.printArray(arr);
            // int[] result = removeEven(arr);
            // odr.printArray(result);
            odr.printArray(arr);
            // int[] reverse = reverseArray(arr, 0, 6);
            // odr.printArray(reverse);
            // System.out.println(odr.minValueInArray(arr));
            // System.out.println((odr.maxValueInArray(arr)));
            //System.out.println(odr.secondMaxValueInArray(arr)[arr.length-2]);         
            // odr.moveZeroes(arr, arr.length); 
            // odr.printArray(arr);         
            // odr.resizeArray(arr, 10);
            // odr.printArray(arr);

            // int[] original = new int[] {1,2,3,4,5};
            // System.out.println(original.length);
            // int[] reSized = odr.resizeArray(original, 10);
            // System.out.println(reSized.length);
            //System.out.println(odr.missingNumber(arr));
            // odr.isPalindrome();
            //System.out.println(odr.fibnacci(2));
            // int n=4;
            // int k=1;
            // int arr1[] = new int[n];
            // arr1[0] = 0;
            // for(int i=1;i<n;i++){
            //     arr1[k] = odr.fibnacci(i);
            //     k++;
            // }
            int k=0;
            int arr4[] = new int[9];
            for(int i=1;i<8;i++){
                arr4[k] = odr.fibnacci(i);
                k++;
            }
           
            odr.printArray(arr4);
          

    }
}
            
            
        

