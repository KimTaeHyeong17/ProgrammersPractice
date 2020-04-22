import java.util.*;
class Solution {
  public String solution(String s) {
      String answer = "";
      if (s.length() == 0){
          return s;
      }
      char[] charArray = s.toCharArray();
      Arrays.sort(charArray);
      System.out.println(charArray);
      List<Character> temp = new ArrayList();
      for(char c : charArray){
          temp.add(c);
      }
      Collections.reverse(temp);
      for(char c : temp){
          answer = answer+c;
      }
      System.out.println(answer);
      //왜 char array는 reverse가 안되지안되지
      
      String[] stringArray = s.split("");
      Arrays.sort(stringArray);
      System.out.println(String.join("",stringArray));
      Collections.reverse(Arrays.asList(stringArray));
      System.out.println(String.join("",stringArray));

      for(String c : stringArray){
          answer = answer + c;
      }
      return answer;
  }
}
