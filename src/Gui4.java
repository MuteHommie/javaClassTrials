import javax.swing.*;

public class Gui4  extends JFrame{
    public Gui4(){
        setVisible(true);
        setSize(500, 300);
        setTitle("Second frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        String trial = JOptionPane.showInputDialog(null, "Enter your name", "Name", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Gui4();
    }

}
