package 文件.缓冲输出输入流;

import java.io.*;

/**
 * 缓冲字符流可以一行一行的读取或输入
 */
public class 文件缓冲字符流 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\13450\\Desktop\\debug.log\\");
        /*
         * 文件字符输出流，替换文件内容为false
         * 文件输出流，在文件夹末尾追加内容为true
         * try()括号中创建FileOutputStream对象即可自动关闭程序
         */
        try (FileWriter out = new FileWriter(f, true);
             BufferedWriter bw = new BufferedWriter(out)) {
            // String本就是存放字符,就不需再次转换
            String str1 = "臣等正欲战死";
            String str2 = "陛下何故先降";
            bw.write(str1);//第一行的数据
            bw.newLine();//创建一个新行
            bw.write(str2);//第二行的数据
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //文件输入流

        try (FileReader in = new FileReader(f);
             BufferedReader br = new BufferedReader(in)) {//输入流读文件
            String tmp = null;
            int i = 1;//计数器
            while ((tmp = br.readLine()) != null) {//循环读取文件中的内容
                System.out.println("第" + i + "行：" + tmp);
                i++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

