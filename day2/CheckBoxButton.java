package week3.day2;

public class CheckBoxButton extends Button{

	public void clickCheckButton() {
		System.out.println("CheckBoxButton - clickCheckButton ");
	}
	
	public static void main(String[] args) {
		CheckBoxButton chkbxbtn = new CheckBoxButton();
		chkbxbtn.clickCheckButton();
		chkbxbtn.submit();
		chkbxbtn.click();
		chkbxbtn.setText("CheckBox Text");
		
		
	}
}
