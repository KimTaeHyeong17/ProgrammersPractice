class Solution {
  public int solution(int n) {
      int answer = 0;
      n++;
      if(n==0 || n==1 ||n==2){
          return 0;
      }
      
      boolean[] prime = new boolean[n];
      for(int i = 0 ; i < prime.length ; i++){
          prime[i] = true;
      }
      //0은 1이고 1은 2다.
      prime[0] = false;
      prime[1] = false;
      
      for(int i = 2; i < prime.length ;i++ ){
          //소수를 loop돌면서 해당 소수의 배수를 제거한다.
          for(int j = 2 ; j * i < prime.length ; j++){
              prime[i*j] = false;
          }
      }
      for(boolean b : prime){
          if(b){
              answer++;
          }
      }
      return answer;
  }
}
