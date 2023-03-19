import javax.swing.*;
import java.awt.*;

public class GUI6 extends JFrame {
        private JLabel lblUser, lblpass;
        private JTextField txtUser = new JTextField(20);
        private JPasswordField pwdPass = new JPasswordField(20);

        private JButton btnlLog, btnExit;

        public GUI6(){
            super("Login frame");
            lblUser = new JLabel("Username");
            lblpass = new JLabel("Password");

            btnlLog = new JButton("Login");
            btnExit = new JButton("Exit");

            setVisible(true);
            setSize(400, 300);
            setLayout(new GridLayout(3,2));
            setDefaultCloseOperation(EXIT_ON_CLOSE);
//            lblUser.setBounds(50, 35, 100, 50);
            add(lblUser);
//            txtUser.setBounds(120, 50, 150, 30);
            add(txtUser);
//            lblpass.setBounds(50, 75, 100, 50);
            add(lblpass);
//            pwdPass.setBounds(120, 90, 150, 30);
            add(pwdPass);
//            btnlLog.setBounds(70, 140, 100, 30);
            add(btnlLog);
//            btnExit.setBounds(200, 140, 100, 30);
            add(btnExit);

        }
        public static void main(String[] args) {
            new GUI6();

        }
    }


