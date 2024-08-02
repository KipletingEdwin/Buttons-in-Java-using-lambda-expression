import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button;


    MyFrame(){
        ImageIcon icon = new ImageIcon("thumb.jpeg");


        button = new JButton();
        button.setBounds(180,100,150,50);
        button.addActionListener(e -> System.out.println("Hey bro, you are a genious"));
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
    }

}
