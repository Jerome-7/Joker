package 文件.文件输出输入流;

import java.io.*;

/**
 * 文件字符流
 * 适合传输文字
 * 不适合传输图片,视频等二进制内容
 */
public class 文件字符流 {
    public static void main(String[] args) {
        File f = new File("word.txt");
        /*
         * 文件字符输出流，替换文件内容为false
         * 文件输出流，在文件夹末尾追加内容为true
         * try()括号中创建FileOutputStream对象即可自动关闭程序
         */
        try (FileWriter out = new FileWriter(f, true)) {
            // String本就是存放字符,就不需再次转换
            String str = "你见过洛杉矶凌晨四点的样子吗?";
            out.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //文件输入流
        FileReader in = null;

        try {
            in = new FileReader(f);//输入流读文件
            char b2[] = new char[200];//缓冲区
            int len = in.read(b2);//读入缓冲区的总字节数
            System.out.println("文件中的数据是：" + new String(b2, 0, len));//去除空格
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

