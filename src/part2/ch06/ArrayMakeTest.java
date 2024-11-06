package part2.ch06;

public class ArrayMakeTest {
    public static void main(String[] args) {

        // 정수 5개를 저장 할 배열을 생성하시요
        int[] a = new int[5];
        System.out.println("a = " + a);
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        char[] c = new char[5];
        c[0] = 'A';
        c[1] = 'P';
        c[2] = 'P';
        c[3] = 'L';
        c[4] = 'E';
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

    }
}
