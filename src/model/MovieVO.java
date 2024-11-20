package model;

public class MovieVO {
    private String title;
    private String openDay;
    private String person;
    private String cate;
    private int runningTime;
    private String grade;

    public MovieVO(){

    }

    public MovieVO(String title, String openDay, String person, String cate, int runningTime, String grade) {
        this.title = title;
        this.openDay = openDay;
        this.person = person;
        this.cate = cate;
        this.runningTime = runningTime;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public MovieVO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getOpenDay() {
        return openDay;
    }

    public MovieVO setOpenDay(String openDay) {
        this.openDay = openDay;
        return this;
    }

    public String getPerson() {
        return person;
    }

    public MovieVO setPerson(String person) {
        this.person = person;
        return this;
    }

    public String getCate() {
        return cate;
    }

    public MovieVO setCate(String cate) {
        this.cate = cate;
        return this;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public MovieVO setRunningTime(int runningTime) {
        this.runningTime = runningTime;
        return this;
    }

    public String getGrade() {
        return grade;
    }

    public MovieVO setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", openDay='" + openDay + '\'' +
                ", person='" + person + '\'' +
                ", cate='" + cate + '\'' +
                ", runningTime=" + runningTime +
                ", grade='" + grade + '\'' +
                '}';
    }
}
