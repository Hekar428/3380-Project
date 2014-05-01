package book.worm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//this is gonna be the actual gui that will display the app after login
public class MainPage extends JFrame implements ActionListener {

    

    JLabel welcome = new JLabel("Welcome Username");
    JPanel panel = new JPanel();
    JButton Name;
<<<<<<< HEAD
<<<<<<< HEAD
    int yheight=1;
    int xheight=1;
    MainPage(){
=======
    MainPage() {
>>>>>>> 053616a68303ba18efc48dd5d3f519aaec9adc4c
=======
    JButton Friend;
    
    int yheight=1;
    int xheight=1;
    MainPage(){
>>>>>>> 1666d71f5c79997c7aa01af17b342beb5fd5a07d
        super("BookWorm");
        for(int i = 1; i <= 50; i++) {
            Name = new JButton("Book");//Put actual book name here
            Name.addActionListener(this);
            
            panel.add(Name);
<<<<<<< HEAD
            this.add(panel);
<<<<<<< HEAD
            if(i!=1){
                if(i%4==0){
                    xheight=7;
                } 
                if(i%4==1){
                    xheight=1;
                    yheight++;
                }
                if(i%4==2){
                    xheight=3;
                }
                if(i%4==3){
                    xheight=5;
                }
=======
            int yheight = 1;
            int xheight = 1;
=======
            

            

>>>>>>> 1666d71f5c79997c7aa01af17b342beb5fd5a07d
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
<<<<<<< HEAD
                xheight = 7;
>>>>>>> 053616a68303ba18efc48dd5d3f519aaec9adc4c
=======
                xheight = 5;
>>>>>>> 1666d71f5c79997c7aa01af17b342beb5fd5a07d
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
        panel.setLayout(null); 

        welcome.setBounds(70,50,150,60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    
    @Override
<<<<<<< HEAD
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == Name) {
            
=======
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == Friend){
            Friends first = new Friends();
            dispose();
>>>>>>> 1666d71f5c79997c7aa01af17b342beb5fd5a07d
        }
        
    }
    

}