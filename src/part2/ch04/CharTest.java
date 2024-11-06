package part2.ch04;

public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c);
        int a = 'A';
        System.out.println("a = " + a);
        int b = 'B' + 1;
        System.out.println("b = " + b);

        char r = '가';
        System.out.println("r = " + r);
        int hanD = '가';
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00';
        System.out.println("hanU = " + hanU);
        System.out.println("(char)hanU = " + (char)hanU);

        char upper = 'A';
        char lower = (char) (upper + 32);
        System.out.println("lower = " + lower);

        char lower1 = 'u'; //117
        int upper1 = lower1 -32;
        System.out.println("upper1 = " + upper1);
        System.out.println("upper1 = " + (char)upper1);


        int data = '1' + '2';
        System.out.println("data = " + data);

        char i = '1';
        char j = '2';
        int sum = i + j;
        System.out.println("sum = " + sum);


    }
}
