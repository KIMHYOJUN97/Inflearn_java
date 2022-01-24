package GreedyAlgorithm;

import java.util.*;
class Person implements Comparable<Person>{
	int height;
	int weight;
	public Person(int height,int weight){
		this.height = height;
		this.weight = weight;
	}
	@Override
	public int compareTo(Person o) {
		return o.height-this.height;
	}
}
public class 씨름선수_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		ArrayList<Person> al = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int height = sc.nextInt();
			int weight = sc.nextInt();
			al.add(new Person(height,weight));
		}
		
		Collections.sort(al);
		int max = Integer.MIN_VALUE;
		for(Person p:al) {
			if(p.weight > max) {
				max = p.weight;
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
