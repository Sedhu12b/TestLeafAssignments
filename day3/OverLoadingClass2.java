package week3.day3;

public class OverLoadingClass2 extends OverLoadingClass1{

	public void method() {
		System.out.println("This is the method from SubClass - Overridded ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingClass2 olC2 = new OverLoadingClass2();
		olC2.method2();
		olC2.method();
	}

}
