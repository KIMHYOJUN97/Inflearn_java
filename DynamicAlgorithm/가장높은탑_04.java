package DynamicAlgorithm;

import java.util.*;
class Brick implements Comparable<Brick>{
	int s;
	int h;
	int w;
	public Brick(int s,int h,int w) {
		this.s = s;
		this.w = w;
		this.h = h;
	}
	@Override
	public int compareTo(Brick o) {
		return o.s-this.s;
	}
}
public class 가장높은탑_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dy = new int[n];
		ArrayList<Brick> arr = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr.add(new Brick(a,b,c));
		}
		
		int answer = 0;
		Collections.sort(arr);
		dy[0]= arr.get(0).h;
		answer = dy[0];
		for(int i =1;i<arr.size();i++) {
			int max_h = 0;
			for(int j=i-1;j>=0;j--) {
				if(arr.get(j).w>arr.get(i).w && dy[j]>max_h) {
					max_h = dy[j];
				}
			}
			dy[i] = max_h+arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		System.out.println(answer);
	}

}
