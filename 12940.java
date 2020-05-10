import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if(n>m){
            answer[0] = GCD(n,m);
            answer[1] = LCM(n,m);
        }else{
            answer[0] = GCD(m,n);
            answer[1] = LCM(m,n);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
    public int GCD(int big, int small){
        for(int i = big ; i > 0 ; i--){
            if(big%i == 0 && small%i == 0){
                return i;
            }
        }
        return -1;
    }
    public int LCM(int big, int small){
        int answer = big;
        while(true){
            if(answer % big == 0 && answer % small == 0){
                return answer;
            }
            answer++;
        }
    }
}
