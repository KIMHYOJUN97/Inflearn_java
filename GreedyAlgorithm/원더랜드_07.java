package GreedyAlgorithm;

import java.util.*;
class Edge implements Comparable<Edge>{
	int v1;
	int v2;
	int cost;
	public Edge(int v1,int v2,int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge ob) {
		return this.cost-ob.cost;
	}
}
public class 원더랜드_07 {
	static int[] unf;
	static int answer = 0;
	public static int Find(int v) {
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]);
	}
	public static void Union(int a,int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa !=fb) unf[fa]=fb;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		unf = new int[v+1];
		ArrayList<Edge> arr = new ArrayList<>();
		for(int i =1;i<=v;i++) unf[i] = i;
		for(int i=0;i<e;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr.add(new Edge(a,b,c));
		}
		Collections.sort(arr);
		for(Edge ob : arr) {
			int fv1=Find(ob.v1);
			int fv2=Find(ob.v2);
			if(fv1!=fv2) {
				answer+=ob.cost;
				Union(ob.v1,ob.v2);
			}
		}
		
		System.out.println(answer);
	}

}
