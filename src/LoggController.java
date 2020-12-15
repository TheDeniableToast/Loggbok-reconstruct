public class LoggController {

    private LoggView theView;
    private LoggModel theModel;

    public LoggController(LoggModel theModel, LoggView theView) {
        this.theModel = theModel;
        this.theView = theView;
    }
}
