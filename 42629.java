import java.util.*;
class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue(Comparator.reverseOrder());
        int count = 0;
        for(int i = 0 ; i < k ; i++){
            // System.out.println(q);
            if(count < dates.length && i == dates[count]){
                q.add(supplies[count]);
                count++;
            }
            if(stock==0){
                stock+=q.poll();
                answer++;
            }
            stock--;
        }
        
        return answer;
    }
}
