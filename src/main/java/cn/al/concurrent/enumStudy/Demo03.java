package cn.al.concurrent.enumStudy;

public enum Demo03 {
    red(1), yellow(2);
    Demo03(int i) {
    }
}

class test{
    public static void main(String[] args) {
        System.out.println(Demo03.valueOf("red"));
        System.out.println(Demo03.values());
    }
}
