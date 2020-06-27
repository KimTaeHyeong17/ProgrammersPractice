import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] num = new String[numbers.length];
        
        for(int i = 0 ; i < num.length ; i++){
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, new CustomCompare());
        
        if(num[0].equals("0")){
            return new String(answer.append("0"));
        }
        for(int i = 0 ; i < num.length ; i++){
            answer.append(num[i]);
        }
        
        
        return new String(answer);
    }

}
 class CustomCompare implements Comparator<String>{
        public int compare(String o1, String o2){
            return (o2+o1).compareTo(o1+o2);
        }
 }
