package 线程.继承Thread类;

public class 继承Thread类 {
    public static void main(String[] args) {
        Thread a = new ThreadA();// new Thread(括号中可以自定义线程名字)
        a.start();// 启动线程

        Thread b = new ThreadA.ThreadB();
        b.start();
    }
}

class ThreadA extends Thread{// Thread是线程类
    @Override
    public void run() {
        for (int i=0;i<=77;i++){
            System.out.println(i);
            try {
                // 停顿一秒之后在次运行（1000为毫秒单位）
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.run();
    }




    static class ThreadB extends Thread{
        @Override
        public void run() {
            for (char i= 'a';i<= 'z';i++){
                System.out.println(i);
                try {
                    // 停顿一秒之后在次运行（1000为毫秒单位）
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            super.run();
        }
    }
}



