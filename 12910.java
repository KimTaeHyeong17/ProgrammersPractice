import java.util.*;

class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] answer = {};
      Arrays.sort(arr);
      ArrayList<Integer> arraylist = new ArrayList();
      for(int i = 0 ; i < arr.length ; i++){
          if(arr[i]%divisor == 0){
              arraylist.add(arr[i]);
          }
      }
      if(arraylist.size() == 0){
          answer = new int[1];
          answer[0] = -1;
      }else{
          answer = new int[arraylist.size()];
          for(int i = 0 ; i < arraylist.size(); i++){
              answer[i] = arraylist.get(i);
          }
      }
      return answer;
  }
}
