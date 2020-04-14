https://programmers.co.kr/learn/courses/30/lessons/42576?language=java

import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        // for(int i = 0 ; i < participant.length ; i++){
        //     System.out.print(participant[i] + " ");
        // }
        // System.out.println("");
        // for(int i = 0 ; i < completion.length ; i++){
        //     System.out.print(completion[i] + " ");
        // }
        // System.out.println("");

        for(int i = 0 ; i < completion.length ; i++){
            if (completion[i].equals(participant[i])){
                
            }else{
              // System.out.print(" return : " + participant[i]);   
                return participant[i];
            } // a a c d e 
        }     // a c d e 
        

        return participant[participant.length-1];
    }
}
