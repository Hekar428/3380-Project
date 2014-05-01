
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;


public class Friends extends JFrame implements ActionListener {
    
    String SNumberOfFriends;
    JButton Main;
    JPanel pane = new JPanel();
    File file = new File("LoggedInUser.txt");
    int NumberOfFriends;
    String NextFriend;
    
    Friends(){
        super("Friends");
        Main = new JButton("Main Page");
        Main.addActionListener(this);
        try{
            Scanner keyb = new Scanner(file);
            while (SNumberOfFriends!=";"){
                SNumberOfFriends = keyb.next();
            }
            while (SNumberOfFriends!=";"){
                SNumberOfFriends = keyb.next();
            }
            NumberOfFriends = Integer.parseInt(keyb.next());

        JTextArea textArea = new JTextArea(NumberOfFriends, 16);
        JScrollPane scrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
        for(int i=1; i<=NumberOfFriends; i++){
            while(keyb.next()!= ","){
                    NextFriend = NextFriend+keyb.next();
                }
        
            textArea.append(NextFriend + "//n");
        }
        } catch(FileNotFoundException s){}
        
        pane.add(Main);
        this.add(pane);

        Main.setBounds(400, 100, 150, 50);
        setSize(400,800);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
}
    @Override
        public void actionPerformed(ActionEvent event){
            if (event.getSource() == Main){
                MainPage regFace = new MainPage();
                regFace.setVisible(true);
                dispose();
            }
        }
}