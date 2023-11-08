package week3.day3;

public interface DatabaseConnection {
	
	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();


}
