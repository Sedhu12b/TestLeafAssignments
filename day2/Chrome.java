package week3.day2;

public class Chrome extends Browser {
	 void openIncognito() {
		 System.out.println("Chrome Incognito");
	 }
	 void clearCache() {
		 System.out.println("Chrome cleare Cache");
		 
	 }
	 public static void main(String[] args) {
		 Chrome chBr = new Chrome();

		 chBr.browserName = "Chrome Bro";
		 chBr.browserVersion = "V1.22";
		 chBr.openURL();
		 chBr.navigateBack();
		 chBr.closeBrowser();
		 chBr.openIncognito();
		 chBr.clearCache();
	}

}
