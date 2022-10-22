package src.窗口.组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 下拉列表框组件 extends JFrame {
    public 下拉列表框组件() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        setLayout(null);


        JComboBox<String> comboBox = new JComboBox<>();//使用String添加下拉列表元素
        String items[] = {"身份证", "学生证", "工作证"};//向下拉列表添加数据
        ComboBoxModel cm = new DefaultComboBoxModel<>(items);//创建下拉列表模型
        comboBox.setModel(cm);//向列表中添加数据模型

        JButton btn = new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("选中的索引：" + comboBox.getSelectedIndex());//获取选中的索引
                System.out.println("选中的值：" + comboBox.getSelectedItem());//获取选中的值
            }
        });
        btn.setBounds(100, 10, 60, 20);
        c.add(btn);

        comboBox.setEditable(true);//是否可以编辑

        comboBox.setBounds(10, 10, 80, 21);
        c.add(comboBox);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 下拉列表框组件();
    }
}
