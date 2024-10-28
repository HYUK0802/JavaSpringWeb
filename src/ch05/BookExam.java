package ch05;

public class BookExam {
    public static void main(String[] args) {
        // 책 한권을 저장할 변수를 선언 하시오
        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "혁컴퍼니";
        b.author = "김재혁";
        b.page = 123;
        b.isbn = "123123";
        System.out.println(b.title + b.price + b.company + b.author + b.page + b.isbn);
    }



}
