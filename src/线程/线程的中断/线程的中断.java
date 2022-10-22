package 线程.线程的中断;

import 线程.线程的加入.线程的加入;

import javax.swing.*;
import java.awt.*;

public class 线程的中断 extends JFrame {
    Thread thread;

    public static void main(String[] args) {
        new 线程的中断();
    }
    public 线程的中断(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口后停止程序
        setSize(200,100);// 设定窗体宽和高
        setVisible(true);// 设置窗体可见
        final JProgressBar progressBar = new JProgressBar();// 创建进度条
        // 将进度条放置在窗体合适的位置
        getContentPane().add(progressBar, BorderLayout.NORTH);
        progressBar.setStringPainted(true);// 设置进度条上显示数字
        thread = new Thread(){// 使用匿名内部类方式创建线程对象

            @Override
            public void run() {
                try {
                for (int i = 0; i <= 100; i++) {
                    progressBar.setValue(i);// 设置进度条的当前值
                    if (i == 50) {// 当i进度条走到50%时
                        this.interrupt();// 将执行中断操作，this代表匿名类
                    }
                    Thread.sleep(100);// 使线程休眠100毫秒
                }
                    } catch (InterruptedException e) {
                        System.out.println("当前线程被中断");
                    }
                }
            };
        thread.start();// 启动线程
        }
    }
