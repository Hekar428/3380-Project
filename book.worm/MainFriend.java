package book.worm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class MainFriend extends JFrame implements ActionListener{
    
    String SNumberOfBooks;
    int NumberOfBooks;
    String BookName;
    JPanel panel = new JPanel();
    JButton Name;
    JButton Main;
    File file = new File("LoggedInUser.txt");
    
    JLabel welcome = new JLabel("Welcome");

    int yheight=1;
    int xheight=1;
    
    MainFriend(){
        super("BookWorm");
        try{
            Scanner keyb = new Scanner(file);
            while (SNumberOfBooks!=";"){
                SNumberOfBooks = keyb.next();
            }
            
                NumberOfBooks = Integer.parseInt(keyb.next());
            
            for(int i = 1; i <= NumberOfBooks; i++) {
                BookName = "";
                while(keyb.next()!= ","){
                    BookName = BookName+keyb.next();
                }
                Name = new JButton(BookName);//Put actual book name here
                Name.addActionListener(this);

                panel.add(Name);




                if(i%4 == 0) {
                    xheight = 7;
                } 
                if(i%4 == 1 && i != 1) {
                    yheight++;
                    xheight=1;
                }
                if(i%4 == 2) {
                    xheight = 3;
                }
                if(i%4 == 3) {
                    xheight = 5;
                }

                Name.setBounds(110*xheight, 100*yheight, 150, 50);

            }
        } catch(FileNotFoundException s) {}    
        
        Main = new JButton("Friends");
        Main.addActionListener(this);
        panel.add(Main);    
        panel.add(Name);
        this.add(panel);
        
        Main.setBounds(650, 25, 150, 50);
        

        setSize(800,600);
        setLocation(500,280);
        panel.setLayout (null); 

        welcome.setBounds(70,50,150,60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == Main){
            MainPage first = new MainPage();
            dispose();
        }
    }
}
