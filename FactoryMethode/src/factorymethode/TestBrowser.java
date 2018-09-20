package factorymethode;
import java.util.*;
//test or evaluation class
public class TestBrowser {
    public static void main(String[] args) {
        //Getting the browser objects using the factory methode 
        Browser br1 = BrowserFactory.getBrowser("IE");
        Browser br2 = BrowserFactory.getBrowser("Google Chrome");
        Browser br3 = BrowserFactory.getBrowser("FireFox");
        Browser br4 = BrowserFactory.getBrowser("XT");
        // Testing the object if it is not null before calling method on it to avoid NullPointerException.
        if (br1 != null) {
            br1.start();
            br1.stop();
        }
        if (br2 != null) {
            br2.start();
            br2.stop();
        }
        if (br3 != null) {
            br3.start();
            br3.stop();
        }
        if (br4 != null) {
            br4.start();
            br4.stop();
        }
        //creating a list of browser
        
        List<Browser> ls = new ArrayList<>();
        ls.add(br1);
        ls.add(br2);
        ls.add(br3);
        ls.add(br4);
        //using the forEch method and method reference as per java 8.
        ls.forEach(System.out::println);
    }
}