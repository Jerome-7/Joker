package 文件.数据输入输出流;

import java.io.*;

/**
 * 数据字节流可指定文件写入内容
 * 也可作为加密文件使用
 */

public class 文件数据字节流 {
    //文件输出流
    public static  void main(String[] args) {
        File f = new File("word.txt");

        /*
         * 文件输出流，替换文件内容为false
         * 文件输出流，在文件夹末尾追加内容为true
         * try()括号中创建FileOutputStream对象即可自动关闭程序
         */
        try (FileOutputStream out = new FileOutputStream(f, false);
             DataOutputStream dos = new DataOutputStream(out)) {
            dos.writeUTF("这是写入字符串数据");//写入字符串数据
            dos.writeDouble(3.14);//写入浮点型数据
            dos.writeBoolean(true);//写入布尔类型数据
            //写入int值、数值时尽量不要写一起
            dos.writeInt(123);//写入整型数据
            /*
             * .flush();是刷新的意思
             * 强制将缓冲区数据写入文件中，驾驶缓冲区并没有写满
             * 使用缓冲字节输出流时，要多进行刷新操作
             * 负责缓冲区将等待缓冲区装满之后在进行操作
             * 如此一来就影响系统运行效率
             */
            //dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件输入流
        try (FileInputStream in = new FileInputStream(f);
             //将文件字节流包装成缓冲字节流
             DataInputStream dis = new DataInputStream(in)) {
            //.readUTF是读取文件中String类型数据
            System.out.println("readUTF()读取数据：" + dis.readUTF());
            //.readDouble是读取文件中Double类型数据
            System.out.println("readDouble读取数据："+dis.readDouble());
            //.readBoolean是读取文件中Boolean类型数据
            System.out.println("readBoolean读取数据："+dis.readBoolean());
            //.readInt是读取文件中int类型数据
            System.out.println("readInt读取数据："+dis.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

