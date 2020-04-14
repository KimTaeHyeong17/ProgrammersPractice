//https://programmers.co.kr/learn/courses/30/lessons/12903?language=java
import java.util.*;
class Solution {
  public String solution(String s) {
      String answer = "";
      if (s.length()%2==0){
          //even number
          answer = "" + s.charAt(s.length()/2-1) + s.charAt((s.length()/2));
      }else{
          answer = "" + s.charAt(s.length()/2);
      }
      return answer;
  }
}
