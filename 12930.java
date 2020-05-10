import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        int count = 0;
        for(int i = 0 ; i < charArray.length ; i++){
            char c = charArray[i];
            if(c == ' '){
                answer = answer + " ";
                count = 0;
            }else{
                if(count%2==0){
                    answer = answer + Character.toUpperCase(c);
                }else{
                    answer = answer + Character.toLowerCase(c);
                }
                count++;
            }
        }
        return answer;
    }
}
