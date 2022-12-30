/* 학번과 이름의 데이터가 같으면 동일한 경우로 처리하는 Map 구현 및, Map 출력 */
import java.util.HashMap;
import java.util.Map;

class Student {
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object obj) {	//학번과 이름이 동일할 경우 true 리턴
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (sno == student.sno) && (name.contentEquals(student.name));
        } else {
            return false;
        }
    }

    // 학번과 이름이 같다면 동일한 값을 리턴
    public int hashCode() {
        return sno + name.hashCode();
    }
}

public class Week11_2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        //학번과 이름이 동일한 경우 같은 키로 인식
        map.put("1,홍길동", 95);
        map.put("1,홍길동", 90);
        map.put("2,김길동", 80);
        System.out.println("총 Entry 수 : " + map.size());

        System.out.println(map);
    }
}
