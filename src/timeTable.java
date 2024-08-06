import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class timeTable extends JFrame implements ActionListener {

    JButton see, clear;
    JTextField jTextField;
    JTextArea answer;

    timeTable(){

        Cursor cursor=new Cursor(Cursor.HAND_CURSOR);

        JLabel first=new JLabel("Enter any number");
        first.setBounds(20,230,170,25);        first.setFont(new Font("Serif",Font.BOLD,18));
        add(first);

        jTextField=new JTextField();
        jTextField.setBounds(200,230,100,25);
        jTextField.setBackground(Color.cyan);
        jTextField.setFont(new Font("Serif",Font.BOLD,18));
        jTextField.setToolTipText("Enter number which number's times table you want to see.");
        add(jTextField);


        see=new JButton("See");
        see.setBounds(40,285,80,25);
        see.setFont(new Font("Serif",Font.ITALIC,18));
        see.setCursor(cursor);
        see.addActionListener(this);
        see.setToolTipText("Click here to see the times table.");
        add(see);

        clear=new JButton("Clear");
        clear.setBounds(220,285,80,25);
        clear.setFont(new Font("Serif",Font.ITALIC,18));
        clear.setCursor(cursor);
        clear.addActionListener(this);
        clear.setToolTipText("Click here to clear.");
        add(clear);

        answer=new JTextArea();
        answer.setBounds(20,350,300,280);
        answer.setFont(new Font("Serif",Font.BOLD,20));
        answer.setBackground(Color.GRAY);
        answer.setForeground(Color.yellow);
        add(answer);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/times.jpeg"));
        Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel backgroundImage=new JLabel(i3);
        backgroundImage.setBounds(20,10,300,200);
        add(backgroundImage);

        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/pic2.jpeg"));
        Image i21=i11.getImage().getScaledInstance(360,700,Image.SCALE_SMOOTH);
        ImageIcon i31=new ImageIcon(i21);
        JLabel img=new JLabel(i31);
        img.setBounds(0,0,360,700);
        add(img);

        ImageIcon icon=new ImageIcon(getClass().getResource("icon/hstu.png"));
        setIconImage(icon.getImage());
        setTitle("Times Table");
        setSize(360,700);
        setLocation(450,20);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == see) {
            int number = Integer.parseInt(jTextField.getText());
            for (int i = 1; i <= 10; i++) {
                int result = i * number;

                String r = String.valueOf(result);
                String i1 = String.valueOf(i);
                String num = String.valueOf(number);

                answer.append(i + " X " + num + " = " + r + "\n");
            }
        }

        else {
            answer.setText("");
            jTextField.setText("");
        }
    }

    public static void main(String[] args) {
        new timeTable();
    }
}
