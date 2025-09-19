import java.util.*;

public class bredth_first_search {

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[adj.size()];
        q.add(0);
        visited[0] = 1;
        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);
            for (int x : adj.get(node)) {
                if (visited[x] != 1) {
                    visited[x] = 1;
                    q.add(x);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1, 4)));
        adj.add(new ArrayList<>(Arrays.asList(2, 3)));

        ArrayList<Integer> bfs = bfs(adj);
        for (int ele : bfs) {
            System.out.println(ele);
        }
    }
}