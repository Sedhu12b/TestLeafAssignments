package codingchallenge;

import java.lang.reflect.Array;

public class CodChanDay2 {
	
	public static void main(String[] args) {
		CodChanDay2 cc2 = new CodChanDay2();
//		cc2.chkpalindrome("A man, a plan, a canal: Panama");
//		cc2.chkpalindrome("race a car");
//		cc2.chkpalindrome("");
		
		System.out.println("=======================");
		cc2.chkSingleEle();
		
	}
	
	public void chkpalindrome(String s1) {
		String t,t1,t2;
		t2="";
//		String s1 = "A man, a plan, a canal: Panama";
		t = s1.toLowerCase();
		t1 = t.replaceAll("[^a-zA-Z]", "");
		
		for (int i = t1.length()-1; i>= 0; i--) {
			t2 += t1.charAt(i);
			
		}
		System.out.println("Pharse : "+t1);
		System.out.println("Pharse Reverse : "+t2);
		
		if (t1.equals(t2)) {
			System.out.println("Given Phare is Palindrome ============  ");
		}
		else
		{
			System.out.println("Given Sting is Not Palindrome =============");
		}

	}
	
	public void chkSingleEle() {
			int[] a1 = {1,2,1,2,3,1,2};
			int flag;
			for(int i=0;i<=a1.length-1;i++) {
				flag = 0;
				for (int j=0; j<= a1.length-1;j++) {
					
					if (a1[i]==a1[j]) {
						flag = flag+1;
					}
				}
				
				if (flag == 1) {
					System.out.println("Single Element : "+a1[i]);
				}
			}	
			
			
			
		}

}
