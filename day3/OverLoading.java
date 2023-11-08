package week3.day3;

public class OverLoading {
	
	public void reportStep(String msg, String status) {
		System.out.println("OverLoading with 2 Paramerters : "+"Message text"+msg+" Status txt : "+status);
		
	}
	
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("OverLoading with 3 Paramerters : "+"Message text"+msg+" Status txt : "+status+"Boolean status : "+snap);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoading ol = new OverLoading();
		ol.reportStep("Sample msg OverLoading ", "Sample status overloading");
		ol.reportStep("Overloading 2nd method", "Status overloading 2nd  Status", true);
		
		
	}

}
