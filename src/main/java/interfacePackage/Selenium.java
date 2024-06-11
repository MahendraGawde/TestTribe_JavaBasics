package interfacePackage;

public class Selenium {
    public static void main(String[] args) {
        String browserName = "chrome";
        Browser browserSelect = null;
        if (browserName.equals("chrome")){
            browserSelect = new ChromeBrowser();
        }
        else {
            browserSelect = new FirefoxBrowser();
        }
//        ChromeBrowser chrome = new ChromeBrowser();
//        FirefoxBrowser firefox = new FirefoxBrowser();
        browserSelect.console();
        browserSelect.userInterface();
    }


}
