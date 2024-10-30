package ch06;

import ch05.Movie;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // 영화 3편을 저장 할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하세요
        Movie[] mv = new Movie[3];
        mv[0] = new Movie();
        mv[0].movieName = "A영화";
        mv[0].name = "김재혁";
        mv[0].runningTime = 160;
        mv[0].grade = "19세";
        mv[0].openDay = "2024-02-02";
        mv[0].cate = "horror";

        mv[1] = new Movie();
        mv[1].movieName = "B영화";
        mv[1].name = "이현아";
        mv[1].runningTime = 160;
        mv[1].grade = "19세";
        mv[1].openDay = "2024-02-02";
        mv[1].cate = "horror";

        mv[2] = new Movie();
        mv[2].movieName = "C영화";
        mv[2].name = "이현";
        mv[2].runningTime = 10;
        mv[2].grade = "29세";
        mv[2].openDay = "2024-05-02";
        mv[2].cate = "로맨스";

        // 반복문
        for (int i = 0; i < mv.length; i++) {
            System.out.println("\nmoviename = " + mv[i].movieName + " \nname = " + mv[i].name + " \nrunning time = " + mv[i].runningTime
            + " \ngrade = " + mv[i].grade + " \nopenday = " + mv[i].openDay +
                    " \ncategory = " + mv[i].cate);
        }
    }
}
