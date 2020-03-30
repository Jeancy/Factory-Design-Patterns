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
        Browser br5 = BrowserFactory.getBrowser("NULL");
        
        // Testing the object if it is not null before calling method on it to avoid NullPointerException.
        // Creating an array of browsers.
        Browser [] brs = {br1, br2,br3, br4,br5};
        for(Browser br: brs){
            if (br != null) {
               br.start();
               br.stop();
            }    
        }
        
        //creating a list of browser
        
        List<Browser> ls = new ArrayList<>();
        ls.add(br1);
        ls.add(br2);
        ls.add(br3);
        ls.add(br4);
        ls.add(br5);
        //using the forEch method and method reference as per java 8.
        ls.forEach(System.out::println);
    }
}
