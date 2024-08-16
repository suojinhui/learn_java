package day08.gui2;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        // 目标：自定义一个登录界面，让界面本身也是事件监听对象
        JFrame win = new LoginFrame();
        win.setVisible(true);
    }
}
