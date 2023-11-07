package week3.day2;

public class Button extends WebElement {
	public void submit() {
		System.out.println("Button - submit");
	}
	
	public static void main(String[] args) {
		Button btn = new Button();
		btn.submit();
		btn.click();
		btn.setText("Sample Text from Button class");
	}
}
