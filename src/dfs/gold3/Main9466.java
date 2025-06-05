package dfs.gold3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main9466 {


    static HashMap<Integer,Integer> graph;
    static boolean[] visited;

    static int teamCount;

    static int startNode;

    static int DFSCount;

    static Set<Integer> tempArr;

    static void DFS(int node){
        visited[node] = true;
        tempArr.add(node);
        int i = graph.get(node);

        if(i == node){
            teamCount++;
            return;
        } else if(tempArr.contains(i)){
            for (int q = 0; q<i; q++) {
                tempArr.remove(q);
            }
            teamCount += tempArr.size();
            return;
        }

//        if(visited[graph.get(i)] || visited[i] ){


        DFSCount++;  //1 2
        DFS(i);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for (int q = 0; q < T; q++) {
            int n = Integer.parseInt(br.readLine());
            String[] student = br.readLine().split(" ");
            graph = new HashMap<>();
            startNode = 0;
            DFSCount = 0;
            visited = new boolean[n+1];
            teamCount = 0;



            for (int i = 0; i < n; i++) {
                graph.put(i+1, Integer.parseInt(student[i]));
            }


            for (int i = 0; i <n; i++) {
                if (!visited[i+1]){
                    tempArr = new HashSet<>();
                    startNode = i+1;
                    DFSCount = 0;
                    DFS(i+1);
                }
            }

            // 1 2 3 4 5
            // 2 3 4 5 3

            System.out.println(n - teamCount);


        }





    }


}
