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

        JTextArea textArea = new JTextArea(User.NumberOfFriends, 16);
        JScrollPane scrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
        for(int i=1; i<=User.NumberOfFriends; i++){
            textArea.append(NEXTFRIEND + "//n");
        }
        
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