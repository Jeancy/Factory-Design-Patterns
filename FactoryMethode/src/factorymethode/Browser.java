// Factory design pattern in action
package factorymethode;

// Coding through interface principal
public interface Browser {
    //defining the default behaviour with java 8 default method
    default void start(){
        System.out.println("Starting Browser ....");
    }
    default void stop(){
        System.out.println("Stopping Browser...");
    }
    
}
// Implementing the browser interface with different well known browsers.

class IE implements Browser {
    @Override
    public void start(){
        System.out.println("Starting Internet Explorer...");
    }
    @Override
    public void stop(){
        System.out.println("Stopping Internet Explorer...");  
    }
    // Overriding the toString method of all the browsers for propre defintion.
    @Override
    public String toString(){
        return " [" +"Internet Explorer ]";
    }
}
class GoogleChrome implements Browser {
    @Override
    public void start(){
        System.out.println("Starting Google chrome...");
    }
    @Override
    public void stop(){
        System.out.println("Stopping Google chrome...");  
    }
    @Override
    public String toString(){
        return " [ "+"Google Chrome ]";
    }
}
class FireFox implements Browser{
    @Override
    public void start(){
        System.out.println("Starting Firefox....");
    }
    @Override
    public void stop(){
        System.out.println("Stopping FireFox...");  
    }
    @Override
    public String toString(){
        return " [ "+"Firefox ]";
    }
}
