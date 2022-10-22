package 线程.Runnable接口;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class 实现Rummable接口 extends JFrame implements Runnable{
    private JLabel jl = new JLabel();// 声明对象
    private int coutn = 0 ;// 声明计数变量
    private Container container = getContentPane();// 声明容量

    public 实现Rummable接口() {
        setBounds(35, 150, 2000 ,900);// 绝对定位窗体大小位置
        container.setLayout(null);// 使窗体不使用任何布局管理器
        try {
            // 获取相应路径下的图片
            Icon icon =new ImageIcon("G:\\Lmage\\练习图片\\100.gif");
            jl.setIcon(icon);// 将图标放置在标签中
        }catch (NullPointerException ex){
            System.out.println("图片不存在，请将1.gif拷贝到当前目录下");
            return;
        }
        // 设置图片在标签的最左侧
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setBounds(10, 10, 800, 800);// 设置标签的位置与大小
        jl.setOpaque(true);
        container.add(jl);// 将标签添加到容器里
        setVisible(true);// 使窗体可见
        // 设置窗体关闭方式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        实现Rummable接口 frame = new 实现Rummable接口();// 实列化一个实现Rummable接口对象
        Thread t = new Thread(frame);
        t.start();
    }


    @Override
    public void run() {
        // 设置一个临时变量count，让他的初始等于jl值的10
        int count = 10;
        while (true){
            jl.setBounds(count, 10, 1280, 720);
            try {
                Thread.sleep(900);//每次移动，停顿一秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count += 20;// 设置图片运动间距为20
            // 如果count大于等于200，那么就让count在回到初始值10
            if (count >= 200){
                count = 10;
            }
        }
    }
}
