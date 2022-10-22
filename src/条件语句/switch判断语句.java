package 条件语句;

public class switch判断语句 {
    public static void main(String[] args) {
        int grade = 10 ;
        // 使用switch对grade进行判断，如果判断条件为case判断范围内则输出
        // 如果判断条件超出或不在case判断范围内则输出”成绩无效“
        // 注：break是为前面代码结束进程，如果不使用break则输出下一句
        // 利用此特点可以简化代码，输出相同数据时前面代码可以不写
        switch (grade){
            case 10:
            case 9:
                System.out.println("成绩：优");break;
            case 8:
                System.out.println("成绩：良");break;
            case 7:
                System.out.println("成绩：中");break;
            case 6:
            case 5:
                System.out.println("成绩：差");break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("成绩：差");break;
            default:
                System.out.println("成绩无效");
        }
    }
}
