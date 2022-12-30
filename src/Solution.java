import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

    }
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length]; //숫자를 문자열로 바꾸는 구문

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (a, b) -> ((b+a).compareTo(a+b))); //compareTo메소드 사용(lambda식)

        if(str[0].equals("0")){
            return "0";
        }

        StringBuilder st= new StringBuilder();

        for(int i = 0; i < str.length; i++){
            st.append(str[i]);
        }

        return answer.toString();
    }
}
