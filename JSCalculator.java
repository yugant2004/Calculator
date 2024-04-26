import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//THIS IS MY VERY FIRST JAVA SWING PROJECT "A basic calculator"

public class JSCalculator implements ActionListener{

    JFrame jf;
    JTextField tf;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bMul, bDiv, bClear, bEqual;

    double n1 = 0, n2 = 0, result = 0;
    char op;

    public JSCalculator() {

        jf = new JFrame("Basic Calculator");
        jf.setSize(250, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);

        tf = new JTextField();
        tf.setPreferredSize(new Dimension(250, 50));
        tf.setEditable(false);
        tf.setHorizontalAlignment(JTextField.RIGHT);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bClear = new JButton("C");
        bEqual = new JButton("=");

        JPanel panel = new JPanel(new GridLayout(4, 4));
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bDiv);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bMul);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bSub);
        panel.add(b0);
        panel.add(bClear);
        panel.add(bEqual);
        panel.add(bAdd);

        jf.setLayout(new BorderLayout());
        jf.add(tf, BorderLayout.NORTH);
        jf.add(panel, BorderLayout.CENTER);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bClear.addActionListener(this);
        bEqual.addActionListener(this);

        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b0) {
            tf.setText(tf.getText() + "0");
        } 
        if (e.getSource() == b1) {
            tf.setText(tf.getText() + "1");
        }  
        if (e.getSource() == b2) {
            tf.setText(tf.getText() + "2");
        }  
        if (e.getSource() == b3) {
            tf.setText(tf.getText() + "3");
        }  
        if (e.getSource() == b4) {
            tf.setText(tf.getText() + "4");
        }  
        if (e.getSource() == b5) {
            tf.setText(tf.getText() + "5");
        }  
        if (e.getSource() == b6) {
            tf.setText(tf.getText() + "6");
        }  
        if (e.getSource() == b7) {
            tf.setText(tf.getText() + "7");
        }  
        if (e.getSource() == b8) {
            tf.setText(tf.getText() + "8");
        }  
        if (e.getSource() == b9) {
        tf.setText(tf.getText() + "9");
        }  

        if (e.getSource() == bAdd) {
            n1 = Double.parseDouble(tf.getText());
            op = '+';
            tf.setText("");
        } 
        if (e.getSource() == bSub) {
            n1 = Double.parseDouble(tf.getText());
            op = '-';
            tf.setText("");
        } 
        if (e.getSource() == bMul) {
            n1 = Double.parseDouble(tf.getText());
            op = '*';
            tf.setText("");
        } 
        if (e.getSource() == bDiv) {
            n1 = Double.parseDouble(tf.getText());
            op = '/';
            tf.setText("");
        } 
        if (e.getSource() == bClear) {
            tf.setText("");
        } 
        if (e.getSource() == bEqual) {
            n2 = Double.parseDouble(tf.getText());
            switch (op) {
                case '+':
                result = n1 + n2;
                break;
                case '-':
                result = n1 - n2;
                break;
                case '*':
                result = n1 * n2;
                break;
                case '/':
                result = n1 / n2;
                break;
            }
            tf.setText(String.valueOf(result));
        }
    }
    public static void main(String[] args){
        new JSCalculator();
    }
}        
