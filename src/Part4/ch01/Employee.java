package Part4.ch01;

// 사원
public class Employee{
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee() {
        super(); // 상위 클래스의 생성자를 호출 -> new Object()
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
