package 文件.缓冲输出输入流;

import java.io.*;

/**
 * 缓冲字节流可以大大提高运行效率
 */
public class 文件缓冲字节流 {
    //文件输出流
    public static <buty, bi> void main(String[] args) {
        File f = new File("C:\\Users\\13450\\Desktop\\debug.log\\");

        /*
         * 文件输出流，替换文件内容为false
         * 文件输出流，在文件夹末尾追加内容为true
         * try()括号中创建FileOutputStream对象即可自动关闭程序
         */
        long start1 = System.currentTimeMillis();//获取流开始时毫秒值
        try (FileOutputStream out = new FileOutputStream(f, true);
             BufferedOutputStream bo = new BufferedOutputStream(out)) {
            String str = "有花堪折直须折,莫待无花空折枝";
            byte b[] = str.getBytes();//字符串转换为字节数组
            bo.write(b);//将字节数组中数据写入到文件夹
            /*
             * bo.flush();是刷新的意思
             * 强制将缓冲区数据写入文件中，驾驶缓冲区并没有写满
             * 使用缓冲字节输出流时，要多进行刷新操作
             * 负责缓冲区将等待缓冲区装满之后在进行操作
             * 如此一来就影响系统运行效率
             */
            bo.flush();
            long end = System.currentTimeMillis();//获取流结束时毫秒值
            System.out.println("运行经历的毫秒数：" + (end - start1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件输入流
        long start2 = System.currentTimeMillis();//获取流开始时毫秒值
        try (FileInputStream in = new FileInputStream(f);
             //将文件字节流包装成缓冲字节流
             BufferedInputStream bi = new BufferedInputStream(in)) {
            byte b1[] = new byte[1024];//缓冲区字节数组（这个缓冲区与Buffered不同）
            while (bi.read(b1) != -1) {//使用缓冲流读取数据

            }
            long end = System.currentTimeMillis();//获取流结束时毫秒值
            System.out.println("运行经历的毫秒数：" + (end - start2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

