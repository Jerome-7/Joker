package 条件语句;

public class while循环语句 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1 ;
        // 使用 while对 sum进行 1+2+...+99+100
        // 设置 i<100时进行自增
        // 当 i每次自增后就与 sum进行相加
        // sum与 i相加后用相加后的数再次与自增后的 i相加
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
