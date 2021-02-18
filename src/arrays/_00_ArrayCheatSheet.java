package arrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5];
		for(int i=0;i<5;i++) {
			strings[i] = "String " + i;
		}
		//2. print the third element in the array
		System.out.println(strings[2]);
		System.out.println();
		//3. set the third element to a different value
		strings[2] = "changed";
		//4. print the third element again
		System.out.println(strings[2]);
		System.out.println();
		//5. use a for loop to print all the values in the array
		   //BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		System.out.println();
		//6. make an array of 50 integers
		int[] ints = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for(int i=0;i < ints.length; i++) {
			ints[i] = rand.nextInt(200);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = 200;
		for(int i = 0; i < ints.length; i++) {
			if(smallestNumber > ints[i]) {
				smallestNumber = ints[i];
			}
		}
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		//10. print the largest number in the array.
		int largestNumber = 1;
		for(int i = 0; i < ints.length; i++) {
			if(largestNumber < ints[i]) {
				largestNumber = ints[i];
			}
		}
		System.out.println();
		System.out.println(smallestNumber);
		System.out.println(largestNumber);
	}
}
