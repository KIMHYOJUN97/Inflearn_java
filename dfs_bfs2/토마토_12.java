package dfs_bfs2;

import java.util.*;
class Point{
	int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
public class 토마토_12 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int n,m;
	static int[][] arr;
	static int[][] dis;
	public static int BFS() {
		Queue<Point> q = new LinkedList<>();
		for(int i = 0;i<m;i++) {
			for(int j =0;j<n;j++) {
				if(arr[i][j] == 1)
					q.offer(new Point(i,j));
			}
		}
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i=0;i<4;i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx >=0 && nx<m&&ny>=0&&ny<n&&arr[nx][ny]==0) {
					arr[nx][ny] = 1;
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
					q.offer(new Point(nx,ny));
				}
			}
		}
		int min = Integer.MIN_VALUE;
		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				if(dis[i][j] >min) min = dis[i][j];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr= new int[m][n];
		dis = new int[m][n];
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int flag =0;
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j] ==0) flag = 0;
			}
		}
		int answer = BFS();
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j] == 0) flag = 1;
			}
		}
		if(flag == 1) System.out.println(-1);
		else if(flag==0) System.out.println(answer);
		else System.out.println(0);
		
	}

}
