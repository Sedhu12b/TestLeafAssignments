package week2.Day2;

public class ReverseOddWords {
	String temp="";
	public static void main(String[] args) {
		String test1 = "I am a software tester";
		ReverseOddWords obj1 = new ReverseOddWords();
		obj1.reverseOddWordsinString(test1);
	}
	
	void reverseOddWordsinString(String test) {
		
		String string="";
		
		String[] splitarr = test.split(" ");
		//System.out.println(splitarr[1]);
		for (int i = 1; i < splitarr.length; i=i+2) {
			
			for (int j = splitarr[i].length()-1; j >=0; j--) {
				temp = temp+splitarr[i].charAt(j);
							
			}
			splitarr[i] = splitarr[i].replaceAll(splitarr[i], temp);
			//System.out.println(splitarr[i]);
			
		}
		
		for (int i = 0; i < splitarr.length; i++) {
			 string = string+splitarr[i]+" ";
			
		}
		
		System.out.print(string);

	}
	

}
