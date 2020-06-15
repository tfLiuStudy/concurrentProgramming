package cn.al.concurrent.synchronizedStudy;

/**
 * synchronzied(对象锁)学习
 */
public class Demo01 {
    /**
     * 共享资源
     */
    private static int count = 0;
    private static Object object = new Object();

    public static void main(String[] args) {
        Thread one = add();
        Thread two = sub();
        one.start();
        two.start();
    }

    /**
     * -
     */
    private static Thread sub() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    synchronized (object){
                        count--;
                        System.out.println(count);
                    }
                }
            }
        };
        return thread;
    }

    /**
     * +
     */
    private static Thread add() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    synchronized (object){
                        count++;
                        System.out.println(count);
                    }
                }
            }
        };
        return thread;
    }
}
