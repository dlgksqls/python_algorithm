import java.util.*;
import java.io.*;
public class Main {
    static int n, m;
    static boolean graph[][];
    static boolean visited[];
    static int answer;
    static ArrayList<Integer> queue;

    public static void bfs(int index){
        queue = new ArrayList<>();

        queue.add(index);
        visited[index] = true;

        while(!queue.isEmpty()){
            int idx = queue.remove(0);

            for (int i=1; i<=n; i++){
                if (graph[idx][i] && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];

        for (int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }
        for (int i=1; i<=n; i++){
            if (!visited[i]) {
                answer++;
                bfs(i);
            }
        }
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
