package 线程.线程同步机制;

public class synchronized关键字 implements Runnable{
    int num = 10;// 设置初始票池
    public static void main(String[] args) {
        synchronized关键字 s = new synchronized关键字();
        Thread t1 = new Thread(s,"线程一");
        Thread t2 = new Thread(s,"线程二");
        Thread t3 = new Thread(s,"线程三");
        Thread t4 = new Thread(s,"线程四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public synchronized void sell() {// 线程同步方法
            if (num > 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("票数：" + num--);
            }
    }
    @Override
    public void run(){
        while (true){
            sell();
        }
    }
}
