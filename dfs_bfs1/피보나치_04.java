package dfs_bfs1;

public class 피보나치_04 {
	static int[] fibo;
 	public static int DFS(int n) {
 		if(fibo[n] > 0) return fibo[n];//tree형식인 재귀에서 미리 값을 계산해줌으로써 더 이상 트리를 뻗어 나가지 않아도 되기 때문에 재귀보다 훨씬 빠른 성능을 낸다=메모이제이션.
		if(n == 1) return fibo[n]=1;
		else if(n==2){return fibo[n] = 1;
		}
		else {
			return fibo[n] = DFS(n-2)+DFS(n-1);
		}
	}
	public static void main(String[] args) {
		int n = 45;
		fibo = new int[n+1];
		System.out.println(DFS(5));
	}

}
