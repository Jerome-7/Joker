package 条件语句;

public class for循环语句 {
    public static void main(String[] args) {
//        int sum = 0 ;
//        // 一、for语句
//        // int i=1循环开始前可运行一次，可做赋值操作
//        // i<=100返回布尔值，控制循环是否继续执行
//        // i++通常是赋值表达式，在完成一次循环后执行
//        for (int i=1;i<=100;i++){
//            sum +=i;
//        }
//        System.out.println("sum="+sum);
        // 二、foreach语句
        // int arr[]= {7,10,11,56,99};是foreach特有的赋值方法
        int arr[]= {7,10,11,56,99};
        // int x循环变量，依次将obj中的值赋给x
        // arr一个可被遍历的集合，列如数组
        // 遍历：可以简单理解为，对数组或集合中的所有元素，逐一访问，依次读取一遍
        // 数组：就是相同数据类型的元素按一定顺序排列的集合
        for (int x:arr){
            System.out.println(x);
        }
    }
}
