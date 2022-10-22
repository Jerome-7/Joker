package 窗口.窗体布局;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 网格组布局 {
    JFrame a = new JFrame();
    Container t;  //容器

    void 窗口() {
        a.setSize(800, 700);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t = a.getContentPane();
        t.setLayout(new GridBagLayout());
    }

    void 按钮方位() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        t.add(new JButton("按钮"), c);
        GridBagConstraints w = new GridBagConstraints();
        w.gridx = 1;
        w.gridy = 1;
        t.add(new JButton("按钮"), w);
        GridBagConstraints q = new GridBagConstraints();
        q.gridx = 3;
        q.gridy = 3;
        t.add(new JButton("按钮"), q);
    }

    void 按钮矩阵() {
        for (int i = 0; i < 9; i++) {
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = i;
            c.gridy = 0;
            t.add(new JButton("按钮"), c);
            GridBagConstraints c1 = new GridBagConstraints();
            c1.gridx = 0;
            c1.gridy = i;
            t.add(new JButton("按钮"), c1);
        }
    }

    void 按钮初始化() {
        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = 1;
        c1.gridy = 1;
        t.add(new JButton("按钮1"), c1);
        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 2;
        c2.gridy = 2;
        c2.gridheight = 2;
        c2.gridwidth = 1;
        t.add(new JButton("按钮2"), c2);
        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 4;
        c3.gridy = 4;
        c3.gridheight = 2;
        c3.gridwidth = 2;
        t.add(new JButton("按钮3"), c3);
    }

    void 按钮初始化2() {
        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = 1;
        c1.gridy = 1;
        c1.gridheight = 2;
        c1.gridwidth = 2;
        t.add(new JButton("居中"), c1);
        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 3;
        c2.gridy = 1;
        c2.gridheight = 2;
        c2.gridwidth = 2;
        c2.fill = GridBagConstraints.HORIZONTAL;   //水平填充
        t.add(new JButton("水平"), c2);
        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 5;
        c3.gridy = 1;
        c3.gridheight = 2;
        c3.gridwidth = 2;
        c3.fill = GridBagConstraints.VERTICAL;
        t.add(new JButton("垂直"), c3);
        GridBagConstraints c4 = new GridBagConstraints();
        c4.gridx = 7;
        c4.gridy = 1;
        c4.gridheight = 2;
        c4.gridwidth = 2;
        c4.fill = GridBagConstraints.BOTH;
        t.add(new JButton("全部"), c4);
    }

    void 按钮初始化3() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 2;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.SOUTH;
        t.add(new JButton("@"), c);
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        JPanel b = new JPanel();
        b.setBackground(Color.blue);
        a.add(b, c);
    }

    void 像素设置() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(5, 5, 5, 10);
        a.add(new JButton("按钮"), c);
    }

    void 初始大小设置() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 2;
        c.ipadx = 10;
        c.ipady = 10;
        a.add(new JButton("按钮"), c);
        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = 4;
        c1.gridy = 2;
        c1.ipadx = -10;
        c1.ipady = -10;
        a.add(new JButton("按钮"), c1);
    }

    void 设置最大大小() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 2;
        c.weightx = 10;
        c.weighty = 10;
        a.add(new JButton("按钮"), c);
    }

    public static void main(String[] args) {
        网格组布局 r = new 网格组布局();
        r.窗口();
        //r.按钮方位();
        //r.按钮矩阵();
        //r.按钮初始化();
        r.按钮初始化2();
        //r.按钮初始化3();
        //r.像素设置();
        //r.初始大小设置();
        //r.设置最大大小();
    }
}
