package 窗口.监听事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 动作监听器在窗体上任何操作（包括按钮、文本文档、文本域等）
 */
public class 动作监听器 extends JFrame {
    public 动作监听器() {
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(230, 150);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel centerP = new JPanel();
        centerP.setLayout(new FlowLayout());
        c.add(centerP,BorderLayout.CENTER);

        JPanel southP = new JPanel();
        JLabel console = new JLabel("点击组件");//添加窗口标签
        southP.add(console);
        c.add(southP,BorderLayout.SOUTH);

        JButton btn = new JButton("按钮");
        centerP.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("按钮被点击");
            }
        });

        JTextField jt = new JTextField(10);
        centerP.add(jt);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("文本框中点击了回车");
            }
        });

        JCheckBox jc = new JCheckBox("多选框");
        centerP.add(jc);
        jc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("多选框被点击");
            }
        });

        JRadioButton jr = new JRadioButton("单选框");
        centerP.add(jr);
        jr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("单选框被点击");
            }
        });

        String values[] = {"选项1","选项2","选项3"};
        JComboBox jb = new JComboBox(values);
        centerP.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("下拉列表被选择");
            }
        });
        c.validate();//重新验证一下容器中的组件
    }

    public static void main(String[] args) {
        new 动作监听器();
    }
}
