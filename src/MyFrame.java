import javax.swing.*;

public class MyFrame extends JFrame {
    JButton button;


    MyFrame(){

        button = new JButton();
        button.setBounds(200,100,150,50);
        button.addActionListener(e -> System.out.println("Hey bro, you are a genious"));
        button.setText("I'm a button!");




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
    }

}
