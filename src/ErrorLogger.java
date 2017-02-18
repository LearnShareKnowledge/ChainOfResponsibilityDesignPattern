/**
 * Created by 310124463 on 18/02/17.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void logMessage(int level, String message) {

        if(this.level == level)
        {
            System.out.println("ErrorLogger.logMessage:"+ message);
        }
        else
        {
            nextLogger.logMessage(level,message);
        }

    }
}
