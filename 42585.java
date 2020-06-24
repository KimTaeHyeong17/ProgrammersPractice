import java.util.*;
class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0 ; i < arrangement.length(); i++){
            char c = arrangement.charAt(i);
            if (c == '('){
                stack.push(c);
            }else{
                stack.pop();
                if (arrangement.charAt(i-1) == '('){
                    answer += stack.size();
                }else{
                    answer++;
                }
            }
            
        }
        //() none
        // (1()2) 2
        // (1()2()3) 3
        // (1(2(3()4()5)(6()7)8()9))
        
        return answer;
    }
}
