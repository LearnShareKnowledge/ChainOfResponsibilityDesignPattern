/**
 * Created by 310124463 on 18/02/17.
 */
public abstract class AbstractLogger {

    public static int DEBUG = 1 ;

    public static int INFO = 2 ;

    public static int ERROR = 3 ;

    public int level ;

    public AbstractLogger nextLogger;

    public AbstractLogger(int level)
    {
        this.level = level;
    }

    public abstract void logMessage(int level , String message);

    public void setNextLogger(AbstractLogger nextLogger)
    {
        this.nextLogger = nextLogger ;
    }


}
