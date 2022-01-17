package dfs_bfs1;

import java.util.*;
public class 이진수출력_02 {
	public static void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n/2);
			System.out.print(n%2+" ");
		}
	}
	
	public static void main(String[] args) {
		
		DFS(11);
	}

}
