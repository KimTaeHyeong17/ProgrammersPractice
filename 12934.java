import java.util.*;
class Solution {
  public long solution(long n) {
      long answer = -1;
      double number = Math.sqrt(n);
      int numberint = (int) number;
      return number == numberint ? (long) Math.pow(numberint+1,2) : -1;
  }
}
