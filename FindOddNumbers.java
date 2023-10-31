package week2.Day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindOddNumbers findodd = new FindOddNumbers();
		findodd.findoddnumbs1();

	}
	
	public void findoddnumbs1() {
		
		for(int i=0;i<=10;i++) {
			if (i%2 == 1 )
			{
				System.out.println("Given numb is Odd :"+i);
			}
		}
	}

}
