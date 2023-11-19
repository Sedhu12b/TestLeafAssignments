package codingchallenge;

public class CodChanDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodChanDay1 cc = new CodChanDay1();
//		cc.cc1pg1_lastWordinString("Wefxddzlcome to the World of Programming");
//		cc.cc1pg1_lastWordinString("Autoamtion life so crazy!");
//		System.out.println("Fun call with return :"+var1);
		
		cc.rootOfTheNumberInt(8);
	}
	
	String cc1pg1_lastWordinString(String s1) {
//		String s1 = "Hello World Java";
		System.out.println("===== Coding Changellange Day1 Program1 String Last word and Length =======");
		String[] splitArr = s1.split(" ");
		System.out.println("Length of the String Array : "+splitArr.length);
		System.out.println("Last Word in Given String is : "+splitArr[(splitArr.length)-1]);
		
		System.out.println("Lengeth of Last word in Given String is : "+(splitArr[(splitArr.length)-1]).length());
		System.out.println("=========Coding Changellange Day1 Pgm1 Ends ==========");
		return splitArr[(splitArr.length)-1] ;
		
	}
	
	public void rootOfTheNumberInt(Integer number ) {
		double t,t2;
		double squareroot = number / 2;
		do 
		{
		t = squareroot;
		t2 =number/t;
		squareroot = (t + t2) / 2;
		}
		 while ((t - squareroot) != 0); 
		System.out.println(squareroot); 
		 
		
	}
	
}
