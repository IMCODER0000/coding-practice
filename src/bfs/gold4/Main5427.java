package bfs.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main5427 {

    static char[][] Board;
    static boolean[][] visited;
    static boolean[][] fireVisited;
    static ArrayList<int[]> fire = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0,};
    static int[] dy = {0, 0, -1, 1};
    static int h,w;

    static int[] fireDis;

    static class Point{
        int x, y;
        int dis;

        public Point(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }

    }


    static void bfs(int x, int y) {
        Queue<Point> human = new LinkedList<>();
        Queue<Point> fireQ = new LinkedList<>();
        for (int[] f : fire) {
            fireQ.offer(new Point(f[0], f[1], 0));
            fireVisited[f[0]][f[1]] = true;
        }
        human.offer(new Point(x, y, 1));
        visited[x][y] = true;


        while (!human.isEmpty()) {

            int fSize = fireQ.size();


            for (int i = 0; i <fSize; i++) {
                Point f = fireQ.poll();

                for (int d = 0; d < 4; d++) {
                    int nx = f.x + dx[d];
                    int ny = f.y + dy[d];
                    if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                    if (Board[nx][ny] == '#' || fireVisited[nx][ny]) continue;

                    fireVisited[nx][ny] = true;
                    Board[nx][ny] = '*';  // 불 퍼짐
                    fireQ.offer(new Point(nx, ny, f.dis + 1));
                }



            }
            int hSize = human.size();
            for (int q = 0; q <hSize; q++) {
                Point p = human.poll();



                for (int i = 0; i <4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];

                    if (nx < 0 || nx >= h || ny < 0 || ny >= w) {
                        System.out.println(p.dis);
                        return;
                    }

                    if (Board[nx][ny] != '.' || visited[nx][ny]){
                        continue;
                    }


                    human.offer(new Point(nx, ny, p.dis + 1));
                    visited[nx][ny] = true;
                    Board[nx][ny] = '@';

                }



            }



            }
        System.out.println("IMPOSSIBLE");

        }









    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        fire = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());

        for (int l = 0; l < T; l++) {

            fire.clear();

            String[] hw = br.readLine().split(" ");
            w = Integer.parseInt(hw[0]);
            h = Integer.parseInt(hw[1]);
            int x = 0;
            int y = 0;

            Board = new char[h][w];
            visited = new boolean[h][w];


            for (int i = 0; i < h; i++) {
                String input = br.readLine();
                for (int j = 0; j < w; j++) {
                    Board[i][j] = input.charAt(j);
                    if(Board[i][j] == '@'){
                        x = i;
                        y = j;
                    }

                    if(Board[i][j] == '*'){
                        int[] xy = new int[2];
                        xy[0] = i;
                        xy[1] = j;
                        fire.add(xy);
                    }

                }
            }
            fireVisited = new boolean[h][w];

            bfs(x, y);

        }








    }



}
