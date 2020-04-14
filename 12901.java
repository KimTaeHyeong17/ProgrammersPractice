//https://programmers.co.kr/learn/courses/30/lessons/12901?language=java#

class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
      int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
      int count_day = 0;
      for(int i = 0 ; i < a-1 ; i ++){
          count_day += month[i];
      }
      count_day += b;
      answer = day[(count_day+4)%7];
      
      return answer;
  }
}
