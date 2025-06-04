package dfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MainPr {

    static List<Integer>[] graph;

    static List<Integer> result;
    static boolean[] visitedByBfs;
    static boolean[] visitedByDfs;
    static int N;


    static void dfs(int node){
        visitedByDfs[node] = true;
        System.out.println(node + " ");
        for(int g : graph[node]){
            if(!visitedByDfs[g]){
                dfs(g);
            }
        }
    }

    static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visitedByBfs[node] = true;

        while(!q.isEmpty()){
            int poll = q.poll();
            System.out.println(poll);
            for (int next : graph[poll]){

                if(visitedByBfs[next]){
                    continue;
                }

                q.offer(next);
                visitedByBfs[next] = true;
            }


        }




    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 6;
        graph = new ArrayList[N + 1];
        visitedByBfs = new boolean[N + 1];
        visitedByDfs = new boolean[N + 1];
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <=N; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[1].add(2);
        graph[2].add(1);

        graph[1].add(3);
        graph[3].add(1);

        graph[2].add(4);
        graph[4].add(2);

        graph[3].add(5);
        graph[5].add(3);

        graph[4].add(5);
        graph[5].add(4);

        graph[5].add(6);
        graph[6].add(5);

        //        for (List<Integer> integers : graph) {
        for (int i = 1; i<graph.length; i++) {

            System.out.print(i + " : ");
            for (Integer integer : graph[i]) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();


        dfs(1);
        System.out.println();
        System.out.println();
        System.out.println();
        bfs(1);

//        for (List<Integer> integers : graph) {
//        for (int i = 1; i<graph.length; i++) {
//
//            System.out.print(i + " : ");
//            for (Integer integer : graph[i]) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//        }





    }


}
