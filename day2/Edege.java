package week3.day2;

public class Edege extends Browser {
	 void takeSnap() {
		 System.out.println("Edge takeSnap");
	 }
	 void clearCookies() {
		 System.out.println("Edge ClearCookies");
		 
	 }
	 
	 public static void main(String[] args) {
		Edege newEdge = new Edege();
		newEdge.browserName = "EdgeBrowser";
		newEdge.browserVersion = "Version 1";
		System.out.println("Edge Browser : "+newEdge.browserName);
		System.out.println("Edge Browser : "+newEdge.browserVersion);
		newEdge.openURL();
		newEdge.navigateBack();
		newEdge.closeBrowser();
		newEdge.takeSnap();
		newEdge.clearCookies();
		
		
	}

}
