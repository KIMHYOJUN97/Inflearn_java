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
public class 이진트리순회_05 {
	public static void DFS(Node root) {
		if(root == null) return;
		else {
//			System.out.print(root.data+" ");
			DFS(root.lt);
			System.out.print(root.data+" ");
			DFS(root.rt);
//			System.out.print(root.data+" ");
		}
	}
	
	public static void main(String[] args) {
		Node tree = new Node(1);
		tree.lt = new Node(2);
		tree.rt = new Node(3);
		tree.lt.lt = new Node(4);
		tree.lt.rt = new Node(5);
		tree.rt.lt = new Node(6);
		tree.rt.rt = new Node(7);
		DFS(tree);
	}

}
