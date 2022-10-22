package 条件语句;

public class if判断语句 {
    public static void main(String[] args) {
//        // 一、第一种形式的判断语句
//        int num = 4 ;
//        // 使用if判断num除以2是否等于零，
//        if (num%2==0){
//            // 如果是偶数将输出以下代码
//            System.out.println("num是偶数");
//        }
//        System.out.println("num的值是："+num);

//        // 二、第二种形式的判断语句
//        int balance = 500;
//        // 使用if语句判断balance是否符合500的条件
//        // 使用else判断如果符合就输出”买豪车“
//        // 使用else判断如果不符合就输出”买自行车“
//        // 最后不管符不符合都会输出”吃饭、睡觉“
//        if (balance==500){
//            System.out.println("买豪车");
//        }else {
//            System.out.println("买自行车");
//        }
//        System.out.println("吃饭、睡觉");

        // 第三种形式的判断语句
        int balance = 200;
        // 使用if语句判断balance是否符合500的条件
        // 使用else判断如果符合就输出”买川崎hr2“
        // 使用else if判断如果balance大于等于200或小于500就输出”买川崎h2“
        // 使用else if判断如果balance大于等于50或小于200就输出”买川崎400“
        // 使用else if判断如果balance大于0或小于50就输出”买春风250“
        // 如果都不符合就输出”洗洗睡吧“
        if (balance>=500){
            System.out.println("买川崎hr2");
        }else if (balance>=200 && balance<500){
            System.out.println("买川崎h2");
        }else if (balance>=50 && balance<200){
            System.out.println("买川崎400");
        }else if (balance>0 && balance<50){
            System.out.println("买春风250");
        }else {
            System.out.println("洗洗睡吧");
    }
}
}

// if 判断语句的总结
// 1、表达式：关系表达式或逻辑表达式
// 2、表达式的运算结果应该是真或假
// 真则执行该语句，假则逃过该语句或执行下一条语句
// 3、”语句“可以是单语句也可以是复合语句
// 4、else if 可以有多条
// 5、if 和 else if 都需要判断表达式真假，else则不需要，else if 和 else 必须配合 if 一起使用，不能单独使用
