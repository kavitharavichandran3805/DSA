import java.util.*;

public class depth_first_search {

    public static void dfs(int node, int[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> bfs) {
        visited[node] = 1;
        bfs.add(node);
        for (int ele : adj.get(node)) {
            if (visited[ele] == 0) {
                dfs(ele, visited, adj, bfs);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1, 4)));
        adj.add(new ArrayList<>(Arrays.asList(2, 3)));

        ArrayList<Integer> bfs = new ArrayList<>();
        int[] visited = new int[adj.size()];
        dfs(0, visited, adj, bfs);
        for (int ele : bfs) {
            System.out.println(ele);
        }
    }
}
