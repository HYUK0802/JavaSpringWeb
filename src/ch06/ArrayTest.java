package ch06;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int[] j = {10, 20, 30, 40, 50};
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }
        int sum = j[3] + j[0];
        System.out.println("sum = " + sum);
        System.out.println(a.length);

        int[] b = new int[3];
        System.out.println(b[0]);


    }
}
