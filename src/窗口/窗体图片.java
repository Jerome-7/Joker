package 窗口;

import javax.swing.*;
import java.awt.*;

public class 窗体图片 extends JFrame {
    public 窗体图片(){
        setBounds(100,100,100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        JLabel l =new JLabel("这是一个标签");
//        URL url =窗体图片.class.getResource("java.png");//获取图片URL路径
//      Icon icon =new ImageIcon(url);//获取相应路径下的图片
        Icon icon =new ImageIcon("G:\\Lmage\\练习图片/10.gif");//第二种方法获取相应路径下的图片
        l.setIcon(icon);//添加图片
        //l.setSize(20,20);//设置标签大小，即使改变标签大小，也不会改变图片大小
        c.add(l);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 窗体图片();
    }
}
