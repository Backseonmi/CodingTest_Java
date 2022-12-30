public class GymnasticClothes {
    class Solution { //lost는 도난 당한 학번들, reserve는 여분이 있는 학생들
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n - lost.length;
            // int answer = n - reserve.length;

            for(int i = 0; i < lost.length; i++){
                for(int j = 0; j < reserve.length; j++){
                    if(lost[i] == reserve[j]){
                        answer++;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            for(int i = 0; i < lost.length; i++){
                for(int j = 0; j < reserve.length; j++){
                    if(lost[i] == reserve[j]+1 || lost[i] ==reserve[j]-1){
                        answer++;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
