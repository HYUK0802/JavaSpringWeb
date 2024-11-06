package part2.ch06;

import part2.ch05.Book;

public class BasicArrayTest {
    public static void main(String[] args) {
        float[] f = {24.5f, 45.6f, 77.65f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        // 책 3권을 저장할 배열을 생성하고 책3권의 데이터를 저장하고 출력하세요
        Book[] b = new Book[3];
        b[0] = new Book();
        b[0].title = "자바";
        b[0].price = 13022;
        b[0].company = "혁출";
        b[0].author = "김혁";
        b[0].page = 500;
        b[0].isbn = "112312";


        System.out.println(b[0].title + "\t" + b[0].page + "\t" + b[0].company + "\t" + b[0].author);
        b[1] = new Book();
        b[1].title = "자바";
        b[1].price = 13022;
        b[1].company = "혁출";
        b[1].author = "김혁";
        b[1].page = 500;
        b[1].isbn = "112312";

        System.out.println(b[0].title + "\t" + b[0].page + "\t" + b[0].company + "\t" + b[0].author);
        b[2] = new Book();
        b[2].title = "자바";
        b[2].price = 13022;
        b[2].company = "혁출";
        b[2].author = "김혁";
        b[2].page = 500;
        b[2].isbn = "112312";

        System.out.println(b[0].title + "\t" + b[0].page + "\t" + b[0].company + "\t" + b[0].author);

    }
}
