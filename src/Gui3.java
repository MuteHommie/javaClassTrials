import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Gui3 {
    public  Gui3() {

        JFrame frame = new JFrame("My first frame! lol!");
        frame.setVisible(true);
        frame.setSize(500, 300 );
//        frame.setTitle("My first Frame");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        String trial = JOptionPane.showInputDialog(frame, "Who be dis", "Name", INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Gui3();
    }
}
