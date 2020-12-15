import javax.swing.*;

public class Logg {

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
