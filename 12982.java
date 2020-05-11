import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        for(int i = 0 ; i < d.length ; i++){
            sum = sum + d[i];
            if(sum <= budget){
                answer = i+1;
            }
        }
        System.out.println(sum);
        return answer;
    }
}
