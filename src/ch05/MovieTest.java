package ch05;

public class MovieTest {
    public static void main(String[] args) {

        Movie mv = new Movie();
        mv.movieName = "아바타";
        mv.openDay = "2022.12.14";
        mv.name = "제이크 설리";
        mv.cate = "액션";
        mv.runningTime = 192;
        mv.grade = "12세";
        System.out.println(mv.toString());
    }
}
