package dfs.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main2606 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count;


    static void dfs(int node) {
        visited[node] = true;
        for (int next : graph[node]) {
            if(!visited[next]){
                count++;
                dfs(next);
            }
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cNum = Integer.parseInt(br.readLine());
        int nNum = Integer.parseInt(br.readLine());

        graph = new ArrayList[cNum + 1];
        visited = new boolean[cNum + 1];

        for (int i = 1; i <= cNum; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < nNum; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            graph[a].add(b);
            graph[b].add(a);

        }

        dfs(1);

        System.out.println(count);





    }






}
