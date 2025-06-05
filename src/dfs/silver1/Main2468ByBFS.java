package dfs.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main2468ByBFS {

    static int[][] Board;
    static int[][] BoardBackUp;
    static boolean[][] visited;

    static Set<Integer> numbers;

    static int N;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;

    static class Point{
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    static void BFS(int x, int y, int n) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point poll = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                    continue;
                }

                if (visited[nx][ny] || Board[nx][ny] <= n) {
                    continue;
                }

                q.offer(new Point(nx, ny));
                visited[nx][ny] = true;


            }

        }


    }



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());

        Board = new int[N][N];
        BoardBackUp = new int[N][N];
        visited = new boolean[N][N];
        numbers = new HashSet<>();
        count = 0;
        int max = 0;
        numbers.add(0);



        for (int i = 0; i < N; i++) {
            String[] Ns = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                Board[i][j] = Integer.parseInt(Ns[j]);
                BoardBackUp[i][j] = Integer.parseInt(Ns[j]);
                numbers.add(Board[i][j]);
            }
        }

        for (int n : numbers) {
            for (int i = 0; i < N; i++) {
                System.arraycopy(BoardBackUp[i], 0, Board[i], 0, N);
            }
            visited = new boolean[N][N];
            count =0;
            for (int i = 0; i <N; i++) {
                for (int j = 0; j <N; j++) {
                    if (!visited[i][j] && Board[i][j] > n) {
                        BFS(i, j, n);
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }


        System.out.println(max);





    }



}
