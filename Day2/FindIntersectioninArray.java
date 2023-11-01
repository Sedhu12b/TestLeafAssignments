package week2.Day2;

public class FindIntersectioninArray {

	public static void main(String[] args) {
		
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		for (int i = 0; i < array1.length; i++) {
			
			
			for (int j2 = 0; j2 < array2.length; j2++) {
				if (array1[i] == array2[j2]) {
					System.out.println("Intersection Value b/w Array1 and Array2 is : "+array1[i]);
				}
				
			}
			
		}
	}
}
