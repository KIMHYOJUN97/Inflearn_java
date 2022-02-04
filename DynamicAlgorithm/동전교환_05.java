package DynamicAlgorithm;

import java.util.*;
public class 동전교환_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coin = new int[n];
		for(int i=0;i<n;i++) {
			coin[i] = sc.nextInt();

		}
		int target = sc.nextInt();
		int[] dy = new int[target+1];
		Arrays.fill(dy, 1000);
		dy[0] = 0;
		for(int i =0;i<n;i++) {
			for(int j =coin[i];j<=target;j++) {
				dy[j] = Math.min(dy[j],dy[j-coin[i]]+1);
			}
		}
		System.out.println(dy[target]);
	}

}
