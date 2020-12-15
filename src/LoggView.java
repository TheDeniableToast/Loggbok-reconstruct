import javax.swing.*;

public class LoggView {
    private JPanel LoggPanel;
    private JLabel LoggTitle = new JLabel("Loggbok");
    private JButton enterButton = new JButton("Enter");
    private JTextPane LogEntry = new JTextPane();
    private JTextPane User = new JTextPane();
    private JTextArea Console = new JTextArea(20, 5);

    public JPanel getLoggPanel() {
        return LoggPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoggView");
        frame.setContentPane(new LoggView().LoggPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public String getLogEntry() {
        return LogEntry.getText();
    }

    public String getUser() {
        return User.getText();
    }

    private void createUIComponents() {

    }
}
