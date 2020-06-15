package cn.al.concurrent.threadImpl;

public class ThreeTwo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is Runnable");
            }
        }).start();
    }
}
