package src.窗口.组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 密码框组件 extends JFrame {
    public 密码框组件() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        JTextField jt = new JTextField(20);
        jt.setFont(new Font("宋体",Font.PLAIN,20));
        c1.gridx=1;
        c1.gridy=1;
        c1.gridheight=4;
        c1.gridwidth=4;
        c.add(jt,c1);

        GridBagConstraints c2 = new GridBagConstraints();
        JPasswordField jp = new JPasswordField(20);// 20为文本长度
        jp.setText("aa");// 设置初始文本
        jp.setFont(new Font("宋体", Font.PLAIN, 20));// 设置字体格式
        jp.setEchoChar('*');// 设置*字符
        c2.gridy=2;
        c2.gridx=2;
        c2.gridheight=4;
        c2.gridwidth=4;
        c.add(jp,c2);

        JButton btn = new JButton("确认");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("文本框中的内容为：" + jp.getUIClassID());// 获取文本框中的文本值
                jp.setText("");// 清空文本框中的内容
                jp.requestFocus();// 获取焦点，获取光标
            }
        });
        c.add(btn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 密码框组件();
    }
}




