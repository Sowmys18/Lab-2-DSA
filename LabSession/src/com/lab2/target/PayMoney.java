package com.lab2.target;
import java.util.Scanner;

public class PayMoney {
	

public static void main(String[] args) {
	
	int size;
	 int transaction;
	
	 int target;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter number of elements:");
	
	  size = sc.nextInt(); 

	  //Creating array to store the all the numbers
	 int  array[] = new int[size];

	  System.out.println("Enter " + size + " integers");
	  //Loop to store each numbers in array
	  for (transaction = 0; transaction <size; transaction++)
	      array[transaction] = sc.nextInt(); // 12 20 15 18
	  System.out.println("Enter total no of targets to be acheived");
	  int t=sc.nextInt();
	  for(int i=1;i<=t;i++) {
	  System.out.println("Enter the no of target value:");
	  target = sc.nextInt(); //32
	  
	  // Acheive our target
	  int sum = 0;
	  for (transaction = 0; transaction <size; transaction++) {
		  sum = sum + array[transaction];
		  if(sum>=target ) {// 20 12 15   32   0+20=>20  
			  
			break;
		  }
		  
	  }
	  if(sum<target ) {
		  System.out.println("Target not Achieved");
	  }
	  else
		  System.out.println("Target achieved after "+ (transaction+1) +"Transactions" );
	  }
	}
	}
}
