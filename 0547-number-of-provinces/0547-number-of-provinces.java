class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (isConnected[i][i] == 1) {
                dfs(isConnected, i);
                c++;
            }
        }
        return c;
    }
    private void dfs(int[][] graph, int city) {
        graph[city][city] = 2;
        for (int next = 0; next < graph.length; next++) {
            if (graph[city][next] == 1 && graph[next][next] == 1) {
                dfs(graph, next);
            }
        }
    }
}