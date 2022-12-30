import java.util.*;

public class Simulation {
    class Solution {
        public int solution(int[] A, int[] B) {
            int index = B.length - 1;
            Arrays.sort(A);
            Arrays.sort(B);

            int answer = 0;
            for(int i = A.length - 1; i >= 0; i--){ //뒤에서부터 비교
                if(A[i] < B[index]){
                    index--;
                    answer++;
                }

            }
            return answer;
        }
    }
}