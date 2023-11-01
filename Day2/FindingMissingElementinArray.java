package week2.Day2;

import java.util.Arrays;

public class FindingMissingElementinArray {
	public static void main(String[] args) {
		int[] arr1 =  {11,13,15,17,21,23};
		FindingMissingElementinArray chkmmissing = new FindingMissingElementinArray();
		chkmmissing.checkMissingNumbinArrary(arr1);
			
		}
	
	void checkMissingNumbinArrary(int[] arr1) {
	
	
	Arrays.sort(arr1);
	
	int j = arr1[0];
	int k = arr1[1];
	int diffbwtwoint = k - j;
	
	
	
	for (int i = 0; i < arr1.length-1; i++) {
		
		if (arr1[i+1]-(arr1[i]) != diffbwtwoint) {
			System.out.println("Missing Value in Array is : "+(arr1[i]+diffbwtwoint));
		}
		}
	}

}
