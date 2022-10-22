package src.窗口.组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 提交按钮组件 extends JFrame {
    public 提交按钮组件() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 2, 5, 5));

        JButton btn[] = new JButton[6];
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            c.add(btn[i]);
        }

        btn[0].setText("不可用");//设置文本
        btn[0].setEnabled(false);//设置组件为不可用

        btn[1].setText("有背景色");//设置背景颜色
        btn[1].setBackground(Color.BLACK);//设置背景颜色

        btn[2].setText("无边框");
        btn[2].setBorderPainted(false);//不显示边框

        btn[3].setText("有边框");
        btn[3].setBorder(BorderFactory.createLineBorder(Color.GREEN));//设置边线颜色

        Icon icon = new ImageIcon("C:\\Users\\13450\\Desktop/1000.jpg");//获取按钮
        btn[4].setIcon(icon);//给按钮设置图片
        btn[4].setToolTipText("图片按钮");//鼠标悬停提示

        btn[5].setText("可点击");
        btn[5].addActionListener(new ActionListener() {//添加事件监听
            @Override
            public void actionPerformed(ActionEvent e) {//监听触发的方法
                //弹出小对话框
                JOptionPane.showConfirmDialog(提交按钮组件.this, "点击按钮");
            }
        });
        setVisible(true);//设置窗体可见
    }

    public static void main(String[] args) {
        new 提交按钮组件();
    }
}
