//import
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;

public class Window extends JFrame{
    static int height;
    static int width;
    JFrame win;
    static JLabel welcome;
    static JButton pause;

    /**
     * Constructs Window
     */
    public Window(){
        //Create window with appropriate height and width
        height = 26*23+25;
        width = 12*26+10;
        JFrame win = new JFrame("Tetromized");
        win.setSize(width, height);
        win.setBackground(Color.red);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.win = win;

        //Create Panel
        JPanel panel = new JPanel();

        //Add panel to window
        this.win.add(panel);

        //Window Features
        welcome = new JLabel("Lets get TETROMIZED!");
        pause = new JButton("Pause");

        //Add Features
        panel.add(welcome);
        panel.add(pause);

    }

    public void draw(){
        this.win.setVisible(true);
    }

    //test main 2b deleted
    public static void main(String[] args){
        Window win = new Window();
        win.draw();

    }

    
}
