package bfs.silver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class QQ {

    static Map<String, List<String>> graph = new HashMap<>();
    static Set<String> visited = new HashSet<>();

    private static void bfs(String start){
        Queue<String> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        while(!queue.isEmpty()){
            String current = queue.poll();
            System.out.println(current + "방문");
            for (String F : graph.get(current)) {
                if (!visited.contains(F)) {
                    queue.offer(F);
                    visited.add(F);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D"));
        graph.put("C", Arrays.asList("E"));
        graph.put("D", new ArrayList<>());
        graph.put("E", new ArrayList<>());

        System.out.println("A 탐색 시작");


        bfs("A");




    }
}