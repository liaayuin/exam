package com.labQ6;
class Main{
	public static void main(String[] args) {
		int[] array= {3, 7, 1, 9, 4};
		int indexToDelete=7;
		deletedElement(array,indexToDelete);
	}

	private static int[] deletedElement(int[] array, int indexToDelete) {
		int[] newArray = new int[array.length - 1]; 
		if(indexToDelete>0 && indexToDelete <array.length) {
			for (int i = 0, j = 0; i < array.length; i++) { 
				if (i != indexToDelete) { 
					newArray[j++] = array[i]; 
				}
			}
		}
		else{
			new IllegalStateException("Invalid index " + array); 
		return newArray;
	}

}