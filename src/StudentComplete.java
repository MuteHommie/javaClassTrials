import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class StudentComplete extends JFrame implements ActionListener {
    private JFrame mainFrame = new JFrame(" Dashboard");
    private JMenuBar mainBar = new JMenuBar();
    private JMenu mnuFile, mnuEdit, mnuView, mnuHelp;
    private JMenuItem mitNew, mitOpen, mitSave, mitExit, mitSettings, mitCopy, mitCut, mitPaste, mitSize, mitPrint, mitContactUs, mitAbout, mitLink;
    private JLabel userName, passWord, pageTitle, fullName, regNO, gender, level, state;
    private JTextField txtName = new JTextField(15);
    private JTextField txtFullNames, txtFullRegNo;
    private JRadioButton rbtfemale, rbtmale, rbty1, rbty2, rbty3, rbty4;
    private JCheckBox chbfeePaid, chbregUnits,  chbexamDone;
    private JPasswordField txtPassword = new JPasswordField(15);

    private JButton btnLogin, btnReset, btnCancel, printCard, viewResults, logOut;
    private ButtonGroup bgpGender, bgpLevel;

    public StudentComplete() {
        super("Login Screen");
        mnuFile = new JMenu("File");
        mnuEdit = new JMenu("Edit");
        mnuView = new JMenu("View");
        mnuHelp = new JMenu("Help");

        mitNew = new JMenuItem("New"); mitOpen = new JMenuItem("Open"); mitSave = new JMenuItem("Save"); mitExit = new JMenuItem("Exit");
        mitSettings = new JMenuItem("Settings"); mitCopy = new JMenuItem("Copy"); mitCut = new JMenuItem("Cut"); mitPaste = new JMenuItem("Paste");
        mitSize = new JMenuItem("Size"); mitPrint = new JMenuItem("Print"); mitContactUs = new JMenuItem("Contact us"); mitAbout = new JMenuItem("About");
        mitLink = new JMenuItem("Our socials");
        pageTitle = new JLabel("Student Portfolio");
        userName = new JLabel("Username");
        passWord = new JLabel("Password");
        fullName = new JLabel("Full name");
        regNO = new JLabel("Reg NO.");
        gender = new JLabel("Gender");
        level = new JLabel("Level");
        state = new JLabel("State");


        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");
        btnCancel = new JButton("Cancel");
        printCard = new JButton("Print Card");
        viewResults = new JButton("View Results");
        logOut = new JButton("Log Out");
        txtFullNames = new JTextField(15);
        txtFullRegNo = new JTextField(20);
        rbtfemale = new JRadioButton("Female");
        rbtmale = new JRadioButton("Male");
        rbty1 = new JRadioButton("Y1");
        rbty2 = new JRadioButton("Y2");
        rbty3 = new JRadioButton("Y3");
        rbty4 = new JRadioButton("Y4");
        chbexamDone = new JCheckBox("Exam Done");
        chbfeePaid = new JCheckBox("Feepaid");
        chbregUnits = new JCheckBox("Registed Units");
        bgpGender = new ButtonGroup();
        bgpLevel = new ButtonGroup();

        bgpGender.add(rbtfemale);
        bgpGender.add(rbtmale);

        bgpLevel.add(rbty1);
        bgpLevel.add(rbty2);
        bgpLevel.add(rbty3);
        bgpLevel.add(rbty4);

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

        mainFrame.setSize(550, 500);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(false);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setJMenuBar(mainBar);
        mainBar.add(mnuFile);
        mainBar.add(mnuEdit);
        mainBar.add(mnuView);
        mainBar.add(mnuHelp);
        mnuFile.add(mitNew);
        mnuFile.add(mitOpen);
        mnuFile.add(mitSave);
        mnuFile.add(mitSettings);
        mnuFile.add(mitExit);
        mnuEdit.add(mitCopy);
        mnuEdit.add(mitCut);
        mnuEdit.add(mitPaste);
        mnuView.add(mitSize);
        mnuView.add(mitPrint);
        mnuHelp.add(mitAbout);
        mnuHelp.add(mitContactUs);
        mnuHelp.add(mitLink);

        pageTitle.setBounds(40, 15, 300, 40);
        mainFrame.add(pageTitle);
        fullName.setBounds(50, 70, 200, 40);
        mainFrame.add(fullName);
        txtFullNames.setBounds(150, 70, 300,  40 );
        mainFrame.add(txtFullNames);
        regNO.setBounds(50, 120, 200, 40);
        mainFrame.add(regNO);
        txtFullRegNo.setBounds(150, 120, 300, 40);
        mainFrame.add(txtFullRegNo);
        gender.setBounds(60, 170, 50, 40);
        mainFrame.add(gender);
        rbtfemale.setBounds(150, 170, 100, 40);
        mainFrame.add(rbtfemale);
        rbtmale.setBounds(250, 170, 100, 40);
        mainFrame.add(rbtmale);
        level.setBounds(60, 200, 60, 40);
        mainFrame.add(level);
        rbty1.setBounds(150, 200, 40, 40);
        mainFrame.add(rbty1);
        rbty2.setBounds(200, 200, 40, 40);
        mainFrame.add(rbty2);
        rbty3.setBounds(250, 200, 40, 40);
        mainFrame.add(rbty3);
        rbty4.setBounds(300, 200, 40, 40);
        mainFrame.add(rbty4);
        state.setBounds(60,  230, 90, 40);
        mainFrame.add(state);
        chbfeePaid.setBounds(150, 230, 100, 40);
        mainFrame.add(chbfeePaid);
        chbregUnits.setBounds(250, 230, 120, 40);
        mainFrame.add(chbregUnits);
        chbexamDone.setBounds(380, 230, 120, 40);
        mainFrame.add(chbexamDone);
        printCard.setBounds(60, 300, 100, 40);
        mainFrame.add(printCard);
        viewResults.setBounds(190, 300, 120, 40);
        mainFrame.add(viewResults);
        logOut.setBounds(330, 300, 100, 40);
        mainFrame.add(logOut);

        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);
        btnCancel.addActionListener(this);
        logOut.addActionListener(this);
        viewResults.addActionListener(this);
        printCard.addActionListener(this);
        mitLink.addActionListener(this);
        mitExit.addActionListener(this);
        mitNew.addActionListener(this);

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
                    mainFrame.setVisible(true);
                    txtName.setText("");
                    txtPassword.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
            }
        } else if (e.getSource()==btnReset) {
            txtName.setText("");
            txtPassword.setText("");
        }else if (e.getSource() == btnCancel ){
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit");
            if(x == 0){
                JOptionPane.showMessageDialog(this, "Goodbye!");
                System.exit(0);
            }
        } else if (e.getSource()== logOut) {
            int y = JOptionPane.showConfirmDialog(mainFrame, "Are you sure you want to log out?");
            if (y == JOptionPane.YES_OPTION){
                mainFrame.setVisible(false);
                super.setVisible(true);
            }
        }else  if (e.getSource() == viewResults){
                JOptionPane.showMessageDialog(mainFrame, "You passed your exam");
        } else if (e.getSource() == printCard){
            String iGender= "";
            String iLevel = "";

            if (rbtmale.isSelected()){
                iGender= "Male";
            } else if (rbtfemale.isSelected()) {
                iGender="Female";
            }
            if (rbty1.isSelected()) {
                iLevel = "Y1";
            } else if (rbty2.isSelected()) {
                iLevel = "Y2";
            } else if (rbty3.isSelected()) {
                iLevel = "Y3";
            } else if (rbty4.isSelected()) {
                iLevel = "Y4";
            }
            JOptionPane.showMessageDialog(mainFrame, "Your details are as follows:\n Name: "+ txtFullNames.getText()+ "\n Registration Number: " + txtFullRegNo.getText() + "\n Gender: " + iGender + " \n Level: " + iLevel + "\n Status: ");
            txtFullNames.setText("");
            txtFullRegNo.setText("");
            bgpGender.clearSelection();
            bgpLevel.clearSelection();
            chbfeePaid.setSelected(false);
            chbexamDone.setSelected(false);
            chbregUnits.setSelected(false);
        }else if (e.getSource()== mitExit){
            int z = JOptionPane.showConfirmDialog(mainFrame, "You sure you want to quit?");
            if(z== JOptionPane.YES_OPTION){
                System.exit(0);
            }
        } else if (e.getSource()== mitNew) {
            txtFullNames.setText("");
            txtFullRegNo.setText("");
            bgpGender.clearSelection();
            bgpLevel.clearSelection();
            chbfeePaid.setSelected(false);
            chbexamDone.setSelected(false);
            chbregUnits.setSelected(false);
        } else if (e.getSource() == mitLink) {
            try {
                URL googleLink = new URL("https://google.com");
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getSource() == mitPrint) {
            String iGender= "";
            String iLevel = "";

            if (rbtmale.isSelected()){
                iGender= "Male";
            } else if (rbtfemale.isSelected()) {
                iGender="Female";
            }
            if (rbty1.isSelected()) {
                iLevel = "Y1";
            } else if (rbty2.isSelected()) {
                iLevel = "Y2";
            } else if (rbty3.isSelected()) {
                iLevel = "Y3";
            } else if (rbty4.isSelected()) {
                iLevel = "Y4";
            }
            JOptionPane.showMessageDialog(mainFrame, "Your details are as follows:\n Name: "+ txtFullNames.getText()+ "\n Registration Number: " + txtFullRegNo.getText() + "\n Gender: " + iGender + " \n Level: " + iLevel + "\n Status: ");
        }

    }
}
