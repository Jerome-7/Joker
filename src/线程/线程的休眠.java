package 线程;

public class 线程的休眠 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++){
            System.out.println(i);
            try {
                // 此代码能够将程序停顿运行，此代码写到哪里哪里就会停顿运行
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
