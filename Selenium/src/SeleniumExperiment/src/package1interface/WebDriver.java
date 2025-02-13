package package1interface;

public interface WebDriver {
	void get(String url);
	
	String getCurrentUrl();
	
	String getTitle();
	
	void close();
}
