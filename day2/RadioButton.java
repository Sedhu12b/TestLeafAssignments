package week3.day2;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("select Radion BUtton ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton radbtn = new RadioButton();
		radbtn.selectRadioButton();
		radbtn.submit();
		radbtn.click();
		radbtn.setText("Sample Text from RadioButton cls");
	}

}
