import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JPanel rootPanel;
    private JLabel helloLabel;
    private JButton pressMeButton;
    private JTextField nameTextField;

    public HelloWorld() {
        pressMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String greeting = "Hello " + nameTextField.getText();
                helloLabel.setText(greeting);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
