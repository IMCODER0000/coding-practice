package bfs.silver1; // 해당 클래스가 속한 패키지

import java.util.*; // Scanner, Queue, LinkedList 등 유틸리티 클래스들을 사용하기 위해 import

public class Main2178 {

    static int N, M; // 미로의 행(N)과 열(M)의 크기를 저장하는 변수
    static int[][] maze; // 미로 정보를 저장할 2차원 배열
    static boolean[][] visited; // 방문 여부를 저장할 2차원 배열

    // 상하좌우 방향을 표현하는 배열
    static int[] dx = { -1, 1, 0, 0 }; // 위, 아래
    static int[] dy = { 0, 0, -1, 1 }; // 왼쪽, 오른쪽

    // 좌표를 표현할 내부 클래스
    static class Point {
        int x, y; // 좌표값

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // BFS로 미로를 탐색하는 메서드
    public static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>(); // BFS에 사용할 큐
        queue.offer(new Point(x, y)); // 시작점을 큐에 넣음
        visited[x][y] = true; // 시작점 방문 표시

        while (!queue.isEmpty()) { // 큐가 빌 때까지 반복
            Point p = queue.poll(); // 현재 위치를 큐에서 꺼냄

            // 4방향을 탐색
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i]; // 다음 x좌표
                int ny = p.y + dy[i]; // 다음 y좌표

                // 미로 범위를 벗어나면 무시
                if (nx < 0 || ny < 0 || nx >= N || ny >= M)
                    continue;

                // 벽이거나 이미 방문했으면 무시
                if (maze[nx][ny] == 0 || visited[nx][ny])
                    continue;

                // 이동 가능한 경우 큐에 추가하고 방문 표시
                queue.offer(new Point(nx, ny));
                visited[nx][ny] = true;

                // 현재 좌표까지의 거리 = 이전 좌표까지의 거리 + 1
                maze[nx][ny] = maze[p.x][p.y] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 행 개수 입력
        M = sc.nextInt(); // 열 개수 입력
        sc.nextLine(); // 버퍼 비우기 (개행 문자 제거)

        maze = new int[N][M]; // 미로 배열 초기화
        visited = new boolean[N][M]; // 방문 배열 초기화

        // 미로 입력 받기
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine(); // 한 줄씩 입력 받음
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0'; // 문자 '1' 또는 '0'을 숫자로 변환
            }
        }

        bfs(0, 0); // (0, 0)에서 시작해서 BFS 탐색

        System.out.println(maze[N - 1][M - 1]); // 도착 지점까지의 최단 거리 출력
    }

}
