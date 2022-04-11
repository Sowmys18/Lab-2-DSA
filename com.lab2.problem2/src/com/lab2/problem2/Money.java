package com.lab2.problem2;

import java.util.Scanner;

public class Money {
	
	public static void BubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i< n-1; i++) {
			for(int j =0; j< n-i-1; j++) {
				if(arr[j]<arr[j+i]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			}
		}
	public static void  notesCountImplementation(int notes[], int amount ){
	   int[] noteCounter = new int[notes.length];
	   try
	   {
		   for(int i = 0; i< notes.length; i++) {
			   if(amount>= notes[i]) {
				   noteCounter[i] = amount / notes[i];
				   amount = amount - noteCounter[i] * notes[i];
				   
			   }
		   }
		   if (amount >0) {
			   System.out.println("exact amount cannot be given with the heighest denomination");
		   }
		   else {
			   System.out.println("Your payment in order to give minimum number of notes will be");
			   for(int i = 0; i<notes.length; i++) {
				   if(noteCounter[i] != 0) {
					   System.out.println(notes[i] + ":"+ noteCounter[i]);
				   }
			   }
		   }
	   }
	   catch(ArithmeticException e) {
		   System.out.println(e+ "notes of denomination 0 is invalid");
	   }
		   			
				   }
			 
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Size of currency denominations:");
		 try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt(); 

			  //Creating array to store the all the numbers
			 int[] notes = new int[size];
			 System.out.println("Enter the currency denominations value:");
			 
			 
			  for(int i=0;i<size;i++) {
				 notes[i] = sc.nextInt();
			  }
			  System.out.println("Enter the amount you want to pay:");
			  int amount = sc.nextInt();
			  BubbleSort(notes);
			  notesCountImplementation(notes,amount);
		}
		}
	}
	
		 
		
			  
		  
		  
		  
		  
	
			  
			  
			  
			  
			  
			  
		

