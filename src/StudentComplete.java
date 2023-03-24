import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentComplete extends JFrame implements ActionListener {
    private JLabel userName, passWord;
    private JTextField txtName = new JTextField(15);
    private JPasswordField txtPassword = new JPasswordField(15);

    private JButton btnLogin, btnReset, btnCancel;

    public StudentComplete() {
        super("Login Screen");
        userName = new JLabel("Username");
        passWord = new JLabel("Password");

        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");
        btnCancel = new JButton("Cancel");

        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        userName.setBounds(40, 30, 100, 30);
        add(userName);
        txtName.setBounds(120, 30, 150, 30);
        add(txtName);
        passWord.setBounds(40, 70, 100, 30);
        add(passWord);
        txtPassword.setBounds(120, 70, 150, 30);
        add(txtPassword);

        btnLogin.setBounds(30, 120, 90, 30);
        add(btnLogin);
        btnReset.setBounds(130, 120, 90, 30);
        add(btnReset);
        btnCancel.setBounds(230, 120, 90, 30);
        add(btnCancel);

        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);
        btnCancel.addActionListener(this);

    }

    public static void main(String[] args) {
        new StudentComplete();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtName.getText();
            String password = String.valueOf(txtPassword.getPassword());

            try (FileInputStream fileIn = new FileInputStream("C:\\Users\\mutho\\Documents\\School stuff\\YEAR 2\\S2\\javaTrial\\src\\users.txt");
                 BufferedReader br = new BufferedReader(new InputStreamReader(fileIn))) {

                String line;
                boolean matchFound = false;

                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String storedUsername = parts[0];
                        String storedPassword = parts[1];
                        if (storedUsername.equals(username) && storedPassword.equals(password)) {
                            matchFound = true;
                            break;
                        }
                    }
                }

                if (matchFound) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
            }
        } else if (e.getSource()==btnReset) {
            txtName.setText("");
            txtPassword.setText("");
        }else {
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit");
            if(x == 0){
                JOptionPane.showMessageDialog(this, "Goodbye!");
                System.exit(0);
            }
        }

    }
}
