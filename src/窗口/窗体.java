package 窗口;

import javax.swing.*;
import java.awt.*;

public class 窗体 extends JFrame{//让窗体类也成为一个窗体
    public 窗体(){
        //JFrame f = new JFrame("窗口");//创建窗体对象
        setVisible(true);//创建窗体可见
        setTitle("窗口");//设置窗体标题
        /*
        窗口关闭规则
        EXIT_ON_CLOSE：隐藏窗体，并停止程序
        DO_NOTHING_ON_CLOSE：无任何操作
        HIDE_ON_CLOSE：隐藏窗体，但不停止程序
        DISPOSE_ON_CLOSE：释放窗体资源
        */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,300,200);//设置窗体坐标和大小，单位：像素

        Container c = getContentPane();//获取窗体容器

        c.setLayout(null);//将容器的布局设为绝对布局
        JButton a1 = new JButton("按钮1"), a2 = new JButton("按钮2");//创建两个按钮
        a1.setBounds(0,0,150,50);//设置按钮坐标和大小
        a2.setBounds(200,200,100,30);
        c.add(a1);
        c.add(a2);

        setVisible(true);

        c.setBackground(Color.WHITE);//设置窗体背景颜色
        JLabel l = new JLabel("这是一个窗体");
        c.add(l);//添加组件
        //c.remove(l);//删除组件
        c.validate();//验证容器中组件
        setContentPane(c);//重新载入容器

        setResizable(true);//设置窗体是否可以改变大小
        System.out.println("x="+getX()+" y="+getY());
    }
    public static void main(String[] args) {
        new 窗体();
    }
}
