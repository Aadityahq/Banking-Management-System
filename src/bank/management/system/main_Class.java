package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    main_Class(String pin){
        this.pin = pin;

        // Fix Mac UI issue
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setLayout(null); // IMPORTANT
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial",Font.BOLD,28));
        l3.add(label);

        // Common button style
        Color btnColor = new Color(0, 102, 204);

        b1 = createButton("DEPOSIT", 410,274, btnColor);
        b2 = createButton("CASH WITHDRAWAL", 700,274, btnColor);
        b3 = createButton("FAST CASH", 410,318, btnColor);
        b4 = createButton("MINI STATEMENT", 700,318, btnColor);
        b5 = createButton("PIN CHANGE", 410,362, btnColor);
        b6 = createButton("BALANCE ENQUIRY", 700,362, btnColor);
        b7 = createButton("EXIT", 700,406, Color.RED);

        l3.add(b1); l3.add(b2); l3.add(b3);
        l3.add(b4); l3.add(b5); l3.add(b6); l3.add(b7);

        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }

    // 🔥 Reusable button method (clean + consistent UI)
    private JButton createButton(String text, int x, int y, Color bgColor){
        JButton btn = new JButton(text);
        btn.setBounds(x,y,180,40);
        btn.setBackground(bgColor);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 14));

        // IMPORTANT FIXES FOR MAC
        btn.setOpaque(true);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);

        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquriy(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}