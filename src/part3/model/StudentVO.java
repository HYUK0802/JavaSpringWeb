package part3.model;

public class StudentVO {
    private String name;
    private String dept;
    private int age;
    private String email;
    private int year;
    private String phone;

    public StudentVO() {
    }

    public StudentVO(String name, String dept, int age, String email, int year, String phone) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.email = email;
        this.year = year;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public StudentVO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDept() {
        return dept;
    }

    public StudentVO setDept(String dept) {
        this.dept = dept;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentVO setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentVO setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getYear() {
        return year;
    }

    public StudentVO setYear(int year) {
        this.year = year;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public StudentVO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", year=" + year +
                ", phone='" + phone + '\'' +
                '}';
    }
}
