package 窗口;

import javax.swing.*;
import java.awt.*;

public class 窗体标签 extends JFrame {
    public 窗体标签(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,300,200);
        Container c = getContentPane();
        setVisible(true);
        JLabel l =new JLabel("这是一个标签");
        //l.setText("更改标签内容");
        l.setFont(new Font("微软黑体",Font.BOLD,15));
        l.setForeground(Color.green);//更改前景色，更改字体颜色

        c.add(l);

    }

    public static void main(String[] args) {
        new 窗体标签();
    }
}
