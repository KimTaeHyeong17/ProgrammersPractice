import java.util.*;
class Solution {
  public String[] solution(String[] strings, int n) {
      String[] answer = {};
      
      for(int i = 0 ; i < strings.length ; i++){
          Character temp = strings[i].charAt(n);
          strings[i] = temp+strings[i];
      }
      Arrays.sort(strings);
      for (int i = 0 ; i < strings.length ; i++){
          strings[i] = strings[i].substring(1,strings[i].length());
          // System.out.println(strings[i]);
      }
      
      
      
      
      
      return strings;
  }
}
