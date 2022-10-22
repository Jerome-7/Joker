package 窗口.窗体面板;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel面板可以设置多个窗体面板
 */
public class JPanel面板 extends JFrame {
    public JPanel面板() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 2, 10, 10));//设置面板位置

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 3, 10, 10));
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));

        /*
         * 添加边框
         *
         */
        p1.setBorder(BorderFactory.createTitledBorder("面板1"));//添加标题边框
        p2.setBorder(BorderFactory.createTitledBorder("面板1"));//添加标题边框
        p3.setBorder(BorderFactory.createTitledBorder("面板1"));//添加标题边框
        p4.setBorder(BorderFactory.createTitledBorder("面板1"));//添加标题边框

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);

        p1.add(new JButton("p1"));//添加按钮
        p1.add(new JButton("p1"));//添加按钮
        p1.add(new JButton("p1"));//添加按钮
        p1.add(new JButton("p1"));//添加按钮

        p2.add(new JButton("p2"), BorderLayout.CENTER);
        p2.add(new JButton("p2"), BorderLayout.EAST);
        p2.add(new JButton("p2"), BorderLayout.SOUTH);
        p2.add(new JButton("p2"), BorderLayout.WEST);
        p2.add(new JButton("p2"), BorderLayout.NORTH);

        p3.add(new JButton("p3"));
        p3.add(new JButton("p3"));

        p4.add(new JButton("p4"));
        p4.add(new JButton("p4"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanel面板();
    }
}
