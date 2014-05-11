import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

//this is gonna be the actual gui that will display the app after login
public class MainPage extends JFrame implements ActionListener {
    int time = 1;
    Boolean tester = true;
    String SNumberOfBooks;
    int NumberOfBooks;
    String BookName = "";
    JPanel panel = new JPanel();
    JButton Name;
    JButton Friend;
    File file = new File("LoggedInUser.txt");
    
    JLabel welcome = new JLabel("Welcome");

    int yheight=1;
    int xheight=1;
    MainPage(){
        super("BookWorm");
        try{
            Scanner keyb = new Scanner(file);
            System.out.println(keyb.next());
            System.out.println(keyb.next());
            System.out.println(keyb.next());
            
                NumberOfBooks = Integer.parseInt(keyb.next());
                System.out.println(NumberOfBooks);
                String[] bookNames = new String[NumberOfBooks];
            String n = "";
            System.out.println("n = "+n);
            n = keyb.next();
                n=keyb.next();
            for(int i = 0; i <= NumberOfBooks-1; i++) {
                
                if(i!=0)
                    n=keyb.next();

                System.out.println("n = "+n);

                System.out.println(i+" n = "+n);
                    while (!n.equals(",") && !n.equals(";")) {

                        System.out.println(time);
                        tester = true;
                        if (bookNames[i] == null) {
                            bookNames[i] = n;
                            System.out.println(bookNames[i]+" 1st if");
                            n=keyb.next();

                            tester = false;
                            
                        }
                        if (tester==true) {
                            bookNames[i] = bookNames[i] + " " + n;
                            System.out.println(bookNames[i]+" 2nd if");
                            tester = false;
                            n=keyb.next();

                        }
                        
                        time++;
                                        }
                    Name = new JButton(bookNames[i]);
                    Name.addActionListener(this);
                    
                BookName = "";


                if(i%4 == 3) {
                    xheight = 7;
                } 
                if(i%4 == 0 ) {
                    yheight++;
                    xheight=1;
                }
                if(i%4 == 1) {
                    xheight = 3;
                }
                if(i%4 == 2) {
                    xheight = 5;
                }

                Name.setBounds(110*xheight, 100*yheight, 150, 50);
                panel.add(Name);

            }
        } catch(FileNotFoundException s) {}    
        
        Friend = new JButton("Friends");
        Friend.addActionListener(this);
        panel.add(Friend);    
        //panel.add(Name);
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
            dispose();
        }
        
    }
    

}