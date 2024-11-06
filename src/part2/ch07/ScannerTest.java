package part2.ch07;

import part2.ch05.Book;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("책 제목을 입력하세요");
        b.title = sc.next();
        System.out.println("가격을 입력하세요");
        b.page = sc.nextInt();
        System.out.println("회사를 입력하세요");
        b.company = sc.next();
        System.out.println("작가를 입력하세요");
        b.author = sc.next();
        System.out.println("페이지 수 를 입력하세요");
        b.page = sc.nextInt();
        System.out.println("책번호 를 입력하세요");
        b.isbn = sc.next();
        System.out.println("입력하신 책의 정보 입니다. \n" +
                "책의 제목은 " + b.title + "\n" +
                "책의 가격은 " + b.price + "\n" +
                "책의 출판사는 " + b.company + "\n" +
                "책의 글쓴이는 " + b.author + "\n" +
                "책의 페이지 수는 " + b.price + "\n" +
                "책의 책번호는 " + b.isbn + "입니다.");
    }
}
