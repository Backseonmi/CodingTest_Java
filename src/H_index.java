import java.util.*;
class H_index {
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) System.out.print(citations[i] + " ");

        for (int i = 0; i < citations.length; i++) {
            //h를 길이 - i 한 이유는 h의 조건이 h편 이상 이면서 h번 이상 인용된 것이기 때문에
            //h를 논문의 수라고 생각을 했고
            int h = citations.length - i;

            //citations[i]는 인용된 횟수로, 인용된 횟수가 논문의 수보다 같거나 켜야 하는 조건으로 인해서 비교함
            if (citations[i] >= h) { //	  3 5 6  >=   3 2 1
                answer = h; //answer은 h편이됨
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}