package 窗口.窗体布局;

import javax.swing.*;
import java.awt.*;

public class 窗体网格布局 extends JFrame {
    public 窗体网格布局(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,300,200);

        Container c = getContentPane();
        //设置为网格布局，5行4列，水平间隔距为5像素，垂直间距也为5像素
        c.setLayout(new GridLayout(5,4,5,5));

        for(int i = 0;i<20;i++){
            c.add(new JButton("按钮"+i));
        }
        setVisible(true);
    }
    public static void main(String[] args) {

        new 窗体网格布局();
    }
}
