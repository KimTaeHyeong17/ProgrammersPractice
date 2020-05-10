import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length == 0 || arr.length == 1){
            int[] an = {-1};
            return an;
        }
        int min = arr[0];
        for(int num : arr){
            if(min > num){
                min = num;
            }
        }
       
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] != min){
                arrayList.add(arr[i]);
            }
        }
        for(int i = 0 ; i < arrayList.size() ; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
