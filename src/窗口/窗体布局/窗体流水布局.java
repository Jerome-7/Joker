package 窗口.窗体布局;

import javax.swing.*;
import java.awt.*;

/**
 * 窗体流水布局
 */
public class 窗体流水布局 extends JFrame {
    public 窗体流水布局(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,300,200);

        Container c = getContentPane();
        /*
         * 给容器设置流布局
         * 默认为居中
         * LEFT为左对齐
         * RIGHT为右对齐
         * 30为左右间隔
         * 60为上下间隔
         */
        c.setLayout(new FlowLayout(FlowLayout.LEFT,30,60));

        for (int i = 1; i<5; i++){
            c.add(new JButton("按钮"+i));//循环添加按钮组件
        }
        setVisible(true);
    }

    public static void main(String[] args) {

        new 窗体流水布局();
    }
}
