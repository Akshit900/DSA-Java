package ETE.markS;
import java.util.*;
    public class UndirectedGraphCycle {
        public static boolean isCycle(int V, int[][] edges) {
            ArrayList<Integer>[] adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();}
            for (int[] e : edges) {
                adj[e[0]].add(e[1]);
                adj[e[1]].add(e[0]);}
            boolean[] vis = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!vis[i] && bfs(i, adj, vis)) {
                    return true;}}
            return false;}
        public static boolean bfs(int src,
                                  ArrayList<Integer>[] adj,
                                  boolean[] vis) {
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{src, -1});
            vis[src] = true;
            while (!q.isEmpty()) {
                int[] cur = q.poll();
                for (int nei : adj[cur[0]]) {
                    if (!vis[nei]) {
                        vis[nei] = true;
                        q.add(new int[]{nei, cur[0]});}
                    else if (nei != cur[1]) {
                        return true;
                    }}}
            return false;}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int V = sc.nextInt();
            int E = sc.nextInt();
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();}
            System.out.println(isCycle(V, edges));}}

