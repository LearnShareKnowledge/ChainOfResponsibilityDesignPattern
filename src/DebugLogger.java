/**
 * Created by 310124463 on 18/02/17.
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        super(level);
    }

    @Override
    public void logMessage(int level, String message) {

        if(this.level == level)
        {
            // handle the request
            System.out.println("DebugLogger.logMessage:"+ message);
        }
        else
        {
            // pass this to next logger in chain
            nextLogger.logMessage(level,message);
        }

    }
}
