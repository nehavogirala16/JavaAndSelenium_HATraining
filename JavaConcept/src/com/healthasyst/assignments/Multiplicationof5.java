package com.healthasyst.assignments;

public class Multiplicationof5 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int oddcounter=0;
		int evencounter=0;
		for(i=1;i<=30;i++) {
			int res=n*i;
			if(res%2==0) {
			System.out.println(n +"*"+i +"="+res+ "  even");
			evencounter++;
		
		}
			else {
				System.out.println(n +"*"+i +"="+res+ "  odd");
				oddcounter++;
			}
			
	}
		System.out.println("total even numbers"+evencounter);
		System.out.println("total even numbers"+oddcounter);
}
}