package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arrayOfStrings = new String[5];
		arrayOfStrings[0] = "me1";
		arrayOfStrings[1] = "me2";
		arrayOfStrings[2] = "me3";
		arrayOfStrings[3] = "me4";
		arrayOfStrings[4] = "me5";
		//2. print the third element in the array
		System.out.println(arrayOfStrings[2]);
		//3. set the third element to a different value
		arrayOfStrings[2] = "you";
		//4. print the third element again
		System.out.println(arrayOfStrings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i =0;i<arrayOfStrings.length; i++) {
			System.out.print(arrayOfStrings[i]+" ");
		}
		System.out.println("");
		
		//6. make an array of 50 integers
		int fiftyInts[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i =0;i<fiftyInts.length; i++) {
			Random r = new Random();
			int rando = r.nextInt(51);
			fiftyInts[i]=rando;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallBoi =50;
		for(int i =0;i<fiftyInts.length; i++) {
			if(fiftyInts[i]<smallBoi) {
				smallBoi = fiftyInts[i];
			}
		}
		System.out.println("smallest number: "+smallBoi);
		//9 print the entire array to see if step 8 was correct
		for(int i =0;i<fiftyInts.length; i++) {
	System.out.println( fiftyInts[i]);
		}
		//10. print the largest number in the array.
		int bigBoi =0;
		for(int i =0;i<fiftyInts.length; i++) {
			if(fiftyInts[i]>bigBoi) {
				bigBoi = fiftyInts[i];
			}
		}
		System.out.println("Biggest Number: "+bigBoi);
	}
}
