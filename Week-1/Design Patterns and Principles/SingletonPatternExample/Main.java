package SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        //Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        //Logger instance again
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verify both loggers point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton works!");
        } else {
            System.out.println("Logger instances are different. Singleton failed.");
        }
    }
}


// The Logger.java class above follows the Singleton design pattern:

//            1. Only one instance is created.

//            2. Constructor is private.

//            3. A static method getInstance() returns the instance.



/*Output ---> Logger Initialized
              Log: This is the first log message.
              Log: This is the second log message.
              Both logger instances are the same. Singleton works!     */