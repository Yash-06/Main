package Problems;

public class numberOfIslands {
    public int numIslands(char[][] grid){
        int m = grid.length;
        int n = grid.length;
        boolean[][] visited = new boolean[m][n];
        int numOfIslands = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid, i, j, visited);
                }
            }
        }
        return numOfIslands;
    }

    void dfs(char[][] grid, int row, int col, boolean[][] visited){
        if(row<0 || col<0 || row>=grid.length || col>=grid.length || visited[row][col] || grid[row][col] == '0'){
            return;        
        } 
        visited[row][col] = true;
        dfs(grid, row, col-1, visited);
        dfs(grid, row-1, col, visited);
        dfs(grid, row, col+1, visited);
        dfs(grid, row+1, col, visited);
    }

    public static void main(String[] args) {
        numberOfIslands noi = new numberOfIslands();
        char[][] grid = {{1,1,0,0},
                         {1,0,0,0},
                         {0,0,1,0},
                         {0,0,0,1}};


        int x = noi.numIslands(grid);
        System.out.print(x);
    } 
}

