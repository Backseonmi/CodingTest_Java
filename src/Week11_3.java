import java.util.HashSet;
import java.util.Scanner;

public class Week11_3 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();

        set.add("hong");
        set.add("choi");
        set.add("lee");
        set.add("kim");

        // scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력
        System.out.println("추가할 회원의 이름은 : ");
        String str = scanner.nextLine();

        // 결과 출력
        System.out.println(str);

        // close scanner
        scanner.close();

        System.out.println(set);

    }
}