package dfs_bfs2;

import java.util.*;

class Point{
	int x,y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class 미로의최단거리통로_11 {
	static int[][] board = new int[8][8];
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[][] dis = new int[8][8];
	public static void BFS(int x,int y) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x,y));
		board[x][y] = 1;
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i =0 ; i<4;i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx >=1 && nx <=7 &&ny >=1 && ny <=7 &&board[nx][ny]==0) {
					board[nx][ny] = 1;
					q.offer(new Point(nx,ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				board[i][j] = sc.nextInt();
			}
		}
		board[1][1] = 1;
		BFS(1,1);
		if(dis[7][7]==0) System.out.println(-1);
		else System.out.println(dis[7][7]);
		for(int i = 1;i<=7;i++) {
			for(int j = 1;j<=7;j++) {
				System.out.print(dis[i][j]+" ");
			}
			System.out.println();
		}
	}

}
