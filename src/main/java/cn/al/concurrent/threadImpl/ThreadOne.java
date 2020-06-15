package cn.al.concurrent.threadImpl;

/**
 * thread的方式实现线程
 */
public class ThreadOne extends Thread{
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println("this is thread");
            }
        }.start();
        System.out.println("main");
    }
}
