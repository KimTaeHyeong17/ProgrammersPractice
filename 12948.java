class Solution {
  public String solution(String phone_number) {
      String answer = "";
      int length = phone_number.length();
      int starCount = length - 4;
      String last4Char = phone_number.substring(length-4,length);
      for (int i = 0 ; i < starCount ; i ++){
          answer = answer + "*";
      }
      answer = answer + last4Char;
          
  
      return answer;
  }
}
