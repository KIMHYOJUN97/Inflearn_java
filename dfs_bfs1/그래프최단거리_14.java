package dfs_bfs1;

import java.util.*;
//최단거리는 bfs라고 생각하면 된다.
public class 그래프최단거리_14 {
	static int n,m,answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch,dis;
	public static void BFS(int v) {
		Queue<Integer> q = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		q.offer(v);
		while(!q.isEmpty()) {
			int cv = q.poll();
			for(int nv:graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv]=1;
					q.offer(nv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		//인접 리스트 만들기.
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i =0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
		}
		BFS(1);
		for(int i = 2;i<=n;i++) {
			System.out.println(i + " : "+dis[i]);
		}
	}

}
