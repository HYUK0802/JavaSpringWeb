package part2.ch07;

public class SwitchCaseTest {
    public static void main(String[] args) {
        switch ("Friday") {
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
                System.out.println("수영하기");
                break;
            case "Wednesday":
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
