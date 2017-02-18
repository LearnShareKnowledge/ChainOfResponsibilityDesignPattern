

public class Test {

    public static void main (String [] args)
    {

        // Create a logger

        AbstractLogger logger = getLogger ();

        // pass a message with level = debug and log it
        logger.logMessage(AbstractLogger.DEBUG,"debug message");

        // pass a message with level = info and log it
        logger.logMessage(AbstractLogger.INFO,"Info message");

        // pass a message with level = error and log it
        logger.logMessage(AbstractLogger.ERROR,"Error message");

        // Here debug < info < error .. level wise

        // Let's get started

    }

    private static AbstractLogger getLogger() {

        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);

        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        debugLogger.setNextLogger(infoLogger);

        infoLogger.setNextLogger(errorLogger);

        return debugLogger;


    }
}
