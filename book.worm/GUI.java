
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class GUI extends JFrame implements ActionListener {
    JPanel mypanel;
    JButton mybutton1;
    JButton mybutton2;
    JLabel mylabel;
    // String username;
    
    JTextField txuser = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);
    File file = new File("UserList.txt");
    
    public GUI(){
        mypanel = new JPanel();
        mybutton1 = new JButton("Login");
        mybutton1.addActionListener(this);
        mybutton2 = new JButton("Create Account");
        mybutton2.addActionListener(this);
        mylabel = new JLabel();
        
        mypanel.add(mybutton1);
        mypanel.add(mybutton2);
        mypanel.add(mylabel);
        this.add(mypanel);
        
        txuser.setBounds(70,30,150,20);
        pass.setBounds(70,65,150,20);
        mybutton1.setBounds(110,100,80,20);

        mypanel.add(mybutton1);
        mypanel.add(txuser);
        mypanel.add(pass);
        
        actionlogin();
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == mybutton1){
            
        }
        if (event.getSource() == mybutton2){
            
        }
    }
    
    /*this is what reads the username and password. We could probably just create a 
     * text file with all the usernames and passwords created and read from it
     * to find a match
     */
    public void actionlogin() {
        try {
            mybutton1.addActionListener(new ActionListener() {
                Scanner keyb = new Scanner(file);
                public void actionPerformed(ActionEvent ae) {
                    String puname = txuser.getText();
                    final String username = puname;
                    String ppaswd = pass.getText();
                    boolean found = false;
            
                    while (keyb.hasNextLine()) {
                        if (puname.equals(keyb.next())) {
                            if (ppaswd.equals(keyb.next())) {
                                MainPage regFace = new MainPage();
                                regFace.setVisible(true);
                                dispose();
                                found = true;
                                break;
                            }
                            else {
                                JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                                txuser.setText("");
                                pass.setText("");
                                txuser.requestFocus();
                            }
                        }
                        else {
                            txuser.setText("");
                            pass.setText("");
                            txuser.requestFocus();
                            if (keyb.hasNextLine())
                                keyb.nextLine();
                            else
                                continue;
                        }
                    }
                    if (!found)
                    {
                        JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                        txuser.setText("");
                        pass.setText("");
                        txuser.requestFocus();
                    }
                } 
            });
        } catch (FileNotFoundException s) {}
        try {
            mybutton2.addActionListener(new ActionListener() {
                Scanner keyc = new Scanner(file);
                public void actionPerformed(ActionEvent ae) {
                    String puname = txuser.getText();
                    String ppaswd = pass.getText();
                    boolean taken = false;

                    while (keyc.hasNextLine()) {
                        System.out.println("hit");
                        if (puname.equals(keyc.next())) {
                            JOptionPane.showMessageDialog(null,"User Name Taken.");
                            txuser.setText("");
                            pass.setText("");
                            txuser.requestFocus();
                            taken = true;
                            break;
                        }
                        else {
                            if (keyc.hasNextLine())
                                keyc.nextLine();
                            else
                                continue;
                        }
                    }
                    if (!taken) {
                        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("UserList.txt", true)))) {
                            out.print(puname+" ");
                            out.println(ppaswd+" 0 0 0");
                            JOptionPane.showMessageDialog(null,"Account Created Successfully");
                            txuser.setText("");
                            pass.setText("");
                        } catch (IOException e) {}
                    }
                    else
                        return;
                }
            });
        } catch (FileNotFoundException s) {}
    }
}
    
    



