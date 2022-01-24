package dfs_bfs2;

import java.util.*;
public class 섬나라아일랜드_13 {
	static int[][] board;
	static int answer=0;
	static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
	static int n;
	
	public static void DFS(int x,int y) {
		for(int i =0;i<8;i++) {
			int nx = x+dx[i];
			int ny = y + dy[i];
			if(nx >=0 && nx<n &&ny>=0 &&ny<n && board[nx][ny]==1) {
				board[nx][ny] = 0;
				DFS(nx,ny);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board = new int[n][n];
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j] == 1) {
					board[i][j] = 0;
					answer++;
					DFS(i,j);
				}
			}
		}
		System.out.println(answer);
		
	}

}
