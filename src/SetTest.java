import java.util.HashSet; //Set은 데이터를 입력한 순서대로 출력되지 않음

public class SetTest {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if(set.contains("Ham")){
            System.out.println("Ham도 포함되어 있음");
        }

    }
}
