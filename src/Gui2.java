import  javax.swing.*;
import static javax.swing.JOptionPane.*;

//import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Gui2 {
    public Gui2(){
        String name, bYear, cYear;
        int yob, cyr, age;

        name = JOptionPane.showInputDialog("Enter your name");
        bYear = JOptionPane.showInputDialog(null, name+" Enter year of birth", "Year of birth", INFORMATION_MESSAGE);
        yob= Integer.parseInt(bYear);
        cyr = Integer.parseInt(JOptionPane.showInputDialog("Enter the current year: "));

        age = cyr - yob;

        JOptionPane.showMessageDialog(null, name + " You are "+ age + " years old");

        int x = JOptionPane.showConfirmDialog(null, "do you wish to run again?", "Repeat again", ERROR_MESSAGE);
        if(x==0){
            new Gui2();
        }
    }


    public static void main(String[] args) {
        new Gui2();
    }
}
