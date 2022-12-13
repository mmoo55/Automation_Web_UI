package browser;

public class FactoryBrowser {
    public static IBrowser make(String browserType){
        IBrowser browser;
        switch (browserType.toLowerCase()){
            case "grid":
                browser = new Grid();
                break;
            case "headless":
                browser = new Headless();
                break;
            default:
                browser = new Chrome();
                break;
        }
        return browser;
    }
}
