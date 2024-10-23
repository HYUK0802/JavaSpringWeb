public class VDATest {
    public static void main(String[] args) {
        int v; // 변수선언 -> 기억공간
        v = 10;
        System.out.println("v = " + v);

        int a = 10; // 변수 초기화
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        int sum = 0;
        for (int i = 0; i <= 500000000; i++) {
            sum = sum+i;
        }
        System.out.println("sum = " + sum);

        int x = 10;
        int y = 20;
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x,y = " + x + y );
    }
}
