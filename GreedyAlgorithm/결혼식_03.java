package GreedyAlgorithm;

import java.util.*;
class People implements Comparable<People>{
	int time;
	char state;
	People(int time, char state){
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(People o) {
		if(this.time==o.time) return this.state-o.state;
		else return this.time-o.time;
	}
}
public class 결혼식_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<People> ps = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ps.add(new People(x,'s'));
			ps.add(new People(y,'e'));
		}
		Collections.sort(ps);
		int cnt=0,max=0;
		
		for(People o:ps) {
			if(o.state=='s') cnt++;
			else cnt--;
			max = Math.max(cnt, max);
		}
		System.out.println(max);
	}
}
