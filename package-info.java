package com.labQ4;
class Mmain{
	public static void main(String[] args) {
		char[] chars = {'a','A','B','C','d'};
		for(int i=0; i<chars.length; i++) {
			System.out.print(chars[i]+" ");
		}
	}
static void bubbleSort(int array[]) {
    int size = array.length;
    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)

        
        if (array[j] > array[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }
}
  
