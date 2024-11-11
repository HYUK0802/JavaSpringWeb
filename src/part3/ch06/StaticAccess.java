package part3.ch06;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // myutil
        int sum = MyUtil.hap(a, b);
        System.out.println(sum);
    }
}
