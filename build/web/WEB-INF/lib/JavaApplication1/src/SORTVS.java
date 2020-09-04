
import java.util.*;

class SORTVS {

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    // function to print the shortest distance and path 
    // between source vertex and destination vertex 
    private static List printShortestDistance(
            ArrayList<ArrayList<Integer>> adj,
            int s, int dest, int v) {
        // predecessor[i] array stores predecessor of 
        // i and distance array stores distance of i 
        // from s 
        int pred[] = new int[v];
        int dist[] = new int[v];

        if (BFS(adj, s, dest, v, pred, dist) == false) {
            return null;
        }

        // LinkedList to store path 
        LinkedList<Integer> path = new LinkedList<Integer>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        return path;
    }

    // a modified version of BFS that stores predecessor 
    // of each vertex in array pred 
    // and its distance from source in array dist 
    private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src,
            int dest, int v, int pred[], int dist[]) {
        // a queue to maintain queue of vertices whose 
        // adjacency list is to be scanned as per normal 
        // BFS algorithm using LinkedList of Integer type 
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // boolean array visited[] which stores the 
        // information whether ith vertex is reached 
        // at least once in the Breadth first search 
        boolean visited[] = new boolean[v];

        // initially all vertices are unvisited 
        // so v[i] for all i is false 
        // and as no path is yet constructed 
        // dist[i] for all i set to infinity 
        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        // now source is first to be visited and 
        // distance from source to itself should be 0 
        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        // bfs Algorithm 
        while (!queue.isEmpty()) {
            int u = queue.remove();
            for (int i = 0; i < adj.get(u).size(); i++) {
                if (visited[adj.get(u).get(i)] == false) {
                    visited[adj.get(u).get(i)] = true;
                    dist[adj.get(u).get(i)] = dist[u] + 1;
                    pred[adj.get(u).get(i)] = u;
                    queue.add(adj.get(u).get(i));

                    // stopping condition (when we find 
                    // our destination) 
                    if (adj.get(u).get(i) == dest) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // List of graph edges as per above diagram

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int ar[] = new int[n + 1];
            int br[] = new int[n + 1];
            for (int j = 1; j <= n; j++) {
                ar[j] = scan.nextInt();
                br[ar[j]] = j;
            }

            int v = n+1;

            // Adjacency list for storing which vertices are connected 
            ArrayList<ArrayList<Integer>> adj
                    = new ArrayList<ArrayList<Integer>>(v);
            for (int i1 = 0; i1 <= n; i1++) {
                adj.add(new ArrayList<Integer>());
            }

            // Creating graph given in the above diagram. 
            // add_edge function takes adjacency list, source 
            // and destination vertex as argument and forms 
            // an edge between them. 
            for (int j = 0; j < m; j++) {
                int x = scan.nextInt();
                int y = scan.nextInt();

                addEdge(adj, x, y);

            }

            // Number of nodes in the graph (labelled from 0 to N-1)
            int result = 0;
            for (int j = 1; j <= n; j++) {
                if (ar[j] != j) {
                    int src = j;

                    int index = -1;
                    for (int k = j + 1; k <= n; k++) {
                        if (ar[k] == j) {
                            index = k;
                            break;
                        }
                    }

                    int dest = index;
                    if (dest != -1 && (printShortestDistance(
                            adj,
                            src, dest, v) != null)) {

                        LinkedList<Integer> aa = (LinkedList<Integer>) (printShortestDistance(
                                adj,
                                src, dest, v));

                        for (int b = aa.size() - 1; b > 0; b--) {
                            swap(aa.get(b), aa.get(b - 1), ar);
                        }
                    } else if (dest != -1) {
//                        System.out.println(j);
                        int temp = ar[src];
                        ar[src] = ar[dest];
                        ar[dest] = temp;
                        result++;
                    }
                }

            }

            System.out.println(result);

        }
    }

    private static void swap(int b, int get, int ar[]) {
        int temp = ar[b];
        ar[b] = ar[get];
        ar[get] = temp;
    }
}
