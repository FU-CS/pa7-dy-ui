package _PA7;

import java.util.Stack;

public class Q3 {
	public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islandmax = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j] == 1){
                    int curr = 0;
                    Stack<int[]> stack = new Stack<>();
                    int[] arr1 = {i, j};
                    stack.push(arr1);
                    grid[i][j] = 7;
                    while (!stack.isEmpty()){
                        curr++;
                        int[] e = stack.pop();
                        int r = e[0]; int c = e[1];
                        if (r-1>=0 && grid[r-1][c]==1){
                            int[] arr = {r-1, c};
                            stack.push(arr);
                            grid[r-1][c] = 7;
                        }
                        if (r+1<m && grid[r+1][c]==1){
                            int[] arr = {r+1, c};
                            stack.push(arr);
                            grid[r+1][c] = 7;
                        }
                        if (c-1>=0 && grid[r][c-1]==1){
                            int[] arr = {r, c-1};
                            stack.push(arr);
                            grid[r][c-1] = 7;
                        }
                        if (c+1<n && grid[r][c+1]==1){
                            int[] arr = {r, c+1};
                            stack.push(arr);
                            grid[r][c+1] = 7;
                        }
                    }
                    if (curr > islandmax){
                        islandmax = curr;
                    }
                }
                
            }
        }
        return islandmax;
    }
}
