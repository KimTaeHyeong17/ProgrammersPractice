import java.util.*;
class Solution {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        long sum = 0;
        int before = 0;
        Arrays.sort(budgets);
        // 1 - 기준값을 정한다(temp)
        // 2 - 기준값에 대해 sum을 구한다.
        // 3 - sum 이 M을 넘기면 바로 직전 기준값 temp를 리턴한다.

        // 4 - temp를 1씩 증가하는 방법이 아니라 
        int start = 0;
        int end = budgets[budgets.length-1];
        int mid = 0;


        if(mid >= M) {
            return M/budgets.length;
        }

        while(start<=end) {
            sum = 0;
            mid = (start+end)/2;
            // System.out.println("compare : " + mid);
            for (int budget : budgets) {
                if(budget>=mid == true) {
                    sum = sum + mid;
                } else {
                    sum = sum + budget;
                }
            }
            // System.out.println("sum : "+sum);
            if(sum > M){
                end = mid - 1;
            }else{
                answer = mid;
                start = mid+1;
            }
        }
        return answer;
    }
}
