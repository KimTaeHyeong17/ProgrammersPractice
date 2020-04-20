import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList < Integer > array = new ArrayList();
        int[] answer = {};
        int added = -1;
        if (arr.length == 1) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                array.add(arr[i]);
                added = arr[i];
            } else {
                if (arr[i] != added) {
                    array.add(arr[i]);
                    added = arr[i];
                }
            }
        }
        answer = new int[array.size()];
        for(int i = 0 ; i < array.size(); i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}
