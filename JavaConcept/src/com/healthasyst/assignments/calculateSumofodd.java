package com.healthasyst.assignments;

import java.util.Scanner;

public class calculateSumofodd {
int i=1;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter the limit - ");
		int a= sc.nextInt();
		
		for(int i=1;i<a;i++) {
			if(i%2!=0) {
				 i++;
				
			}
			System.out.println("the sum of odd numbers"+i);
		}

	}

}
