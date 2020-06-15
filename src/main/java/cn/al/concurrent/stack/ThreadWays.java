package cn.al.concurrent.stack;

import static java.lang.Thread.sleep;

/**
 * 线程方法的学习
 */
public class ThreadWays {
    public static void main(String[] args) throws InterruptedException {
        //joinTest();
        // 守护线程
        protectThread();
    }

    /**
     * 守护线程:只要其他非守护线程结束了，即使守护线程的代码没有执行完也会结束
     */
    private static void protectThread() throws InterruptedException {
        Thread one = new Thread() {
            @Override
            public void run() {
                System.out.println("begin");
                try {
                    sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end");
            }
        };
        one.setDaemon(true);
        one.start();
        sleep(1);
        System.out.println("main");
    }

    /**
     * join:等待线程结束，join(n):最多等待n毫秒
     */
    private static void joinTest() throws InterruptedException {
        // One
        Thread tOne = new Thread(() -> {
            try {
                System.out.println("begin-" + Thread.currentThread().getName() + "-time-" + System.currentTimeMillis());
                sleep(1);
                System.out.println("end-" + Thread.currentThread().getName() + "-time-" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // Two
        Thread tTwo = new Thread(() -> {
            try {
                System.out.println("begin-" + Thread.currentThread().getName() + "-time-" + System.currentTimeMillis());
                sleep(100000);
                System.out.println("end-" + Thread.currentThread().getName() + "-time-" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        tTwo.start();
        tOne.start();
        tOne.join();
        System.out.println("wait tOne thread");
        tTwo.join();
        System.out.println("wait tTwo  thread");
    }
}
