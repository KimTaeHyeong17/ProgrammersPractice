import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int counter = 0;
        
        for (int i = 0 ; i < prices.length-1 ; i++){
            counter = 0 ;
            for(int j = i + 1; j < prices.length ; j++){
                if(prices[i] <= prices[j]){
                    counter++;
                }else{
                    counter++;
                    break;
                }
            }
            answer[i] = counter;
        }
        answer[prices.length-1] = 0;
        return answer;
        
    }
}
