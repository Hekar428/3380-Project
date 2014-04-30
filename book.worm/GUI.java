
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
    JPanel mypanel;
    JButton loginButton;
    JButton createAcctButton;
    JLabel mylabel;
    
    JTextField txuser   = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);
    
    public GUI() {
        mypanel   = new JPanel();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        createAcctButton = new JButton("Create Account");
        createAcctButton.addActionListener(this);
        mylabel   = new JLabel();
        
        mypanel.add(loginButton);
        mypanel.add(createAcctButton);
        mypanel.add(mylabel);
        this.add(mypanel);
        
        txuser.setBounds      (70,30,150,20);
        pass.setBounds        (70,65,150,20);
        loginButton.setBounds (110,100,80,20);

        mypanel.add(loginButton);
        mypanel.add(txuser);
        mypanel.add(pass);
        
        actionlogin();
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == createAcctButton) {
            CreateAccount first = new CreateAccount();
        }
    }
    
    /*this is what reads the username and password. We could probably just create a 
     * text file with all the usernames and passwords created and read from it
     * to find a match
     */
    public void actionlogin() {
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String puname = txuser.getText();
                String ppaswd = pass.getText();
        
                //where we need to implement the text file
                if(puname.equals("test") && ppaswd.equals("12345")) {
                    newframe regFace =new newframe();
                    regFace.setVisible(true);
                    dispose();
                } 
                else {
                    JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                    txuser.setText("");
                    pass.setText("");
                    txuser.requestFocus();
                }
            }   
        });
    }
}
    
