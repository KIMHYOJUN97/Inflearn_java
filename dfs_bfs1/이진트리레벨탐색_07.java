package dfs_bfs1;

import java.util.*;
class Node{
	int data;
	Node lt,rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}
public class 이진트리레벨탐색_07 {
	static Node root;
	public static void BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			System.out.print(L+" : ");
			for(int i =0;i<len;i++) {
				Node cur = q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		BFS(root);
	}

}
