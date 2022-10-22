package 文件.File类1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 使用File类 {
    public static void main(String[] args) throws IOException {
        /*
         * 项目下的路径（默认路径）：word.txt
         * 包中的文件路径：src/文件/创建File类/word.txt
         * 注意：/ 表示文件夹，\\ 也可表示文件夹（单个\为转义字）
         * 绝对路径：C:\\Intel\\word.txt
         */
        File f1 = new File("C:\\Intel\\word.txt");//第一种构造方法

        System.out.println("文件是否存在：" + f1.exists());//判断文件是否存在

        System.out.println("文件名：" + f1.getName());//输出文件名
        System.out.println("文件的绝对路径：" + f1.getAbsolutePath());//输出文件的绝对路径
        System.out.println("是否是隐藏文件：" + f1.isHidden());//是否是隐藏文件
        System.out.println("文件的字节数：" + f1.length());//输出文件大小，单位：字节
        Date date = new Date(f1.lastModified());//通过毫秒值创建日期类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("文件最后修改时间：" + sdf.format(date));//文件最后修改日期

        boolean del = f1.delete();//删除文件
        System.out.println("删除文件是否成功：" + del);

        //已存在的文件，不能重新创建（不能覆盖已有文件）
        boolean create = f1.createNewFile();//创建新的文件（空文件）
        System.out.println("创建文件是否成功：" + create);
    }
}
