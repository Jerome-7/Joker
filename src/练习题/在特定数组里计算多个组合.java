package 练习题;

public class 在特定数组里计算多个组合 {
    public static void main(String[] args) {
        //题目：公鸡一只要花五块钱，母鸡一只要花三块钱，小鸡三只要花一块钱，问一百块钱可以买多少只公鸡、母鸡、小鸡？
        int 公鸡, 母鸡, 小鸡;//a为公鸡，b为母鸡，c为小鸡
        for (公鸡 = 1; 公鸡 <= 20; 公鸡++) {//公鸡每次买一只可以买20只每次自增1
            for (母鸡 = 1; 母鸡 <= 33; 母鸡++) {//母鸡每次买一只可以买33只每次自增1
                for (小鸡 = 3; 小鸡 <= 99; 小鸡 += 3) {//小鸡每次买三只可以买99只每次自增3
                    if ((公鸡 * 5) + (母鸡 * 3) + (小鸡 / 3) == 100)//（公鸡乘以价格）加（母鸡乘以价格）加（小鸡除以个数）等于100块钱
                        if (公鸡 + 母鸡 + 小鸡 == 100)//公鸡加母鸡加小鸡等于100只鸡
                            System.out.println("公鸡：" + 公鸡 + " 母鸡：" + 母鸡 + " 小鸡：" + 小鸡);
                }
            }
        }
    }
}
