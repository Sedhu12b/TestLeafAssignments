package week3.day3;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("This is APIClient with one Argument"+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("This is APIClient with 3 Arguments: 1st Arg-EndPoint "+endpoint+"| 2nd Arg-requestBody "+requestBody+" | 3r Args requestStatus "+requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient apiClient = new APIClient();
		apiClient.sendRequest("1 Args Endpoint");
		apiClient.sendRequest("Overloaded ", "2nd Arg Request Body", true);
	}
}
