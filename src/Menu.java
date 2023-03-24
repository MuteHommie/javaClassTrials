import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    private JMenuBar myBar = new JMenuBar();
    private JMenu myCounter1, myCounter2, myCounter3;
    private JMenuItem mitNew, mitSave, mitCopy, mitCut, mitPaste, mitHelp, mitAbout;

    public Menu() {
        super("Menu Frame");
        myCounter1 = new JMenu("File");
        myCounter2 = new JMenu("Edit");
        myCounter3 = new JMenu("More");
        mitNew = new JMenuItem("New");
        mitSave = new JMenuItem("Save");
        mitCopy = new JMenuItem("Copy");
        mitCut = new JMenuItem("Cut");
        mitPaste = new JMenuItem("Paste");
        mitHelp = new JMenuItem("Help");
        mitAbout = new JMenuItem("About");

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        setJMenuBar(myBar);
        myBar.add(myCounter1);
        myBar.add(myCounter2);
        myBar.add(myCounter3);
        myCounter1.add(mitNew);
        myCounter1.add(mitSave);
        myCounter2.add(mitCopy);
        myCounter2.add(mitCut);
        myCounter2.add(mitPaste);
        myCounter3.add(mitHelp);
        myCounter3.add(mitAbout);

        mitNew.addActionListener(this);
        mitSave.addActionListener(this);
        mitCopy.addActionListener(this);
        mitCut.addActionListener(this);
        mitPaste.addActionListener(this);
        mitHelp.addActionListener(this);
        mitAbout.addActionListener(this);


    }

    public static void main(String[] args) {
        new Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mitNew) {
            JOptionPane.showMessageDialog(this, "You have clicked on New");
        } else if (e.getSource() == mitSave) {
            JOptionPane.showMessageDialog(this, "You clicked on Save");
        } else if (e.getSource() == mitCopy) {
            JOptionPane.showMessageDialog(this, "Whatchu wanna copy?");
        } else if (e.getSource() == mitCut) {
            JOptionPane.showMessageDialog(this, "Whatchu wanna cut?");
        } else if (e.getSource() == mitPaste) {
            JOptionPane.showMessageDialog(this, "The paste action is successful");
        } else if (e.getSource() == mitHelp) {
            JOptionPane.showMessageDialog(this, "Go to https://gofuckyourself.com");
        } else {
            JOptionPane.showMessageDialog(this, "We are anonymous, \n We do not forgive \n we do not forget!");
        }
    }
}
