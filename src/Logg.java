import javax.swing.*;

public class Logg {

    /**
     *This class collects the individual parts of the project and lets them run at the same time
     *
     * @param args the name of the string array that stores java command line arguments
     */

    public static void main(String[] args) {
        LoggView theView = new LoggView();
        LoggModel theModel = new LoggModel();
        LoggController theController = new LoggController(theModel, theView);

        JFrame frame = new JFrame("LoggView");
        frame.setContentPane(theView.getLoggPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
