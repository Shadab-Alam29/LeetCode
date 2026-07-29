class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color)  return image;
        
        dfs(image, sr, sc, original, color);
        return image;
    }
    static void dfs(int[][] image , int i , int j , int org , int col){
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length)  return;
        
        if (image[i][j] != org)  return;
        image[i][j] = col;
        dfs(image,i+1, j, org, col);
        dfs(image,i-1, j, org, col);
        dfs(image,i, j+1, org, col);
        dfs(image,i, j-1, org, col);
    }
}