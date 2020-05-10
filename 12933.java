import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array);
        for(int i = array.length-1 ; i > -1 ; i--){
            answer += array[i];
        }
        return Long.parseLong(answer);
    }
}
