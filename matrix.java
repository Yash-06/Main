package Problems;

  

public class matrix {

    static int mat[][] = new int[3][3];

    


    public void searchInMatrix(int[][] matrix, int n, int value){
        int i=0;
        int j=n-1;
        
        while(i<n && j>=0){
        if(matrix[i][j] == value){
            System.out.print("value found at : " + i + "," + j);
            return;
        }
        if(matrix[i][j]>value){
            j--;
        }
        else{
            i++;
        }
    }
    System.out.print("Not Found");
}
public void spiralMatrixPrint(int[][] matrix, int row, int col){
    int i = 0;
    int k = 0;
    int l = 0;
    while(k<row && l<col){
        for(i=l;i<col;i++){
            System.out.print(matrix[k][i] + " ");
        }
        k++;
        for(i=k;i<row;i++){
            System.out.print(matrix[i][col-1] + " ");
        }
        col--;
        if(k<row){
            for(i=col-1;i>=l;i--){
                System.out.print(matrix[row-1][i] + " ");
            }
            row--;
        }
        if(l<col){
            for(i=row-1;i>=k;i--){
                System.out.print(matrix[i][l] + " ");
            }
            l++;
        }
    }
}
    public static void main(String[] args) {
        matrix m = new matrix();

        int  matrix[][] =  {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};
        
        // m.searchInMatrix(matrix, 3, 9);
        m.spiralMatrixPrint(matrix, 4, 4);
    }
}
