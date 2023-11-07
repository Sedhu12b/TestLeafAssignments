package week3.day2;

public class Safari extends Browser {
	
	void readerMode() {
		System.out.println("Safari readerMode");
	}
	void fullScreenMode() {
		System.out.println("Safari fullScreen");
		
	}
	public static void main(String[] args) {
		Safari brSA = new Safari();
		brSA.browserName = "Safari";
		brSA.browserVersion = "Version2";
		System.out.println("Browser Name :"+brSA.browserName);
		System.out.println("Version :"+brSA.browserVersion);
		brSA.openURL();
		brSA.navigateBack();
		brSA.closeBrowser();
		brSA.readerMode();
		brSA.fullScreenMode();
	}

}
