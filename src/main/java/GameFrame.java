import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame {
    private JPanel rootPanel;
    private JLabel helloLabel;
    private JButton PressMeButton;
    private JTextField nameTextField;
    private JButton PictureOneButton;

    public GameFrame() {
        PressMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String greeting = "Hello, " + nameTextField.getText() + "! Let's find a cat!";
                helloLabel.setText(greeting);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GameFrame");
        frame.setContentPane(new GameFrame().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
