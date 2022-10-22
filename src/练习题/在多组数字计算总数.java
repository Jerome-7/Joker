package 练习题;

public class 在多组数字计算总数 {
    public static void main(String[] args) {
        //题目：操场上一百多人排队，三人一组多1人，四人一组多2人，五人一组多3人，共多少人
        //循环判断
        for (int i = 100; i <= 200; i++) {
            /*
            判断i余3等于1并且i余4等于2并且i余5等于3
             */
            if ((i % 3 == 1) && (i % 4 == 2) && (i % 5 == 3)) {
                System.out.println(i);
            }
        }
    }
}
