package GreedyAlgorithm;
//
import java.util.*;
class benefit implements Comparable<benefit>{
	int money;
	int day;
	public benefit(int money,int day) {
		this.money = money;
		this.day = day;
	}
	@Override
	public int compareTo(benefit o) {
		return o.day-this.day;
	}
}
public class 최대수입스케줄_priority_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<benefit> bn = new ArrayList<>();
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		int max = 0;
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			bn.add(new benefit(x,y));
			if(y>max) max = y;
		}
		Collections.sort(bn);
		int j =0;
		int sum =0;
		for(int i=max;i>=1;i--) {
			for(;j<n;j++) {
				if(bn.get(j).day<i) break;
				q.offer(bn.get(j).money);
			}
			if(!q.isEmpty()) {
				sum += q.poll();
			}
		}
		
		System.out.println(sum);
		
	}

}
