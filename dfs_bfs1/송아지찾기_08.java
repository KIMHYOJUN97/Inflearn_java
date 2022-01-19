package dfs_bfs1;

import java.util.*;
public class 송아지찾기_08 {
	static int[] dis = {-1,1,5};
	static int[] ch;
	static Queue<Integer> Q = new LinkedList<>();
	public static int solution(int s, int e) {
		int answer = 0;
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i =0;i<len;i++) {
				int x = Q.poll();
				for(int j = 0;j<3;j++) {
					int nx = x+dis[j];
					if(nx==e) return L+1;
					if(nx>=1 && nx <=10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(solution(s,e));
	}

}
