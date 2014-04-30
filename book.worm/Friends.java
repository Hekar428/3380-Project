package book.worm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Friends extends JFrame implements ActionListener {
    
    JButton Main;
    JPanel pane = new JPanel();
    
    Friends(){
        super("Frieds");
        Main = new JButton("Main Page");
        Main.addActionListener(this);

        pane.add(Main);
        this.add(pane);

        Main.setBounds(400, 100, 150, 50);
        
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