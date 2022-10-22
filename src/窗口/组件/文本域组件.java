package src.窗口.组件;

import javax.swing.*;
import java.awt.*;

public class 文本域组件 extends JFrame {
    public 文本域组件() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextArea area = new JTextArea();
        area.setText("这是文本域");// 设定初始文本内容
        area.setRows(10);//设定文本域的行
        area.setColumns(30);//设置文本域的列
        area.append("添加内容");//添加内容
        area.insert("插入",2);//在第二个字符后面插入内容
        area.setFont(new Font("宋体",Font.PLAIN,20));
        JScrollPane js = new JScrollPane(area);//给文本域添加滚动条

        c.add(js);

        setVisible(true);
    }

    public static void main(String[] args) {
        new 文本域组件();
    }
}
