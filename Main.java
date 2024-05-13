package com.labQ1;

import java.util.Scanner;

public class Main {
	public static void  main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many numbers do you want to enter");
		int n= input.nextInt();
		int[] nums =new int[n];
		for(int i=0; i<nums.length; i++) {
			nums[i]=input.nextInt();
		}
		System.out.println("what number do you what to search and count");
		int num =input.nextInt();
		int result=Search(nums, num);
		System.out.println("the number " + num + " is occurred in array " + result+" times");
		mergeSort(nums);
		for(int i=0; i<=nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
	}

       static int Search(int[] nums, int num) {
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]== num) {
				count++;
			}
		}
		return count;
		
	}
       public static void mergeSort(int[] array) {
    	   if (array.length <= 1) {
    	   return; 
    	   }
    	   int mid = array.length / 2;
    	   int[] leftArray = new int[mid];
    	   int[] rightArray = new int[array.length - mid];
    	   for (int i = 0; i < mid; i++) {
    	   leftArray[i] = array[i];
    	   }
    	   for (int i = mid; i < array.length; i++) {
    	   rightArray[i - mid] = array[i];
    	   }
    	   mergeSort(leftArray);
    	   mergeSort(rightArray);
    	   merge(array, leftArray, rightArray);
    	   }
    	  public static void merge(int[] array, int[] leftArray, int[] rightArray) {
    	   int leftLength = leftArray.length;
    	   int rightLength = rightArray.length;
    	   int i = 0, j = 0, k = 0;
    	   while (i < leftLength && j < rightLength) {
    	   if (leftArray[i] <= rightArray[j]) {
    	   array[k++] = leftArray[i++];
    	   }
    	   else {
    	   array[k++] = rightArray[j++];
    	   }
    	   } 
    	   while (i < leftLength) {
    	   array[k++] = leftArray[i++];
    	   } 
    	   while (j < rightLength) {
    	   array[k++] = rightArray[j++];
    	   }
    	   }
    	  

}
