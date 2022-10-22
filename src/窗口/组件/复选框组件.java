package src.窗口.组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 复选框组件 extends JFrame {
    public 复选框组件() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox c1 = new JCheckBox("左边");
        JCheckBox c2 = new JCheckBox("中间");
        JCheckBox c3 = new JCheckBox("右边");

        c.add(c1);
        c.add(c2);
        c.add(c3);

        JButton btn = new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //选中复选框选中状态
                System.out.println(c1.getText() + "复选框选中状态：" + c1.isSelected());
                System.out.println(c2.getText() + "复选框选中状态：" + c2.isSelected());
                System.out.println(c3.getText() + "复选框选中状态：" + c3.isSelected());
            }
        });
        c.add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new 复选框组件();
    }
}
