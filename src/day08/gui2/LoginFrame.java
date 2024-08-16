package day08.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame()
    {
        this.setTitle("登录界面");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
    }

    private void init(){

        //添加一个登录按键
        JButton loginButton = new JButton("登录");
        loginButton.addActionListener(this);
        JPanel panel = new JPanel();
        this.add(panel);
        panel.add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("登录成功！");
        JOptionPane.showMessageDialog(this, "登录成功！");

    }
}
