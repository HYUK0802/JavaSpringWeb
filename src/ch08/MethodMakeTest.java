package ch08;

public class MethodMakeTest {

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int result = add(x,y);
        System.out.println(result);



    }
}
