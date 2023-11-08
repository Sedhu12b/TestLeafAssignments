package week3.day3;

public class JavaConnectionConcrete extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnectionConcrete jcon1 = new JavaConnectionConcrete();
		jcon1.connect();
		jcon1.executeQuery();
		jcon1.executeUpdate();
		jcon1.disconnect();

	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DB Connection Established from Concrete class");
		
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DB Connection disconnected from Concrete class");
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("DB Exequte and Update Query from Concrete class");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("DB Exequte Single Query from Concrete class");
	}

}
