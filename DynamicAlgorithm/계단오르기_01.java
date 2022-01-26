package DynamicAlgorithm;

import java.util.*;
public class 계단오르기_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		for(int i =3;i<=n;i++) {
			dp[i] = dp[i-2]+dp[i-1];
		}
		System.out.println(dp[n]);
	}

}
