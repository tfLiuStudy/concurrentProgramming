package cn.al.concurrent.threadImpl;

import java.util.concurrent.FutureTask;

/**
 * callable
 */
public class ThreadThree {
    public static void main(String[] args) {
        // 创建任务对象
        FutureTask<Integer> task3 = new FutureTask<>(() -> 100);
        new Thread(task3, "t3").start();
    }
}
