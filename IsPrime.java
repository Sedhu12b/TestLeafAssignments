package week2.Day1;

public class IsPrime {
	
	public static void main(String[] args) {
		
		int numb = 11;
		boolean primeflag = true;
		for (int i = 2; i < numb; i++) {
			
			if(numb%i == 0) {
				primeflag = false;
				break;
			}
			
			
		}
		if(primeflag==false) {
			System.out.println("Given Numb "+numb+" is Not Prime");
		}else {
			System.out.println("Given Numb "+numb+" is Prime");
		}
	}

}
