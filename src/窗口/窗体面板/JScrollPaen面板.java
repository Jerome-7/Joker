package 窗口.窗体面板;

import javax.swing.*;
import java.awt.*;

/**
 * JScrollPaen面板可以让窗体拥有滚动条
 */
public class JScrollPaen面板 extends JFrame {
    public JScrollPaen面板() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        JTextArea area = new JTextArea();//文本域
        JScrollPane sp = new JScrollPane(area);//创建滚动面板，给文本域添加滚动条

        c.add(sp);//容器添加滚动面板

        setVisible(true);
    }

    public static void main(String[] args) {
        new JScrollPaen面板();
    }
}
