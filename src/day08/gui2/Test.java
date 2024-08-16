package day08.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {

        // 目标：认识事件处理机制
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel(); // 创建一个面板
        jf.add(panel); // 将面板添加到窗口中

        jf.setSize(400, 300); // 设置窗口大小
        jf.setLocationRelativeTo(null); // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭窗口的默认操作: 关闭窗口退出程序

        JButton jb = new JButton("登录"); // 创建一个按钮
        panel.add(jb); // 将按钮添加到面板中

        // 给按钮绑定点击事件监听器
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 一旦点击按钮，就会执行这个方法
                // e是事件对象，可以获取事件相关信息
                System.out.println("登录成功！");
                System.out.println(e.getWhen());
                JOptionPane.showMessageDialog(jf, "登录成功！");
            }
        });
        //jb.addActionListener(new MyActionListener(jf));

        //需求：监听用户键盘上下左右按键的事件
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        System.out.println("向上");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("向下");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("向左");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("向右");
                        break;
                }

            }
        });
        jf.setVisible(true); // 显示窗口
        // 让窗口成为焦点窗口
        jf.requestFocus();
    }
}

class MyActionListener implements ActionListener {
    private final JFrame jf;
    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("登录成功！");
        JOptionPane.showMessageDialog(jf, "登录成功！");
    }
}
