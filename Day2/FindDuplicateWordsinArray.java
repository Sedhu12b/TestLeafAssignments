package week2.Day2;

public class FindDuplicateWordsinArray {
	int count = 0;
	String str1 ="";
	 
	public static void main(String[] args) {
		String text1 = "We learn Java basics as part of java sessions in java week1";
		
		FindDuplicateWordsinArray duparr1 = new FindDuplicateWordsinArray();		
		duparr1.findDupwords( text1);
		
	}

	
	void findDupwords(String text1) {
		
		
		String[] splitedTxt = text1.split(" ");
		//System.out.println(splitedTxt[0]);	
		
		for (int i = 0; i < splitedTxt.length; i++) {		
					
					for (int j = i+1; j < splitedTxt.length; j++) {
						if (splitedTxt[i].equals(splitedTxt[j])) {
							count=count+1;
							str1 = str1+splitedTxt[i]+" ";
						}
						
					}
			
		}
		
		System.out.println("Duplicate words count in given String is -> "+count);
		System.out.println("Duplicate words in given String is -> "+str1);
		System.out.println("======================================");
		System.out.println("Given String -> "+text1);
		System.out.println("Replaced String with Duplicated word is -> "+text1.replaceAll(str1, " "));
	}
}
