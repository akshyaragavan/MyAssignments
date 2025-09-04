package week3.day2;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		
		System.out.println("connect to the browser");
	}

	@Override
	public void disconnect() {
		
		System.out.println("disconnect the connection");
		
	}

	@Override
	public void excuteUpdate() {
		
		System.out.println("update to the latest version");
		
	}
	public static void main(String[] args) {
		
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.excuteUpdate();
		
	}

}
