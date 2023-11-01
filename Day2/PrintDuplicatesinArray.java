package week2.Day2;

import java.util.Arrays;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		
		int[] numb = {2,5,7,7,5,9,2,3};
		
		Arrays.sort(numb);
		//System.out.println("Arra Numb val:");
		/*for (int k = 0; k < numb.length;k++) {
			System.out.println("Numb Array :"+numb[k]);
		}*/
		for(int i=0; i<numb.length;i++) {
			
			for(int j=i+1;j<numb.length;j++) {
				
				if(numb[i]==numb[j]) {
					System.out.println("Duplicate Value is :"+numb[i]);
				}
			}
				
		}

	}

}
