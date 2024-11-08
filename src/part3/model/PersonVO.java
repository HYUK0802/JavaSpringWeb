package part3.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    public String getName() {
        return name;
    }

    public PersonVO setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonVO setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public PersonVO setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
