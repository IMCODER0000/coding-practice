package dfs.gold4;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main1987ByBFS_BAD {

    static String[][] Board;


    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Set<String> isPassed;
    static int R, C;
    static int count, max;
    static int Max;
    static class Point {
        int x, y, depth;
        Set<String> isPassed = new HashSet<>();

        Point(int x, int y, int depth, Set<String> isPassed) {
            this.x = x;
            this.y = y;
            this.depth = depth;
            this.isPassed = isPassed;
        }



    }


    static void BFS(int x, int y, int depth){
        Max = 0;
        Queue<Point> q = new LinkedList<>();
        Set<String> isPassed = new HashSet<>();
        isPassed.add(Board[x][y]);
        q.offer(new Point(x, y, depth, isPassed));

        while (!q.isEmpty()) {
            Point poll = q.poll();
//            Max = Math.max(Max, poll.depth);
            Max = Math.max(Max, poll.depth);
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx < 1 || ny < 1 || nx >= R + 1 || ny >= C + 1) {
                    continue;
                }

                if (poll.isPassed.contains(Board[nx][ny]) || Board[nx][ny] == null ) {
                    continue;
                }

                HashSet<String> isPassed1 = new HashSet<>(poll.isPassed);
                isPassed1.add(Board[nx][ny]);
                q.offer(new Point(nx, ny, poll.depth + 1, isPassed1));



            }


        }



    }





    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        R = Integer.parseInt(inputs[0]);
        C = Integer.parseInt(inputs[1]);

        Board = new String[R+1][C+1];
        isPassed = new HashSet<>();
        count = 0;



        for (int i = 1; i <= R; i++) {
            String[] Rs = br.readLine().split("");
            for (int j = 1; j <= C; j++) {
                Board[i][j] = Rs[j-1];
            }
        }

        BFS(1, 1, 1);

        System.out.println(Max);



    }
}
