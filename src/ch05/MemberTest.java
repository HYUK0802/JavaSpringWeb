package ch05;

public class MemberTest {
    public static void main(String[] args) {
        // q. 한명의 헬스클럽 회원 데이터를 저장하고 출력하시오.

        Member member1 = new Member();
        member1.memberName = "김재혁";
        member1.age = 27;
        member1.phoneNumber = "010-3525-2728";
        member1.email = "tig05205@05205";
        member1.address = "대구";
        member1.weight = 32.5f;
        System.out.println(member1.toString());
    }
}
