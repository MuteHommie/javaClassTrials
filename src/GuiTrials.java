import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class GuiTrials {
    public static void main(String[] args) {
        int yob , currentYear;
        String trial = JOptionPane.showInputDialog(null, "Enter your name", "Name.", INFORMATION_MESSAGE);
        System.out.println(trial);
          yob = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Year of birth.", "Year of birth", INFORMATION_MESSAGE));
        currentYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the current year", "Current year", INFORMATION_MESSAGE));
        showMessageDialog(null, "Check age in console");
//        showMessageDialog(null, );
        int age = currentYear- yob;
        System.out.println(age);
        int x = JOptionPane.showConfirmDialog(null, "Do you want to exit");
        if (x == 0){
            System.out.println("Exiting");
        } else if (x==1) {
            System.out.println("Not exiting");

        }else {
            System.out.println("Whatever mate");
        }
        }
    }

