package week2.Day2;

public class ChangeOddIndexChartoUpperCase {
	
	public static void main(String[] args) {
		String strval = "changeme";
		
		ChangeOddIndexChartoUpperCase obj1 = new ChangeOddIndexChartoUpperCase();
		obj1.changeOddIndextoUpper(strval);
	}

	void changeOddIndextoUpper(String str1) {
		
		//String strval = "changeme";
		 char[] charArray = str1.toCharArray();
		
		for (int i = 1; i < charArray.length; i=i+2) {
			charArray[i] = Character.toUpperCase(charArray[i]);
			//System.out.println(charArray[i]);
		}
		
		System.out.print(charArray);
		
	}
}
