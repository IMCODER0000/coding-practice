package bfs.gold5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main7576 {
    // N - 상자의 세로
    // M - 사자의 가롲
    // 익토 - 1, 안익토 - 0, 없음 - -1

    static int N,M;

    static int[][] board;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int count;
    static int startCount;

    static class Point {
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


    private static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()){
            Point p = queue.poll();

            for (int i = 0; i < 4; i++) {


                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }

                if ( board[nextX][nextY] == -1  ||visited[nextX][nextY]) {
                    continue;
                }


                if(board[p.x][p.y] == 1){
                    board[nextX][nextY] = 1;
                }

                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;

            }

            count++;





        }


    }



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] MN = br.readLine().split(" ");
        M = Integer.parseInt(MN[0]);
        N = Integer.parseInt(MN[1]);
        int startX = 0;
        int startY = 0;

        board = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String[] Ns = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(Ns[j]);
                if (Integer.parseInt(Ns[j]) == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }

//        System.out.println("start : " + startCount);
//        System.out.println("NM : " + N*M);

        if(startCount == N*M){
            System.out.println(0);
        } else{
            bfs(startX, startY);

            System.out.println("답 : " + count);
        }




//        while (true) {
//
//        }


//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if(board[i][j] == 1 && !visited[i][j]){
//                    bfs(i, j);
//                }
//            }
//        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }






    }



}
