package cn.al.concurrent.stack;

/**
 * 栈帧的演示，每个方法对应一个栈帧
 */
public class ThreadStack {
    public static void main(String[] args) {
        System.out.println("main");
        method1();
    }

    private static void method1() {
        System.out.println("method1");
        method2();
    }

    private static void method2() {
        System.out.println("method2");
    }
}
