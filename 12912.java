class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      if(a>b){
          int temp = a;
          a = b;
          b = temp;
      }
      if(a==b){
          return a;
      }
      for(int i = a ; i < b + 1 ; i++){
          answer += i;
      }
      return answer;
  }
}
