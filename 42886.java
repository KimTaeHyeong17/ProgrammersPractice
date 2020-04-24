import java.util.*;
class Solution {
    public int solution(int[] weight) {
        int answer = 0;
        //추들로 측정할 수 없는 양의 정수 무게 중 최솟값을 return 한다.
        // 3 1 6 2 7 30 1 --> 21
        // 1 1 2 3 6 7 30 -->1 2 3 4 5 6 7 8 9 10 11 12 13 ... 20 21이안됨
        Arrays.sort(weight);
        // System.out.println(Arrays.toString(weight));
        answer = weight[0];
        for(int i = 1 ; i < weight.length ; i++){
            // System.out.println("compareing " + answer + " // " + weight[i]);
            if(answer+1 < weight[i]){
            // System.out.println("find!! " + answer + " // " + weight[i]);
                break;
            }else{
                answer = answer + weight[i];
            }
        }
        return answer+1;
    }
}
