package 文件.File类1;

import java.io.File;

public class 文件夹的操作 {
    public static void main(String[] args) {
//        File dir = new File("dir/dir2/dir3/dir4");
//        boolean flag = dir.mkdir();//创建文件夹
//        boolean flag2 = dir.mkdirs();//创建文件夹及其父文件夹（创建多个文件夹）
//        System.out.println("创建文件夹是否成功："+flag);
//        System.out.println("创建多层文件夹是否成功："+flag2);
//
//        //删除文件路径最后一个文件夹
//        boolean del = dir.delete();//删除文件夹
//        System.out.println("删除文件夹是否成功："+del);

        File f = new File("C:\\Windows\\");//C盘Windows文件夹
        File files[] = f.listFiles();//返回文件夹下的所以文件及子文件夹
        for(File tmp:files){
            if (tmp.isFile()){//判断是否为文件
                System.out.println("文件："+tmp.getName());
            }else if (tmp.isDirectory()){
                System.out.println("文件夹："+tmp.getName());
            }
        }
    }
}
