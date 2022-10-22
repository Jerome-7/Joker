package 文件.File类1;

import java.io.File;

public class 创建File类 {
    public static void main(String[] args) {
        /*
         * 项目下的路径（默认路径）：word.txt
         * 包中的文件路径：src/文件/创建File类/word.txt
         * 注意：/ 表示文件夹，\\ 也可表示文件夹（单个\为转义字）
         * 绝对路径：C:\\Intel\\word.txt
         */
        File f1 = new File("C:\\Intel\\word.txt");//第一种构造方法

        File f2 = new File("C:\\Intel\\","word.txt");//第二种构造方法

        File dir = new File("C:\\Intel\\");//文件夹
        File f3 = new File(dir,"word.txt");//第三种构造方法

        System.out.println(f1.getAbsolutePath());//输出文件的绝对值
        System.out.println(f2.getAbsolutePath());//输出文件的绝对值
        System.out.println(f3.getAbsolutePath());//输出文件的绝对值

        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
    }
}
