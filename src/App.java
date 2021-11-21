import java.util.logging.*;

public class App {
    int[] exampleTest1 = {2,6,8,-10,3}; 
    int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};

    public static void main(String[] args) {
          // Create a Logger
          Logger logger
          = Logger.getLogger(
              App.class.getName());

      // log messages using log(Level level, String msg)
      logger.log(Level.INFO, "This is message 1");
      logger.log(Level.WARNING, "This is message 2");

      
    }


    public static boolean isEven(int num){
        return (num % 2 == 0);
      }
}
