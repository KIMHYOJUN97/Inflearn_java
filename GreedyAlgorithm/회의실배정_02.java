package GreedyAlgorithm;

import java.util.*;
class Time implements Comparable<Time>{
	int s,e;
	public Time(int s,int e){
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if(this.e== o.e) return this.s-o.s;
		else return this.e-o.e;
	}
}
public class 회의실배정_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Time(x,y));
		}
		Collections.sort(arr);
		int end_time=0;
		for(Time ob : arr) {
			if(ob.s >= end_time) {
				cnt++;
				end_time = ob.e;
			}
		}
		System.out.println(cnt);
	}

}
