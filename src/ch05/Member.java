package ch05;

public class Member {
    public String memberName;
    public int age;
    public String phoneNumber;
    public String email;
    public String address;
    public float weight;

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", weight=" + weight +
                '}';
    }
}
