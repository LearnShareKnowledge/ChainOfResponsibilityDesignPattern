/**
 * Created by 310124463 on 18/02/17.
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        super(level);
    }

    @Override
    public void logMessage(int level, String message) {

        if(this.level == level)
        {
            System.out.println("InfoLogger.logMessage:"+ message);
        }
        else
        {
            nextLogger.logMessage(level,message);
        }

    }
}
