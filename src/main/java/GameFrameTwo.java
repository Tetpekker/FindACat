import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class GameFrameTwo extends Canvas {
    private JPanel rootPanel;
    private JLabel firstPicture;

    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("files/01.jpg");
        g.drawImage(i, 12,10,this);

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:\\Users\\tetpe\\IdeaProjects\\FindACat\\src\\main\\java\\files\\01.jpg");
        frame.add(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);

    }
}
