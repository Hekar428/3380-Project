
import javax.swing.JFrame;

public class BookWorm {

    public static void main(String[] args) {
        GUI first = new GUI();
        first.setTitle("BookWorm");
        first.setSize(300, 200);
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first.setVisible(true);
    }
}
