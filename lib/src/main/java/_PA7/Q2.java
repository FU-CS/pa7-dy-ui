package _PA7;

import java.util.Stack;

public class Q2 {
	public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islandNum = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j] == '1'){
                    islandNum++;
                    Stack<int[]> stack = new Stack<>();
                    int[] arr1 = {i, j};
                    stack.push(arr1);
                    grid[i][j] = 'f';
                    while (!stack.isEmpty()){
                        int[] e = stack.pop();
                        int r = e[0]; int c = e[1];
                        // grid[r][c] = 'f';
                        if (r-1>=0 && grid[r-1][c]=='1'){
                            int[] arr = {r-1, c};
                            stack.push(arr);
                            grid[r-1][c] = 'f';
                        }
                        if (r+1<m && grid[r+1][c]=='1'){
                            int[] arr = {r+1, c};
                            stack.push(arr);
                            grid[r+1][c] = 'f';
                        }
                        if (c-1>=0 && grid[r][c-1]=='1'){
                            int[] arr = {r, c-1};
                            stack.push(arr);
                            grid[r][c-1] = 'f';
                        }
                        if (c+1<n && grid[r][c+1]=='1'){
                            int[] arr = {r, c+1};
                            stack.push(arr);
                            grid[r][c+1] = 'f';
                        }
                    }
                }
            }
        }
        return islandNum;
    }

}
