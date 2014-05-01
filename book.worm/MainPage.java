package book.worm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//this is gonna be the actual gui that will display the app after login
public class MainPage extends JFrame implements ActionListener {

    

    JLabel welcome = new JLabel("Welcome Username");
    JPanel panel = new JPanel();
    JButton Name;
    JButton Friend;
    
    int yheight=1;
    int xheight=1;
    MainPage(){
        super("BookWorm");
        for(int i = 1; i <= 50; i++) {
            Name = new JButton("Book");//Put actual book name here
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
        
        Friend = new JButton("Friends");
        Friend.addActionListener(this);
        panel.add(Friend);    
        panel.add(Name);
        this.add(panel);
        
        Friend.setBounds(650, 25, 150, 50);
        

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
        if (event.getSource() == Friend){
            Friends first = new Friends();
        }
        
    }
    

}