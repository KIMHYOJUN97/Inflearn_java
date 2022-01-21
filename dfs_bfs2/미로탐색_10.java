package dfs_bfs2;

import java.util.*;
public class 미로탐색_10 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int answer=0;
	static int[][] board = new int[8][8];
	
	public static void DFS(int x,int y) {
		if(x == 7 && y == 7)answer++;
		else {
			for(int i = 0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx >=1 && nx <=7 &&ny >=1 &&ny <=7 &&board[nx][ny] ==0) {
					board[nx][ny] = 1;
					DFS(nx,ny);
					board[nx][ny] = 0;
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
		DFS(1,1);
		System.out.println(answer);
	}
	
}
