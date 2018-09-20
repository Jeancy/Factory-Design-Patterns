package factorymethode;

//The factory class used to create browsers objects

public class BrowserFactory {
    
    // Defining the factory method that actually creates and returns the browser object
    public static Browser getBrowser(String br){
        // Testing the browser using the switch statement.
        switch (br) {
            case "IE": return new IE();
            case "Google Chrome": return new GoogleChrome();
            case "FireFox": return new FireFox();
            default: return null;
                
        }
    }
}
