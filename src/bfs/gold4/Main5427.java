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
    static boolean[][][] fireVisited;
    static ArrayList<int[]> fire = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0,};
    static int[] dy = {0, 0, -1, 1};
    static int h,w;

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
        Queue<Point>[] fires = new LinkedList[fire.size()];
        for (int i = 0; i < fire.size(); i++) {
            fires[i] = new LinkedList<>();
            fires[i].offer(new Point(fire.get(i)[0],fire.get(i)[1],1));
            fireVisited[i][fire.get(i)[0]][fire.get(i)[1]] = true;
        }
        human.offer(new Point(x, y, 1));
        visited[x][y] = true;


        while (!human.isEmpty()) {
            Point[] fs = new Point[fire.size()];
            Point p = human.poll();
            for (int i = 0; i < fire.size(); i++) {
                fs[i] = fires[i].poll();
            }
            int pos = 0;

            if (p.x == 0 || p.y == 0) {
                System.out.println(p.dis);
                return;
            }

            for (int q = 0; q < fire.size(); q++) {
                for (int j = 0; j <4; j++) {
                    int nfx = fs[q].x + dx[j];
                    int nfy = fs[q].y + dy[j];


                    if (nfx < 0 || nfy < 0 || nfx >= h || nfy >= w) {
                        continue;
                    }

                    if (Board[nfx][nfy] != '.' || !fireVisited[q][nfx][nfy]){
                        continue;
                    }

                    fs[q] = new Point(nfx, nfy, p.dis + 1);
                    fires[q].offer(fs[q]);
                    Board[nfx][nfy] = '*';
                    fireVisited[q][nfx][nfy] = true;
                }

                    for (int i = 0; i <4; i++) {
                        int nx = p.x + dx[i];
                        int ny = p.y + dy[i];


                        if (nx < 0 || ny < 0 || nx >= h || ny >= w) {
                            continue;
                        }
                        if (Board[nx][ny] != '.' || !fireVisited[q][nx][ny]){
                            continue;
                        }


                        pos++;
                        human.offer(new Point(nx, ny, p.dis + 1));
                        visited[nx][ny] = true;
                        Board[nx][ny] = '@';

                }
                if (pos == 0) {
                    System.out.println("IMPOSSIBLE");
                    return;
                }


            }

        }





    }



    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] hw = br.readLine().split(" ");
        h = Integer.parseInt(hw[0]);
        w = Integer.parseInt(hw[1]);
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
        fireVisited = new boolean[fire.size()][h][w];
        bfs(x, y);








    }



}
