package week2.Day1;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Palindrome pali1 = new Palindrome();
		pali1.chkpalindrome(12321);
		
	}
	
	void chkpalindrome(int numb1) {
		int temp1,n,temp2;
		temp2=0;
		
		n = numb1;
		while(n>0) {
			temp1 = n%10;
			temp2 = (temp2*10)+temp1;
			n=n/10;
			
		}
	//System.out.println(temp2);
		
	if (numb1 == temp2 ) {
		System.out.println("Given Numbr is Palindrome");
	}else {
		System.out.println("Given numb is Not Palindrome");
	}

	}

}
