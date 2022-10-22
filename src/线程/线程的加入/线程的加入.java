package 线程.线程的加入;

import com.sun.jdi.Bootstrap;

import javax.swing.*;
import java.awt.*;

public class 线程的加入 extends JFrame {
    private static final long seriaVersionUID = 1l;
    private Thread threadA;// 定义两个线程
    private Thread threadB;// 定义两个线程
    final JProgressBar progressBar = new JProgressBar();// 定义两个进度条组件
    final JProgressBar progressBar2 = new JProgressBar();// 定义两个进度条组件
    int count = 0;

    public static void main(String[] args) {
        init(new 线程的加入(),200,100);
    }
    public 线程的加入(){
        super();
        // 将进度条设置在窗体最上面
        getContentPane().add(progressBar, BorderLayout.NORTH);
        // 将进度条设置在最下面
        getContentPane().add(progressBar2, BorderLayout.SOUTH);
        progressBar.setStringPainted(true);// 设置进度条显示数字字符
        progressBar2.setStringPainted(true);
        // 使用匿名内部类形式初始化Thread实例子
        threadA = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {// 重写run()方法
                while (true){
                    progressBar.setValue(++count);// 设置进度条当前值
                    try{
                        Thread.sleep(100);// 使线程A休眠100毫秒
                        if (count == 20 ){// 当count变量增长为20时
                            threadB.join();// 线程B加入到线程A当中
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();// 启动线程A
        threadB = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true){
                    progressBar2.setValue(++count);// 设置当前进度条
                    try {
                        Thread.sleep(100);// 使线程B休眠100毫秒
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (count == 100 )// 当count变量增长为100时
                        break; // 跳出循环
                }

            }
        });
        threadB.start();// 启动线程B
    }
    // 设置窗体各种属性方法
    private static void init(JFrame frame,int width, int height) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
