import javax.swing.*;

public class Logg {

    public static void main(String[] args) {
        LoggView theView = new LoggView();
        LoggModel theModel = new LoggModel();
        LoggController theController = new LoggController(theModel, theView);


    }
}
