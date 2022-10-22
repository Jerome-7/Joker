package src.窗口.组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 文本框组件 extends JFrame {
    public 文本框组件() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextField jt = new JTextField();
        jt.setColumns(20);// 设置文本框长度为20字符
        jt.setText("aa");// 设置初始文本
        jt.setFont(new Font("宋体", Font.PLAIN, 20));// 设置字体格式
        c.add(jt);

        JButton btn = new JButton("确认");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("文本框中的内容为：" + jt.getText());// 获取文本框中的文本值
                jt.setText("");// 清空文本框中的内容
                jt.requestFocus();// 获取焦点，获取光标
            }
        });
        c.add(btn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 文本框组件();
    }
}

