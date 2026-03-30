package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    Login() {
        super("Bank Management System");

        // ✅ Fix macOS UI issue
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ✅ Background FIRST (important)
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel background = new JLabel(iii3);
        background.setBounds(0,0,850,480);
        background.setLayout(null);
        add(background);

        // ✅ Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80,80,Image.SCALE_SMOOTH);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(360,20,80,80);
        background.add(image);

        // ✅ Title
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 32));
        label1.setBounds(230,110,450,40);
        background.add(label1);

        // ✅ Card No
        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Arial", Font.BOLD, 20));
        label2.setForeground(Color.WHITE);
        label2.setBounds(180,180,150,30);
        background.add(label2);

        textField2 = new JTextField();
        textField2.setBounds(320,180,220,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        background.add(textField2);

        // ✅ PIN
        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(Color.WHITE);
        label3.setBounds(180,230,150,30);
        background.add(label3);

        passwordField3 = new JPasswordField();
        passwordField3.setBounds(320,230,220,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        background.add(passwordField3);

        // ✅ Buttons (modern style)
        button1 = createButton("SIGN IN", 220,300, new Color(0,102,204));
        button2 = createButton("CLEAR", 380,300, new Color(120,120,120));
        button3 = createButton("SIGN UP", 220,350, new Color(0,153,76));

        background.add(button1);
        background.add(button2);
        background.add(button3);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setUndecorated(true);
        setVisible(true);
    }

    // 🔥 Reusable button method
    private JButton createButton(String text, int x, int y, Color color) {
        JButton btn = new JButton(text);
        btn.setBounds(x,y,150,35);
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 14));

        // ✅ FIX for macOS
        btn.setOpaque(true);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);

        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                Connn c = new Connn();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();

                String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");

            } else if (e.getSource() == button3) {
                new Signup();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}