package 窗口.监听事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * 焦点监听器
 */
public class 焦点监听器 extends JFrame {
    public 焦点监听器() {
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(230, 150);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextField jt1 = new JTextField(10);
        jt1.setBounds(10, 10, 66, 21);
        contentPane.add(jt1);

        JTextField jt2 = new JTextField(10);
        jt2.setBounds(10, 41, 66, 21);
        contentPane.add(jt2);

//        JLabel jl1 = new JLabel("未获得焦点");
//        jl1.setBounds(86,13,100,15);
//        contentPane.add(jl1);
//
//        JLabel jl2 = new JLabel("未获得焦点");
//        jl2.setBounds(86,44,100,15);
//        contentPane.add(jl2);

        jt1.addFocusListener(new MyFocusListenter());//使用自定义的监听实现类
        jt2.addFocusListener(new MyFocusListenter());//使用自定义的监听实现类

        setVisible(true);


    }

    class MyFocusListenter implements FocusListener {//自定义的焦点事件监听实现类

        @Override
        public void focusGained(FocusEvent e) {
            JTextField tmp = (JTextField) e.getSource();//获取触发事件的组件
            //给获取焦点的文本框的设置绿色边框
            tmp.setBorder(BorderFactory.createLineBorder(Color.green));
        }

        @Override
        public void focusLost(FocusEvent e) {
            JTextField tmp = (JTextField) e.getSource();//获取触发事件的组件
            //给失去焦点的文本框的设置红色边框
            tmp.setBorder(BorderFactory.createLineBorder(Color.red));

        }
    }

    public static void main(String[] args) {
        new 焦点监听器();
    }
}
