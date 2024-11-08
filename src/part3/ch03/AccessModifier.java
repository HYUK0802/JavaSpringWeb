package part3.ch03;

import part3.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.name = "김재혁";
        memberDTO.phone = "010-1-1-1";
        memberDTO.play();
    }

}
