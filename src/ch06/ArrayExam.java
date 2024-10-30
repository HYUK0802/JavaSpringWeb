package ch06;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c = new char[5];
        c[0] = 'A';
        c[1] = 'P';
        c[2] = 'P';
        c[3] = 'L';
        c[4] = 'E';
        for (int i = 0; i < c.length; i++) {
            System.out.print((char)(c[i]+32));
        }
    }
}
