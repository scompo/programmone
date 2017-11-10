package tk.scompo.programmone;

/**
* A test class.
*/
public class App {

    /**
    * Returns a greeting.

    * @return Hello world.
    */
    public String getGreeting() {
            return "Hello world.";
    }

    /**
    * Main entry point.
    *
    * @param args Command line arguments.
    */
    public static void main(String[] args) {
            System.out.println(new App().getGreeting());
    }
}
