package dfs.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1987 {

    static String[][] Board;


    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static Set<String> isPassed;

    static int R, C;

    static int count, max;




    static void DFS(int x, int y, int depth) {
        max = Math.max(max, depth);
        isPassed.add(Board[x][y]);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 1 || ny < 1 || nx >= R+1 || ny >= C+1) {
                continue;
            }

            if ( isPassed.contains(Board[nx][ny]) || Board[nx][ny] == null) {
                continue;
            }

            DFS(nx, ny, depth+1);


        }
        isPassed.remove(Board[x][y]);

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

        DFS(1, 1, 1);

        System.out.println(max);



    }
}
