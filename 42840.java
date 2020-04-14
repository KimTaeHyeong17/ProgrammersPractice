https://programmers.co.kr/learn/courses/30/lessons/42840?language=java

import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        //sample --> answer
        int[] sample = {1,4,2,3,4,5,1,2,3,4,5,2,3,4,1,2,3,4};
        //정답 패턴 배열 구성
        int[] student_1 = {1,2,3,4,5};
        int[] student_2 = {2,1,2,3,2,4,2,5};
        int[] student_3 = {3,3,1,1,2,2,4,4,5,5};
        
        int student_1_count = 0;
        int student_2_count = 0;
        int student_3_count = 0;
        
        //맞춘 정답 갯수
        for(int i = 0 ; i < answers.length; i++){
            System.out.print(answers[i] + " " );    
            
            if(answers[i] == student_1[i%student_1.length]){
                student_1_count++;
            }
            if(answers[i] == student_2[i%student_2.length]){
                student_2_count++;
            }
            if(answers[i] == student_3[i%student_3.length]){
                student_3_count++;
            }
        }
        
        int max = Math.max(Math.max(student_1_count, student_2_count),student_3_count); // max값 구하기
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==student_1_count) list.add(1); //max값이랑 같으면 넣는다.
        if(max==student_2_count) list.add(2);
        if(max==student_3_count) list.add(3);
        
        answer = new int[list.size()];
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
