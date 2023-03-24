import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI5 extends JFrame implements ActionListener {
    private JFrame welcome = new JFrame();
    private JLabel lblUser, lblpass;
    private JTextField txtUser = new JTextField(20);
    private JPasswordField pwdPass = new JPasswordField(20);

    private JButton btnlLog, btnExit, btnReset;
    private  JRadioButton rbtMale, rbtFemale, rbtChild, rbtTeen, rbtYouth, rbtAdult;
    private JLabel lblGender, lblAge;
    private ButtonGroup bgpGender, bgpAge;


    public GUI5() {
        super("Login frame");
        lblUser = new JLabel("Username");
        lblpass = new JLabel("Password");
        rbtMale = new JRadioButton("Male");
        rbtFemale = new JRadioButton("Female");
        rbtChild = new JRadioButton("Child");
        rbtTeen = new JRadioButton("Teen");
        rbtYouth = new JRadioButton("Youth");
        rbtAdult = new JRadioButton("Adult");
        lblGender = new JLabel("Gender");
        lblAge = new JLabel("Age Group");
        bgpGender = new ButtonGroup();
        bgpAge = new ButtonGroup();

        bgpGender.add(rbtMale);
        bgpGender.add(rbtFemale);

        bgpAge.add(rbtChild);
        bgpAge.add(rbtTeen);
        bgpAge.add(rbtYouth);
        bgpAge.add(rbtAdult);


        btnlLog = new JButton("Login");
        btnReset = new JButton("Reset");
        btnExit = new JButton("Exit");
        welcome.setVisible(false);
        welcome.setSize(400, 300);
        welcome.setLayout(null);
        welcome.setLocationRelativeTo(null);
        welcome.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lblUser.setBounds(50, 35, 100, 50);
        add(lblUser);
        txtUser.setBounds(120, 50, 150, 30);
        add(txtUser);
        lblpass.setBounds(50, 75, 100, 50);
        add(lblpass);
        pwdPass.setBounds(120, 90, 150, 30);
        add(pwdPass);
        lblGender.setBounds(50, 120, 90, 40);
        add(lblGender);
        rbtMale.setBounds(100, 120, 70, 50);
        add(rbtMale);
        rbtFemale.setBounds(170, 120, 70, 50);
        add(rbtFemale);
        lblAge.setBounds(50, 170, 100, 30);
        add(lblAge);
        rbtChild.setBounds(150, 170, 70, 30);
        add(rbtChild);
        rbtTeen.setBounds(150, 190, 70, 30);
        add(rbtTeen);
        rbtYouth.setBounds(150, 210, 70, 30);
        add(rbtYouth);
        rbtAdult.setBounds(150, 230, 70, 30);
        add(rbtAdult);
        btnlLog.setBounds(120, 270, 80, 40);
        add(btnlLog);
        btnReset.setBounds(210, 270, 80, 40);
        add(btnReset);
        btnExit.setBounds(300, 270, 80, 40);
        add(btnExit);
        btnExit.addActionListener(this);
        btnReset.addActionListener(this);
        btnlLog.addActionListener(this);
    }

    public static void main(String[] args) {
        new GUI5();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExit) {
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?");
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else if (e.getSource() == btnReset) {
            txtUser.setText("");
            pwdPass.setText("");
            bgpGender.clearSelection();
            bgpAge.clearSelection();
        } else if (e.getSource() == btnlLog) {
            String userName = txtUser.getText();
            String passWord = new String(pwdPass.getPassword());
            String gender = "";
            String age = "";
            if (rbtMale.isSelected()) {
                gender = "Male";
            } else if (rbtFemale.isSelected()) {
                gender = "Female";
            }

            if (rbtChild.isSelected()) {
                age = "Child";
            } else if (rbtTeen.isSelected()) {
                age = "Teen";
            } else if (rbtYouth.isSelected()) {
                age = "Youth";
            } else if (rbtAdult.isSelected()) {
                age = "Adult";
            }

            if (userName.equalsIgnoreCase("Oscar") && passWord.equals("123456")) {
                JOptionPane.showMessageDialog(this, "Login Successful!\nUsername: " + userName
                        + "\nPassword: " + passWord + "\nGender: " + gender + "\nAge Group: " + age);
                setVisible(false);
                welcome.setVisible(true);
                welcome.setTitle("Welcome "+ userName);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username or password");
            }
        }
    }
}