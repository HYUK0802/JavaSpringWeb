package part2.ch05;

public class Movie {
    public String movieName;
    public String openDay;
    public String name;
    public String cate;
    public int runningTime;
    public String grade;

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", openDay='" + openDay + '\'' +
                ", name='" + name + '\'' +
                ", cate='" + cate + '\'' +
                ", runningTime=" + runningTime +
                ", grade='" + grade + '\'' +
                '}';
    }
}
