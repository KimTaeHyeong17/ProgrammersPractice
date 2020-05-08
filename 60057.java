import java.util.*;
class Solution {
    int answer = 0;
    public int solution(String s) {
        answer = s.length();
        for(int splitCount = 1 ; splitCount < s.length() ; splitCount++){
            String[] strArray = s.split("(?<=\\G.{"+splitCount+"})");
            compress(strArray);
        }
        return answer;
    }
    
    public void compress(String[] array){
        // System.out.println(Arrays.toString(array));
        int count = 1;
        for(int i = 0 ; i < array.length-1;i++){
            if(array[i].equals(array[i+1])){
                if(count > 1){
                    array[i-1] = "";
                }
                count++;
                array[i+1] = array[i];
                array[i] = String.valueOf(count);
                    // System.out.println(Arrays.toString(array));

            }else{
                count = 1;
            }
        }//end of for loop
        calculate(array);
    }
    
    public void calculate(String[] array){
        String str = "";
        for(int i = 0 ; i < array.length ; i++){
            str = str + array[i];
        }
        // System.out.println(str);
        if(answer > str.length()){
            answer = str.length();
        }
    }
}
