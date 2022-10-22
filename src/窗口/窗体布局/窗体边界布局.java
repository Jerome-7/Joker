package 窗口.窗体布局;

import javax.swing.*;
import java.awt.*;

public class 窗体边界布局 extends JFrame {
    public 窗体边界布局(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,300,200);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());//设置为边界布局

        JButton b1 = new JButton("中");
        JButton b2 = new JButton("东");
        JButton b3 = new JButton("西");
        JButton b4 = new JButton("南");
        JButton b5 = new JButton("北");

        /*
        * CENTER为中部按钮
        * EAST为东部按钮
        * WEST为西部按钮
        * SOUTH为南部按钮
        * NORTH为北部按钮
        */
        c.add(b1,BorderLayout.CENTER);
        c.add(b2,BorderLayout.EAST);
        c.add(b3,BorderLayout.WEST);
        c.add(b4,BorderLayout.SOUTH);
        c.add(b5,BorderLayout.NORTH);

        c.add(new JButton("覆盖"),BorderLayout.CENTER);//新组建覆盖旧组件

        setVisible(true);
    }
    public static void main(String[] args) {
        new 窗体边界布局();
    }
}
