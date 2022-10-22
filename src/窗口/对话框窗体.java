package 窗口;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class 对话框窗体 extends JDialog {
    public 对话框窗体(JFrame frame){
        /*
        参数一：父窗体对象
        参数二：对话框标题
        参数三：是否阻塞父窗体
         */
        super(frame,"对话框标题",true);
        Container c = getContentPane();//获取窗体容器
        c.add(new JLabel("这是一个对话框"));
        setBounds(200,200,200,200);//设置窗体坐标和大小

    }

    public static void main(String[] args) {
        JFrame f = new JFrame("父窗体");
        f.setBounds(50,50,300,300);
        Container c =f.getContentPane();
        JButton btn = new JButton("弹出对话框");
        c.setLayout(new FlowLayout());//设置布局，使用流布局
        c.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                对话框窗体 d = new 对话框窗体(f);
                d.setVisible(true);//设置窗口可见
            }
        });
    }
}
