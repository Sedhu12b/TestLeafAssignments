package week3.day3;

public class JavaConnection implements DatabaseConnection{

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DB Connection Established");
		
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DB Connection disconnected");
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("DB ExequteUpdate Query");
		
	}
	
	public static void main(String[] args) {
		JavaConnection jcon = new JavaConnection();
		jcon.connect();
		jcon.executeUpdate();
		jcon.disconnect();
	}

}
