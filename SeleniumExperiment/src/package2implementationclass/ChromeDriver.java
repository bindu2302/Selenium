package package2implementationclass;

import package1interface.WebDriver;

public class ChromeDriver implements WebDriver {

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("Opens url in chrome, get method from Chrome driver class");
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return "current url is returned to the user, getCurrentUrl method from chromedriver class";
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "gives the title of the current page, getTitle method from chromedriver class";
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("close the current browser window, close method from the chromedriver class");
		
	}
}
